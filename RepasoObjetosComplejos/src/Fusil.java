
public class Fusil {

	private int municion;
	private String modelo;	
	private int precision;
	
	//Constructores
	public Fusil(){
		
	}
	public Fusil(int municion, String modelo, int precision) {
		
		setMunicion(municion);
		this.modelo = modelo;
		setPrecision(precision);
	}
	
	public int getMunicion() {
		return municion;
	}
	
	public void setMunicion(int municion) {
		if(municion<50)
		this.municion = municion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPrecision() {
		return precision;
	}
	public void setPrecision(int precision) {
		if(precision < 80)
		this.precision = precision;
	}
		
	/********** toString ************/
	
	@Override
	public String toString() {
		return "Fusil [municion=" + municion + ", modelo=" + modelo + ", precision=" + precision + "]";
	}
	
	
	
}