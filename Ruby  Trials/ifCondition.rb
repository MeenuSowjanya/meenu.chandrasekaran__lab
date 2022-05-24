puts "Enter your age : "
age = Integer(gets.chomp)
if age >= 18 
  puts "Eligible for voting"
end

# OR
puts "Eligible for voting" if age > 18
