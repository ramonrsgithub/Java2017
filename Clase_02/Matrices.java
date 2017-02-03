import java.util.Arrays;
public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definir matriz con capacidad para 10 numeros enteros
		int matriz[] = new int[10];
		int valoresIniciales[] = {1,6,2,4,6};
		
		float matriz2[] = new float[20];
		
		matriz[0] = 8;
		
		
		//Mostrar valores por defecto for tradicional
		for(int i = 0;i<matriz.length;i++){
			System.out.print(matriz[i] + " ");
		}
		System.out.println();
		//Mostrar valores por defecto for in
		
		for(int valor : matriz){
			System.out.print(valor + " ");
		}
		
		System.out.println();
		for(float valor : matriz2){
			System.out.print(valor + " ");
		}
		
		System.out.println();
		//Librería Arrays: funciones para trabajar con matrices
		//Ordenar un Array
		
		Arrays.sort(valoresIniciales);
		
		//Mostrar por pantalla el array después de ordenar
		System.out.println("Matriz ordenada:");
		
		for(int valor : valoresIniciales){
			System.out.print(valor + " ");
		}
		System.out.println();
		//Funciones de búsqueda
		int posicion = Arrays.binarySearch(valoresIniciales, 6);
		System.out.println("El numero está en la posición: \n" + posicion);
		
		
		//*********** MATRICES 2D **************//
		
		int matriz2D[][] = new int[2][2];
		int matriz2DconValores[][] = {{2,3,4,6,4,5,6,4,2,1},{5,6,7},{7,9,0}};
		
		
		for(int i = 0; i<matriz2DconValores.length;i++){
			for(int j = 0;j<matriz2DconValores[i].length;j++){
				System.out.print(matriz2DconValores[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
