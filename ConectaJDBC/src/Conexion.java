import java.sql.*;
import javax.sql.*;
public class Conexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Definir la cadena de conexion
		try{
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
		System.out.println("Ok, conectado");
		
		//2. Crear la sentencia
		Statement sentencia = conexion.createStatement();
		String sqlSentencia = "SELECT * from productos";
		//3. Recoger los resultados
		ResultSet resultado = sentencia.executeQuery(sqlSentencia);
		
		//4. Recorrer el resultSet
		while(resultado.next()){
			System.out.println(resultado.getString("CÓDIGOARTÍCULO") + " " + resultado.getString(2) + " " + resultado.getString("NOMBREARTÍCULO"));
		}
		
		
		
		}
		catch(Exception e){
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		
		
	}

}
