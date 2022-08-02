package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.border.LineBorder;

import modelo.Empleado;
import modelo.Empleador;
import modelo.UsuarioInteractivo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.BorderLayout;

public class VentanaAgencia extends JFrame implements IVista {

	private JPanel contentPane;
	private JPanel panel_AdminYContrataciones;
	private JPanel panel_agregaAdmin;
	private JPanel panel_labelAgregaAdmin;
	private JPanel panel_btnAgregaAdmin;
	private JLabel label_AgregarAdmin;
	private JButton btn_agregarAdmin;
	private ActionListener actionlistener;
	private DefaultListModel<UsuarioInteractivo> modeloListaEmpleados;
	private DefaultListModel<UsuarioInteractivo> modeloListaEmpleadores;
	private JPanel panel_rondaEncuentros;
	private JPanel panel_labelRondaEncuentros;
	private JLabel lblRondaEncuentros;
	private JPanel panel_btnRondaEncuentros;
	private JButton btn_RondaEncuentros;
	private JPanel panel_rondaContrataciones;
	private JPanel panel_labelRondaContrataciones;
	private JLabel lblRondaContrataciones;
	private JPanel panel_btnRondaContrataciones;
	private JButton btn_RondaContrataciones;
	private JPanel panelGeneral;
	private JPanel panel_getEmpleados;
	private JPanel panel_actionEmpleados;
	private JPanel panel_labelMuestraEmpleados;
	private JLabel label_MostrarEmpleados;
	private JPanel panel_btnMuestraEmpleados;
	private JButton btn_MuestraEmpleados;
	private JPanel panel_infoEmpleados;
	private JPanel panel_scrollPaneEmpleados;
	private JPanel panel_getEmpleadores;
	private JPanel panel_actionEmpleadores;
	private JPanel panel_labelMuestraEmpleadores;
	private JLabel label_MostrarEmpleadores;
	private JPanel panel_btnMuestraEmpleadores;
	private JButton btn_MuestraEmpleadores;
	private JPanel panel_infoEmpleadores;
	private JPanel panel_scrollPaneEmpleadores;
	private JPanel panelCerrarSesion;
	private JButton btn_cerrarSesion;
	private JList<UsuarioInteractivo> listEmpleadores;
	private JScrollPane scrollPane_2;
	private JList<UsuarioInteractivo> listEmpleados;
	private JScrollPane scrollPane_1;
	/**
	 * Create the frame.
	 */
	public VentanaAgencia() {
		setTitle("Bienvenido - Agencia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1126, 480);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_AdminYContrataciones = new JPanel();
		this.contentPane.add(this.panel_AdminYContrataciones);
		this.panel_AdminYContrataciones.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_agregaAdmin = new JPanel();
		this.panel_agregaAdmin.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_AdminYContrataciones.add(this.panel_agregaAdmin);
		this.panel_agregaAdmin.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_labelAgregaAdmin = new JPanel();
		this.panel_labelAgregaAdmin.setBackground(SystemColor.inactiveCaption);
		this.panel_agregaAdmin.add(this.panel_labelAgregaAdmin);
		this.panel_labelAgregaAdmin.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.label_AgregarAdmin = new JLabel("Agregar Admin");
		this.label_AgregarAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		this.label_AgregarAdmin.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		this.panel_labelAgregaAdmin.add(this.label_AgregarAdmin);
		
		this.panel_btnAgregaAdmin = new JPanel();
		FlowLayout flowLayout = (FlowLayout) this.panel_btnAgregaAdmin.getLayout();
		flowLayout.setVgap(15);
		this.panel_btnAgregaAdmin.setBackground(SystemColor.inactiveCaption);
		this.panel_agregaAdmin.add(this.panel_btnAgregaAdmin);
		
		this.btn_agregarAdmin = new JButton("Agregar");
		this.btn_agregarAdmin.setActionCommand("AgregarAdmin");
		this.btn_agregarAdmin.setMargin(new Insets(5, 20, 5, 20));
		this.btn_agregarAdmin.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_btnAgregaAdmin.add(this.btn_agregarAdmin);
		
		this.panel_rondaEncuentros = new JPanel();
		this.panel_rondaEncuentros.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_AdminYContrataciones.add(this.panel_rondaEncuentros);
		this.panel_rondaEncuentros.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_labelRondaEncuentros = new JPanel();
		this.panel_labelRondaEncuentros.setBackground(SystemColor.inactiveCaption);
		this.panel_rondaEncuentros.add(this.panel_labelRondaEncuentros);
		this.panel_labelRondaEncuentros.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.lblRondaEncuentros = new JLabel("Ronda Encuentros");
		this.lblRondaEncuentros.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblRondaEncuentros.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		this.panel_labelRondaEncuentros.add(this.lblRondaEncuentros);
		
		this.panel_btnRondaEncuentros = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) this.panel_btnRondaEncuentros.getLayout();
		flowLayout_5.setVgap(15);
		this.panel_btnRondaEncuentros.setBackground(SystemColor.inactiveCaption);
		this.panel_rondaEncuentros.add(this.panel_btnRondaEncuentros);
		
		this.btn_RondaEncuentros = new JButton("Iniciar");
		this.btn_RondaEncuentros.setMargin(new Insets(5, 20, 5, 20));
		this.btn_RondaEncuentros.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.btn_RondaEncuentros.setActionCommand("IniciarRondaEncuentros");
		this.panel_btnRondaEncuentros.add(this.btn_RondaEncuentros);
		
		this.panel_rondaContrataciones = new JPanel();
		this.panel_rondaContrataciones.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_AdminYContrataciones.add(this.panel_rondaContrataciones);
		this.panel_rondaContrataciones.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_labelRondaContrataciones = new JPanel();
		this.panel_labelRondaContrataciones.setBackground(SystemColor.inactiveCaption);
		this.panel_rondaContrataciones.add(this.panel_labelRondaContrataciones);
		this.panel_labelRondaContrataciones.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.lblRondaContrataciones = new JLabel("Ronda Contrataciones");
		this.lblRondaContrataciones.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblRondaContrataciones.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		this.panel_labelRondaContrataciones.add(this.lblRondaContrataciones);
		
		this.panel_btnRondaContrataciones = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) this.panel_btnRondaContrataciones.getLayout();
		flowLayout_1.setVgap(15);
		this.panel_btnRondaContrataciones.setBackground(SystemColor.inactiveCaption);
		this.panel_rondaContrataciones.add(this.panel_btnRondaContrataciones);
		
		this.btn_RondaContrataciones = new JButton("Iniciar");
		this.btn_RondaContrataciones.setMargin(new Insets(5, 20, 5, 20));
		this.btn_RondaContrataciones.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.btn_RondaContrataciones.setActionCommand("IniciarContrataciones");
		this.panel_btnRondaContrataciones.add(this.btn_RondaContrataciones);
		
		
		//ver como usar un solo modelo
		this.modeloListaEmpleados = new DefaultListModel<UsuarioInteractivo>();
		this.modeloListaEmpleadores = new DefaultListModel<UsuarioInteractivo>();
		
		this.panelGeneral = new JPanel();
		this.contentPane.add(this.panelGeneral);
		this.panelGeneral.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_getEmpleados = new JPanel();
		this.panel_getEmpleados.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panelGeneral.add(this.panel_getEmpleados);
		this.panel_getEmpleados.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_actionEmpleados = new JPanel();
		this.panel_getEmpleados.add(this.panel_actionEmpleados);
		this.panel_actionEmpleados.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_labelMuestraEmpleados = new JPanel();
		this.panel_labelMuestraEmpleados.setBackground(SystemColor.inactiveCaption);
		this.panel_actionEmpleados.add(this.panel_labelMuestraEmpleados);
		this.panel_labelMuestraEmpleados.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.label_MostrarEmpleados = new JLabel("Mostrar Empleados");
		this.label_MostrarEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		this.label_MostrarEmpleados.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		this.panel_labelMuestraEmpleados.add(this.label_MostrarEmpleados);
		
		this.panel_btnMuestraEmpleados = new JPanel();
		this.panel_btnMuestraEmpleados.setBackground(SystemColor.inactiveCaption);
		this.panel_actionEmpleados.add(this.panel_btnMuestraEmpleados);
		
		this.btn_MuestraEmpleados = new JButton("Mostrar");
		this.btn_MuestraEmpleados.setMargin(new Insets(5, 20, 5, 20));
		this.btn_MuestraEmpleados.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.btn_MuestraEmpleados.setActionCommand("MostrarEmpleados");
		this.panel_btnMuestraEmpleados.add(this.btn_MuestraEmpleados);
		
		this.panel_infoEmpleados = new JPanel();
		this.panel_infoEmpleados.setBackground(SystemColor.inactiveCaption);
		this.panel_getEmpleados.add(this.panel_infoEmpleados);
		this.panel_infoEmpleados.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.panel_scrollPaneEmpleados = new JPanel();
		this.panel_scrollPaneEmpleados.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_scrollPaneEmpleados.setBackground(SystemColor.controlHighlight);
		this.panel_infoEmpleados.add(this.panel_scrollPaneEmpleados);
		this.panel_scrollPaneEmpleados.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane_1 = new JScrollPane();
		this.scrollPane_1.setPreferredSize(new Dimension(250, 100));
		this.panel_scrollPaneEmpleados.add(this.scrollPane_1);
		
		this.listEmpleados = new JList<UsuarioInteractivo>();
		this.listEmpleados.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		this.listEmpleados.setBackground(SystemColor.controlHighlight);
		this.scrollPane_1.setViewportView(this.listEmpleados);
		
		this.panel_getEmpleadores = new JPanel();
		this.panel_getEmpleadores.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panelGeneral.add(this.panel_getEmpleadores);
		this.panel_getEmpleadores.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_actionEmpleadores = new JPanel();
		this.panel_getEmpleadores.add(this.panel_actionEmpleadores);
		this.panel_actionEmpleadores.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_labelMuestraEmpleadores = new JPanel();
		this.panel_labelMuestraEmpleadores.setBackground(SystemColor.inactiveCaption);
		this.panel_actionEmpleadores.add(this.panel_labelMuestraEmpleadores);
		this.panel_labelMuestraEmpleadores.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.label_MostrarEmpleadores = new JLabel("Mostrar Empleadores");
		this.label_MostrarEmpleadores.setHorizontalAlignment(SwingConstants.CENTER);
		this.label_MostrarEmpleadores.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		this.panel_labelMuestraEmpleadores.add(this.label_MostrarEmpleadores);
		
		this.panel_btnMuestraEmpleadores = new JPanel();
		this.panel_btnMuestraEmpleadores.setBackground(SystemColor.inactiveCaption);
		this.panel_actionEmpleadores.add(this.panel_btnMuestraEmpleadores);
		
		this.btn_MuestraEmpleadores = new JButton("Mostrar");
		this.btn_MuestraEmpleadores.setMargin(new Insets(5, 20, 5, 20));
		this.btn_MuestraEmpleadores.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.btn_MuestraEmpleadores.setActionCommand("MostrarEmpleadores");
		this.panel_btnMuestraEmpleadores.add(this.btn_MuestraEmpleadores);
		
		this.panel_infoEmpleadores = new JPanel();
		this.panel_infoEmpleadores.setBackground(SystemColor.inactiveCaption);
		this.panel_getEmpleadores.add(this.panel_infoEmpleadores);
		
		this.panel_scrollPaneEmpleadores = new JPanel();
		this.panel_scrollPaneEmpleadores.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_scrollPaneEmpleadores.setBackground(SystemColor.controlHighlight);
		this.panel_infoEmpleadores.add(this.panel_scrollPaneEmpleadores);
		this.panel_scrollPaneEmpleadores.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane_2 = new JScrollPane();
		this.scrollPane_2.setPreferredSize(new Dimension(250, 100));
		this.panel_scrollPaneEmpleadores.add(this.scrollPane_2);
		
		this.listEmpleadores = new JList<UsuarioInteractivo>();
		this.listEmpleadores.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		this.listEmpleadores.setBackground(SystemColor.controlHighlight);
		this.scrollPane_2.setViewportView(this.listEmpleadores);
		
		this.panelCerrarSesion = new JPanel();
		this.panelCerrarSesion.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		FlowLayout flowLayout_3 = (FlowLayout) this.panelCerrarSesion.getLayout();
		flowLayout_3.setVgap(50);
		this.panelCerrarSesion.setBackground(SystemColor.inactiveCaption);
		this.panelGeneral.add(this.panelCerrarSesion);
		
		this.btn_cerrarSesion = new JButton("Cerrar Sesion");
		this.btn_cerrarSesion.setActionCommand("CerrarSesion");
		this.btn_cerrarSesion.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panelCerrarSesion.add(this.btn_cerrarSesion);
		
		this.listEmpleadores.setModel(modeloListaEmpleadores);
		this.listEmpleados.setModel(modeloListaEmpleados);
	}
	
	

	public JButton getBtn_agregarAdmin() {
		return btn_agregarAdmin;
	}



	public JButton getBtn_RondaEncuentros() {
		return btn_RondaEncuentros;
	}



	public JButton getBtn_RondaContrataciones() {
		return btn_RondaContrataciones;
	}



	public JButton getBtn_MuestraEmpleados() {
		return btn_MuestraEmpleados;
	}



	public JButton getBtn_MuestraEmpleadores() {
		return btn_MuestraEmpleadores;
	}



	public JButton getBtn_cerrarSesion() {
		return btn_cerrarSesion;
	}



	public DefaultListModel<UsuarioInteractivo> getModeloListaEmpleadores() {
		return modeloListaEmpleadores;
	}



	public DefaultListModel<UsuarioInteractivo> getModeloListaEmpleados() {
		return modeloListaEmpleados;
	}



	public JList getListEmpleados() {
		return listEmpleados;
	}



	public void setListEmpleados(JList listEmpleados) {
		this.listEmpleados = listEmpleados;
	}



	public JList getListEmpleadores() {
		return listEmpleadores;
	}



	public void setListEmpleadores(JList listEmpleadores) {
		this.listEmpleadores = listEmpleadores;
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
	public void setActionListener(ActionListener actionlistener) {
		this.btn_agregarAdmin.addActionListener(actionlistener);
		this.btn_RondaContrataciones.addActionListener(actionlistener);
		this.btn_RondaEncuentros.addActionListener(actionlistener);
		this.btn_MuestraEmpleados.addActionListener(actionlistener);
		this.btn_MuestraEmpleadores.addActionListener(actionlistener);
		this.btn_cerrarSesion.addActionListener(actionlistener);
		this.actionlistener = actionlistener;	
	}
}