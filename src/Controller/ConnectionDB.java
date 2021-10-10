package Controller;
/**
 *
 * @author Miguel
 */
import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.SQLException;
import java.sql.Connection;

//import helpers.ConfirmDialog;

public class ConnectionDB {

    private static final String SERVER = "localhost";
    private static final String USERNAME = "devs";
    private static final String DBNAME = "drugstore";
    private static final int PORT = 3306;
    private static final String PASSWORD = "Miguel9495.";

    public Connection createConnection() {
        
        MysqlDataSource mds = new MysqlDataSource();
        mds.setServerName(SERVER);
        mds.setUser(USERNAME);
        mds.setPortNumber(PORT);
        mds.setPassword(PASSWORD);
        mds.setDatabaseName(DBNAME);

        try {
            return mds.getConnection();
        } catch (SQLException ex) {
            //showMessage("<html><body><center>"+ex);
            return null;
        }
    }
/*
    public void showMessage(String message) {
        ConfirmDialog cd = new ConfirmDialog(message);
        cd.btn1.setVisible(false);
        cd.btn2.setText("Aceptar");
        cd.setVisible(true);
        cd.setLocationRelativeTo(null);
    }*/
}
