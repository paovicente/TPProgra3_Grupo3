package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Font;
import javax.swing.border.LineBorder;

import modelo.UsuarioInteractivo;

import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class VentanaEmpleado extends JFrame implements IVista {

	private JPanel contentPane;
	private JPanel panel_Acciones;
	private JPanel panel_getElecciones;
	private JPanel panel_cerrarSesion;
	private JLabel lblRondaElecciones;
	private JLabel label_MostrarElecciones;
	private JPanel panel_RondaEncuentros;
	private JPanel panel_AgregarEmpleado;
	private JPanel panel_actionElecciones;
	private JPanel panel_btnCerrarSesion;
	private JPanel panel_btnElecciones;
	private JButton btn_mostrarElecciones_1;
	private JPanel panel_infoElecciones;
	private JPanel panel_labelElecciones;
	private JPanel panel_textAreaElecciones;
	private JScrollPane scrollPane;
	private JList<UsuarioInteractivo> listEleccionesEmpleado;
	private ActionListener actionListener;
	private JButton btn_rondaElecciones;
	private JPanel panel_btnRondaElecciones;
	private JPanel panel_lblRondaEncuentros;
	private JLabel label_agregarEmpleado;
	private JPanel panel_lblagregarEmpleado;
	private JButton btn_agregarEmpleado;
	private JPanel panel_btnAgregarEmpleado;
	private JButton btn_cerrarSesion;
	private DefaultListModel<UsuarioInteractivo> modeloLista;

	/**
	 * Launch the application.
	 */
 /*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEmpleado frame = new VentanaEmpleado();
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
	public VentanaEmpleado() {
		this.modeloLista = new DefaultListModel<UsuarioInteractivo>();
		setTitle("Empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 489);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_Acciones = new JPanel();
		this.panel_Acciones.setBackground(SystemColor.inactiveCaption);
		this.panel_Acciones.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_Acciones);
		this.panel_Acciones.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_RondaEncuentros = new JPanel();
		this.panel_RondaEncuentros.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_RondaEncuentros.setBackground(SystemColor.inactiveCaption);
		this.panel_Acciones.add(this.panel_RondaEncuentros);
		this.panel_RondaEncuentros.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_lblRondaEncuentros = new JPanel();
		this.panel_lblRondaEncuentros.setBackground(SystemColor.inactiveCaption);
		this.panel_RondaEncuentros.add(this.panel_lblRondaEncuentros);
		this.panel_lblRondaEncuentros.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.lblRondaElecciones = new JLabel("Ronda Elecciones");
		this.panel_lblRondaEncuentros.add(this.lblRondaElecciones);
		this.lblRondaElecciones.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblRondaElecciones.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		this.panel_btnRondaElecciones = new JPanel();
		this.panel_btnRondaElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_RondaEncuentros.add(this.panel_btnRondaElecciones);
		this.panel_btnRondaElecciones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 40));
		
		this.btn_rondaElecciones = new JButton("Iniciar");
		this.panel_btnRondaElecciones.add(this.btn_rondaElecciones);
		this.btn_rondaElecciones.setMargin(new Insets(15, 30, 15, 30));
		this.btn_rondaElecciones.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.btn_rondaElecciones.setActionCommand("IniciarEleccionesEmpleado");
		
		this.panel_AgregarEmpleado = new JPanel();
		this.panel_AgregarEmpleado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_AgregarEmpleado.setBackground(SystemColor.inactiveCaption);
		this.panel_Acciones.add(this.panel_AgregarEmpleado);
		this.panel_AgregarEmpleado.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_lblagregarEmpleado = new JPanel();
		this.panel_lblagregarEmpleado.setBackground(SystemColor.inactiveCaption);
		this.panel_AgregarEmpleado.add(this.panel_lblagregarEmpleado);
		this.panel_lblagregarEmpleado.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.label_agregarEmpleado = new JLabel("Agregar Empleado");
		this.panel_lblagregarEmpleado.add(this.label_agregarEmpleado);
		this.label_agregarEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		this.label_agregarEmpleado.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		this.panel_btnAgregarEmpleado = new JPanel();
		FlowLayout flowLayout = (FlowLayout) this.panel_btnAgregarEmpleado.getLayout();
		flowLayout.setVgap(40);
		this.panel_btnAgregarEmpleado.setBackground(SystemColor.inactiveCaption);
		this.panel_AgregarEmpleado.add(this.panel_btnAgregarEmpleado);
		
		this.btn_agregarEmpleado = new JButton("Agregar");
		this.panel_btnAgregarEmpleado.add(this.btn_agregarEmpleado);
		this.btn_agregarEmpleado.setMargin(new Insets(15, 30, 15, 30));
		this.btn_agregarEmpleado.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		this.panel_getElecciones = new JPanel();
		this.panel_getElecciones.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_getElecciones);
		this.panel_getElecciones.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_actionElecciones = new JPanel();
		this.panel_actionElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_getElecciones.add(this.panel_actionElecciones);
		this.panel_actionElecciones.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_labelElecciones = new JPanel();
		this.panel_labelElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_actionElecciones.add(this.panel_labelElecciones);
		this.panel_labelElecciones.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.label_MostrarElecciones = new JLabel("Mostrar Elecciones");
		this.label_MostrarElecciones.setHorizontalAlignment(SwingConstants.RIGHT);
		this.panel_labelElecciones.add(this.label_MostrarElecciones);
		this.label_MostrarElecciones.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		this.panel_btnElecciones = new JPanel();
		this.panel_btnElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_actionElecciones.add(this.panel_btnElecciones);
		this.panel_btnElecciones.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
		
		this.btn_mostrarElecciones_1 = new JButton("Mostrar");
		this.btn_mostrarElecciones_1.setActionCommand("MostrarEleccionesEmpleado");
		this.btn_mostrarElecciones_1.setMargin(new Insets(15, 30, 15, 30));
		this.btn_mostrarElecciones_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_btnElecciones.add(this.btn_mostrarElecciones_1);
		
		this.panel_infoElecciones = new JPanel();
		this.panel_getElecciones.add(this.panel_infoElecciones);
		this.panel_infoElecciones.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.panel_textAreaElecciones = new JPanel();
		this.panel_textAreaElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_infoElecciones.add(this.panel_textAreaElecciones);
		this.panel_textAreaElecciones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setBorder(new LineBorder(Color.BLACK, 2, true));
		this.scrollPane.setPreferredSize(new Dimension(350, 120));
		this.panel_textAreaElecciones.add(this.scrollPane);
		
		this.listEleccionesEmpleado = new JList<UsuarioInteractivo>();
		this.listEleccionesEmpleado.setBackground(SystemColor.controlHighlight);
		this.listEleccionesEmpleado.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.listEleccionesEmpleado.setModel(modeloLista);
		this.scrollPane.setViewportView(this.listEleccionesEmpleado);
		
		this.panel_cerrarSesion = new JPanel();
		this.panel_cerrarSesion.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_cerrarSesion);
		this.panel_cerrarSesion.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_btnCerrarSesion = new JPanel();
		this.panel_btnCerrarSesion.setBackground(SystemColor.inactiveCaption);
		FlowLayout fl_panel_btnCerrarSesion = (FlowLayout) this.panel_btnCerrarSesion.getLayout();
		fl_panel_btnCerrarSesion.setVgap(45);
		fl_panel_btnCerrarSesion.setHgap(25);
		this.panel_cerrarSesion.add(this.panel_btnCerrarSesion);
		
		this.btn_cerrarSesion = new JButton("Cerrar Sesion");
		this.btn_cerrarSesion.setActionCommand("CerrarSesion");
		this.btn_cerrarSesion.setPreferredSize(new Dimension(150, 40));
		this.btn_cerrarSesion.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_btnCerrarSesion.add(this.btn_cerrarSesion);
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_rondaElecciones.addActionListener(actionListener);
		this.btn_mostrarElecciones_1.addActionListener(actionListener);
		this.btn_agregarEmpleado.addActionListener(actionListener);
		this.btn_cerrarSesion.addActionListener(actionListener);
		this.actionListener=actionListener;
		
	}
	
	

	public DefaultListModel<UsuarioInteractivo> getModeloLista() {
		return modeloLista;
	}

	@Override
	public void cerrar() {
		this.dispose();
	}

	@Override
	public void mostrar() {
		this.setVisible(true);
	}

	public JList getListEleccionesEmpleado() {
		return listEleccionesEmpleado;
	}

}

