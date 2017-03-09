
public class Fusil extends Arma {

	
		//Constructor por defecto
		public Fusil(){
			super();
		}
	
		public Fusil(int municion,String modelo,int precision){
			//LLamada al constructor de la clase Arma
			super(municion,modelo,precision);
		}
	
	@Override
	public void setMunicion(int municion){
		if(municion<50){
			super.setMunicion(municion);
		}
	}
}
