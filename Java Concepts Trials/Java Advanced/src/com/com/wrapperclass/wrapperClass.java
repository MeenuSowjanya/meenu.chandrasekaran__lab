package com.com.wrapperclass;
class Boxing{
    public static void boxing() {
        int i=10;
        Integer iObj1=Integer.valueOf(i);     // Boxing
        Integer iObj2=i;                     // Autoboxing
        System.out.println("Boxing : "+iObj1);
        System.out.println("Autoboxing : "+iObj2);
    }
}

class Unboxing{
    public static void unBoxing() {
        Integer iObj3=new Integer(10);
        int j=iObj3.intValue();            // Unboxing
        int p=iObj3;                      // Autounboxing
        System.out.println("Unboxing : "+j);
        System.out.println("Autoonboxing : "+p);
        Character iObj4=new Character('s');
        char character=iObj4.charValue();
        System.out.println(character);
    }
}

