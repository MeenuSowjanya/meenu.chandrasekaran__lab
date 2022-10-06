Rails.application.routes.draw do
  get 'home/index'
  # Define your application routes per the DSL in https://guides.rubyonrails.org/routing.html

  # Defines the root path route ("/")
  # root "articles#index"
  match "/", to: "home#index", via: :get
  match "todos", to: "todos#index", via: :get
  match "todos", to: "todos#create", via: :post
  match "todos/:id", to: "todos#show", via: :get
  match "todos/:id", to: "todos#update", via: :put
  match "todos/:id", to: "todos#destroy", via: :delete
  match "register", to: "users#index", via: :get
  match "users/create", to: "users#create", via: :post
  match "login", to: "users#login", via: :get
  match "users/login_check", to: "users#login_check", via: :post
end
