package CalculosMatematicos;

public class MatricesFunciones {
	
	int sueldo = 900;
	public static void sumar10(int x[]){
		
		for(int i = 0;i<x.length;i++){
			x[i] += 10;
		}
		
	}
	
	public static void mostrarMatric(int x[]){
		for(int valor : x){
			System.out.print(valor + " ");
		}
	}
	
	public static void sumar10yRestar20(int x[]){
		sumar10(x);
		
		for(int i =0;i<x.length;i++){
			x[i] -=20;
		}
	}

}
