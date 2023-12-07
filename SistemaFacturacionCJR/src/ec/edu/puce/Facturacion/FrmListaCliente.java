package ec.edu.puce.Facturacion;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrmListaCliente extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTable table;

    
    public FrmListaCliente(DefaultTableModel modeloTabla) {
    	getContentPane().setBackground(new Color(240, 240, 240));
        setBounds(100, 100, 519, 617);
        JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 181));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrarVentana();
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem_1);
		
        JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setFont(new Font("Tahoma", Font.BOLD, 12));
        table.setModel(modeloTabla); 
        scrollPane.setViewportView(table);
    }
    public void cerrarVentana() {
        this.dispose();
    }
}