class GLOBAL_CLASS

    $count = 0   # Global Variable

    def local_class
        $count += 1
        p = 0      # Local Variable
        _p = 10    # Local variable
        return p+_p
    end
end

puts $count

$count += 3
puts $count

obj = GLOBAL_CLASS.new
puts obj.local_class
puts $count
