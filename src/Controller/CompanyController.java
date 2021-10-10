/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.CompanyModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class CompanyController {

    private final ConnectionDB connection;
    private PreparedStatement st;

    public CompanyController() {
        this.connection = new ConnectionDB();
    }

    public CompanyModel getCompany() {
        String sql = "SELECT * FROM drugstore.company;";
        ResultSet rs;

        try {
            st = connection.createConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery();

            if (rs.next()) {
                CompanyModel company = new CompanyModel(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );

                return company;
            } else {
                //connection.showMessage("No hay registros");
                return null;
            }
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return null;
        }
    }

    public boolean newCompany(CompanyModel company) {
        String sql = "INSERT INTO drugstore.company(id, name, fullNameOwner, numberPhone, address, email) VALUES(?,?,?,?,?);";

        if (company != null) {
            try {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, company.getId());
                st.setString(2, company.getName());
                st.setString(3, company.getFullNameOwner());
                st.setString(4, company.getNumberPhone());
                st.setString(5, company.getAddress());
                st.setString(6, company.getEmail());

                return st.executeUpdate() != 0;
            } catch (SQLException ex) {
                //connection.showMessage(ex.toString());
                return false;
            }
        } else {
            //connection.showMessage("No hay datos de compañia.");
            return false;
        }
    }

    public boolean updateCompany(CompanyModel company) {
        String sql = "UPDATE drugstore.company SET id=?, name=?, numberPhone=?, address=?, email=?, fullNameOwner=?;";

        try {
            st = connection.createConnection().prepareStatement(sql);
            st.setString(1, company.getId());
            st.setString(2, company.getName());
            st.setString(3, company.getNumberPhone());
            st.setString(4, company.getAddress());
            st.setString(5, company.getEmail());
            st.setString(6, company.getFullNameOwner());

            return st.executeUpdate() != 0;

        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }

    public boolean deleteCompany() {
        String sql = "DELETE FROM drugstore.company";

        try {
            st = connection.createConnection().prepareStatement(sql);
            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }
}
