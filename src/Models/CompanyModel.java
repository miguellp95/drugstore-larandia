package Models;
/**
 *
 * @author Miguel
 */
public class CompanyModel {
    
    private String id;
    private String name;
    private String fullNameOwner;
    private String numberPhone;
    private String address;
    private String email;
    private String createdAt;
    
    public CompanyModel(String id, String name, String nameOwner, String numberPhone, String address, String email, String createdAt){
        this.id = id;
        this.name = name;
        this.fullNameOwner = nameOwner;
        this.numberPhone = numberPhone;
        this.address = address;
        this.email = email;
        this.createdAt = createdAt;
    }
    
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumberPhone(String number){
        this.numberPhone = number;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCreatedAt(String created){
        this.createdAt = created;
    }
    
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getNumberPhone(){
        return this.numberPhone;
    }
    public String getAddress(){
        return this.address;
    }
    public String getEmail(){
        return this.email;
    }
    public String getCreatedAt(){
        return this.createdAt;
    }
    
    public String getFullNameOwner() {
        return fullNameOwner;
    }

    public void setFullNameOwner(String fullNameOwner) {
        this.fullNameOwner = fullNameOwner;
    }
}