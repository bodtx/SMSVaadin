package sms.view;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ConversionException;
import com.vaadin.data.Property.ReadOnlyException;
import com.vaadin.ui.TextArea;

class MyProperty implements Property {
    Integer data     = 0;
    boolean readOnly = false;
    
    // Return the data type of the model
    public Class<?> getType() {
        return Integer.class;
    }

    public Object getValue() {
        return data;
    }
    
    // Override the default implementation in Object
    @Override
    public String toString() {
        return String.valueOf(data);
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean newStatus) {
        readOnly = newStatus;
    }

    public void setValue(Object newValue)
            throws ReadOnlyException, ConversionException {
        if (readOnly)
            throw new ReadOnlyException();
            
        // Already the same type as the internal representation
        if (newValue instanceof Integer)
            data = (Integer) newValue;
        else if(newValue instanceof TextArea)
        	data = ((String)((TextArea) newValue).getValue()).length();
        
        // Conversion from a string is required
        else if (newValue instanceof String)
            try {
                data = ((String) newValue).length();
            } catch (NumberFormatException e) {
                throw new ConversionException();
            }
        else
             // Don't know how to convert any other types
            throw new ConversionException();

        // Reverse decode the hexadecimal value
    }
}
