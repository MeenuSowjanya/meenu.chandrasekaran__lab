multi_dimensional_array = [[1,"Meenu"],[12,13]]
print multi_dimensional_array

multi_dimensional_array2 = [[1,"Meenu"],[12,[12,"Meenu"]]]
print multi_dimensional_array2

puts " "

multi_dimensional_array.each {|each_array|
  print "#{each_array} "
}

multi_dimensional_array2.each {|each_array|
    print "#{each_array} "
}