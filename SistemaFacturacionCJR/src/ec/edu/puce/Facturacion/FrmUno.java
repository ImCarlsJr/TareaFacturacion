package ec.edu.puce.Facturacion;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmUno extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmUno frame = new FrmUno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmUno() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnMensaje = new JButton("Mensaje");
		btnMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Mensaje", "Titulo", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnMensaje.setBounds(160, 33, 113, 39);
		getContentPane().add(btnMensaje);
		
		JButton btnSioNO = new JButton("Si o NO");
		btnSioNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogResult=JOptionPane.showConfirmDialog(null, "¿Estas seguro?", "Confirme", JOptionPane.YES_NO_OPTION);
				if(dialogResult==JOptionPane.YES_OPTION)
					System.out.println("Si");
				else 
					System.out.println("No");
			}
		});
		btnSioNO.setBounds(170, 91, 89, 23);
		getContentPane().add(btnSioNO);
		
		JButton btnNewButton = new JButton("Enviar Objeto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarFormularioDos();
			}
		});
		btnNewButton.setBounds(160, 167, 113, 23);
		getContentPane().add(btnNewButton);

	}
	public void llamarFormularioDos() {
		Cliente cliente= new Cliente();
		cliente.setNombre("Alex");
		cliente.setApellido("Palma");
		
		
		FrmDos frmDos = new FrmDos(cliente);
		frmDos.setVisible(true);
		this.getParent().add(frmDos);
	}
	private void pedirDatos() {
		FrmDialogo frmDialogo= new FrmDialogo(new JDialog(),true);
		frmDialogo.setVisible(true);
		
	}
}