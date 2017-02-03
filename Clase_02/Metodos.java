
public class Metodos {

	
	//Método que dice si un numero es primo
	
	public static boolean isPrimo(int x){
		
		boolean primo = true;
		
		for(int i = 2;i<x;i++){
			if(x%i ==0){
				primo = false;
				break;
			}
		}
		
		return primo;
			
	}
	
	//Método que no devuelve nada
	
	public static void modificarArray(int x[]){
		x[0] = 1000;
	}
	
	public static void mostrarMatriz(int x[]){
		
		for(int valor : x){
			System.out.print(valor + " ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int numero = 7;
			
			if(isPrimo(numero)){
				System.out.println("PRIMOOOOO");
			}
			
			else{
				System.out.println("No es primo");
			}
			
			int matriz[] = {4,5,6,7};
			
			modificarArray(matriz);
		
			mostrarMatriz(matriz);
	}

}
