package com.company;
import java.util.Scanner;
public class User {

        Scanner user = new Scanner(System.in);
    String UserName() {
        System.out.print("Please, enter Your Name:" + "\t");
        String name = user.nextLine();
        return name;
    }
    String Email() {
        System.out.print("Enter Your e-mail:"  + "\t\t\t");
        Private String email = user.nextLine();
        return email;
    }
    String Town () {
        System.out.print("Enter Your town:" + "\t\t\t");
        Private String town = user.nextLine();
        return town;
    }
}
