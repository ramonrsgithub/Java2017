
public class Soldado {

	private int energia;
	private String nombre;
	private int nivelDeVida;
	private Fusil fusil;
	private SubFusil subfusil;
	private LanzaCohetes lanzacohetes;
	
	
	
	//Constructores
	public Soldado(){
		
	}
	
	public Soldado(int energia,String nombre,int nivelDeVida){
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
	public Fusil getFusil() {
		return fusil;
	}
	public void setFusil(Fusil fusil) {
		if(this.subfusil == null && this.lanzacohetes == null)
		this.fusil = fusil;
	}
	public SubFusil getSubfusil() {
		return subfusil;
	}
	public void setSubfusil(SubFusil subfusil) {
		if(this.fusil == null && this.lanzacohetes == null)
		this.subfusil = subfusil;
	}
	public LanzaCohetes getLanzacohetes() {
		return lanzacohetes;
	}
	public void setLanzacohetes(LanzaCohetes lanzacohetes) {
		if(this.subfusil == null && this.fusil == null)
		this.lanzacohetes = lanzacohetes;
	}
	
	public void cansarSoldado(int x){
		this.energia-=x;
	}
	
	public void dispararFusil(int balas){
		if(this.fusil!=null){
			this.fusil.setMunicion(this.fusil.getMunicion()-balas);
		}
	}
	
	public void dispararSubFusil(int balas){
		if(this.subfusil!=null){
			this.subfusil.setMunicion(this.subfusil.getMunicion()-balas);
		}
	}
	
	public void dispararLanzaCohetes(int balas){
		if(this.lanzacohetes!=null){
			this.lanzacohetes.setMunicion(this.lanzacohetes.getMunicion()-balas);
		}
	}

	@Override
	public String toString() {
		return "Soldado [energia=" + energia + ", nombre=" + nombre + ", nivelDeVida=" + nivelDeVida + ", fusil="
				+ fusil + ", subfusil=" + subfusil + ", lanzacohetes=" + lanzacohetes + "]";
	}
	
	
}
