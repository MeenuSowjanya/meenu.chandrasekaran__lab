package com.COC;

public class B4{
 public static void main(String[] args){
    // for loop
    for(byte i=0;i<10;i+=2){
     System.out.println("Hello World");
    }
    byte init=12;
    byte start=3;
    // while loop
    while(init<=20){
     System.out.println("Hello Meenu");
     init+=3;
    }
    // do-while loop
   do{
    System.out.println("Hello Anu");
    start +=2;
   }while(start<=20);
   // for-each loop
  String name="";
  char[] alphabets={'M','e','e','n','u'};
  for(byte character=0;character<(alphabets.length);character++){
    name+=alphabets[character];
  }
  System.out.println(name);
  // for-each loop
  String name2="";
  for(char alp:alphabets){
   name2+=alp;
  }
  System.out.println(name2);
 }
}
