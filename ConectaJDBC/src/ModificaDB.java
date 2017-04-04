import java.sql.*;
public class ModificaDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			
			//"Insertar registro en la bbdd
			Statement insert = con.createStatement();
			String insertSQL = "INSERT INTO productos (C�DIGOART�CULO,SECCI�N,NOMBREART�CULO,PRECIO) VALUES ('AR55','DEPORTES','BALON BALONCESTO',30.45)";
			insert.executeUpdate(insertSQL);
			
			//Sentencia update
			String updateSQL = "UPDATE productos SET precio='200' where C�DIGOART�CULO = 'AR40'";
			insert.executeUpdate(updateSQL);
			
			//Sentencia delete
			String deleteSQL = "DELETE from productos where C�DIGOART�CULO='AR55'";
			insert.executeUpdate(deleteSQL);
		}
		
		catch(Exception e){
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}

	}

}