/**
 * 
 * Author Pau Robuste
 *
 */
import javax.swing.JOptionPane;

public class ContrasenaApp {
	
	public static void main(String[] args) {
		
		String contra = "Psswrd";
		String dia = "";
		int intents = 3;
				
		do{
			dia = JOptionPane.showInputDialog("Cual es la contrasenya?");
			
			if(dia.equals(contra)) {
				System.out.println("Enhorabuena, has accedido.");
				break;
			}else {
				intents--;
			}
			
		}while(intents!=0 || dia.equals(contra));
		
		if(intents == 0) {
			System.out.println("Te has quedado sin intentos, cuenta bloqueada.");
		}
	}

}
