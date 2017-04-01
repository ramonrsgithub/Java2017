import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDeleteUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				try{
					//1. Crear la conexi�n
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
					
					//2. Crear objeto statement para ejecutar consulta
					
					Statement objetoSentencia = con.createStatement();
					
					//3. Ejecutar instrucci�n insert Sql 
					String insertSql = "INSERT INTO PRODUCTOS (C�DIGOART�CULO,NOMBREART�CULO,PRECIO) VALUES ('AR77','PANTAL�N',23.78)";
					objetoSentencia.executeUpdate(insertSql);
					
					
					
					//3. Ejecutar instrucci�n Update
					
					String updateSql = "UPDATE PRODUCTOS SET PRECIO=PRECIO*2 WHERE C�DIGOART�CULO='AR77'";
					objetoSentencia.executeUpdate(updateSql);
					
					//3.Ejecutar instrucci�n Delete
					String deleteSql = "DELETE from productos where C�DIGOART�CULO='AR77'";
					objetoSentencia.executeUpdate(deleteSql);
					System.out.println("Datos actualizados correctamente");
				}
				
				catch(Exception e){
					System.out.println("Error en la conexi�n");
					e.printStackTrace();
				}

	}

}
