class TodosController < ApplicationController
    skip_before_action :verify_authenticity_token
    def index
    end

    def list
    #    #   render plain: Todo.all.map{|todo| todo.to_pleasant_string}.join("\n")
    #    render plain: Todo.order(:due_date).map{|todo| todo.to_pleasant_string}.join("\n") 
    render "list"
    end

    def create 
        todo = Todo.new(todo_params)
        begin todo.save 
            list
        rescue => exception
            render plain: "Unsuccessfull"
        end
    end

    
    def show
        id = params[:id] # params default variable storing array
        todo = Todo.find(id)
        # render plain: todo.to_pleasant_string
        render "show"
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
