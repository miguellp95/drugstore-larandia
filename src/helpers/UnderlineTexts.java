/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

/**
 *
 * @author Miguel
 */
public class UnderlineTexts {
    
    public Font underlineText(javax.swing.JButton jb, int mode, int size, float weight){
        Font font = jb.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, mode);
        attributes.put(TextAttribute.SIZE, size);
        attributes.put(TextAttribute.WEIGHT, weight);
        
        return font.deriveFont(attributes);
    }
}
