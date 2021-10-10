package helpers;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class CustomizeJTable {
    private final Color backgroundColor, foregroundColor;
    private final Font font;

    public CustomizeJTable(){ 
        backgroundColor = new Color(34, 138, 147);
        foregroundColor = new Color(255,255,255);
        font = new Font("Tahoma", Font.BOLD, 14);
    }
    
    public void customStyleTableHeader(JTable table) {
        //Customizing header
        JTableHeader header = table.getTableHeader();
        header.setBackground(this.backgroundColor);
        header.setForeground(this.foregroundColor);
        header.setFont(this.font);
        header.setResizingAllowed(false);
        header.setReorderingAllowed(false);
    }
     
    public void centerTextColumnTable(JTable table) {
        DefaultTableCellRenderer cellRenderCenter = new DefaultTableCellRenderer();
        cellRenderCenter.setHorizontalAlignment(SwingConstants.CENTER);

        for (int columnIndex = 0; columnIndex < table.getModel().getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(cellRenderCenter);
        }
    }
    
    public void setColorCellsTable(JTable table) {
        table.setSelectionBackground(this.backgroundColor);
        table.setSelectionForeground(this.foregroundColor);
    }
}
