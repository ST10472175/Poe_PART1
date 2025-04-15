/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */
class Login {
    private String storedUsername;
    private String storedPassword;
    
    //constructor to initialise stored credentials
    public Login(String username, String password){
        this.storedUsername = username;
        this.storedPassword = password;
    }
    
    //method to verify if the entered username and password match the stored credentials
    public boolean accountVerfier(String inputUsername,String inputPassword){
        return inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword);
    }
    
}
