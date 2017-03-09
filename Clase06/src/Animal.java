
public abstract class Animal {

	private String raza;
	private int fuerza;
	private String tipoReproductivo;
	
	public Animal(){
		
	}
	public Animal(String raza, int fuerza,String tipoReproductivo) {
		this.raza = raza;
		this.fuerza = fuerza;
		this.tipoReproductivo = tipoReproductivo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public String getTipoReproductivo() {
		return tipoReproductivo;
	}
	public void setTipoReproductivo(String tipoReproductivo) {
		this.tipoReproductivo = tipoReproductivo;
	}
	@Override
	public String toString() {
		return "Animal [raza=" + raza + ", fuerza=" + fuerza + ", tipoReproductivo=" + tipoReproductivo + "]";
	}
	//Chorrifunciones
	public String comer(){
		return "Como como un animal";
	}
	
	public abstract String hablar();
		//return "Hablo como un animal";
	
	
	
}
