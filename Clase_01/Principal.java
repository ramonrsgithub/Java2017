
public class Principal {

	enum diasSemana {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.out.println("Hola Mundo");
		
		
	/* Esto es un comentario
	  con varias lineas de texto	
	 */
		
	//Variables primitivas
	
	//Números
	
	byte a1 = 0; //Hay que inicializar las variables cuando nos interese utilizarlas.
	short b = a1;
	int c;
	long d;
	
	float f = 4.567f;
	double g = 4.590231;
	
	
	//Booleanos
	boolean h = false;
	
	//caracter
	char j = 'j';
	
	//String es un objetos
	
	String frase = "Hola me encanta Java!";
	
	
	//Mostrar por consola el valor de una variable
	
	System.out.println("La variable f vale " + f);
	
	
	//Declaración de constante
	
	final double velocidadLuz = 30000000000.45323232 ;
	
	
	//Ejemplo Enumerado Dias Semana
	diasSemana dia = diasSemana.LUNES;
	
	
	
	
			
	
	
		

	}

}


