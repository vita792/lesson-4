package com.company;
import java.util.Scanner;
public class User {

        String name;
        Private String email;
        Private String town;
        Scanner user = new Scanner(System.in);
    String UserName() {
        System.out.print("Please, enter Your Name:" + "\t");
        name = user.nextLine();
        return name;
    }
    String Email() {
        System.out.print("Enter Your e-mail:"  + "\t\t\t");
        email = user.nextLine();
        return email;
    }
    String Town () {
        System.out.print("Enter Your town:" + "\t\t\t");
        town = user.nextLine();
        return town;
    }
}
