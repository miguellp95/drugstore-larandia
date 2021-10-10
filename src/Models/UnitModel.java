package Models;
/**
 * @author Miguel
 */
public class UnitModel {

    private int id;
    private String name;
    private int packageId;
    private String packageName;
    private int pieces;
    private String state;
    
    public UnitModel(int id, String name, int packageId, String packageName, int pieces, String state){
        this.id = id;
        this.name = name;
        this.packageId = packageId;
        this.packageName = packageName;
        this.pieces = pieces;
        this.state = state;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPackageId(int packageId){
        this.packageId = packageId;
    }
    public void setPackageName(String packageName){
        this.packageName = packageName;
    }
    public void setPieces(int pieces){
        this.pieces = pieces;
    }
    public void setState(String state){
        this.state = state;
    }
    
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getPackageId(){
        return this.packageId;
    }
    public String getPackageName(){
        return this.packageName;
    }
    public int getPieces(){
        return this.pieces;
    }
    public String getState(){
        return this.state;
    }
}