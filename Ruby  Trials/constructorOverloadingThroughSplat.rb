class CLASS
    def  initialize(*args)
        for i in args
            puts i
        end
    end
end

obj = CLASS.new
obj.initialize(1,12)