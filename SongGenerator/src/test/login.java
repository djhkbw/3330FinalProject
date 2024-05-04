package test;

public class login {
    //create user login
    private String username;
    private String password;
	
  
    
    //constructor
    public login(String username, String password) {
        this.username = username;
        this.password = password;
     
    }
    //getters & setters
    String getUsername() {
        return this.username;
    }
    void setUsername(String username) {
        this.username = username;
    }
    String getPassword() {
        return this.password;
    }
    void setPassword(String password) {
        this.password = password;
    }
    
 

    //Returns user info as string
    public String toString() {
       return "User: [username: " + this.username + ", password: " + this.password;
       
	}
	public boolean checkLogin(String username2, String password2) {
		
        if(this.username.equals(username2) && this.password.equals(password2)) {
            return true;
        }
		return false;
	}
}
