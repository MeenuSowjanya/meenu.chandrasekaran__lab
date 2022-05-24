# .to_sym function
# .push function appends in array

my_array = ["Meenu","Love"]
sym_array = []
intern_array = []
my_array.each {|element|
  sym_array.push(element.to_sym)
  intern_array.push(element.intern)
}
print sym_array
print intern_array