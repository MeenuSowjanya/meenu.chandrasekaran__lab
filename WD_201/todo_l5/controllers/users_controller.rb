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

  private 
  def user_params
    params.require(:user).permit(:first_name, :last_name, :email, :password)
  end
end
