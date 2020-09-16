/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundtest;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author poohsu
 */
public class JVC implements Serializable {
    
        public static final String VALUE_PROPERTY = "value";
    
    private String value;
    
    private PropertyChangeSupport propertySupport;
    
    public JVC() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        String oldValue = this.value;
        this.value = value;
        propertySupport.firePropertyChange(VALUE_PROPERTY, oldValue, this.value);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}