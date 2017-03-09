
public class Canguro extends Animal {

	private float volBolsaMarsupial;
	
	public Canguro(){
		
	}

	public Canguro(String raza, int fuerza, String tipoReproductivo,float volBolsa) {
		super(raza, fuerza, tipoReproductivo);
		this.volBolsaMarsupial = volBolsa;
	}

	public float getVolBolsaMarsupial() {
		return volBolsaMarsupial;
	}

	public void setVolBolsaMarsupial(float volBolsaMarsupial) {
		this.volBolsaMarsupial = volBolsaMarsupial;
	}

	@Override
	public String toString() {
		return "Canguro [volBolsaMarsupial=" + volBolsaMarsupial + "]";
	}
	
	@Override
	public String comer(){
		return "Como como un canguro";
	}
	
	
	public String hablar(){
		return "Hablo como un canguro";
	}
	
	
}
