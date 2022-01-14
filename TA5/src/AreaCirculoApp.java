/**
 * 
 * Author Pau Robusté
 *
 */
import javax.swing.JOptionPane;
public class AreaCirculoApp {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Introduce el radio del circulo");
		double numero = Double.parseDouble(entrada); 
		
		double resultat = Math.PI * Math.pow(numero, 2);
		
		System.out.println(resultat);
	}
}
