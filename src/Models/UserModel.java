package Models;
/**
 * @author Miguel
 */
public class UserModel {
    
    private int userId;
    private String userName;
    private String userOwner;
    private String userPassword;
    private String userState;
    private String userCreatedAt;
    private String userUpdatedAt;
    
    public UserModel(int id, String name, String owner, String password, String state, String createdAt, String updatedAt){
        this.userId = id;
        this.userName = name;
        this.userOwner = owner;
        this.userPassword = password;
        this.userState = state;
        this.userCreatedAt = createdAt;
        this.userUpdatedAt = updatedAt;
    }
    
    public UserModel(String username, String owner, String password){
        this.userName = username;
        this.userOwner = owner;
        this.userPassword = password;
    }
    
    public int getId(){
        return this.userId;
    }
    
    public String getUsername(){
        return this.userName;
    }
    
    public String getOwner(){
        return this.userOwner;
    }
    
    public String getPassword(){
        return this.userPassword;
    }
    
    public String getState(){
        return this.userState;
    }
    
    public String getCreatedAt(){
        return this.userCreatedAt;
    }
    
    public String getUpdatedAt(){
        return this.userUpdatedAt;
    }
    
    public void setId(int id){
        this.userId = id;
    }
    
    public void setUsername(String username){
        this.userName = username;
    }
    
    public void setOwner(String owner){
        this.userOwner = owner;
    }
    
    public void setPassword(String password){
        this.userPassword = password;
    }
    
    public void setState(String state){
        this.userState = state;
    }
    
    public void setCreatedAt(String createdAt){
        this.userCreatedAt = createdAt;
    }
    
    public void setUpdatedAt(String updatedAt){
        this.userUpdatedAt = updatedAt;
    }
    
}