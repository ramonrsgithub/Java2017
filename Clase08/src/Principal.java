import java.util.Arrays;
import java.util.*;

public class Principal {

	public static void aplicarDescuento(Descuentator p){
		p.calcularDescuento();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Descuentator misProductos[] = new Descuentator[10];
		
		misProductos[0] = new Ordenador("we34","HP",450,1000);
		misProductos[1] = new Lavadora("we35","Siemens",450,700);
		misProductos[2] = new Ordenador("we36","Mac",2000,1000);
		misProductos[3] = new Lavadora("we37","Electrolux",900,700);
		misProductos[4] = new Crucero("Tenerife","Vigo",900,"Transatlantico");
		misProductos[5] = new Entrada(450);
		for(Descuentator p: misProductos){
			if(p!=null){
				p.calcularDescuento();
			}
			else{
				break;
			}
		}
		
		for(Descuentator p: misProductos){
			if(p!=null){
				System.out.println(p);
			}
			else{
				break;
			}
		}
		
		
		Producto ps[] = new Producto[4];
		
		ps[0] = new Ordenador("zwe34","HP",450,1000);
		
		ps[1] = new Lavadora("dwe35","Siemens",450,700);
		ps[2] = new Ordenador("fwe36","Mac",2000,1000);
		ps[3] = new Lavadora("awe37","Electrolux",900,700);
		
		Arrays.sort(ps);
		
		for(Producto p: ps){
			if(p!=null){
				System.out.println(p);
			}
			else{
				break;
			}
		}
		
		//Criterio de igualdad
		Producto p = new Ordenador("we34","HP",450,1000);
		Producto p2 = new Ordenador("zwe34","HP",450,1000);
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p.equals(p2));
		
		
		Set<Descuentator> productos = new HashSet<Descuentator>();
		productos.add(new Ordenador("q","Mac",4000,2000));
		productos.add(new Ordenador("qg","Hp",3000,2000));
		
		
		for(Descuentator pro:productos){
			System.out.println(pro);
		}
	}

}
