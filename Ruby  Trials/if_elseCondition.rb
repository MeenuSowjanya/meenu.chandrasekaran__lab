puts "Enter your age : "
age = Integer(gets.chomp)
if age >= 18 
  puts "Eligible for voting"
else 
    puts "Not eligible for voting"
end

# OR
puts age > 18 ? "Eligible for voting" : "Not eligible for voting"

