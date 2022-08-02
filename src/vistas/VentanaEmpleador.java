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

public class VentanaEmpleador extends JFrame implements IVista {

	private JPanel contentPane;
	private ActionListener actionListener;
	private JPanel panel_Acciones;
	private JPanel panel_RondaEncuentros;
	private JPanel panel_lblRondaEncuentros;
	private JLabel lblRondaElecciones;
	private JPanel panel_btnRondaElecciones;
	private JButton btn_rondaElecciones;
	private JPanel panel_AgregarEmpleador;
	private JPanel panel_lblagregarEmpleador;
	private JLabel label_agregarEmpleador;
	private JPanel panel_btnAgregarEmpleador;
	private JButton btn_agregarEmpleador;
	private JPanel panel_getElecciones;
	private JPanel panel_actionElecciones;
	private JPanel panel_labelElecciones;
	private JLabel label_MostrarElecciones;
	private JPanel panel_btnElecciones;
	private JButton btn_mostrarElecciones;
	private JPanel panel_infoElecciones;
	private JPanel panel_textAreaElecciones;
	private JScrollPane scrollPane;
	private JPanel panel_cerrarSesionyGestionTicket;
	private JPanel panel_btnCerrarSesion;
	private JButton btn_cerrarSesion;
	private DefaultListModel<UsuarioInteractivo> modeloLista;
	private JList<UsuarioInteractivo> list;
	private JPanel panelGestionTicket;
	private JButton btn_GestionarTicket;

	/**
	 * Create the frame.
	 */
	public VentanaEmpleador() {
		this.modeloLista = new DefaultListModel<UsuarioInteractivo>();
		setTitle("Empleador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 489);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_Acciones = new JPanel();
		this.panel_Acciones.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_Acciones.setBackground(SystemColor.inactiveCaption);
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
		this.lblRondaElecciones.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblRondaElecciones.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_lblRondaEncuentros.add(this.lblRondaElecciones);
		
		this.panel_btnRondaElecciones = new JPanel();
		this.panel_btnRondaElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_RondaEncuentros.add(this.panel_btnRondaElecciones);
		this.panel_btnRondaElecciones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 40));
		
		this.btn_rondaElecciones = new JButton("Iniciar");
		this.btn_rondaElecciones.setMargin(new Insets(15, 30, 15, 30));
		this.btn_rondaElecciones.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.btn_rondaElecciones.setActionCommand("IniciarEleccionesEmpleador");
		this.panel_btnRondaElecciones.add(this.btn_rondaElecciones);
		
		this.panel_AgregarEmpleador = new JPanel();
		this.panel_AgregarEmpleador.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_AgregarEmpleador.setBackground(SystemColor.inactiveCaption);
		this.panel_Acciones.add(this.panel_AgregarEmpleador);
		this.panel_AgregarEmpleador.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_lblagregarEmpleador = new JPanel();
		this.panel_lblagregarEmpleador.setBackground(SystemColor.inactiveCaption);
		this.panel_AgregarEmpleador.add(this.panel_lblagregarEmpleador);
		this.panel_lblagregarEmpleador.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.label_agregarEmpleador = new JLabel("Agregar Empleador");
		this.label_agregarEmpleador.setHorizontalAlignment(SwingConstants.CENTER);
		this.label_agregarEmpleador.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_lblagregarEmpleador.add(this.label_agregarEmpleador);
		
		this.panel_btnAgregarEmpleador = new JPanel();
		FlowLayout flowLayout = (FlowLayout) this.panel_btnAgregarEmpleador.getLayout();
		flowLayout.setVgap(40);
		this.panel_btnAgregarEmpleador.setBackground(SystemColor.inactiveCaption);
		this.panel_AgregarEmpleador.add(this.panel_btnAgregarEmpleador);
		
		this.btn_agregarEmpleador = new JButton("Agregar");
		this.btn_agregarEmpleador.setActionCommand("AgregarEmpleador");
		this.btn_agregarEmpleador.setMargin(new Insets(15, 30, 15, 30));
		this.btn_agregarEmpleador.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_btnAgregarEmpleador.add(this.btn_agregarEmpleador);
		
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
		this.label_MostrarElecciones.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_labelElecciones.add(this.label_MostrarElecciones);
		
		this.panel_btnElecciones = new JPanel();
		this.panel_btnElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_actionElecciones.add(this.panel_btnElecciones);
		this.panel_btnElecciones.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
		
		this.btn_mostrarElecciones = new JButton("Mostrar");
		this.btn_mostrarElecciones.setActionCommand("MostrarEleccionesEmpleador");
		this.btn_mostrarElecciones.setMargin(new Insets(15, 30, 15, 30));
		this.btn_mostrarElecciones.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_btnElecciones.add(this.btn_mostrarElecciones);
		
		this.panel_infoElecciones = new JPanel();
		this.panel_getElecciones.add(this.panel_infoElecciones);
		this.panel_infoElecciones.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.panel_textAreaElecciones = new JPanel();
		this.panel_textAreaElecciones.setBackground(SystemColor.inactiveCaption);
		this.panel_infoElecciones.add(this.panel_textAreaElecciones);
		this.panel_textAreaElecciones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setBackground(SystemColor.controlHighlight);
		this.scrollPane.setPreferredSize(new Dimension(350, 120));
		this.scrollPane.setBorder(new LineBorder(Color.BLACK, 2, true));
		this.panel_textAreaElecciones.add(this.scrollPane);
		
		this.list = new JList<UsuarioInteractivo>();
		this.list.setModel(modeloLista);
		this.scrollPane.setViewportView(this.list);
		
		this.panel_cerrarSesionyGestionTicket = new JPanel();
		this.panel_cerrarSesionyGestionTicket.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_cerrarSesionyGestionTicket);
		this.panel_cerrarSesionyGestionTicket.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_btnCerrarSesion = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) this.panel_btnCerrarSesion.getLayout();
		flowLayout_1.setHgap(25);
		flowLayout_1.setVgap(45);
		this.panel_btnCerrarSesion.setBackground(SystemColor.inactiveCaption);
		this.panel_cerrarSesionyGestionTicket.add(this.panel_btnCerrarSesion);
		
		this.btn_cerrarSesion = new JButton("Cerrar Sesion");
		this.btn_cerrarSesion.setActionCommand("CerrarSesion");
		this.btn_cerrarSesion.setPreferredSize(new Dimension(150, 40));
		this.btn_cerrarSesion.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_btnCerrarSesion.add(this.btn_cerrarSesion);
		
		this.panelGestionTicket = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) this.panelGestionTicket.getLayout();
		flowLayout_2.setVgap(45);
		flowLayout_2.setHgap(25);
		this.panelGestionTicket.setBackground(SystemColor.inactiveCaption);
		this.panel_cerrarSesionyGestionTicket.add(this.panelGestionTicket);
		
		this.btn_GestionarTicket = new JButton("Gestion Ticket");
		this.btn_GestionarTicket.setActionCommand("GestionTicket");
		this.btn_GestionarTicket.setPreferredSize(new Dimension(150, 40));
		this.btn_GestionarTicket.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panelGestionTicket.add(this.btn_GestionarTicket);
	}
	
	

	public DefaultListModel<UsuarioInteractivo> getModeloLista() {
		return modeloLista;
	}



	public JList<UsuarioInteractivo> getList() {
		return list;
	}



	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_agregarEmpleador.addActionListener(actionListener);
		this.btn_rondaElecciones.addActionListener(actionListener);
		this.btn_mostrarElecciones.addActionListener(actionListener);
		this.btn_cerrarSesion.addActionListener(actionListener);
		this.btn_GestionarTicket.addActionListener(actionListener);
		this.actionListener=actionListener;
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