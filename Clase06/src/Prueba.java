
public class Prueba {
	public static String hacerHablar(Animal a){
		return a.hablar();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Canguro("Palleiro",90,"Oviparo",4f);
		Mono m = new Mono("El del ZOO",80,"Viv�paro",2);
		Canguro c = new Canguro("Australiano",20,"Viviparos",50.5f);
		System.out.println(m.comer());
		System.out.println(a.comer());
		
		//POLIMORFISMOOOOOOOOO
		Animal mianimal = new Mono("El del ZOO",80,"Viv�paro",2);
		
		mianimal = c;
		
		System.out.println(hacerHablar(c));
		System.out.println(hacerHablar(new Mono()));
		
		
	}

}
