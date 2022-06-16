books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

books.each{|x|
   puts "#{x} was written by #{authors[books.find_index(x)]}"
}