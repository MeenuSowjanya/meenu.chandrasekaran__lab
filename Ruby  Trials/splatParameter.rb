def friendsList (person_name , *friends) 
    puts "#{person_name} has the following friends : "
    friends.each do |friend|
        puts friend
    end
end

friendsList("Meenu","Keerthee","Vaish","Smile")