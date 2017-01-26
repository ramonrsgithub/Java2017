
public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 10;
		byte c = (byte)(b + 1);
		
		float grados = 4.56f;
		float grados2 = (float)4.56;
		
		//float grados3 = (5f/9)*10000 +32;
		float grados3 = ((float)5/9)*10000 +32;
		System.out.println(grados3);
		
		
		//Wrappers: Envoltorios .
		//Por cada variable primitiva hay un wrapper con funciones.
		Float envoltorio = new Float(grados);
		String nDecimal = envoltorio.toString();
				
		String numeroDecimal = Float.toString(grados);
		
		//Pasar un int a String
		
		int x = 10;
		
	    String numeroInt = Integer.toString(x);
	    
	    //Pasar un número a binario
	    
	    int numero = 123;
	    String numeroBinario = Integer.toBinaryString(numero);
	    System.out.println(numero  + numeroBinario);
	    
	   //Pasar de un String a un numero
	    
	    String numero2 = "23";
	    int num = Integer.parseInt(numero2);
	    float numFloar = Float.parseFloat(numero2);
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
