import java.util.Scanner;
public class SentenciaSeleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores :
		//Comparaci�n es  ==
		//Distinto que es !=
		
		//L�gico Y es &&
		//L�gico O es ||
		//L�gico Not es !
		
		//Operador resto div entera %
		
		int edad = 25;
		int resto = edad % 2;
		float peso = 25.7f;
		
		
		//if else if else
		
		if(edad > 18 && peso > 50){
			//C�digo a ejecutar si es menor de edad
		}
		
		else if(edad < 30){
			//C�digo a ejecutar si es mayor de 18 y menor de 30
		}
		
		else{
			//C�digo a ejecutar si es mayor de 30
		}
		
		float deuda = 34.56f;
		boolean moroso  = deuda > 0;
		
		if(!moroso){
			System.out.println("Enhorabuena por saber administrar su dinero");
		}
		
		//switch = Select Case
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca una opci�n");
		int opcion = lector.nextInt(); //puede ser 1,2 o 3
		
		switch(opcion){
		
		case 1:
			//Codigo si opcion es 1
			break;
		case 2:
			//Codigo para opcion = 2
			break;
		case 3: 
			break;
		default:
			//C�digo si no se cumple nada de lo anterior
				break;
				
		}
		
		
		
		
		
		
		
		
	}

}
