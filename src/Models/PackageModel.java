package Models;
/**
* @author Miguel
 */
public class PackageModel {
    
    private int id;
    private String name;
    private String description;
    private String state;
    
    public PackageModel(int id, String name, String description, String state){
        this.id = id;
        this.name = name;
        this.description = description;
        this.state = state;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getState() {
        return this.state;
    }
    
}