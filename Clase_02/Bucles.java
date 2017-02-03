
public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bucle While
		
		int i = 0;
		
		while(i < 10){
			if(i%2==0){
				System.out.println(i);
			}
			i++; //i = i + 1; i+=1
		}
		
		//Bucle for con variable local j
		
		for(int j =1;j<10;j++){
			//Código bucle
		}
		
		//do while
		java.util.Scanner lector = new java.util.Scanner(System.in);
		int edad;
		do{
			System.out.println("Introduzca la edad");
			edad = lector.nextInt();
		}
		
		while(edad < 18);
		
		
		
		
		
		
		
	}

}
