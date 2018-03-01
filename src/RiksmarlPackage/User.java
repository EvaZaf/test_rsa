/**
 *
 * @author cgntuser
 */
package RiksmarlPackage;

public class User {
    String username;
    String password;
    
    public User(String username,String password){
        this.username=username;
        this.password=password;
    }
    
    public void setUsername(String username){
        this.username=username;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getPassword(){
            return this.password;
    }

    String setPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
