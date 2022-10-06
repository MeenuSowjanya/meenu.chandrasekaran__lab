puts "Enter your age : "
age = Integer(gets.chomp)
if age > 18 
  puts "Eligible for voting"
elsif age == 18
    puts "You are at the correct age for voting"
else
    puts "Not eligible for voting"
end

