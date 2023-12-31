package ec.edu.puce.factura;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Color;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private FrmCliente frmCliente;
	private FrmProducto frmProducto;
	private FrmFacturar frmFacturar;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setForeground(new Color(255, 128, 0));
		setBackground(new Color(255, 128, 0));
		setTitle("Sistema de facturación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 454);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(192, 192, 192));
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrarVentana();
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		JMenuItem mntmNuevoCliente = new JMenuItem("Nuevo Cliente");
		mntmNuevoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFrmClientes();
			}
		});
		mnClientes.add(mntmNuevoCliente);
		
		JMenu mnProductos = new JMenu("Productos");
		menuBar.add(mnProductos);
		
		JMenuItem mntmNuevoProducto = new JMenuItem("Nuevo Producto");
		mntmNuevoProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFrmProducto();
			}
		});
		mnProductos.add(mntmNuevoProducto);
		
		JMenu mnFacturas = new JMenu("Facturas");
		menuBar.add(mnFacturas);
		
		JMenuItem mntmFacturar = new JMenuItem("Facturar");
		mntmFacturar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFrmFacturar();
			}
		});
		mnFacturas.add(mntmFacturar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(143, 149, 188));
		contentPane.add(desktopPane, "name_335641104678300");
	}
	
	private void cerrarVentana() {
		this.dispose();
	}
	
	private void abrirFrmClientes() {
		if (this.frmCliente == null) {
			this.frmCliente = new FrmCliente();
			this.desktopPane.add(frmCliente);
			this.frmCliente.setVisible(true);
		} else if (!this.frmCliente.isVisible()){
			this.frmCliente.setVisible(true);
		} else {
			this.frmCliente.toFront();
		}
	}
	
	private void abrirFrmProducto() {
		if (this.frmProducto == null) {
			this.frmProducto = new FrmProducto();
			this.desktopPane.add(frmProducto);
			this.frmProducto.setVisible(true);
		} else if (!this.frmProducto.isVisible()){
			this.frmProducto.setVisible(true);
		} else {
			this.frmProducto.toFront();
		}
	}
	
	private void abrirFrmFacturar() {
		if (this.frmFacturar == null || this.frmFacturar.isClosed()) {
			this.frmFacturar = new FrmFacturar();
			this.desktopPane.add(frmFacturar);
			this.frmFacturar.setVisible(true);
		}  else {
			this.frmFacturar.toFront();
		}
	}
	
}