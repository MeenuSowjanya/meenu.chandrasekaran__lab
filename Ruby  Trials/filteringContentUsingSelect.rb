my_array = [1,12,2323,12]

puts my_array.select {|element|
  element > 5 
}

my_hash = {
  name: "Meenu",
  age => 18,
  school: "Sacred Heart School"
}

puts my_hash.select {|key,value|
  key.is_a? Symbol
}