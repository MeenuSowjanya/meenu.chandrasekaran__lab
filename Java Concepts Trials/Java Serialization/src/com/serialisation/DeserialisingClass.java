package com.serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialisingClass {
    public static void main(String [] args) {
        User user = null;
        try {
            FileInputStream fileIn = new FileInputStream("src/userInByteStream.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized User...");
        System.out.println("Name: " + user.userName);
        System.out.println("Password: " + user.password);     // transient field
        System.out.println("Phone Number: " + user.phoneNumber);
    }
}
