print "Enter a sentence : "
sentence = gets.chomp
puts " "
print "Enter a word to Redact : "
redacted_word = gets.chomp

((sentence.split(" "))).each do |word|
    if word != redacted_word
        print "#{word} "
    else
        print "REDACTED "
    end
end

# OR

((sentence.split(" "))).each do |word|
    unless word != redacted_word
        print "REDACTED "
    else
        print "#{word} "
    end
end

