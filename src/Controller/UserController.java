package Controller;

import Models.UserModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController {

    private final ConnectionDB connection;
    private PreparedStatement st;
    
    public UserController() {
        connection = new ConnectionDB();
    }

    public UserModel[] findUsers() {
        ResultSet rs;
        String query = "SELECT * FROM drugstore.users";

        UserModel users[];
        try {
            st = connection.createConnection().prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rs = st.executeQuery();

            if (rs.next()) {

                rs.last();
                users = new UserModel[rs.getRow()];
                rs.beforeFirst();

                while (rs.next()) {
                    users[rs.getRow() - 1] = new UserModel(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            "*************",
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7));
                }
                return users;
            } else {
               // connection.showMessage("No hay registros.");
                return null;
            }

        } catch (SQLException e) {
            //connection.showMessage(e.toString());
            return null;
        }
    }

    public String validateSession(String username, String password) {
        ResultSet rs;
        String query = "SELECT users.userState FROM drugstore.users WHERE users.userName=? AND users.userPassword=?";

        try {
            st = connection.createConnection().prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);

            rs = st.executeQuery();

            if (rs.next()) {
                return rs.getString(1);
            } else {
                return "";
            }
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return "";
        } catch (Exception ex) {
            //connection.showMessage(ex.toString());
            return "";
        }
    }

    public UserModel findByUsername(String username) {
        ResultSet rs;
        String query = "SELECT * FROM drugstore.users WHERE users.userName=?";
        try {
            st = connection.createConnection().prepareStatement(query);
            st.setString(1, username);

            rs = st.executeQuery();
            if (rs.next()) {
                UserModel user = new UserModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        "*************",
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );

                return user;
            } else {
                return null;
            }
        } catch (SQLException e) {
            //connection.showMessage(e.toString()); 
            return null;
        }
    }

    public UserModel[] findByOwner(String owner) {
        ResultSet rs;
        String query = "SELECT * FROM drugstore.users WHERE users.userOwner LIKE ?"; 
        UserModel users[];

        try {
            st = connection.createConnection().prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            st.setString(1, '%'+owner+'%');
            rs = st.executeQuery();

            if (rs.next()) {
                rs.last();
                users = new UserModel[rs.getRow()];
                rs.beforeFirst();

                while (rs.next()) {
                    users[rs.getRow() - 1] = new UserModel(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            "*************",
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7));
                }
                return users;
            } else {
                //connection.showMessage("No hay registros.");
                return null;
            } 
        } catch (SQLException e) {
            //connection.showMessage(e.toString()); 
            return null;
        }
    }

    public Boolean createUser(UserModel user) {
        String query = "INSERT INTO drugstore.users (users.userName, users.userOwner, users.userPassword) VALUES(?,?,?)";

        try {
            st = connection.createConnection().prepareStatement(query);
            st.setString(1, user.getUsername());
            st.setString(2, user.getOwner());
            st.setString(3, user.getPassword());
            return st.executeUpdate() != 0;

        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }

    public boolean updateUser(UserModel user) {
        String query = "UPDATE drugstore.users SET users.userName=?, users.userOwner=?, users.userState=? WHERE users.userId=?";
        
        try{
            st = connection.createConnection().prepareCall(query);
            st.setString(1, user.getUsername());
            st.setString(2, user.getOwner());
            st.setString(3, user.getState());
            st.setInt(4, user.getId());
            return st.executeUpdate() != 0;
            
        } catch (SQLException ex){
            //connection.showMessage(ex.toString());
            return false;
        }
    }

    public boolean deleteUser(int idUser) {
        String query = "DELETE FROM drugstore.users WHERE users.userId=?";

        try{
            st = connection.createConnection().prepareStatement(query);
            st.setInt(1, idUser);
            return st.executeUpdate() != 0;
            
        } catch(SQLException ex){
            //connection.showMessage(ex.toString());
            return false;
        }
    }

    
    public boolean updateStateUser(int id, String state) {
        String query = "UPDATE drugstore.users SET users.userState=? WHERE users.userId=?";
        
        try{
            st = connection.createConnection().prepareStatement(query);
            st.setInt(1,id);
            st.setString(2, state);
            return st.executeUpdate() != 0;

        } catch(SQLException ex){
            //connection.showMessage(ex.toString());
            return false;
        }
    }
}
