package org.joshy.html.forms;

import java.util.*;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.JComponent;
import org.joshy.u;
import org.joshy.html.box.*;
import org.joshy.html.*;
import org.w3c.dom.*;

public class InputText extends FormItemLayout {
    
    public InputText() {
    }
    
    public JComponent createComponent(Element elem) {
        JTextField comp = new JTextField();
        commonPrep(comp,elem);
        if(elem.hasAttribute("value")) {
            comp.setText(elem.getAttribute("value"));
        }
        if(elem.hasAttribute("size")) {
            comp.setColumns(Integer.parseInt(elem.getAttribute("size")));
        } else {
            comp.setColumns(15);
        }
        return comp;
    }
    
}
