Rails.application.routes.draw do
  # Define your application routes per the DSL in https://guides.rubyonrails.org/routing.html

  # Defines the root path route ("/")
  # root "articles#index"

  
  match "todos/index", to: "todos#index", via: :get
  match "todos/create", to: "todos#create", via: :get
  match "todos/:id", to: "todos#show", via: :get
end
