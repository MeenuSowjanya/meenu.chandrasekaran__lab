def sorted_reverse ( array , reverse = false)
    if reverse
        array.sort!.reverse!
    end
    unless reverse
        array.sort!
    end
end
# OR

     
#  def sorted_reverse ( array , reverse = false)
#     if reverse
#         array.sort!
#     end
#     unless reverse
#         array.sort! {|ele1,ele2| ele2 <=> ele1}
#     end
#  end

reverse_list = [1,12,242,1,3]
puts sorted_reverse(reverse_list)
     




