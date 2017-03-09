
public class Arma {
	private int municion;
	private String modelo;	
	private int precision;
	
	public Arma(){
		
	}
	public Arma(int municion,String modelo,int precision){
		this.municion = municion;
		this.modelo = modelo;
		this.precision = precision;
	}
	
	public int getMunicion() {
		return municion;
	}
	public void setMunicion(int municion) {
		
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
				
		this.precision = precision;
	}

	@Override
	public String toString() {
		return "Arma [municion=" + municion + ", modelo=" + modelo + ", precision=" + precision + "]";
	}
	
	
}
