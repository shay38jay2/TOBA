/*
 This program allows user to register for online banking services. It has
a form with a submit button that collects the information from new customer.
 */

public class NewCustomer{
    
        //Variables username1, password1,firstName1, lastName1 and valid1.
    
        private String username1;
        private String password1;
        private String firstName1;
        private String lastName1;
        public boolean valid1;
        
        //Return for each entry variable.
        public String getFirstName(){
            return firstName1;
        }
        
        public void setFirstName(String newFirstName){
            firstName1 = newFirstName;
        }
        
        public String getLastName(){
            return lastName1;
        }
        
        public void setLastName(String newLastName){
            lastName1 = newLastName;
        }
        
        public String getPassword(){
            return password1;
        }
        
        public void setPassword(String newPassword){
            password1 = newPassword;
        }
        
        public String getUserName(){
            return username1;
        }
        
        public void setUserName(String newUsername){
            username1 = newUsername;
        }
        public boolean isValid(){
            return valid1;
        }
        
        public void setValid(boolean newValid){
            valid1 = newValid;
        }
              
    
}
 




        
        
                

    
    
    

    
