
public class Coche {
	private String matricula;
	private String marca;
	private float precio;
	private Motor motor;
	private static String fabricante;
	
	//Constructor
	
	//Por defecto
	public Coche(){
		this.motor = new Motor();
	}
	
	//Constructor con todos los datos de un coche
	
	public Coche(String matricula, String marca,float precio,int nivelAceite,int cilindrada,int potecia){
		if(validarMatricula(matricula)){
			this.matricula = matricula;
		}
		
		this.marca = marca;
		this.precio = precio;
		//Crear el objeto motor
		this.motor = new Motor(nivelAceite,cilindrada,potecia);
		
	
	}
	
	public Coche(String matricula){
		if(validarMatricula(matricula)){
			this.matricula = matricula;
		}
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if(validarMatricula(matricula)){
			this.matricula = matricula;
		}
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public Motor getMotor(){
		return this.motor;
	}
	
	
	
	//Validar matricula
	private boolean validarMatricula(String matricula){
		boolean correcta = true;
		//Las matr�culas tienen que tener 8 caracteres , los 4 primeros n�meros
		if(matricula.length()==8){
			for(int i = 0;i<4;i++){
				if(Character.isLetter(matricula.charAt(i))){
					correcta = false;
					break; //Salgo del bucle
				}
			}
			
		}
		
		else{
			correcta = false;
		}
		
		return correcta;
		
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + ", motor=" + motor + "]";
	}
	
	public static String getFabricante(){
		return fabricante;
	}
	
	public static void setFabricante(String f){
		fabricante = f;
	}
    public static void guardarCoche(Coche c,Coche garaje[]){
		
		for(int i = 0;i<garaje.length;i++){
			if(garaje[i]==null){
				garaje[i] = c;
				break;
			}
		}
		
	}
	
}
