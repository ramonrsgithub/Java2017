import CalculosMatematicos.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[] = {1,2,3,4,5,6};
		
		MatricesFunciones.sumar10yRestar20(matriz);
		
		MatricesFunciones prueba = new MatricesFunciones();
		prueba.mostrarMatric(matriz);
		
		
		Alumno a = new Alumno();
		a.nombre = "Anxo Alonso";
		a.capacidadAtencion = -100;
		
		a.espabilar();

	}

}
