package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.BoxLayout;
import java.awt.Insets;
import java.awt.Component;

public class VentanaRegistroAdmin extends JFrame implements KeyListener, IVista {

	private JPanel contentPane;
	private JPanel panel_tituloSistemaRegistro;
	private JPanel panel_principalRegistro;
	private JLabel lblRegistroAdmin;
	private JPanel panel_IngresaDatosEmpleado;
	private JPanel panel_botonRegistro;
	private JButton btn_Registrarse;
	private ActionListener actionListener;
	private JPanel panelNombre;
	private JPanel panelInputNombre;
	private JLabel lbl_Nombre;
	private JTextField inputNombre;
	
	/**
	 * Create the frame.
	 */
	public VentanaRegistroAdmin() {
		setTitle("Usuario Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 413);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.panel_tituloSistemaRegistro = new JPanel();
		this.panel_tituloSistemaRegistro.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_tituloSistemaRegistro.setBackground(SystemColor.inactiveCaption);
		this.contentPane.add(this.panel_tituloSistemaRegistro, BorderLayout.NORTH);
		
		this.lblRegistroAdmin = new JLabel("Registro Admin");
		this.lblRegistroAdmin.setFont(new Font("Century Gothic", Font.BOLD, 24));
		this.panel_tituloSistemaRegistro.add(this.lblRegistroAdmin);
		
		this.panel_principalRegistro = new JPanel();
		this.panel_principalRegistro.setBackground(SystemColor.inactiveCaption);
		this.panel_principalRegistro.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.contentPane.add(this.panel_principalRegistro, BorderLayout.CENTER);
		this.panel_principalRegistro.setLayout(new BorderLayout(0, 0));
		
		this.panel_IngresaDatosEmpleado = new JPanel();
		this.panel_IngresaDatosEmpleado.setBackground(SystemColor.inactiveCaption);
		this.panel_principalRegistro.add(this.panel_IngresaDatosEmpleado, BorderLayout.CENTER);
		this.panel_IngresaDatosEmpleado.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panelNombre = new JPanel();
		this.panelNombre.setBackground(SystemColor.inactiveCaption);
		this.panel_IngresaDatosEmpleado.add(this.panelNombre);
		this.panelNombre.setLayout(new BorderLayout(0, 0));
		
		this.lbl_Nombre = new JLabel("Nombre");
		this.lbl_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		this.lbl_Nombre.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		this.panelNombre.add(this.lbl_Nombre);
		
		this.panelInputNombre = new JPanel();
		this.panelInputNombre.setBackground(SystemColor.inactiveCaption);
		this.panel_IngresaDatosEmpleado.add(this.panelInputNombre);
		this.panelInputNombre.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 130));
		
		this.inputNombre = new JTextField();
		this.inputNombre.addKeyListener(this);
		this.inputNombre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.inputNombre.setColumns(10);
		this.panelInputNombre.add(this.inputNombre);
		
		this.panel_botonRegistro = new JPanel();
		this.panel_botonRegistro.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_botonRegistro.setBackground(SystemColor.inactiveCaption);
		this.panel_principalRegistro.add(this.panel_botonRegistro, BorderLayout.SOUTH);
		this.panel_botonRegistro.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.btn_Registrarse = new JButton("Registrarse");
		this.btn_Registrarse.setEnabled(false);
		this.btn_Registrarse.setActionCommand("RegistrarseAdmin");
		this.btn_Registrarse.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.panel_botonRegistro.add(this.btn_Registrarse);
	}

	public ActionListener getActionListener() {
		return actionListener;
	}

	public JButton getBtn_Registrarse() {
		return btn_Registrarse;
	}

	public JTextField getInput_Nombre() {
		return inputNombre;
	}

	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (this.inputNombre.getText().length()>0) {
			this.btn_Registrarse.setEnabled(true);
	     }else {
	         this.btn_Registrarse.setEnabled(false);
	     }
	}
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void cerrar() {
		this.dispose();
		
	}

	@Override
	public void mostrar() {
		this.setVisible(true);
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_Registrarse.addActionListener(actionListener);
		this.actionListener = actionListener;	
	}

}