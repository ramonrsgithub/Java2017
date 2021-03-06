
public class Principal {

	public static void guardarProducto(Producto pros[],Producto p){
		//Recorro la matriz y busco la primera pos vac�a
		for(int i = 0;i<pros.length;i++){
			if(pros[i]==null){
				pros[i] = p;
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Ordenador("HA23","HP Omen",2000,1);
		Producto p2 = new Lavadora("LQ10","Electrolux 20",800,200);
		//Mostrar ordenador
		System.out.println(p1.toString());
		//Mostrar lavadora
		System.out.println(p2.toString());
		
		//Cambiar disco duro al ordenador
		Ordenador o = (Ordenador)p1;
		o.setDiscoDuro(2);
		((Ordenador)p1).setDiscoDuro(3);
		
		//Cambiar revoluciones a la lavadora
		((Lavadora)p2).setRevoluciones(400);
		
		p1.calcularDescuento();
		p2.calcularDescuento();
		
		Producto p3 ;
		p3 = new Ordenador();
		p3 = new Lavadora();
		
		//Crear una matriz con capacidad 10 productos
		Producto misProductos[] = new Producto[10];
		
		//Ejercicio: Solicitar al usuario que producto quiere guardar en la matriz
		//A continuaci�n se crea el producto y se guarda en la primera posicion vac�a.
		
		
		//Guardar el producto que me da la gana
		guardarProducto(misProductos, new Ordenador("HI98","HP",900,2));
		guardarProducto(misProductos,new Lavadora("KP90","Siemens",450,450));
		guardarProducto(misProductos,new Ordenador("QQ01","Asus",550,1));
		//Aplicar descuento a todos los productos de la matriz
		for(Producto p : misProductos){
			if(p!=null){
				p.calcularDescuento();
			}
			else{
				break;
			}
		}
		
		//Cambiar discos duros a todos los ordenadores
		for(Producto p : misProductos){
			if(p!=null){
			if(p instanceof Ordenador){
			((Ordenador)p).setDiscoDuro(3);
			}
			}
		}
		
		//Mostrar los productos guardados
		System.out.println("Productos guardados en la matriz:");
		for(Producto p : misProductos){
			if(p!=null){
				System.out.println(p);
			}
			else{
				break;
			}
		}
		
		
		
	}

}
