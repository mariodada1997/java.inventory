package ContabilidadJamones;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing. JPanel;
import javax.swing. JTextField;

public class cMiscelanea {
    public void Deshabilitar(JPanel panel) {
        JTextField cajaTexto;
        JComboBox comboBox;
        for (int x=0; x<panel.getComponentCount(); x++) {
            if (panel.getComponent(x) instanceof JTextField) {
                cajaTexto=(JTextField) panel.getComponent(x);
                cajaTexto.setEditable(false);
            }
            if (panel.getComponent(x) instanceof JComboBox) {
                comboBox=(JComboBox) panel.getComponent(x);
                comboBox.setEditable(false);
                comboBox.setEnabled(false);
            }
        }
    }
    public void Habilitar(JPanel panel) {
        JTextField cajaTexto;
        JComboBox comboBox;
        for (int x=0; x<panel.getComponentCount(); x++) {
            if (panel.getComponent(x) instanceof JTextField) {
                cajaTexto=(JTextField) panel.getComponent(x);
                cajaTexto.setEditable(true);
            }
            if (panel.getComponent(x) instanceof JComboBox) {
                comboBox=(JComboBox) panel.getComponent(x);
                comboBox.setEditable(true);
                comboBox.setEnabled(true);
            }
        }
    }
    public void Limpiar(JPanel panel) {
        JTextField cajaTexto;
        JComboBox seleccionado;
        for (int x2=0; x2<panel.getComponentCount(); x2++) {
            if (panel.getComponent(x2) instanceof JComboBox) {
                seleccionado=(JComboBox) panel.getComponent(x2);
                seleccionado.setSelectedItem(null);
            }
        }
    }
    
    public void LimpiarProducto(JPanel panel) {
        JTextField cajaTexto;
        JComboBox seleccionado;
        for (int x=0; x<panel.getComponentCount(); x++) {
            if (panel.getComponent(x) instanceof JTextField) {
                cajaTexto=(JTextField) panel.getComponent(x);
                cajaTexto.setText("");
            }
        }
        for (int x2=0; x2<panel.getComponentCount(); x2++) {
            if (panel.getComponent(x2) instanceof JComboBox) {
                seleccionado=(JComboBox) panel.getComponent(x2);
                seleccionado.setSelectedItem(null);
            }
        }
    }
    
    public cMiscelanea () { 
    }
}
