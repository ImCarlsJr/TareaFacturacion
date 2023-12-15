package ec.edu.puce.Facturacion;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class FrmDos extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	public FrmDos(Cliente cliente) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblMensaje = new JLabel("Enviado");
		lblMensaje.setBounds(97, 35, 234, 30);
		getContentPane().add(lblMensaje);

		lblMensaje.setText(cliente.getNombre()+" "+cliente.getApellido());
	}

}