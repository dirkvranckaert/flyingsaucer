package org.joshy.html.forms;

import java.util.*;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.*;
import javax.swing.JComponent;
import org.joshy.u;
import org.joshy.html.box.*;
import org.joshy.html.*;
import org.w3c.dom.*;

public class InputSelect extends FormItemLayout {
    
    public InputSelect() {
    }
    
    public JComponent createComponent(Element elem) {
        JComboBox comp = new JComboBox();
        commonPrep(comp,elem);
        
        NodeList options = elem.getElementsByTagName("option");
        for(int i=0; i<options.getLength(); i++) {
            Element value = (Element)options.item(i);
            String svalue = value.getFirstChild().getNodeValue();
            comp.addItem(svalue);
        }
        
        return comp;
    }
    
}
