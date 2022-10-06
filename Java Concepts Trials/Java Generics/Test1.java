import java.util.*;  
class Test1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
list.add("Meenu");  
list.add("Sowjee");   
String s=list.get(1);
System.out.println("element is: "+s);  
  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
