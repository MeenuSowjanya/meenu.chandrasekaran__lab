puts "Enter your age : "
age = Integer(gets.chomp)

unless age < 18
    puts "You are eligible for voting"
else
    puts "You are not eligible for voting"
    
end