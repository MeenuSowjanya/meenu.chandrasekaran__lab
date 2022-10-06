class TodosController < ApplicationController
    skip_before_action :verify_authenticity_token
    def index
    end
    def create 
        todo = Todo.new(todo_params)
        begin todo.save 
            list
        rescue => exception
            render plain: "Unsuccessfull"
        end
    end
   def update 
        id = params[:id]
        completed = params[:completed]
        todo = Todo.find(id)
        todo.completed = completed
        todo.save
        render plain: "Completed todo updated status to #{completed}"
    end

    private 
    def todo_params
      params.require(:todo).permit(:todo_text, :due_date)
    end
end
