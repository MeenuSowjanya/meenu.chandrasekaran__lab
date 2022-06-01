puts "Enter your age : "
age = Integer(gets.chomp)     # gets is used to get the user input . chomp is used to trim the input given .
if age >= 18 
  puts "Eligible for voting"
end

# OR
puts "Eligible for voting" if age > 18    # if modifier
