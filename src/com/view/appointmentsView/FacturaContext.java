package com.view.appointmentsView;

import com.utils.Styles;

/**
 *
 * @author Daniel Batres
 */
public class FacturaContext extends Styles {
    public int counter = 0;
    
    public float addTotal(String total, String anteriorTotal, String newTotal) {
        float finalTotal = 0;
        
        try {
            if (total.toLowerCase().contains("ingresar") || total.isEmpty()) {
                counter++;
                total = "0";
            }
            
            if (anteriorTotal.toLowerCase().contains("ingresar") || anteriorTotal.isEmpty()) anteriorTotal = "0";
                    
            if (counter != 0) {
                finalTotal = ((Float.parseFloat(total) + Float.parseFloat(newTotal)) - Float.parseFloat(anteriorTotal));
            } else {
                finalTotal = Float.parseFloat(total) + Float.parseFloat(newTotal);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        
        return finalTotal;
    }
    
    public String emptyValue(String value) {
        if (value.toLowerCase().contains("ingresar") || value.contains("$")) return "0.00";
        
        return value;
    }
    
    public String emptyString(String value) {
        if (value.toLowerCase().contains("ingresar")) return "No agregado";
        
        return value;
    }
}
