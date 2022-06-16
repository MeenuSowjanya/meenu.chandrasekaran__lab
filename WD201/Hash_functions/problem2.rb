todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]

  arr1 = []
  arr2 = []
  arr3 = []
  dog = {}

for val in 0...todos.length do
for tiger in 0...todos[val].length do
    if todos[val][tiger + 1] == "money"
       array1 = arr1.push(todos[val][tiger])
        dog.store((todos[val][tiger+1]).to_sym,array1)
    end
    
end
end
p dog