# Symbols are types of variables but the symbols declared once is final


# Older method of declaring
symbols_hash = {
    :name => "Meenu",
    :age => 18
}

# Latest method of declaring
new_symbols_hash = {
    name: "Meenu",
    age: 18
}

print symbols_hash
puts " "
print new_symbols_hash

# Difference between symbols and normal variable keys 

puts "Meenu".object_id
puts "Meenu".object_id

puts :Meenu.object_id
puts :Meenu.object_id


# Also the efficiency of symbol is high because it has only one reference
