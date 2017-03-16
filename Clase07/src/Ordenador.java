
public class Ordenador extends Producto {

	private int discoDuro;

	public Ordenador(){
		super();
	}
	
	public Ordenador(String id,String nombre,float precio,int discoDuro){
		super(id,nombre,precio);
		this.discoDuro = discoDuro;
	}

	@Override
	public String toString() {
		return super.toString() + "Ordenador [discoDuro=" + discoDuro + "]";
	}

	public int getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(int discoDuro) {
		this.discoDuro = discoDuro;
	}
	
	public void calcularDescuento(){
		if(this.discoDuro < 1){
			//precio -= precio*0.1;
			super.setPrecio(super.getPrecio()-(float)0.1*super.getPrecio());
		}
		else{
			precio-=precio*0.2;
		}
	}
	
	
}
