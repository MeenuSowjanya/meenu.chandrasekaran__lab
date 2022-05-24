my_hash = {1 => "Meenu",2 => "Anu"}

print "{ "
my_hash.each {|key,value|
    print "#{key} : #{value} "
}
print "}"