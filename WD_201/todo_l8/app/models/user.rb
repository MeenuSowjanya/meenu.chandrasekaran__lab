class User < ApplicationRecord
    has_secure_password
   
    VALID_EMAIL_REGEX = /\A[\w+\-.]+@[a-z\d\-]+(\.[a-z\d\-]+)*\.[a-z]+\z/i.freeze
    VALID_NAME_REGEX = /\A[^0-9`!@#\$%\^&*+_=]+\z/.freeze

    validates :name, presence: true, length: { minimum: 3, maximum: 25 },format: { with: VALID_NAME_REGEX }
    validates :email, presence: true, length: { minimum: 10, maximum: 255 },format: { with: VALID_EMAIL_REGEX },uniqueness: { case_sensitive: false }
    validates :password, presence: true, length: { minimum: 6, maximum: 255 }

end
