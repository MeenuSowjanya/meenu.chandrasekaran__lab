books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

cat = {}
for value in 0...books.length do
    for a in 0...authors.length do
        if value == a
            k = authors[a].split.first.downcase.to_sym
            r = 
            books[value]
            cat.store(k,r)
        end
    end
end
p cat