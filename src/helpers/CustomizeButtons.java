package helpers;

import java.awt.Component;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.font.TextAttribute;

public class CustomizeButtons {
 
    private Color primaryColor;
    private Color cancelColor;
    private final UnderlineTexts underlineObj;
    private final int underlineDashed;
    private final float weightBold;
    private final float weightRegular;
    private final int noUnderline;
    
    public CustomizeButtons(){
        primaryColor = new Color(34, 138, 147);
        cancelColor = new Color(255, 0, 0);
        underlineObj = new UnderlineTexts();
        underlineDashed = TextAttribute.UNDERLINE_LOW_DASHED;
        weightBold = TextAttribute.WEIGHT_BOLD;
        weightRegular = TextAttribute.WEIGHT_REGULAR;
        noUnderline = -1;
    }
    
    public void setHandCursor(Component obj) {
        obj.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public void stylizeModuleButton(JButton button, int fontSize) {
        button.setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, this.primaryColor));
        button.setFont(underlineObj.underlineText(button, this.underlineDashed, fontSize, this.weightBold));
    }

    public void normalStyleModuleButton(JButton button, int fontSize) {
        button.setFont(underlineObj.underlineText(button, this.noUnderline, fontSize, this.weightRegular));
        button.setBorder(BorderFactory.createLineBorder(primaryColor, 3));
    }
    
    public void stylizeModuleCancelButton(JButton button, int fontSize) {
        button.setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, this.cancelColor));
        button.setFont(underlineObj.underlineText(button, this.underlineDashed, fontSize, this.weightBold));
    }

    public void normalStyleModuleCancelButton(JButton button, int fontSize) {
        button.setFont(underlineObj.underlineText(button, this.noUnderline, fontSize, this.weightRegular));
        button.setBorder(BorderFactory.createLineBorder(cancelColor, 3));
    }
    
    public void setBorderBottom(JButton button){
        button.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, this.primaryColor));
    }
    
    public Color getprimaryColor(){
        return this.primaryColor;
    }
    
    public void setPrimaryColor(Color color){
        this.primaryColor = color;
    }
    
    public Color getCancelColor(){
        return this.cancelColor;
    }
    
    public void setCancelColor(Color color){
        this.cancelColor = color;
    }
}
