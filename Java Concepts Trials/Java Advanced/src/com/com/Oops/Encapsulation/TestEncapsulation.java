package com.com.Oops.Encapsulation;

class Encapsulation {
    private String user;
    private String password;
    private int accountNumber;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(user == "Meenu") {
            this.password = password;
        }
    }

    public int getAccountNumber() {
        int Account = 0;
        if (user == "Meenu" || user == "Keerthana") {
            Account = accountNumber;
        }
        return (Account);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

public class TestEncapsulation{
    public static void main(String[] args) {
        Encapsulation object = new Encapsulation();
        object.setUser("Meenu");
        object.setAccountNumber(132372);
        object.setPassword("MsPsk");
        System.out.println(object.getUser()+object.getAccountNumber()+object.getPassword());
    }
}
