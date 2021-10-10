package Controller;
/**
 *
 * @author Miguel
 */
import Models.CategoryModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryController {

    private final ConnectionDB connection;
    private PreparedStatement st;

    public CategoryController() {
        this.connection = new ConnectionDB();
    }

    public CategoryModel[] listCategories() {
        
        String sql = "SELECT * FROM drugstore.categories;";
        ResultSet rs;
        
        try {
            st = connection.createConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery();

            if (rs.next()) {
                rs.last();
                CategoryModel[] category = new CategoryModel[rs.getRow()];
                rs.beforeFirst();

                while (rs.next()) {
                    category[rs.getRow() - 1] = new CategoryModel(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4)
                    );
                }
                return category;

            } else {
                //connection.showMessage("No hay registros");
                return null;
            }
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return null;
        }
    }

    public boolean newCategory(CategoryModel category) {
        String sql = "INSERT INTO drugstore.categories(categoryName, categoryDescription) VALUES(?,?);";

        if (category != null) {
            try {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, category.getName());
                st.setString(2, category.getDescription());

                return st.executeUpdate() != 0;
            } catch (SQLException ex) {
                //connection.showMessage(ex.toString());
                return false;
            }
        } else {
            //connection.showMessage("No hay datos de categoria.");
            return false;
        }
    }

    public boolean updateCategory(CategoryModel category) {
        String sql = "UPDATE drugstore.categories SET categoryName=?, categoryDescrption=?, categoryState=? WHERE categoryId=?;";

        if (category != null) {
            try {
                st = connection.createConnection().prepareStatement(sql);
                st.setString(1, category.getName());
                st.setString(2, category.getDescription());
                st.setString(3, category.getState());
                st.setInt(4, category.getId());

                return st.executeUpdate() != 0;

            } catch (SQLException ex) {
                //connection.showMessage(ex.toString());
                return false;
            }
        } else {
            //connection.showMessage("No hay datos de categoria.");
            return false;
        }
    }

    public boolean deleteCategory(int categoryId) {
        String sql = "DELETE FROM drugstore.categories WHERE categoryId=?;";

        try {
            st = connection.createConnection().prepareStatement(sql);
            st.setInt(1, categoryId);

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }

    public boolean inactiveCategory(String categoryState, int categoryId) {
        String sql = "UPDATE drugstore.categories SET categoryState=? WHERE categoryId=?;";
        try {
            st = connection.createConnection().prepareStatement(sql);
            st.setString(1, categoryState);
            st.setInt(2, categoryId);

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            //connection.showMessage(ex.toString());
            return false;
        }
    }

}
