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

public class VentanaAgencia extends JFrame implements IVista {

	private JPanel contentPane;
	private JPanel panel_AdminYContrataciones;
	private JPanel panel_getEmpleados;
	private JPanel panel_getEmpleadores;
	private JPanel panel_agregaAdmin;
	private JPanel panel_rondaContrataciones;
	private JPanel panel_actionEmpleados;
	private JPanel panel_infoEmpleados;
	private JPanel panel_actionEmpleadores;
	private JPanel panel_infoEmpleadores;
	private JPanel panel_labelAgregaAdmin;
	private JPanel panel_btnAgregaAdmin;
	private JPanel panel_labelRondaContrataciones;
	private JPanel panel_btnRondaContrataciones;
	private JPanel panel_labelMuestraEmpleados;
	private JPanel panel_btnMuestraEmpleados;
	private JPanel panel_labelMuestraEmpleadores;
	private JPanel panel_btnMuestraEmpleadores;
	private JScrollPane scrollPane;
	private JPanel panel_scrollPaneEmpleados;
	private JList<UsuarioInteractivo> listEmpleados;
	private JLabel label_AgregarAdmin;
	private JButton btn_agregarAdmin;
	private JLabel lblRondaEncuentros;
	private JButton btn_RondaContrataciones;
	private JLabel label_MostrarEmpleados;
	private JLabel label_MostrarEmpleadores;
	private JButton btn_MuestraEmpleados;
	private JButton btn_MuestraEmpleadores;
	private JPanel panel_scrollPaneEmpleadores;
	private JScrollPane scrollPane_1;
	private JList<UsuarioInteractivo> listEmpleadores;
	private ActionListener actionlistener;
	private DefaultListModel<UsuarioInteractivo> modeloListaEmpleados;
	private DefaultListModel<UsuarioInteractivo> modeloListaEmpleadores;
	/**
	 * Create the frame.
	 */
	public VentanaAgencia() {
		setTitle("Bienvenido - Agencia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 480);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_AdminYContrataciones = new JPanel();
		this.contentPane.add(this.panel_AdminYContrataciones);
		this.panel_AdminYContrataciones.setLayout(new GridLayout(1, 2, 0, 0));
		
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
		
		this.panel_rondaContrataciones = new JPanel();
		this.panel_rondaContrataciones.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_AdminYContrataciones.add(this.panel_rondaContrataciones);
		this.panel_rondaContrataciones.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_labelRondaContrataciones = new JPanel();
		this.panel_labelRondaContrataciones.setBackground(SystemColor.inactiveCaption);
		this.panel_rondaContrataciones.add(this.panel_labelRondaContrataciones);
		this.panel_labelRondaContrataciones.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.lblRondaEncuentros = new JLabel("Ronda Encuentros");
		this.lblRondaEncuentros.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblRondaEncuentros.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		this.panel_labelRondaContrataciones.add(this.lblRondaEncuentros);
		
		this.panel_btnRondaContrataciones = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) this.panel_btnRondaContrataciones.getLayout();
		flowLayout_1.setVgap(15);
		this.panel_btnRondaContrataciones.setBackground(SystemColor.inactiveCaption);
		this.panel_rondaContrataciones.add(this.panel_btnRondaContrataciones);
		
		this.btn_RondaContrataciones = new JButton("IniciarRondaEncuentros");
		this.btn_RondaContrataciones.setMargin(new Insets(5, 20, 5, 20));
		this.btn_RondaContrataciones.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_btnRondaContrataciones.add(this.btn_RondaContrataciones);
		
		this.panel_getEmpleados = new JPanel();
		this.panel_getEmpleados.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_getEmpleados);
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
		FlowLayout flowLayout_2 = (FlowLayout) this.panel_btnMuestraEmpleados.getLayout();
		flowLayout_2.setVgap(15);
		this.panel_btnMuestraEmpleados.setBackground(SystemColor.inactiveCaption);
		this.panel_actionEmpleados.add(this.panel_btnMuestraEmpleados);
		
		this.btn_MuestraEmpleados = new JButton("Mostrar");
		this.btn_MuestraEmpleados.setActionCommand("MostrarEmpleados");
		this.btn_MuestraEmpleados.setMargin(new Insets(5, 20, 5, 20));
		this.btn_MuestraEmpleados.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_btnMuestraEmpleados.add(this.btn_MuestraEmpleados);
		
		this.panel_infoEmpleados = new JPanel();
		this.panel_infoEmpleados.setBackground(SystemColor.inactiveCaption);
		this.panel_getEmpleados.add(this.panel_infoEmpleados);
		this.panel_infoEmpleados.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.panel_scrollPaneEmpleados = new JPanel();
		this.panel_scrollPaneEmpleados.setBackground(SystemColor.controlHighlight);
		this.panel_scrollPaneEmpleados.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panel_infoEmpleados.add(this.panel_scrollPaneEmpleados);
		this.panel_scrollPaneEmpleados.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.scrollPane.setBorder(null);
		this.scrollPane.setBackground(SystemColor.controlHighlight);
		this.scrollPane.setPreferredSize(new Dimension(370, 100));
		this.panel_scrollPaneEmpleados.add(this.scrollPane);
		
		this.listEmpleados = new JList<UsuarioInteractivo>();
		this.listEmpleados.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.listEmpleados.setBackground(SystemColor.controlHighlight);
		this.scrollPane.setViewportView(this.listEmpleados);
		
		this.panel_getEmpleadores = new JPanel();
		this.panel_getEmpleadores.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_getEmpleadores);
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
		FlowLayout flowLayout_3 = (FlowLayout) this.panel_btnMuestraEmpleadores.getLayout();
		flowLayout_3.setVgap(15);
		this.panel_btnMuestraEmpleadores.setBackground(SystemColor.inactiveCaption);
		this.panel_actionEmpleadores.add(this.panel_btnMuestraEmpleadores);
		
		this.btn_MuestraEmpleadores = new JButton("Mostrar");
		this.btn_MuestraEmpleadores.setActionCommand("MostrarEmpleadores");
		this.btn_MuestraEmpleadores.setMargin(new Insets(5, 20, 5, 20));
		this.btn_MuestraEmpleadores.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_btnMuestraEmpleadores.add(this.btn_MuestraEmpleadores);
		
		this.panel_infoEmpleadores = new JPanel();
		this.panel_infoEmpleadores.setBackground(SystemColor.inactiveCaption);
		this.panel_getEmpleadores.add(this.panel_infoEmpleadores);
		
		this.panel_scrollPaneEmpleadores = new JPanel();
		this.panel_scrollPaneEmpleadores.setBackground(SystemColor.controlHighlight);
		this.panel_scrollPaneEmpleadores.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		FlowLayout flowLayout_4 = (FlowLayout) this.panel_scrollPaneEmpleadores.getLayout();
		flowLayout_4.setVgap(10);
		flowLayout_4.setHgap(0);
		this.panel_infoEmpleadores.add(this.panel_scrollPaneEmpleadores);
		
		this.scrollPane_1 = new JScrollPane();
		this.scrollPane_1.setBorder(null);
		this.scrollPane_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.scrollPane_1.setBackground(SystemColor.controlHighlight);
		this.scrollPane_1.setPreferredSize(new Dimension(370, 100));
		this.panel_scrollPaneEmpleadores.add(this.scrollPane_1);
		
		this.listEmpleadores = new JList<UsuarioInteractivo>();
		this.listEmpleadores.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.listEmpleadores.setBackground(SystemColor.controlHighlight);
		this.scrollPane_1.setViewportView(this.listEmpleadores);
		
		
		//ver como usar un solo modelo
		this.modeloListaEmpleados = new DefaultListModel<UsuarioInteractivo>();
		this.modeloListaEmpleadores = new DefaultListModel<UsuarioInteractivo>();
		this.listEmpleadores.setModel(modeloListaEmpleadores);
		this.listEmpleados.setModel(modeloListaEmpleados);
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



	public void setActionlistener(ActionListener actionlistener) {
		this.btn_agregarAdmin.addActionListener(actionlistener);
		this.btn_RondaContrataciones.addActionListener(actionlistener);
		this.btn_MuestraEmpleados.addActionListener(actionlistener);
		this.btn_MuestraEmpleadores.addActionListener(actionlistener);
		this.actionlistener = actionlistener;
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.setActionlistener(actionListener);
		
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