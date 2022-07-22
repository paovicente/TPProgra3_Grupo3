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

public class VentanaRegistroAdmin extends JFrame implements KeyListener, IVista {

	private JPanel contentPane;
	private JPanel panel_tituloSistemaRegistro;
	private JPanel panel_principalRegistro;
	private JLabel lblRegistroAdmin;
	private JPanel panel_IngresaDatosEmpleado;
	private JPanel panel_botonRegistro;
	private JButton btn_Registrarse;
	private JPanel panel_NombreApellido;
	private JPanel panel_TelefonoEdad;
	private JLabel label_Nombre;
	private JTextField input_Nombre;
	private JLabel label_Apellido;
	private JTextField input_Apellido;
	private JLabel label_Telefono;
	private JTextField input_Telefono;
	private JLabel lblEdad;
	private JTextField input_Edad;
	private JPanel panel_labelNombre;
	private JPanel panel_inputNombre;
	private JPanel panel_labelApellido;
	private JPanel panel_inputApellido;
	private JPanel panel_labelTelefono;
	private JPanel panel_inputTelefono;
	private JPanel panel_labelEdad;
	private JPanel panel_inputEdad;
	private ActionListener actionlistener;
	
	/**
	 * Create the frame.
	 */
	public VentanaRegistroAdmin() {
		setTitle("Usuario Empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 494);
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
		
		this.panel_NombreApellido = new JPanel();
		this.panel_NombreApellido.setBackground(SystemColor.inactiveCaption);
		this.panel_NombreApellido.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_IngresaDatosEmpleado.add(this.panel_NombreApellido);
		this.panel_NombreApellido.setLayout(new GridLayout(2, 2, 0, 0));
		
		this.panel_labelNombre = new JPanel();
		this.panel_labelNombre.setBorder(null);
		this.panel_labelNombre.setBackground(SystemColor.inactiveCaption);
		this.panel_NombreApellido.add(this.panel_labelNombre);
		this.panel_labelNombre.setLayout(new BorderLayout(0, 0));
		
		this.label_Nombre = new JLabel("Nombre");
		this.label_Nombre.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.label_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_labelNombre.add(this.label_Nombre);
		
		this.panel_inputNombre = new JPanel();
		this.panel_inputNombre.setBorder(null);
		this.panel_inputNombre.setBackground(SystemColor.inactiveCaption);
		this.panel_NombreApellido.add(this.panel_inputNombre);
		this.panel_inputNombre.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 80));
		
		this.input_Nombre = new JTextField();
		this.input_Nombre.addKeyListener(this);
		this.input_Nombre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.panel_inputNombre.add(this.input_Nombre);
		this.input_Nombre.setColumns(10);
		
		this.panel_labelApellido = new JPanel();
		this.panel_labelApellido.setBorder(null);
		this.panel_labelApellido.setBackground(SystemColor.inactiveCaption);
		this.panel_NombreApellido.add(this.panel_labelApellido);
		this.panel_labelApellido.setLayout(new BorderLayout(0, 0));
		
		this.label_Apellido = new JLabel("Apellido");
		this.label_Apellido.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.label_Apellido.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_labelApellido.add(this.label_Apellido);
		
		this.panel_inputApellido = new JPanel();
		this.panel_inputApellido.setBorder(null);
		this.panel_inputApellido.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout = (FlowLayout) this.panel_inputApellido.getLayout();
		flowLayout.setVgap(80);
		this.panel_NombreApellido.add(this.panel_inputApellido);
		
		this.input_Apellido = new JTextField();
		this.input_Apellido.addKeyListener(this);
		this.input_Apellido.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.panel_inputApellido.add(this.input_Apellido);
		this.input_Apellido.setColumns(10);
		
		this.panel_TelefonoEdad = new JPanel();
		this.panel_TelefonoEdad.setBackground(SystemColor.inactiveCaption);
		this.panel_TelefonoEdad.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_IngresaDatosEmpleado.add(this.panel_TelefonoEdad);
		this.panel_TelefonoEdad.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_labelTelefono = new JPanel();
		this.panel_labelTelefono.setBackground(SystemColor.inactiveCaption);
		this.panel_TelefonoEdad.add(this.panel_labelTelefono);
		this.panel_labelTelefono.setLayout(new BorderLayout(0, 0));
		
		this.label_Telefono = new JLabel("Tel\u00E9fono");
		this.label_Telefono.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.label_Telefono.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_labelTelefono.add(this.label_Telefono);
		
		this.panel_inputTelefono = new JPanel();
		this.panel_inputTelefono.setBackground(SystemColor.inactiveCaption);
		FlowLayout fl_panel_inputTelefono = (FlowLayout) this.panel_inputTelefono.getLayout();
		fl_panel_inputTelefono.setVgap(80);
		this.panel_TelefonoEdad.add(this.panel_inputTelefono);
		
		this.input_Telefono = new JTextField();
		this.input_Telefono.addKeyListener(this);
		this.input_Telefono.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.panel_inputTelefono.add(this.input_Telefono);
		this.input_Telefono.setColumns(10);
		
		this.panel_labelEdad = new JPanel();
		this.panel_labelEdad.setBackground(SystemColor.inactiveCaption);
		this.panel_TelefonoEdad.add(this.panel_labelEdad);
		this.panel_labelEdad.setLayout(new BorderLayout(0, 0));
		
		this.lblEdad = new JLabel("Edad");
		this.lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblEdad.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_labelEdad.add(this.lblEdad);
		
		this.panel_inputEdad = new JPanel();
		this.panel_inputEdad.setBackground(SystemColor.inactiveCaption);
		FlowLayout fl_panel_inputEdad = (FlowLayout) this.panel_inputEdad.getLayout();
		fl_panel_inputEdad.setVgap(80);
		this.panel_TelefonoEdad.add(this.panel_inputEdad);
		
		this.input_Edad = new JTextField();
		this.input_Edad.addKeyListener(this);
		this.input_Edad.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.panel_inputEdad.add(this.input_Edad);
		this.input_Edad.setColumns(10);
		
		this.panel_botonRegistro = new JPanel();
		this.panel_botonRegistro.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_botonRegistro.setBackground(SystemColor.inactiveCaption);
		this.panel_principalRegistro.add(this.panel_botonRegistro, BorderLayout.SOUTH);
		this.panel_botonRegistro.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.btn_Registrarse = new JButton("Registrarse");
		this.btn_Registrarse.setActionCommand("RegistrarseAdmin");
		this.btn_Registrarse.setEnabled(false);
		this.btn_Registrarse.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.panel_botonRegistro.add(this.btn_Registrarse);
	}

	public ActionListener getActionlistener() {
		return actionlistener;
	}

	public void setActionlistener(ActionListener actionlistener) {
		this.btn_Registrarse.addActionListener(actionlistener);
		this.actionlistener = actionlistener;
	}

	public JButton getBtn_Registrarse() {
		return btn_Registrarse;
	}

	public JTextField getInput_Nombre() {
		return input_Nombre;
	}

	public JTextField getInput_Apellido() {
		return input_Apellido;
	}

	public JTextField getInput_Telefono() {
		return input_Telefono;
	}

	public JTextField getInput_Edad() {
		return input_Edad;
	}

	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (this.input_Nombre.getText().length()>0 && this.input_Apellido.getText().length()>0 && 
				this.input_Edad.getText().length()>0 &&this.input_Telefono.getText().length()>0) {
			this.btn_Registrarse.setEnabled(true);
	     }else {
	         this.btn_Registrarse.setEnabled(false);
	     }
	}
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_Registrarse.addActionListener(actionListener);
		this.actionlistener=actionListener;
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