
public class SoldadoConHerencia {
	private int energia;
	private String nombre;
	private int nivelDeVida;
	private Arma arma;
	
	public SoldadoConHerencia(int energia, String nombre, int nivelDeVida) {
		
		this.energia = energia;
		this.nombre = nombre;
		this.nivelDeVida = nivelDeVida;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivelDeVida() {
		return nivelDeVida;
	}

	public void setNivelDeVida(int nivelDeVida) {
		this.nivelDeVida = nivelDeVida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	
	
	
}
