def PrimeOrNot(number)
    puts "That's not an integer" unless number.is_a? Integer
    puts "Enter a positive number" unless number > 0
    puts "1 is neither prime nor composite" if number == 1
    puts "It is a prime number" if number == 2
    isPrime = true
    for i in 2..(number-1)
        isPrime = false if number % i == 0
    end
    return "That's a prime number" if isPrime
    return "That's a composite number" unless isPrime
end

puts PrimeOrNot(13)