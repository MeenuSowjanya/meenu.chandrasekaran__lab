array = ["Meenu","Vaish",12]
puts array.length  # The .length method tallies the number of elements in your array and returns the count
puts array.size    # The .size method tallies the number of elements in your array and returns the count

puts array.first   # The .first method accesses the first element of the array, the element at index 0

puts array.last    # The .last method accesses the last element of the array

puts array.take(3) # The .take method returns the first n elements of the array

puts array.drop(2) # The .drop method returns the elements after n elements of the array

=begin
    
You can access a specific element in an array by accessing its index. 
If the index does not exist in the array, nil will be returned
    
=end

puts array[2]

puts array[3]

array[0] = "Meenu Sowjanya C"

# --- #

array.pop  # The .pop method will permantently remove the last element of an array
print array

puts array.shift # The .shift method will permantently remove the first element of an array and return this element
print array

array.unshift("Anu") # The .unshift method will allow you to add an element to the beginning of an array
print array

array.delete(5) # The .delete method removes a specified element from an array permanently . If no specified value , no changes
print array

array.delete_at(3) # The .delete_at method allows you to permanently remove an element of an array at a specified index . If no specified index , no changes
print array

puts array.reverse # The .reverse method reverses the array but does not mutate it (the original array stays as is)

puts array.select { |element| element.is_a? Integer} # The .select method iterates over an array and returns a new array that includes any items that return true to the expression provided

puts array.include?("Meenu") # The include? method checks to see if the argument given is included in the array

puts array.join("#$#") # The .join method returns a string of all the elements of the array separated by a separator parameter. If the separator parameter is nil, the method uses an empty string as a separator between strings

array.each{|x| puts x} # The .each method iterates over each element of the array, allowing you to perform actions on them

puts array.uniq # The .uniq method takes in an array containing duplicate elements, and returns a copy of the array containing only unique elements—any duplicate elements are removed from the array

array.concat([5, 6, 7], [8, 9, 10]) # The .concat method appends the elements from an array to the original array. The .concat method can take in multiple arrays as an argument, which will in turn append multiple arrays to the original array

print array




