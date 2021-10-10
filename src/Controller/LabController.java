package Controller;

import Models.LabModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LabController {

    private final ConnectionDB connection;
    private PreparedStatement st;

    public LabController() {
        this.connection = new ConnectionDB();
    }

    public LabModel[] listLabs() {
        String sql = "SELECT * FROM drugstore.labs;";
        ResultSet rs;
        LabModel labs[];

        try {
            st = connection.createConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery();

            if (rs.next()) {

                rs.last();
                labs = new LabModel[rs.getRow()];
                rs.beforeFirst();

                while (rs.next()) {
                    labs[rs.getRow() - 1] = new LabModel(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4));
                }
                return labs;
            } else {
                //connection.showMessage("No hay registros.");
                return null;
            }
        } catch (SQLException e) {
            //connection.showMessage(e.toString());
            return null;
        }
    }

    public boolean newLab(LabModel labModel) {
        String sql = "INSERT INTO drugstore.labs(labName, labDescription) VALUES(?,?);";

        if (labModel != null) {
            try {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, labModel.getName());
                st.setString(2, labModel.getDescription());

                return st.executeUpdate() != 0;
            } catch (SQLException ex) {
                //connection.showMessage(ex.toString());
                return false;
            }
        } else {
            //connection.showMessage("No hay datos de Laboratorio.");
            return false;
        }
    }

    public boolean updateLab(LabModel lab) {
        String sql = "UPDATE drugstore.labs SET labName=?, labDescrption=?, labState=? WHERE labId=?;";

        if (lab != null) {
            try {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, lab.getName());
                st.setString(2, lab.getDescription());
                st.setString(3, lab.getState());
                st.setInt(4, lab.getId());

                return st.executeUpdate() != 0;

            } catch (SQLException ex) {
                //connection.showMessage(ex.toString());
                return false;
            }
        } else {
            //connection.showMessage("No hay datos de Laboratorio.");
            return false;
        }
    }

    public boolean deleteLab(int labId) {
        String sql = "DELETE FROM drugstore.labs WHERE labId=?;";

        try {
            st = connection.createConnection().prepareStatement(sql);
            st.setInt(1, labId);

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }

    public boolean inactiveLab(String labState, int labId) {
        String sql = "UPDATE drugstore.labs SET labState=? WHERE labId=?;";
        try {
            st = connection.createConnection().prepareStatement(sql);
            st.setString(1, labState);
            st.setInt(2, labId);
            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }
}
