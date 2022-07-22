package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class VentanaRegistro extends JFrame implements KeyListener, IVista {

	private JPanel contentPane;
	private JPanel panel_titulo;
	private JLabel label_tituloRegistro;
	private JPanel panel_IngresoDatosRegistro;
	private JPanel panel_tipoUsuario;
	private JPanel panel_IngresaDatosUsuario;
	private JPanel panel_tituloTipoUsuario;
	private JPanel panel_opcionesTipoUsuario;
	private JLabel lblSeleccioneTipoDe;
	private JRadioButton rdbtn_opcionEmpleado;
	private JRadioButton rdbtn_opcionEmpleador;
	private JRadioButton rdbtn_opcionAdmin;
	private JLabel label_NombreDeUsuario;
	private JTextField input_NombreUsuario;
	private JLabel label_Password;
	private JButton btn_Siguiente;
	private JPasswordField passwordField;
	private JPanel panel_labelNombreUsuario;
	private JPanel panel_inputNombreUsuario;
	private JPanel panel_labelPassword;
	private JPanel panel_inputPassword;
	private JPanel panel_btnSiguiente;
	private ActionListener actionlistener;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
 /*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the frame.
	 */
	public VentanaRegistro() {
		setTitle("Sistema de Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 504);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.panel_titulo = new JPanel();
		this.panel_titulo.setBackground(SystemColor.inactiveCaption);
		this.contentPane.add(this.panel_titulo, BorderLayout.NORTH);
		this.panel_titulo.setLayout(new BorderLayout(0, 0));
		
		this.label_tituloRegistro = new JLabel("Bienvenido al sistema de Registro");
		this.label_tituloRegistro.setBackground(Color.WHITE);
		this.label_tituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		this.label_tituloRegistro.setFont(new Font("Century Gothic", Font.BOLD, 24));
		this.panel_titulo.add(this.label_tituloRegistro, BorderLayout.NORTH);
		
		this.panel_IngresoDatosRegistro = new JPanel();
		this.panel_IngresoDatosRegistro.setBackground(Color.BLACK);
		this.contentPane.add(this.panel_IngresoDatosRegistro, BorderLayout.CENTER);
		this.panel_IngresoDatosRegistro.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_tipoUsuario = new JPanel();
		this.panel_IngresoDatosRegistro.add(this.panel_tipoUsuario);
		this.panel_tipoUsuario.setLayout(new BorderLayout(0, 0));
		
		this.panel_tituloTipoUsuario = new JPanel();
		this.panel_tituloTipoUsuario.setBackground(SystemColor.inactiveCaption);
		this.panel_tipoUsuario.add(this.panel_tituloTipoUsuario, BorderLayout.NORTH);
		
		this.lblSeleccioneTipoDe = new JLabel("Seleccione tipo de usuario");
		this.lblSeleccioneTipoDe.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_tituloTipoUsuario.add(this.lblSeleccioneTipoDe);
		
		this.panel_opcionesTipoUsuario = new JPanel();
		this.panel_tipoUsuario.add(this.panel_opcionesTipoUsuario, BorderLayout.CENTER);
		this.panel_opcionesTipoUsuario.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.rdbtn_opcionEmpleado = new JRadioButton("Empleado");
		buttonGroup.add(this.rdbtn_opcionEmpleado);
		this.rdbtn_opcionEmpleado.setBackground(SystemColor.inactiveCaption);
		this.rdbtn_opcionEmpleado.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.rdbtn_opcionEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_opcionesTipoUsuario.add(this.rdbtn_opcionEmpleado);
		
		this.rdbtn_opcionEmpleador = new JRadioButton("Empleador");
		buttonGroup.add(this.rdbtn_opcionEmpleador);
		this.rdbtn_opcionEmpleador.setBackground(SystemColor.inactiveCaption);
		this.rdbtn_opcionEmpleador.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.rdbtn_opcionEmpleador.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_opcionesTipoUsuario.add(this.rdbtn_opcionEmpleador);
		
		this.rdbtn_opcionAdmin = new JRadioButton("Admin");
		buttonGroup.add(this.rdbtn_opcionAdmin);
		this.rdbtn_opcionAdmin.setBackground(SystemColor.inactiveCaption);
		this.rdbtn_opcionAdmin.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.rdbtn_opcionAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_opcionesTipoUsuario.add(this.rdbtn_opcionAdmin);
		
		this.panel_IngresaDatosUsuario = new JPanel();
		this.panel_IngresaDatosUsuario.setBackground(SystemColor.inactiveCaption);
		this.panel_IngresoDatosRegistro.add(this.panel_IngresaDatosUsuario);
		this.panel_IngresaDatosUsuario.setLayout(new GridLayout(5, 1, 0, 0));
		
		this.panel_labelNombreUsuario = new JPanel();
		this.panel_labelNombreUsuario.setBackground(SystemColor.inactiveCaption);
		this.panel_IngresaDatosUsuario.add(this.panel_labelNombreUsuario);
		this.panel_labelNombreUsuario.setLayout(new BorderLayout(0, 0));
		
		this.label_NombreDeUsuario = new JLabel("Nombre de Usuario");
		this.label_NombreDeUsuario.setHorizontalTextPosition(SwingConstants.LEADING);
		this.panel_labelNombreUsuario.add(this.label_NombreDeUsuario);
		this.label_NombreDeUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.label_NombreDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.panel_inputNombreUsuario = new JPanel();
		this.panel_inputNombreUsuario.setBackground(SystemColor.inactiveCaption);
		this.panel_IngresaDatosUsuario.add(this.panel_inputNombreUsuario);
		this.panel_inputNombreUsuario.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.input_NombreUsuario = new JTextField();
		this.input_NombreUsuario.addKeyListener(this);
		this.panel_inputNombreUsuario.add(this.input_NombreUsuario);
		this.input_NombreUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.input_NombreUsuario.setColumns(10);
		
		this.panel_labelPassword = new JPanel();
		this.panel_labelPassword.setBackground(SystemColor.inactiveCaption);
		this.panel_IngresaDatosUsuario.add(this.panel_labelPassword);
		this.panel_labelPassword.setLayout(new BorderLayout(0, 0));
		
		this.label_Password = new JLabel("Contrase\u00F1a");
		this.panel_labelPassword.add(this.label_Password);
		this.label_Password.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.label_Password.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.panel_inputPassword = new JPanel();
		this.panel_inputPassword.setBackground(SystemColor.inactiveCaption);
		this.panel_IngresaDatosUsuario.add(this.panel_inputPassword);
		
		this.passwordField = new JPasswordField();
		this.passwordField.addKeyListener(this);
		this.passwordField.setPreferredSize(new Dimension(135, 25));
		this.panel_inputPassword.add(this.passwordField);
		
		this.panel_btnSiguiente = new JPanel();
		this.panel_btnSiguiente.setBackground(SystemColor.inactiveCaption);
		this.panel_IngresaDatosUsuario.add(this.panel_btnSiguiente);
		
		this.btn_Siguiente = new JButton("Siguiente");
		this.btn_Siguiente.setEnabled(false);
		this.btn_Siguiente.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.panel_btnSiguiente.add(this.btn_Siguiente);
	}

	public ActionListener getActionlistener() {
		return actionlistener;
	}


	public JRadioButton getRdbtn_opcionEmpleado() {
		return rdbtn_opcionEmpleado;
	}

	public JRadioButton getRdbtn_opcionEmpleador() {
		return rdbtn_opcionEmpleador;
	}

	public JRadioButton getRdbtn_opcionAdmin() {
		return rdbtn_opcionAdmin;
	}

	public JTextField getInput_NombreUsuario() {
		return input_NombreUsuario;
	}

	public JButton getBtn_Siguiente() {
		return btn_Siguiente;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (this.input_NombreUsuario.getText().length()>0 && this.passwordField.getText().length()>0) {
			this.btn_Siguiente.setEnabled(true);
	     }else {
	         this.btn_Siguiente.setEnabled(false);
	     }
	}
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_Siguiente.addActionListener(actionListener);
		this.actionlistener = actionListener;
	}

	@Override
	public void cerrar() {
		this.dispose();
	}

	@Override
	public void mostrar() {
		this.setVisible(true);
		
	}
}