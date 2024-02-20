package controlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JTextField;

public class Utilidades {

    Color letrasBase = new Color(0, 0, 0);
    Color letrasAlternativo = new Color(1, 1, 1);
    
    /* Método para limpiar todos los jTextField en un panel */
    public void limpiarCampos(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setText("");
            }
        }
    }
    
    /* Método para que los campos vacíos se conviertan en "0" */
    public static void aCero(JTextField campo) {
        if (campo.getText().isEmpty()) {
            campo.setText("0");
        }
    }

}
