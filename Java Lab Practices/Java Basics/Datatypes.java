package com.COC;

import java.lang.reflect.Array;
import java.util.Arrays;  // For using Array functions exclusively
import java.util.Locale;
/*
  Multiline Comments
*/

/*
  Class - PascalNamingConvention
  Methods - camelNamingConvention
  Variables - camelNamingConvention
 */

// To declare the line is completed, we always use ;. So ; is must

public class Datatypes {

    public static void main(String[] args){
        // Primitive Datatypes - (byte,short,int,long,double,float,char,boolean)    // Primitive datatypes - Variables 

        byte numberOne=10;

        boolean boolOne=true;

        boolOne=false;

        long numberTwo=12345678901L;

        float numberThree=298368368473879383283729398392839283927.89284282739279272874647666666666666666666666666666666666666666666666666666666723822863826386382683f;

        double numberFour=63571884792492749729777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777.48248222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222888888888888888747;
        short numberFive=19281;

        char alphabet='M';

        System.out.println(numberOne);

        System.out.println(boolOne);

        System.out.println(numberTwo);

        System.out.println(numberThree);

        System.out.println(numberFour);

        System.out.println((numberFive)+(numberOne));

        System.out.println((alphabet));


        // Reference Datatypes - (Array,String,Class,Interface,Enumeration,Annotation) Basics - (Array,String,Class,Interface)    // Reference datatypes - Objects

        byte[] bytes={0,1,2,3,4};

        System.out.println(Arrays.toString(bytes));   // Only for whole array

        System.out.println(bytes.length);

        System.out.println(bytes[2]+bytes[0]);

        char[] characters={'m','e','e','n','u'};

        System.out.println(Arrays.toString(characters));

        System.out.println((Integer.toString(bytes[0]))+(characters[2]));

        char[] alphabets=characters.clone();

        System.out.println(Arrays.toString(alphabets));

        char[][] arrayOf2D={{'a','g'},{'b'}};

        System.out.println(Arrays.toString(arrayOf2D));

        System.out.println(arrayOf2D.length);

        String name="Meenu";        // From Javalang package

        System.out.println(name);

        System.out.println(name.toLowerCase(Locale.ROOT));

        System.out.println(name+" SOWJANYA".toLowerCase(Locale.ROOT));

        System.out.println(name.length());

        System.out.println(name.concat("Meenu"));

        System.out.println(name.charAt(3)); // Character at specified index

        System.out.println("                   Meenu      Sowjanya                  ".trim());

        System.out.println(Arrays.toString(name.split("",1))); // split returns O/P in the form of array

        System.out.println("     Meenu".startsWith(" "));

        System.out.println("Meenu".endsWith(" "));

        // Constants

        byte ageOfPerson=11;
        ageOfPerson=12;              // Can be changes
        System.out.println((ageOfPerson));

        final byte ageForVote=18;    // Once declared can't be changed
        System.out.println(ageForVote);


        // Operators


        System.out.println(2+3);
        System.out.println(2*3);
        System.out.println(2/4);
        System.out.println(2-3);
        System.out.println(2%3);



        ageOfPerson+=12;
        System.out.println(ageOfPerson);
        String Ternary=(ageOfPerson>ageForVote)?"Eligible":"Not Eligible";
        System.out.println(Ternary);

        // Operators precedence = BODMAS

        System.out.println(true && true);

        byte no=10;
        System.out.println(no);
        System.out.println(no++);
        no++;
        System.out.println(no);

        byte no1=12;
        System.out.println(no1);
        no1++;
        System.out.println(no1);

        byte no2=13;
        ++no2;
        System.out.println(no2);

        byte no3=14;
        System.out.println(++no3);

        // ++a and a++ makes difference only in sout statement
    }
}
