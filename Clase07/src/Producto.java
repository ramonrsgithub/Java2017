
public abstract class Producto {

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
	
	public abstract void calcularDescuento();
		
	
	
	
}
