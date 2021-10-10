/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Miguel
 */
import Models.UnitModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UnitController {
    private final ConnectionDB connection;
    private PreparedStatement st;
    
    public UnitController(){
        this.connection = new ConnectionDB();
    }
    
    public UnitModel[] listUnits(){
    
        String sql = "select u.unitId, u.unitName, p.packageId, p.packageName, u.unitPieces, u.unitState from drugstore.units as u inner join drugstore.package as p On p.packageId=u.unitPackageId;";
        UnitModel [] units ;
        ResultSet rs;
        
        try{
            st = connection.createConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery();
            
            if(rs.next()){
                rs.last();
                units = new UnitModel[rs.getRow()];
                rs.beforeFirst();
        
                while(rs.next()){
                    units[rs.getRow()-1] = new UnitModel(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getString(6)
                    );
                }
                return units;
            }else{
                //connection.showMessage("No hay registros.");
                return null;
            }
        }catch(SQLException ex){
            //connection.showMessage(ex.toString());
            return null;
        }
    }
    
    public boolean newUnit(UnitModel unit){
        String sql = "INSERT INTO drugstore.units (unitName, unitPackageId, unitPieces) values(?,?,?)";
        try{
            if(unit != null){
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, unit.getName());
                st.setInt(2, unit.getPackageId());
                st.setInt(3, unit.getPieces());
                
                return st.executeUpdate() != 0;
            }else{
                //connection.showMessage("No hay datos para guardar");
                return false;
            }
        }catch(SQLException ex){
            //connection.showMessage(ex.toString());
            return false;
        }
    }
    
    public boolean updateUnit(UnitModel unit){
        String sql = "UPDATE drugstore.units SET unitName=?, unitPackageId=?, unitPieces=?, unitState=? WHERE unitId=?";
        try{
            if(unit != null){
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, unit.getName());
                st.setInt(2, unit.getPackageId());
                st.setInt(3, unit.getPieces());
                st.setString(4, unit.getState());
                st.setInt(5, unit.getId());
                return st.executeUpdate() != 0;
            }else{
                //connection.showMessage("No hay datos para actualizar");
                return false;
            }
        }catch(SQLException ex){
            //connection.showMessage(ex.toString());
            return false;
        }
    }
    
    public boolean deleteUnit(int unitId){
        String sql = "DELETE FROM drugstore.units WHERE unitId=?";
        try{
            if(unitId > 0 ){
                st = connection.createConnection().prepareStatement(sql);
                st.setInt(1, unitId);
                
                return st.executeUpdate() != 0;
            }else{
                //connection.showMessage("No hay datos para guardar");
                return false;
            }
        }catch(SQLException ex){
            //connection.showMessage(ex.toString());
            return false;
        }
    }
    
    public boolean inactiveUnit(String state, int unitId){
        String sql = "UPDATE drugstore.units SET unitState=? WHERE unitId=?";
        try{
            if(unitId > 0 ){
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, state);
                st.setInt(2, unitId);
                
                return st.executeUpdate() != 0;
            }else{
                //connection.showMessage("No hay datos para guardar");
                return false;
            }
        }catch(SQLException ex){
            //connection.showMessage(ex.toString());
            return false;
        }
    }
}
