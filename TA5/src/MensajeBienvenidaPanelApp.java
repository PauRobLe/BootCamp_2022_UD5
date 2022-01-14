/**
 * 
 * Author Pau Robusté
 * 
 */
import javax.swing.JOptionPane;
public class MensajeBienvenidaPanelApp {
	
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

	}

}
