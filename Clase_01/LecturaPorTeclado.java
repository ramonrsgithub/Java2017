import java.util.Scanner;
import javax.swing.*;

public class LecturaPorTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca su edad: ");
		int edad = lector.nextInt();
		System.out.println("Introduzca su email");
		String correo = lector.next();
		
		
		System.out.println("Tiene : " + edad + " años");
		System.out.println("Su correo es: " + correo);
		
		*/
		String edad2 = JOptionPane.showInputDialog("Introduzca su edad");
		
		int edadModificada = Integer.parseInt(edad2) + 10;
		
		
		System.out.println(edadModificada);
		
	}

}
