
public class Lavadora extends Producto {

	private int revoluciones;

	public Lavadora(){
		super();
	}
	public Lavadora(String id, String nombre, float precio, int revoluciones) {
		super(id, nombre, precio);
		this.revoluciones = revoluciones;
	}
	public int getRevoluciones() {
		return revoluciones;
	}
	public void setRevoluciones(int revoluciones) {
		this.revoluciones = revoluciones;
	}
	@Override
	public String toString() {
		return super.toString() + "Lavadora [revoluciones=" + revoluciones + "]";
	}
	
	public void calcularDescuento(){
		if(this.revoluciones < 200){
			//precio -= precio*0.1;
			super.setPrecio(super.getPrecio()-(float)0.1*super.getPrecio());
		}
		else{
			precio-=precio*0.2;
		}
	}
	
	
	
	
}
