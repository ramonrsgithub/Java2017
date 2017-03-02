
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Motor motor = new Motor(100,500,120);
			
			//Mostrar info del motor
			System.out.println(motor);
			
			//Modificar el motor
			motor.setCilindrada(300);
			
			
			/******************** Crear coches *********************/
			
			Coche coche = new Coche("3456-JTY","Peugeot",30000,100,250,150);
			Coche coche2 = new Coche();
			Coche coche3 = new Coche("1111-THY");
			
			/********** Establecer el fabricante ******************/
			Coche.setFabricante("PSA");
			System.out.println("Fabricante de los coche \n" + Coche.getFabricante());
			//Cambiés el nivelAceite a los 3 coches
			
			coche.getMotor().setNivelAceite(50);
			System.out.println("*******Coche después de cambiar nivel de aceite: ********");
			System.out.println(coche);
			try{
				coche2.getMotor().setNivelAceite(50);
			}
			catch(NullPointerException e){
				System.out.println("No se ha podido realizar el cambio de aceite");
			}
			
			System.out.println("*******Coche2 después de cambiar nivel de aceite: ********");
			System.out.println(coche2);
			
			
			
			
	}

}
