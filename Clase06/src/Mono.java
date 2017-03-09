
public class Mono extends Animal {
	private int numeroDePulgas;
	

	public Mono() {
		super();
	}

	public Mono(String raza, int fuerza, String tipoReproductivo,int numeroDePulgas) {
		super(raza, fuerza, tipoReproductivo);
		this.numeroDePulgas = numeroDePulgas;
		
			}
	
	public int getNumeroDePulgas() {
		return numeroDePulgas;
	}

	public void setNumeroDePulgas(int numeroDePulgas) {
		this.numeroDePulgas = numeroDePulgas;
	}

	@Override
	public String toString() {
		return "Mono [numeroDePulgas=" + numeroDePulgas + "]";
	}
	
	@Override
	public String comer(){
		return "Como como un mono, muchos plátanos";
	}
	
	
	public String hablar(){
		return "uuhh, uuhh,uuhh";
	}
	

}
