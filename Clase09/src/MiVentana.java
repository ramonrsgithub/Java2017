import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MiVentana extends JFrame implements ActionListener  {

	//Controles de la ventana
	JLabel etiqueta;
	JTextField caja;
	JButton btnConversorEuros;
	JButton btnConversorDolares;
	JButton btnUno,btnDos,btnTres,btnCuatro,btnMas,btnIgual;
	double euros;
	double dolares;
	
	double numero1,numero2,resultado;
	char operacion;
	
	//Constructor
	
	public MiVentana(){
		
		this.setSize(300,200);
		this.setTitle("Mi propia Ventanita");
		this.setLayout(new FlowLayout());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Llamo a funci�n que agrega controles
		initComponents();
		
		setVisible(true);
		
	}
	
	private void initComponents(){
		etiqueta = new JLabel("Introduzca una cantidad");
		caja = new JTextField(20);
		this.btnConversorDolares = new JButton("Convertir a dolares");
		this.btnConversorEuros = new JButton("Convertir a euros");
		this.btnUno = new JButton("1");
		this.btnDos = new JButton("2");
		this.btnTres = new JButton("3");
		this.btnCuatro = new JButton("4");
		this.btnMas = new JButton("+");
		this.btnIgual = new JButton("=");
		//Agregarlos al contentPane
		this.getContentPane().add(etiqueta);
		this.getContentPane().add(caja);
		this.add(btnConversorDolares);
		this.add(btnConversorEuros);
		this.add(btnUno);
		this.add(btnDos);
		this.add(btnTres);
		this.add(btnCuatro);
		this.add(btnMas);
		this.add(btnIgual);
		
		//Agregar actionlisteners
		this.btnConversorEuros.addActionListener(this);
		this.btnConversorDolares.addActionListener(this);
		this.btnUno.addActionListener(new Manejador1());
		this.btnDos.addActionListener(new Manejador1());
		this.btnTres.addActionListener(new Manejador1());
		this.btnCuatro.addActionListener(new Manejador1());
		this.btnMas.addActionListener(new ManejadorOperacion());
		
		//Asignar manejador an�nimo al boton igual
		
		this.btnIgual.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				numero2 = Double.parseDouble(caja.getText());
				
				switch(operacion){
				case '+':
					resultado = numero1 + numero2;
					break;
				case '-':
					resultado = numero1 - numero2;
				}
				
				caja.setText(Double.toString(resultado));
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Preguntar qui�n ha generado el evento
		if(e.getSource()== this.btnConversorDolares){
		euros = Double.parseDouble(caja.getText());
		dolares = euros*0.89;
		caja.setText(Double.toString(dolares));
		}
		else{
			dolares = Double.parseDouble(caja.getText());
			euros = dolares*1.13;
			caja.setText(Double.toString(euros));
		}
		
	}
	
	class Manejador1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton origen = (JButton)e.getSource();
			caja.setText(caja.getText() + origen.getText());
		}
		
	}
	
	class ManejadorOperacion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			numero1 = Double.parseDouble(caja.getText());
			operacion = '+';
			caja.setText("");
		}
		
	}
	
}//Fin del JFrame
