
public class Ejercito {

	private Soldado misSoldados[];
	private int energiaTotal;
	
	//Constructores
	public Ejercito(){
		misSoldados = new Soldado[3];
			}
	
	public Ejercito(int cantidad){
		misSoldados = new Soldado[cantidad];
	}
	
	public void setSoldado(Soldado s){
		for(int i = 0;i<misSoldados.length;i++){
			if(misSoldados[i]==null){
				misSoldados[i] = s;
				setEnergiaTotal();
				break;
			}
		}
	}
	
	public Soldado getSoldado(int posicion){
		return misSoldados[posicion];
	}
	
	public void recuperarSoldado(int posicion){
		this.misSoldados[posicion].setNivelDeVida(100);
		setEnergiaTotal();
	}
	
	private void setEnergiaTotal(){
		for(int i = 0;i<misSoldados.length;i++){
			if(misSoldados[i]!=null)
			this.energiaTotal+=misSoldados[i].getEnergia();
		}
	}
}
