class UsersController < ApplicationController
    def index
      user = User.new
    end
    def create

        user = User.new(user_params)
        if user.save
         render plain: "Successfull"
        else
         render plain: "unsuccessfull"
        end
      
    end
      
    def login

    end

    def login_check
      user = User.find_by({email: user_params[:email], password: user_params[:password]})
      if user 
        render plain: "true"
      else
        render plain: "false"
        
      end
      
    end

    private 
    def user_params
      params.require(:user).permit(:name, :email, :password)
    end

  end
  

