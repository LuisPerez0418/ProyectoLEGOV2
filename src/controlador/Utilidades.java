package controlador;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JTextField;

public class Utilidades {

    public void limpiarCampos(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setText("");
            }
        }
    }

}
