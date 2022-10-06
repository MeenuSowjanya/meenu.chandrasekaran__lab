def square (side)
    side ** 2
end

puts square (12)

def a
    puts "A was evaluated"
    return true
end

def b
    puts "B was evaluated"
    return true
end


fctn_a = a   
fctn_b = b   

puts fctn_a || fctn_b
puts "--------"
puts fctn_a && fctn_b

# Program to print all even numbers from an array

my_array = [1,12,30,-1,-10]
my_array.each {|i| puts i if i % 2 == 0}