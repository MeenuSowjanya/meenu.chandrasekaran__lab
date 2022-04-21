package com.JA;

import java.util.Scanner;

public class AccessModifiers {

    public static void main(String[] args) {
	// access modifiers  // For specifying scope
        // keywords - public, private, protected
        /* Real life example - private --> Only for me  --> Only applicable within same class
                               public --> For all
                               protected --> Restricted Public
                               If we did not give public for class and methods , computer can't recognise your class / methods
                               Default - public inside main method
         */

        System.out.println("Hi guys");
        /*
           If you want to pass parameters to the main method , go to run --> edit configurations
         */
        System.out.println(args[0]+" "+args[1]+" "+args[2]);
        method1("Meenu","Sowjanya");                   // Compiler default run - main method
        method2();
        method3();
        method4();
        method5(); // Function call  // no sout -- so, it did not print the returned value -- so use sout
        System.out.println(method5());
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number");
        int arg1= input.nextInt();
        System.out.println("Enter your second number");
        int arg2= input.nextInt();
        System.out.println(addTwoNumbers(arg1,arg2));   // Passing arguments to created parameters
    }
    /* Creating own method - If you want to return answers in any one particular datatype write like
                             public String
                                          (OR)
                             If your method do not want to return anything
                             public void

                             // Static - fixed memory
     */
    // Compiler default run - main method
    // void - if u dont want to return anything - no need to return anything
    // datatype - if u want to return the value of certain datatype - should use 'return' keyword
    public static void method1(String p1,String p2){
        System.out.println("Hello Meenu");
        System.out.println(p1+" "+p2);
    }
    public static void method2(){

        System.out.println("Hello Anu");
    }
    private static void method3(){
        System.out.println("Hello Pradeep");
    }
    public static void method4(){
        int a = 10;
        /* Only for main method - it will accept variable declaration without access modifiers DEFAULT - PUBLIC for variables.
           But in other methods it is best to specify the access modifiers to avoid confusions . But not that much necessary*/
        System.out.println(a);
    }
    static int method5(){
        return (5+9);
    }
    static int addTwoNumbers(int number1,int number2){          // created parameters  // parameters scope is only within that method
        return (number1+number2);
    }

}
