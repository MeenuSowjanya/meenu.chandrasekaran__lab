
package com.serialisation;

import java.io.Serializable;                           // Importing Serialisable inteface
import java.io.FileOutputStream;                       // Importing FileOutputStream class
import java.io.ObjectOutputStream;                     // Importing ObjectOutputStream class
import java.io.IOException;
import java.io.FileNotFoundException;
class User implements Serializable{                   // Implementing Serialisable inteface
    public String userName;
    public transient String password;
    /* ' transient ' keyword will assign the declared value only in this jvm.It will hide the value declared in this jvm, and while serialisation ,
        the default value for a datatype is assigned and converted . */
    public long phoneNumber;
}
public class SerialisableClass{
    public static void main(String[] args) {
        User user = new User();                      // Creating object for a serialisable class
        user.userName = "Meenu Sowjanya";
        user.password = "MACB@1234";
        user.phoneNumber = 7448354949L;

        try {
            FileOutputStream outputFile = new FileOutputStream("src/userInByteStream.ser");
            ObjectOutputStream out = new ObjectOutputStream(outputFile);
            out.writeObject(user);
            out.close();
            outputFile.close();
            System.out.printf("Serialized data is saved in /src/userInByteStream.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
