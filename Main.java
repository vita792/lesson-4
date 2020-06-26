package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
        User newUser = new User();
        Validator validatorEmail = new Validator();
        Validator validatorTown = new Validator();

        String userName = newUser.UserName();
        String userEmail = newUser.Email();
        String userTown = newUser.Town();
        
        String validEmail = validatorEmail.ValidatorEmail(userEmail);
        String validTown = validatorTown.ValidatorTown(userTown);
        
        
        String formatName = String.format("User name is %s", userName);  
        String formatEmail = String.format("User`s email is %s", validEmail);  
        String formatTown = String.format("User`s town is %s", validTown);
        
        System.out.println(formatName);  
        System.out.println(formatEmail);  
        System.out.println(formatTown);  
    }
}
