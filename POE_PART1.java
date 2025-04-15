/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */ import java.util.Scanner;
public class POE_PART1 {

    public static void main(String[] args) {
        DetailsCaputre inputDevice = new DetailsCaputre();
        Scanner inputdevice = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter username(must contain underscore and must have characters equal to or less than 5):");
            String Username = inputdevice.nextLine();
            inputDevice.setUsername(Username);
            if(inputDevice.isUsernameValid()){
                System.out.println("Username successfully captured.");
                break;
            }else{
                System.out.println("Invalid username.Must contain an underscore and be 5 characters or fewer.");
            }
        }
        
        //password validation
        while (true){
            System.out.println("Enter password( must contain a min 8 chars, capital letter, special char):");
            String Password = inputdevice.nextLine();
            inputDevice.setPassword(Password);
            if (inputDevice.isPasswordValid()){
                System.out.println("Password successfully captured.");
                break;
            }else{
                System.out.println("Invalid password. Must be at least 8 characters,contains a capital letter, lowercase letter,number, and special.");
                
            }
        }
        
        //phone number validation
        while (true){
            System.out.println("Enter phone number( must contain an international country code and must bbe 10 digits long):");
            String number = inputdevice.nextLine();
            inputDevice.setNumber(number);
            if( inputDevice.isNumberValid()){
                System.out.println("Phone number successfully captured.");
                break;
            }else{
                System.out.println("Invalid phone number.Must be 10 to 13 digits,with optional'+'.");
            }
        }
        
        Login userLogin = new Login( inputDevice.getUsername(), inputDevice.getPassword());
        //login process
        boolean isLoggedIn = false;
        while(!isLoggedIn){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your username to log in:");
            String inputUsername = scan.nextLine();
            
            System.out.println("Enter your password to log in:");
            String inputPassword = scan.nextLine();
            
            //Authenicate the entered username and password
            isLoggedIn = userLogin.accountVerfier(inputUsername, inputPassword);
            
            
            if(isLoggedIn){
                System.out.println("Login successful!");
            }else{
                System.out.println("Invalid username or password.Please try again.");
            }
        }
        
        
       
    }
}
