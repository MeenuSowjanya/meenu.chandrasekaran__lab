require_relative 'Module1'

include MODULE_ONE

MODULE_ONE::meth1
puts MODULE_ONE.var

obj = MODULE_ONE::S_C.new
print "Enter where the animal sleeps : "
obj.sleep(gets.chomp)