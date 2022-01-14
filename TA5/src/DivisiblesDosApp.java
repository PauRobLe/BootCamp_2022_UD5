/**
 * 
 * Author Pau Robusté
 *
 */
import javax.swing.JOptionPane;
public class DivisiblesDosApp {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Introduce un numero:");
		double numero = Double.parseDouble(entrada);
		
		if(numero % 2 == 0) {
			System.out.println("El numero introducido es divisble entre dos.");
		}else {
			System.out.println("El numero introducido no es divisble entre dos.");
		}

	}
}