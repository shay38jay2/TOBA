/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shay
 */
public class User {
    
    String userName="";
    String password="";
    
    public String setUserName(String userName){
        this.userName = userName;
        return userName;
    }
    
    public String getPassword(){
        return password;
        
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    
}
