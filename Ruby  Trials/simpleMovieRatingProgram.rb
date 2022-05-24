movies = {
 Beast: 5,
 Don: 10
}
puts "What would you like to do ?"
puts "---Type 'add' to add a movie---" 
puts "---Type 'update' to update a movie---"
puts "---Type 'display' to display a movie---"
puts "---Type 'delete' to delete a movie---"

choice = gets.chomp

case (choice)
when "add"
    puts "Enter the movie title : "
    title = gets.chomp
    if (movies[title.to_sym].nil?)
     puts "Enter the ratings : "
     ratings = gets.chomp
     movies[title.intern] = ratings.to_i
     puts "Movie ratings is successfully added"
    else 
      puts "This movie already exists"
    end
when "update"
    puts "Enter the movie title : "
    title = gets.chomp
    unless (movies[title.to_sym].nil?)
        puts "Modify the ratings here"
        ratings = gets.chomp.to_i
        movies[title.intern] = ratings
        puts "Movie ratings is updated"
    else 
        puts "This movie does not exist"
    end
when "delete"
    puts "Enter the movie title : "
    title = gets.chomp
    unless (movies[title.to_sym].nil?)
        movies.delete(title.intern)
        puts "Movie is deleted"
    else 
        puts "This movie does not exist"
    end
when "display"
    movies.each {|title,rating| puts "#{title}: #{rating}"}
end
     