package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;

public class VentanaGestionTicket extends JFrame implements IVista{

	private JPanel panelPrincipal;
	private JPanel panel_AltayActivar;
	private JPanel panel_BajaCancelarySuspender;
	private JPanel panel_ModificacionyConsulta;
	private JPanel panelAlta;
	private JPanel panelActivar;
	private JPanel panelBaja;
	private JPanel panelCancelar;
	private JPanel panelSuspender;
	private JPanel panelModificacion;
	private JPanel panelConsulta;
	private JButton btn_Alta;
	private JButton btn_Activar;
	private JButton btn_Baja;
	private JButton btn_Cancelar;
	private JButton btn_Suspender;
	private JButton btn_Modificar;
	private JButton btn_Consultar;
	private ActionListener actionListener;
	
	/**
	 * Create the frame.
	 */
	public VentanaGestionTicket() {
		setTitle("Gestion de Ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 411);
		this.panelPrincipal = new JPanel();
		this.panelPrincipal.setBackground(Color.BLACK);
		this.panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.panelPrincipal);
		this.panelPrincipal.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_AltayActivar = new JPanel();
		this.panel_AltayActivar.setBackground(Color.BLACK);
		this.panelPrincipal.add(this.panel_AltayActivar);
		this.panel_AltayActivar.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panelAlta = new JPanel();
		FlowLayout flowLayout = (FlowLayout) this.panelAlta.getLayout();
		flowLayout.setVgap(45);
		flowLayout.setHgap(25);
		this.panelAlta.setBackground(SystemColor.inactiveCaption);
		this.panelAlta.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_AltayActivar.add(this.panelAlta);
		
		this.btn_Alta = new JButton("Alta");
		this.btn_Alta.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.btn_Alta.setPreferredSize(new Dimension(120, 40));
		this.btn_Alta.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panelAlta.add(this.btn_Alta);
		
		this.panelActivar = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) this.panelActivar.getLayout();
		flowLayout_1.setHgap(25);
		flowLayout_1.setVgap(45);
		this.panelActivar.setBackground(SystemColor.inactiveCaption);
		this.panelActivar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_AltayActivar.add(this.panelActivar);
		
		this.btn_Activar = new JButton("Activar");
		this.btn_Activar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.btn_Activar.setPreferredSize(new Dimension(120, 40));
		this.btn_Activar.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panelActivar.add(this.btn_Activar);
		
		this.panel_BajaCancelarySuspender = new JPanel();
		this.panel_BajaCancelarySuspender.setBackground(Color.BLACK);
		this.panelPrincipal.add(this.panel_BajaCancelarySuspender);
		this.panel_BajaCancelarySuspender.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panelBaja = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) this.panelBaja.getLayout();
		flowLayout_2.setHgap(25);
		flowLayout_2.setVgap(45);
		this.panelBaja.setBackground(SystemColor.inactiveCaption);
		this.panelBaja.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_BajaCancelarySuspender.add(this.panelBaja);
		
		this.btn_Baja = new JButton("Baja");
		this.btn_Baja.setActionCommand("Baja");
		this.btn_Baja.setPreferredSize(new Dimension(120, 40));
		this.btn_Baja.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.btn_Baja.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panelBaja.add(this.btn_Baja);
		
		this.panelCancelar = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) this.panelCancelar.getLayout();
		flowLayout_3.setHgap(25);
		flowLayout_3.setVgap(45);
		this.panelCancelar.setBackground(SystemColor.inactiveCaption);
		this.panelCancelar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_BajaCancelarySuspender.add(this.panelCancelar);
		
		this.btn_Cancelar = new JButton("Cancelar");
		this.btn_Cancelar.setPreferredSize(new Dimension(120, 40));
		this.btn_Cancelar.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.btn_Cancelar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.btn_Cancelar.setActionCommand("Cancelar");
		this.panelCancelar.add(this.btn_Cancelar);
		
		this.panelSuspender = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) this.panelSuspender.getLayout();
		flowLayout_4.setHgap(25);
		flowLayout_4.setVgap(45);
		this.panelSuspender.setBackground(SystemColor.inactiveCaption);
		this.panelSuspender.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_BajaCancelarySuspender.add(this.panelSuspender);
		
		this.btn_Suspender = new JButton("Suspender");
		this.btn_Suspender.setPreferredSize(new Dimension(120, 40));
		this.btn_Suspender.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.btn_Suspender.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.btn_Suspender.setActionCommand("Suspender");
		this.panelSuspender.add(this.btn_Suspender);
		
		this.panel_ModificacionyConsulta = new JPanel();
		this.panel_ModificacionyConsulta.setBackground(Color.BLACK);
		this.panelPrincipal.add(this.panel_ModificacionyConsulta);
		this.panel_ModificacionyConsulta.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panelModificacion = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) this.panelModificacion.getLayout();
		flowLayout_5.setHgap(25);
		flowLayout_5.setVgap(45);
		this.panelModificacion.setBackground(SystemColor.inactiveCaption);
		this.panelModificacion.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_ModificacionyConsulta.add(this.panelModificacion);
		
		this.btn_Modificar = new JButton("Modificar");
		this.btn_Modificar.setPreferredSize(new Dimension(120, 40));
		this.btn_Modificar.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.btn_Modificar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panelModificacion.add(this.btn_Modificar);
		
		this.panelConsulta = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) this.panelConsulta.getLayout();
		flowLayout_6.setHgap(25);
		flowLayout_6.setVgap(45);
		this.panelConsulta.setBackground(SystemColor.inactiveCaption);
		this.panelConsulta.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panel_ModificacionyConsulta.add(this.panelConsulta);
		
		this.btn_Consultar = new JButton("Consultar");
		this.btn_Consultar.setPreferredSize(new Dimension(120, 40));
		this.btn_Consultar.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.btn_Consultar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.panelConsulta.add(this.btn_Consultar);
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_Activar.addActionListener(actionListener);
		this.btn_Alta.addActionListener(actionListener);
		this.btn_Baja.addActionListener(actionListener);
		this.btn_Cancelar.addActionListener(actionListener);
		this.btn_Consultar.addActionListener(actionListener);
		this.btn_Modificar.addActionListener(actionListener);
		this.btn_Suspender.addActionListener(actionListener);
		this.actionListener = actionListener;
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
