puts "Meenu is a good girl" if 12 > 3
puts "Meenu is a good girl" unless 12 < 3

boolean = true
puts boolean ? "Vaish is a good girl" : "Vaish is a bad girl"

case (boolean)
when boolean then puts "Vaish is a good girl"
when boolean == false then puts "Love u smiley"
end

# Conditional Assignment

fav_person = nil  
fav_person |= "Vaish"
puts fav_person
fav_person |= "Smile"
puts fav_person
fav_person = "Smile"
puts fav_person

puts 10.times{"Meenu is a very good girl"}

[1,12,"Meenu","Vaish"].each{|ele| puts ele}
