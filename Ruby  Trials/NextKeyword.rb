# next = continue keyword in python

i = 10
loop do
    i -= 1
    next if i % 2 == 0
    puts "Hello"
    break if i == -1
end