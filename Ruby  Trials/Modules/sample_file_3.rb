class SAMPLE_CLASS
    require_relative 'Module1'
    include MODULE_ONE

    require_relative 'Module2'
    include MODULE_TWO
end

obj = SAMPLE_CLASS.new
obj.meth1()
