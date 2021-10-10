package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Models.PackageModel;

public class PackageController {

    private final ConnectionDB connection;
    private PreparedStatement st;

    public PackageController() {
        this.connection = new ConnectionDB();
    }

    public PackageModel[] listPackages() {
        String sql = "SELECT * FROM drugstore.package;";
        PackageModel packageModel[];
        ResultSet rs;
        try {
            st = connection.createConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery();

            if (rs.next()) {
                rs.last();
                packageModel = new PackageModel[rs.getRow()];
                rs.beforeFirst();

                while (rs.next()) {
                    packageModel[rs.getRow() - 1] = new PackageModel(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4));
                }
                return packageModel;
            } else {
                //connection.showMessage("No hay registros.");
                return null;
            }
        } catch (SQLException e) {
            //connection.showMessage(e.toString());
            return null;
        }
    }

    public boolean newPackage(PackageModel packageModel) {
        String sql = "INSERT INTO drugstore.package(packageName, packageDescription) VALUES(?,?);";

        try {
            st = connection.createConnection().prepareStatement(sql);
            st.setString(1, packageModel.getName());
            st.setString(2, packageModel.getDescription());

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }

    public boolean updatePackage(PackageModel packageModel) {
        String sql = "UPDATE drugstore.package SET packageName=?, packageDescrption=?, packageState=? WHERE packageId=?;";

        try {
            st = connection.createConnection().prepareStatement(sql);
            st.setString(1, packageModel.getName());
            st.setString(2, packageModel.getDescription());
            st.setString(3, packageModel.getState());
            st.setInt(4, packageModel.getId());

            return st.executeUpdate() != 0;

        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }

    public boolean deletePackage(int packageId) {
        String sql = "DELETE FROM drugstore.package WHERE packageId=?;";

        try {
            st = connection.createConnection().prepareStatement(sql);
            st.setInt(1, packageId);

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }

    public boolean inactiveCategory(String packageState, int packageId) {
        String sql = "UPDATE drugstore.package SET packageState=? WHERE packageId=?;";

        if (!packageState.equals("") && packageId > 0) {
            try {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, packageState);
                st.setInt(2, packageId);

                return st.executeUpdate() != 0;
            } catch (SQLException ex) {
                //connection.showMessage(ex.toString());
                return false;
            }
        } else {
            //connection.showMessage("No sabemos cual paquete actualizar.");
            return false;
        }
    }
}
