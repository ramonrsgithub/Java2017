
public abstract class Producto implements Descuentator,Comparable<Producto> {

	private String id;
	private String nombre;
	protected float precio;
	
	//Constructores
	
	public Producto(String id, String nombre, float precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	public int compareTo(Producto p){
		return this.id.compareTo(p.id);
	}

	@Override
	public void calcularDescuento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		Producto other = (Producto) obj;
		
		if(this.id==other.id){
			return true;
		}
		else{
			return false;
		}
	}

	

	
	//Criterio de igualdad: Por id
	
	
	
	
	
	
}
