class UsersController < ApplicationController
  skip_before_action :verify_authenticity_token
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
    user = User.find_by(email: params[:email], password: params[:password])
    if user
      render plain:"successfull"
    else
      render plain:"unsuccessfull"
    end
  end

  private 
  def user_params
    params.require(:user).permit(:first_name, :last_name, :email, :password)
  end
end
