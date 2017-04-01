import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultasPreparadas {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try{
				//1. Crear la conexi�n
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
				
				//2. Preparar la consulta
				String sentencia = "SELECT NOMBREART�CULO,SECCI�N,PA�SDEORIGEN FROM PRODUCTOS WHERE" + 
				" SECCI�N=? AND PA�SDEORIGEN=?";
				PreparedStatement consultaPreparada = con.prepareStatement(sentencia);
				
				//3. Establecer los par�metros
				consultaPreparada.setString(1, "DEPORTES");
				consultaPreparada.setString(2,"USA");
				
				//4. Recorrer el resultset
				
				ResultSet resultset = consultaPreparada.executeQuery();
				while(resultset.next()){
					System.out.println(resultset.getString(1)+ " " + resultset.getString(2));
				}
			}
			
			catch(Exception e){
				System.out.println("Error en la conexi�n");
				e.printStackTrace();
			}

		}
	}


