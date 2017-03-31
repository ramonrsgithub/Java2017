
public class Viaje {

	private String destino;
	private String origen;
	protected float precio;
	
	public Viaje(){
		
	}
	public Viaje(String destino, String origen, float precio) {
		this.destino = destino;
		this.origen = origen;
		this.precio = precio;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Viaje [destino=" + destino + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
