import java.sql.*;
public class ConsultasPreparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Definir la cadena de conexion
				try{
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
				System.out.println("Ok, conectado");
				
				String sentenciaSQL = "SELECT NOMBREART�CULO,PRECIO from productos where SECCI�N = ? AND PA�SDEORIGEN = ?";
				String sentenciaSQL2 = "SELECT * from pedidos where FORMADEPAGO = ?";
				PreparedStatement consulta = conexion.prepareStatement(sentenciaSQL);
				PreparedStatement consulta2 = conexion.prepareStatement(sentenciaSQL2);
				//Paso de par�metros
				consulta.setString(1, "DEPORTES");
				consulta.setString(2, "USA");
				
				consulta2.setString(1, "CONTADO");
				ResultSet resultado = consulta2.executeQuery();
				
				while(resultado.next()){
					System.out.println(resultado.getString(1) + " " + resultado.getString(2));
				}
				
				}
				catch(Exception e){
					System.out.println("Error en la conexion");
					e.printStackTrace();
				}

	}

}