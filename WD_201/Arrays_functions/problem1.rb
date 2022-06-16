names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
new_array = []
names.each{|x|
  str = x.join(" ")
  new_array.push(str)
}
print new_array