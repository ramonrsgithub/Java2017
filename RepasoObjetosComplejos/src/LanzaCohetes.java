
public class LanzaCohetes {
	private int municion;
	private String modelo;	
	private int precision;
	
	/************* Constructores *******************/
	public LanzaCohetes(){
		
	}
	public LanzaCohetes(int municion, String modelo, int precision) {
		this.municion = municion;
		this.modelo = modelo;
		this.precision = precision;
	}
	public int getMunicion() {
		return municion;
	}
	public void setMunicion(int municion) {
		if(municion <100)
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
		if(precision<95)
		this.precision = precision;
	}
	
	
	
	
}
