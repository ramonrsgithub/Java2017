
public class ProbarSoldadConHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoldadoConHerencia s = new SoldadoConHerencia(100,"Pepe",100);
		s.setArma(new Metralleta(100000,"WWWW",40));
		
		Arma a = s.getArma();
		s.getArma().setMunicion(10);
	}

}
