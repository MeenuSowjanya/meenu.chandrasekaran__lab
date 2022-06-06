require_relative 'Module1'
include MODULE_ONE
require_relative 'Module2'
include MODULE_TWO

obj1 = MODULE_ONE::S_C.new
obj2 = MODULE_TWO::S_C.new

obj1.eat("Veggies")
obj2.dance("12 'o clock")