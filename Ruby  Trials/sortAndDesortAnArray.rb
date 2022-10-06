my_array = [1,12,16,2]

puts my_array.sort

puts my_array

puts my_array.sort!

puts my_array

puts my_array.sort! {|first,second| second <=> first}