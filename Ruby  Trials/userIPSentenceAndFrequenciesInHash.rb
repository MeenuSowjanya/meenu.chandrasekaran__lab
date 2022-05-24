puts "Enter a sentence : "
frequencies_hash = Hash.new(0)
((gets.chomp).split).each do |word,frequency|
    frequencies_hash[word] += 1
end
frequencies_hash = frequencies_hash.sort_by {|key,value| value}
frequencies_hash.reverse!
print frequencies_hash


