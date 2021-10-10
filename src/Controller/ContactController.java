/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Models.ContactModel;

public class ContactController {

    private final ConnectionDB connection;
    private PreparedStatement st;

    public ContactController() {
        connection = new ConnectionDB();
    }

    public ContactModel[] listContacts() {
        ResultSet rs;
        String query = "SELECT * FROM drugstore.contact";
        ContactModel contacts[];

        try {
            st = connection.createConnection().prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery();

            if (rs.next()) {

                rs.last();
                contacts = new ContactModel[rs.getRow()];
                rs.beforeFirst();


                while (rs.next()) {
                    contacts[rs.getRow() - 1] = new ContactModel(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8));
                }
                return contacts;
            
            } else {
                //connection.showMessage("No hay registros.");
                return null;
            }
        } catch (SQLException e) {
            //connection.showMessage(e.toString());
            return null;
        }
    }

    public boolean newContact(ContactModel contact) {
        String sql = "INSERT INTO drugstore.contact (contactId, contactName, contactIsEnterprise, contactNumberPhone, contactAddress, contactEmail) values(?,?,?,?,?,?)";

        try {
            if (contact != null) {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, contact.getContactId());
                st.setString(2, contact.getContactName());
                st.setInt(3, contact.getContactIsEnterprise());
                st.setString(4, contact.getContactNumberPhone());
                st.setString(5, contact.getContactAddress());
                st.setString(6, contact.getContactEmail());
                return st.executeUpdate() != 0;
            
            } else {
                //connection.showMessage("No hay datos del contacto.");
                return false;
            }
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }
    
    public boolean updateContact(ContactModel contact) {
        String sql = "UPDATE drugstore.contact SET contactName=?, contactIsEnterprise=?, contactNumberPhone=?, contactAddress=?, contactEmail=?, contactState=? WHERE contactId=?";

        try {
            if (contact != null) {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, contact.getContactName());
                st.setInt(2, contact.getContactIsEnterprise());
                st.setString(3, contact.getContactNumberPhone());
                st.setString(4, contact.getContactAddress());
                st.setString(5, contact.getContactEmail());
                st.setString(6, contact.getContactState());
                st.setString(7, contact.getContactId());
                return st.executeUpdate() != 0;
            
            } else {
                //connection.showMessage("No hay datos del contacto.");
                return false;
            }
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }
    
    public boolean deleteContact(String contactId) {
        String sql = "DELETE FROM drugstore.contact WHERE contactId=?";

        try {
            if (!contactId.equals("")) {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, contactId);
                return st.executeUpdate() != 0;
            } else {
                //connection.showMessage("No hay ningun ID de contacto.");
                return false;
            }
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }
    
    public boolean inactiveContact(String id, String state) {
        String sql = "UPDATE drugstore.contact SET contactState=? WHERE contactId=?";

        try {
            if (!id.equals("") && !state.equals("")) {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, state);
                st.setString(2, id);
                return st.executeUpdate() != 0;
            } else {
                //connection.showMessage("No hay datos del contacto.");
                return false;
            }
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }
}
