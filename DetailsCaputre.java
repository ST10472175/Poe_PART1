/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */
class DetailsCaputre {
    private String username;
    private String password;
    private String number;
    
    //setters
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    
    //getters
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getNumber(){
        return number;
    }
    
    //Username validation
    public boolean isUsernameValid(){
        return username!=null && username.contains("_") && username.length()<=5;
    }
    
    //password validation
    public boolean isPasswordValid(){
        if(password ==null){
            return false;
        }
        
        return password.length()>=8 &&
                password.matches(".*[A-Z].*") && //contains uppercase
                password.matches(".*[a-z].*") && //contains lowercase
                password.matches(".*\\d.*") && //contains digits
                password.matches(".*[!@#$%^&*()_+\\-[ \\ ]{};':\"\\\\|,.<>/?].*");
    }
    
    //phone number validation
    public boolean isNumberValid(){
        return number !=null && number.matches("^\\+?[0-9]{10,13}$");
    }
    
    
}
