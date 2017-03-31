
public class Entrada implements Descuentator {

	public float precio;
	
	public Entrada(float precio) {
		this.precio = precio;
	}

	public void calcularDescuento(){
		this.precio*=0.50;
	}
	
	
}
