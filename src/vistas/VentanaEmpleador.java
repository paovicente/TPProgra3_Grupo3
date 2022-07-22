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
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class VentanaEmpleador extends JFrame implements IVista {

	private JPanel contentPane;
	private JPanel panel_RondaEncuentros;
	private JPanel panel_getElecciones;
	private JPanel panel_addEmpleador;
	private JLabel lblRondaElecciones;
	private JButton btn_rondaEncuentros;
	private JLabel label_MostrarElecciones;
	private JLabel lblAgregarEmpleador;
	private JButton btn_agregarEmpleador;
	private JPanel panel_LabelRondaEncuentros;
	private JPanel panel_btnRondaEncuentros;
	private JPanel panel_actionElecciones;
	private JPanel panel_labelAddEmpleador;
	private JPanel panel_btnAddEmpleador;
	private JPanel panel_btnElecciones;
	private JButton btn_mostrarElecciones_1;
	private JPanel panel_infoElecciones;
	private JPanel panel_labelElecciones;
	private JPanel panel_textAreaElecciones;
	private JScrollPane scrollPane;
	private ActionListener actionListener;

	/**
	 * Launch the application.
	 */
	 /* public static void main(String[] args) {
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
	public VentanaEmpleador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 489);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_RondaEncuentros = new JPanel();
		this.panel_RondaEncuentros.setBackground(SystemColor.inactiveCaption);
		this.panel_RondaEncuentros.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_RondaEncuentros);
		this.panel_RondaEncuentros.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_LabelRondaEncuentros = new JPanel();
		this.panel_LabelRondaEncuentros.setBackground(SystemColor.inactiveCaption);
		this.panel_RondaEncuentros.add(this.panel_LabelRondaEncuentros);
		this.panel_LabelRondaEncuentros.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.lblRondaElecciones = new JLabel("Ronda Elecciones");
		this.lblRondaElecciones.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.lblRondaElecciones.setHorizontalAlignment(SwingConstants.RIGHT);
		this.panel_LabelRondaEncuentros.add(this.lblRondaElecciones);
		
		this.panel_btnRondaEncuentros = new JPanel();
		this.panel_btnRondaEncuentros.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout = (FlowLayout) this.panel_btnRondaEncuentros.getLayout();
		flowLayout.setHgap(25);
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(45);
		this.panel_RondaEncuentros.add(this.panel_btnRondaEncuentros);
		
		this.btn_rondaEncuentros = new JButton("Iniciar");
		this.btn_rondaEncuentros.setActionCommand("IniciarRondaEleccionesEmpleador");
		this.btn_rondaEncuentros.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.btn_rondaEncuentros.setMargin(new Insets(15, 30, 15, 30));
		this.panel_btnRondaEncuentros.add(this.btn_rondaEncuentros);
		
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
		
		this.panel_addEmpleador = new JPanel();
		this.panel_addEmpleador.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_addEmpleador);
		this.panel_addEmpleador.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_labelAddEmpleador = new JPanel();
		this.panel_labelAddEmpleador.setBackground(SystemColor.inactiveCaption);
		this.panel_addEmpleador.add(this.panel_labelAddEmpleador);
		this.panel_labelAddEmpleador.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.lblAgregarEmpleador = new JLabel("Agregar Empleador");
		this.lblAgregarEmpleador.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.lblAgregarEmpleador.setHorizontalAlignment(SwingConstants.RIGHT);
		this.panel_labelAddEmpleador.add(this.lblAgregarEmpleador);
		
		this.panel_btnAddEmpleador = new JPanel();
		this.panel_btnAddEmpleador.setBackground(SystemColor.inactiveCaption);
		FlowLayout fl_panel_btnAddEmpleador = (FlowLayout) this.panel_btnAddEmpleador.getLayout();
		fl_panel_btnAddEmpleador.setVgap(45);
		fl_panel_btnAddEmpleador.setHgap(25);
		fl_panel_btnAddEmpleador.setAlignment(FlowLayout.LEFT);
		this.panel_addEmpleador.add(this.panel_btnAddEmpleador);
		
		this.btn_agregarEmpleador = new JButton("Agregar");
		this.btn_agregarEmpleador.setMargin(new Insets(15, 30, 15, 30));
		this.btn_agregarEmpleador.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_btnAddEmpleador.add(this.btn_agregarEmpleador);
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_agregarEmpleador.addActionListener(actionListener);
		this.btn_mostrarElecciones_1.addActionListener(actionListener);
		this.btn_rondaEncuentros.addActionListener(actionListener);
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
