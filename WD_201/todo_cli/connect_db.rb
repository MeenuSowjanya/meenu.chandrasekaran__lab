require "active_record"

def connect_db!
  ActiveRecord::Base.establish_connection(
    host: "localhost",
    adapter: "mysql2",
    port: 3306,
    database: "saas_db",
    username: "meenu_sowjanya",
    password: "Password@12",
  )
end