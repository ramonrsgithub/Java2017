import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//1. Crear la conexión
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
			
			//2. Crear objeto statement para ejecutar consulta
			
			Statement objetoSentencia = con.createStatement();
			//3. Ejecutar instrucción Sql y guardar resultados en resultset
			String sentenciaSql = "Select * from productos";
			ResultSet resultset = objetoSentencia.executeQuery(sentenciaSql);
			
			//4. Recorrer el resultset
			
			while(resultset.next()){
				System.out.println(resultset.getString("CÓDIGO ARTÍCULO")+ " " + resultset.getString("NOMBRE ARTÍCULO"));
			}
		}
		
		catch(Exception e){
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

	}

}
