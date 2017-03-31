
public class Crucero extends Viaje implements Descuentator {

	private String tipoBarco;

	public Crucero(String destino,String origen,float precio,String tipoBarco) {
		super(destino,origen,precio);
		this.tipoBarco = tipoBarco;
	}

	public String getTipoBarco() {
		return tipoBarco;
	}

	public void setTipoBarco(String tipoBarco) {
		this.tipoBarco = tipoBarco;
	}

	@Override
	public String toString() {
		return super.toString() + "Crucero [tipoBarco=" + tipoBarco + "]";
	}
	
	public void calcularDescuento(){
		if(this.tipoBarco == "trasatlantico"){
			super.precio=super.precio*0.9f;
		}
		else{
			super.precio*=0.8;
		}
	}
	
	
}
