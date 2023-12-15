package ec.edu.puce.Facturacion;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class FrmDialogo extends JDialog {

	public FrmDialogo(Dialog owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtmensaje;
	private JTextField textapellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FrmDialogo dialog = new FrmDialogo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FrmDialogo() {
		super();
		setBounds(100, 100, 572, 559);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtmensaje = new JTextField();
		txtmensaje.setBounds(24, 33, 96, 19);
		contentPanel.add(txtmensaje);
		txtmensaje.setColumns(10);
		
		textapellido = new JTextField();
		textapellido.setBounds(24, 67, 96, 19);
		contentPanel.add(textapellido);
		textapellido.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
