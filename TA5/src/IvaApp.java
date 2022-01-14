/**
 * 
 * Author Pau Robuste
 *
 */
import javax.swing.JOptionPane;
public class IvaApp {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
		
		String entrada = JOptionPane.showInputDialog("Introduce el precio del producto");
		double numero = Double.parseDouble(entrada);
		
		double resultativa = numero*IVA;
		
	}
}
