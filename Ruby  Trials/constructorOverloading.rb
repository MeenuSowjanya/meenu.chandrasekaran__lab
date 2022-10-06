class HELLO
    def initialize
        puts "Hello"
    end 
    def initialize(a)
        puts a
    end
end
 
class1 = HELLO.new
class1.initialize
class1.initialize(5)

# Constructor Overloading not possible