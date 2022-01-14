/**
 * 
 * Author Pau Robusté
 *
 */
import javax.swing.JOptionPane;
public class DiaLaborableApp {
	
	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("Que dia de la semana quieres consultar?");
		
		switch(dia) {
			case "Lunes":
				System.out.println("Hoy es dia laborable, hay que trabajar.");
				break;
			case "Martes":
				System.out.println("Hoy es dia laborable, hay que trabajar.");
				break;
			case "Miercoles":
				System.out.println("Hoy es dia laborable, hay que trabajar.");
				break;
			case "Jueves":
				System.out.println("Hoy es dia laborable, hay que trabajar.");
				break;
			case "Viernes":
				System.out.println("Hoy es dia laborable, hay que trabajar.");
				break;
			case "Sabado":
				System.out.println("Hoy no es dia laborable, hay que descansar.");
				break;
			case "Domingo":
				System.out.println("Hoy no es dia laborable, hay que descansar.");
				break;
		}
		
	}
}
