package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class VentanaFormularioEmpleador extends JFrame implements IVista {

	private JPanel contentPane;
	private JPanel panelFormularioEmpleador;
	private JPanel panel_botones;
	private JPanel panelLocacion;
	private JPanel panel_Remuneracion;
	private JPanel panel_CargaHoraria;
	private JPanel panel_tipoPuesto;
	private JPanel panel_RangoEtario;
	private JPanel panel_Experiencia;
	private JPanel panel_Estudios;
	private JPanel panel_LabelLocacion;
	private JPanel panel_opcionesLocacion;
	private JRadioButton rdbtnHomeOfficeEmpleador;
	private JRadioButton rdbtnPresencialEmpleador;
	private JRadioButton rdbtnIndistintoEmpleador;
	private JLabel labelLocacion;
	private JPanel panel_labelRemuneracion;
	private JPanel panel_opcionesRemuneracion;
	private JLabel labelRemuneracion;
	private JRadioButton rdbtnRemuneracion1Empleador;
	private JRadioButton rdbtnRemuneracion2Empleador;
	private JRadioButton rdbtnRemuneracion3Empleador;
	private JPanel panel_labelCargaHoraria;
	private JPanel panel_opcionesCargaHoraria;
	private JLabel labelCargaHoraria;
	private JRadioButton rdbtnMedia;
	private JRadioButton rdbtnCompleta;
	private JRadioButton rdbtnExtendida;
	private JPanel panel_labelTipoPuesto;
	private JPanel panel_opcionesTipoPuesto;
	private JLabel labelTipoPuesto;
	private JRadioButton rdbtnSenior;
	private JRadioButton rdbtnJunior;
	private JRadioButton rdbtnManagement;
	private JPanel panel_labelRangoEtario;
	private JPanel panel_opcionesRangoEtario;
	private JLabel labelRangoEtario;
	private JRadioButton rdbtnMenosDe40;
	private JRadioButton rdbtnEntre40y50;
	private JRadioButton rdbtnMayorde50;
	private JPanel panel_labelExperiencia;
	private JPanel panel_opcionesExperiencia;
	private JLabel labelExperiencia;
	private JRadioButton rdbtnNada;
	private JRadioButton rdbtnExpeMedia;
	private JRadioButton rdbtnMucha;
	private JPanel panel_labelEstudios;
	private JPanel panel_opcionesEstudios;
	private JLabel labelEstudios;
	private JRadioButton rdbtnPrimario;
	private JRadioButton rdbtnSecundario;
	private JRadioButton rdbtnTerciario;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private JPanel panel_seleccionDatos;
	private JPanel panel_pesosAspectos;
	private JButton btnAgregar;
	private JButton btnFinalizar;
	private JPanel panel_pesoLocacion;
	private JPanel panel_pesoRemuneracion;
	private JPanel panel_pesoCargaHoraria;
	private JPanel panel_pesoTipoPuesto;
	private JPanel panel_pesoRangoEtario;
	private JPanel panel_pesoExperiencia;
	private JPanel panel_pesoEstudios;
	private JPanel panel_CantEmpleosSolicitados;
	private JLabel lblPesoLocacion;
	private JSpinner spinnerLocacion;
	private JLabel lblPesoRemuneracion;
	private JSpinner spinnerRemuneracion;
	private JLabel lblPesoCargaHoraria;
	private JSpinner spinnerCargaHoraria;
	private JLabel lblPesoTipoPuesto;
	private JSpinner spinnerTipoPuesto;
	private JLabel lblPesoRangoEtario;
	private JSpinner spinnerRangoEtario;
	private JLabel lblPesoExperiencia;
	private JSpinner spinnerExperiencia;
	private JLabel lblPesoEstudios;
	private JSpinner spinnerEstudios;
	private JLabel lblCantidadEmpleadosSolicitados;
	private JSpinner spinnerEmpSolic;
	private ActionListener actionlistener;
	
	/**
	 * Create the frame.
	 */
	public VentanaFormularioEmpleador() {
		setTitle("Formulario Empleador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 606);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.panelFormularioEmpleador = new JPanel();
		this.panelFormularioEmpleador.setBackground(Color.BLACK);
		this.contentPane.add(this.panelFormularioEmpleador);
		this.panelFormularioEmpleador.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_seleccionDatos = new JPanel();
		this.panel_seleccionDatos.setBackground(SystemColor.inactiveCaption);
		this.panelFormularioEmpleador.add(this.panel_seleccionDatos);
		this.panel_seleccionDatos.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panelLocacion = new JPanel();
		this.panelLocacion.setBackground(SystemColor.inactiveCaption);
		this.panel_seleccionDatos.add(this.panelLocacion);
		this.panelLocacion.setLayout(new BorderLayout(0, 0));
		
		this.panel_LabelLocacion = new JPanel();
		this.panel_LabelLocacion.setBackground(SystemColor.inactiveCaption);
		this.panelLocacion.add(this.panel_LabelLocacion, BorderLayout.NORTH);
		this.panel_LabelLocacion.setLayout(new BorderLayout(0, 0));
		
		this.labelLocacion = new JLabel("Locaci\u00F3n de preferencia");
		this.labelLocacion.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.labelLocacion.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_LabelLocacion.add(this.labelLocacion, BorderLayout.NORTH);
		
		this.panel_opcionesLocacion = new JPanel();
		this.panel_opcionesLocacion.setBackground(SystemColor.inactiveCaption);
		this.panelLocacion.add(this.panel_opcionesLocacion, BorderLayout.CENTER);
		this.panel_opcionesLocacion.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.rdbtnHomeOfficeEmpleador = new JRadioButton("Home Office");
		this.rdbtnHomeOfficeEmpleador.setBackground(SystemColor.inactiveCaption);
		this.rdbtnHomeOfficeEmpleador.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup.add(this.rdbtnHomeOfficeEmpleador);
		this.panel_opcionesLocacion.add(this.rdbtnHomeOfficeEmpleador);
		
		this.rdbtnPresencialEmpleador = new JRadioButton("Presencial");
		this.rdbtnPresencialEmpleador.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnPresencialEmpleador.setBackground(SystemColor.inactiveCaption);
		buttonGroup.add(this.rdbtnPresencialEmpleador);
		this.panel_opcionesLocacion.add(this.rdbtnPresencialEmpleador);
		
		this.rdbtnIndistintoEmpleador = new JRadioButton("Indistinto");
		this.rdbtnIndistintoEmpleador.setBackground(SystemColor.inactiveCaption);
		this.rdbtnIndistintoEmpleador.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup.add(this.rdbtnIndistintoEmpleador);
		this.panel_opcionesLocacion.add(this.rdbtnIndistintoEmpleador);
		
		this.panel_Remuneracion = new JPanel();
		this.panel_Remuneracion.setBackground(SystemColor.inactiveCaption);
		this.panel_seleccionDatos.add(this.panel_Remuneracion);
		this.panel_Remuneracion.setLayout(new BorderLayout(0, 0));
		
		this.panel_labelRemuneracion = new JPanel();
		this.panel_labelRemuneracion.setBackground(SystemColor.inactiveCaption);
		this.panel_Remuneracion.add(this.panel_labelRemuneracion, BorderLayout.NORTH);
		this.panel_labelRemuneracion.setLayout(new BorderLayout(0, 0));
		
		this.labelRemuneracion = new JLabel("Remuneraci\u00F3n");
		this.labelRemuneracion.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.labelRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_labelRemuneracion.add(this.labelRemuneracion, BorderLayout.NORTH);
		
		this.panel_opcionesRemuneracion = new JPanel();
		this.panel_opcionesRemuneracion.setBackground(SystemColor.inactiveCaption);
		this.panel_Remuneracion.add(this.panel_opcionesRemuneracion, BorderLayout.CENTER);
		
		this.rdbtnRemuneracion1Empleador = new JRadioButton("$40.000");
		this.rdbtnRemuneracion1Empleador.setBackground(SystemColor.inactiveCaption);
		this.rdbtnRemuneracion1Empleador.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_1.add(this.rdbtnRemuneracion1Empleador);
		this.panel_opcionesRemuneracion.add(this.rdbtnRemuneracion1Empleador);
		
		this.rdbtnRemuneracion2Empleador = new JRadioButton("$80.000");
		this.rdbtnRemuneracion2Empleador.setBackground(SystemColor.inactiveCaption);
		this.rdbtnRemuneracion2Empleador.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_1.add(this.rdbtnRemuneracion2Empleador);
		this.panel_opcionesRemuneracion.add(this.rdbtnRemuneracion2Empleador);
		
		this.rdbtnRemuneracion3Empleador = new JRadioButton("$120.000");
		this.rdbtnRemuneracion3Empleador.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnRemuneracion3Empleador.setBackground(SystemColor.inactiveCaption);
		buttonGroup_1.add(this.rdbtnRemuneracion3Empleador);
		this.panel_opcionesRemuneracion.add(this.rdbtnRemuneracion3Empleador);
		
		this.panel_CargaHoraria = new JPanel();
		this.panel_CargaHoraria.setBackground(SystemColor.inactiveCaption);
		this.panel_seleccionDatos.add(this.panel_CargaHoraria);
		this.panel_CargaHoraria.setLayout(new BorderLayout(0, 0));
		
		this.panel_labelCargaHoraria = new JPanel();
		this.panel_labelCargaHoraria.setBackground(SystemColor.inactiveCaption);
		this.panel_CargaHoraria.add(this.panel_labelCargaHoraria, BorderLayout.NORTH);
		this.panel_labelCargaHoraria.setLayout(new BorderLayout(0, 0));
		
		this.labelCargaHoraria = new JLabel("Carga Horaria");
		this.labelCargaHoraria.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelCargaHoraria.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_labelCargaHoraria.add(this.labelCargaHoraria);
		
		this.panel_opcionesCargaHoraria = new JPanel();
		this.panel_opcionesCargaHoraria.setBackground(SystemColor.inactiveCaption);
		this.panel_CargaHoraria.add(this.panel_opcionesCargaHoraria, BorderLayout.CENTER);
		
		this.rdbtnMedia = new JRadioButton("Media");
		this.rdbtnMedia.setBackground(SystemColor.inactiveCaption);
		this.rdbtnMedia.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_2.add(this.rdbtnMedia);
		this.panel_opcionesCargaHoraria.add(this.rdbtnMedia);
		
		this.rdbtnCompleta = new JRadioButton("Completa");
		this.rdbtnCompleta.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnCompleta.setBackground(SystemColor.inactiveCaption);
		buttonGroup_2.add(this.rdbtnCompleta);
		this.panel_opcionesCargaHoraria.add(this.rdbtnCompleta);
		
		this.rdbtnExtendida = new JRadioButton("Extendida");
		this.rdbtnExtendida.setBackground(SystemColor.inactiveCaption);
		this.rdbtnExtendida.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_2.add(this.rdbtnExtendida);
		this.panel_opcionesCargaHoraria.add(this.rdbtnExtendida);
		
		this.panel_tipoPuesto = new JPanel();
		this.panel_tipoPuesto.setBackground(SystemColor.inactiveCaption);
		this.panel_seleccionDatos.add(this.panel_tipoPuesto);
		this.panel_tipoPuesto.setLayout(new BorderLayout(0, 0));
		
		this.panel_labelTipoPuesto = new JPanel();
		this.panel_labelTipoPuesto.setBackground(SystemColor.inactiveCaption);
		this.panel_tipoPuesto.add(this.panel_labelTipoPuesto, BorderLayout.NORTH);
		this.panel_labelTipoPuesto.setLayout(new BorderLayout(0, 0));
		
		this.labelTipoPuesto = new JLabel("Tipo Puesto");
		this.labelTipoPuesto.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelTipoPuesto.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_labelTipoPuesto.add(this.labelTipoPuesto);
		
		this.panel_opcionesTipoPuesto = new JPanel();
		this.panel_opcionesTipoPuesto.setBackground(SystemColor.inactiveCaption);
		this.panel_tipoPuesto.add(this.panel_opcionesTipoPuesto, BorderLayout.CENTER);
		
		this.rdbtnSenior = new JRadioButton("Senior");
		this.rdbtnSenior.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnSenior.setBackground(SystemColor.inactiveCaption);
		buttonGroup_3.add(this.rdbtnSenior);
		this.panel_opcionesTipoPuesto.add(this.rdbtnSenior);
		
		this.rdbtnJunior = new JRadioButton("Junior");
		this.rdbtnJunior.setBackground(SystemColor.inactiveCaption);
		this.rdbtnJunior.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_3.add(this.rdbtnJunior);
		this.panel_opcionesTipoPuesto.add(this.rdbtnJunior);
		
		this.rdbtnManagement = new JRadioButton("Management");
		this.rdbtnManagement.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnManagement.setBackground(SystemColor.inactiveCaption);
		buttonGroup_3.add(this.rdbtnManagement);
		this.panel_opcionesTipoPuesto.add(this.rdbtnManagement);
		
		this.panel_RangoEtario = new JPanel();
		this.panel_RangoEtario.setBackground(SystemColor.inactiveCaption);
		this.panel_seleccionDatos.add(this.panel_RangoEtario);
		this.panel_RangoEtario.setLayout(new BorderLayout(0, 0));
		
		this.panel_labelRangoEtario = new JPanel();
		this.panel_labelRangoEtario.setBackground(SystemColor.inactiveCaption);
		this.panel_RangoEtario.add(this.panel_labelRangoEtario, BorderLayout.NORTH);
		this.panel_labelRangoEtario.setLayout(new BorderLayout(0, 0));
		
		this.labelRangoEtario = new JLabel("Rango Etario");
		this.labelRangoEtario.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelRangoEtario.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_labelRangoEtario.add(this.labelRangoEtario);
		
		this.panel_opcionesRangoEtario = new JPanel();
		this.panel_opcionesRangoEtario.setBackground(SystemColor.inactiveCaption);
		this.panel_RangoEtario.add(this.panel_opcionesRangoEtario, BorderLayout.CENTER);
		
		this.rdbtnMenosDe40 = new JRadioButton("Menos de 40");
		this.rdbtnMenosDe40.setBackground(SystemColor.inactiveCaption);
		this.rdbtnMenosDe40.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_4.add(this.rdbtnMenosDe40);
		this.panel_opcionesRangoEtario.add(this.rdbtnMenosDe40);
		
		this.rdbtnEntre40y50 = new JRadioButton("Entre 40 y 50");
		this.rdbtnEntre40y50.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnEntre40y50.setBackground(SystemColor.inactiveCaption);
		buttonGroup_4.add(this.rdbtnEntre40y50);
		this.panel_opcionesRangoEtario.add(this.rdbtnEntre40y50);
		
		this.rdbtnMayorde50 = new JRadioButton("Mayor de 50");
		this.rdbtnMayorde50.setBackground(SystemColor.inactiveCaption);
		this.rdbtnMayorde50.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_4.add(this.rdbtnMayorde50);
		this.panel_opcionesRangoEtario.add(this.rdbtnMayorde50);
		
		this.panel_Experiencia = new JPanel();
		this.panel_Experiencia.setBackground(SystemColor.inactiveCaption);
		this.panel_seleccionDatos.add(this.panel_Experiencia);
		this.panel_Experiencia.setLayout(new BorderLayout(0, 0));
		
		this.panel_labelExperiencia = new JPanel();
		this.panel_labelExperiencia.setBackground(SystemColor.inactiveCaption);
		this.panel_Experiencia.add(this.panel_labelExperiencia, BorderLayout.NORTH);
		this.panel_labelExperiencia.setLayout(new BorderLayout(0, 0));
		
		this.labelExperiencia = new JLabel("Experiencia");
		this.labelExperiencia.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelExperiencia.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_labelExperiencia.add(this.labelExperiencia);
		
		this.panel_opcionesExperiencia = new JPanel();
		this.panel_opcionesExperiencia.setBackground(SystemColor.inactiveCaption);
		this.panel_Experiencia.add(this.panel_opcionesExperiencia, BorderLayout.CENTER);
		
		this.rdbtnNada = new JRadioButton("Nada");
		this.rdbtnNada.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnNada.setBackground(SystemColor.inactiveCaption);
		buttonGroup_5.add(this.rdbtnNada);
		this.panel_opcionesExperiencia.add(this.rdbtnNada);
		
		this.rdbtnExpeMedia = new JRadioButton("Media");
		this.rdbtnExpeMedia.setBackground(SystemColor.inactiveCaption);
		this.rdbtnExpeMedia.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_5.add(this.rdbtnExpeMedia);
		this.panel_opcionesExperiencia.add(this.rdbtnExpeMedia);
		
		this.rdbtnMucha = new JRadioButton("Mucha");
		this.rdbtnMucha.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnMucha.setBackground(SystemColor.inactiveCaption);
		buttonGroup_5.add(this.rdbtnMucha);
		this.panel_opcionesExperiencia.add(this.rdbtnMucha);
		
		this.panel_Estudios = new JPanel();
		this.panel_Estudios.setBackground(SystemColor.inactiveCaption);
		this.panel_seleccionDatos.add(this.panel_Estudios);
		this.panel_Estudios.setLayout(new BorderLayout(0, 0));
		
		this.panel_labelEstudios = new JPanel();
		this.panel_labelEstudios.setBackground(SystemColor.inactiveCaption);
		this.panel_Estudios.add(this.panel_labelEstudios, BorderLayout.NORTH);
		this.panel_labelEstudios.setLayout(new BorderLayout(0, 0));
		
		this.labelEstudios = new JLabel("Estudios");
		this.labelEstudios.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelEstudios.setFont(new Font("Century Gothic", Font.BOLD, 16));
		this.panel_labelEstudios.add(this.labelEstudios);
		
		this.panel_opcionesEstudios = new JPanel();
		this.panel_opcionesEstudios.setBackground(SystemColor.inactiveCaption);
		this.panel_Estudios.add(this.panel_opcionesEstudios, BorderLayout.CENTER);
		
		this.rdbtnPrimario = new JRadioButton("Primario");
		this.rdbtnPrimario.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnPrimario.setBackground(SystemColor.inactiveCaption);
		buttonGroup_6.add(this.rdbtnPrimario);
		this.panel_opcionesEstudios.add(this.rdbtnPrimario);
		
		this.rdbtnSecundario = new JRadioButton("Secundario");
		this.rdbtnSecundario.setBackground(SystemColor.inactiveCaption);
		this.rdbtnSecundario.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_6.add(this.rdbtnSecundario);
		this.panel_opcionesEstudios.add(this.rdbtnSecundario);
		
		this.rdbtnTerciario = new JRadioButton("Terciario");
		this.rdbtnTerciario.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.rdbtnTerciario.setBackground(SystemColor.inactiveCaption);
		buttonGroup_6.add(this.rdbtnTerciario);
		this.panel_opcionesEstudios.add(this.rdbtnTerciario);
		
		this.panel_pesosAspectos = new JPanel();
		this.panel_pesosAspectos.setBackground(SystemColor.inactiveCaption);
		this.panelFormularioEmpleador.add(this.panel_pesosAspectos);
		this.panel_pesosAspectos.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panel_pesoLocacion = new JPanel();
		this.panel_pesoLocacion.setBackground(SystemColor.inactiveCaption);
		this.panel_pesosAspectos.add(this.panel_pesoLocacion);
		this.panel_pesoLocacion.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.lblPesoLocacion = new JLabel("Peso Locaci\u00F3n:");
		this.lblPesoLocacion.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPesoLocacion.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_pesoLocacion.add(this.lblPesoLocacion);
		
		this.spinnerLocacion = new JSpinner();
		this.spinnerLocacion.setPreferredSize(new Dimension(45, 20));
		this.spinnerLocacion.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		this.panel_pesoLocacion.add(this.spinnerLocacion);
		
		this.panel_pesoRemuneracion = new JPanel();
		this.panel_pesoRemuneracion.setBackground(SystemColor.inactiveCaption);
		this.panel_pesosAspectos.add(this.panel_pesoRemuneracion);
		
		this.lblPesoRemuneracion = new JLabel("Peso Remuneraci\u00F3n:");
		this.lblPesoRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPesoRemuneracion.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_pesoRemuneracion.add(this.lblPesoRemuneracion);
		
		this.spinnerRemuneracion = new JSpinner();
		this.spinnerRemuneracion.setPreferredSize(new Dimension(45, 20));
		this.spinnerRemuneracion.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		this.panel_pesoRemuneracion.add(this.spinnerRemuneracion);
		
		this.panel_pesoCargaHoraria = new JPanel();
		this.panel_pesoCargaHoraria.setBackground(SystemColor.inactiveCaption);
		this.panel_pesosAspectos.add(this.panel_pesoCargaHoraria);
		
		this.lblPesoCargaHoraria = new JLabel("Peso Carga Horaria:");
		this.lblPesoCargaHoraria.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPesoCargaHoraria.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_pesoCargaHoraria.add(this.lblPesoCargaHoraria);
		
		this.spinnerCargaHoraria = new JSpinner();
		this.spinnerCargaHoraria.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		this.spinnerCargaHoraria.setPreferredSize(new Dimension(45, 20));
		this.panel_pesoCargaHoraria.add(this.spinnerCargaHoraria);
		
		this.panel_pesoTipoPuesto = new JPanel();
		this.panel_pesoTipoPuesto.setBackground(SystemColor.inactiveCaption);
		this.panel_pesosAspectos.add(this.panel_pesoTipoPuesto);
		
		this.lblPesoTipoPuesto = new JLabel("Peso Tipo Puesto:");
		this.lblPesoTipoPuesto.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPesoTipoPuesto.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_pesoTipoPuesto.add(this.lblPesoTipoPuesto);
		
		this.spinnerTipoPuesto = new JSpinner();
		this.spinnerTipoPuesto.setPreferredSize(new Dimension(45, 20));
		this.spinnerTipoPuesto.setMinimumSize(new Dimension(45, 20));
		this.spinnerTipoPuesto.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		this.panel_pesoTipoPuesto.add(this.spinnerTipoPuesto);
		
		this.panel_pesoRangoEtario = new JPanel();
		this.panel_pesoRangoEtario.setBackground(SystemColor.inactiveCaption);
		this.panel_pesosAspectos.add(this.panel_pesoRangoEtario);
		
		this.lblPesoRangoEtario = new JLabel("Peso Rango Etario:");
		this.lblPesoRangoEtario.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPesoRangoEtario.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_pesoRangoEtario.add(this.lblPesoRangoEtario);
		
		this.spinnerRangoEtario = new JSpinner();
		this.spinnerRangoEtario.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		this.spinnerRangoEtario.setPreferredSize(new Dimension(45, 20));
		this.panel_pesoRangoEtario.add(this.spinnerRangoEtario);
		
		this.panel_pesoExperiencia = new JPanel();
		this.panel_pesoExperiencia.setBackground(SystemColor.inactiveCaption);
		this.panel_pesosAspectos.add(this.panel_pesoExperiencia);
		
		this.lblPesoExperiencia = new JLabel("Peso Experiencia:");
		this.lblPesoExperiencia.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPesoExperiencia.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_pesoExperiencia.add(this.lblPesoExperiencia);
		
		this.spinnerExperiencia = new JSpinner();
		this.spinnerExperiencia.setPreferredSize(new Dimension(45, 20));
		this.spinnerExperiencia.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		this.panel_pesoExperiencia.add(this.spinnerExperiencia);
		
		this.panel_pesoEstudios = new JPanel();
		this.panel_pesoEstudios.setBackground(SystemColor.inactiveCaption);
		this.panel_pesosAspectos.add(this.panel_pesoEstudios);
		
		this.lblPesoEstudios = new JLabel("Peso Estudios:");
		this.lblPesoEstudios.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblPesoEstudios.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_pesoEstudios.add(this.lblPesoEstudios);
		
		this.spinnerEstudios = new JSpinner();
		this.spinnerEstudios.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		this.spinnerEstudios.setPreferredSize(new Dimension(45, 20));
		this.panel_pesoEstudios.add(this.spinnerEstudios);
		
		this.panel_CantEmpleosSolicitados = new JPanel();
		this.panel_CantEmpleosSolicitados.setBackground(SystemColor.inactiveCaption);
		this.panel_pesosAspectos.add(this.panel_CantEmpleosSolicitados);
		
		this.lblCantidadEmpleadosSolicitados = new JLabel("Cantidad Empleados Solicitados:");
		this.lblCantidadEmpleadosSolicitados.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblCantidadEmpleadosSolicitados.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_CantEmpleosSolicitados.add(this.lblCantidadEmpleadosSolicitados);
		
		this.spinnerEmpSolic = new JSpinner();
		this.spinnerEmpSolic.setPreferredSize(new Dimension(45, 20));
		this.spinnerEmpSolic.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		this.panel_CantEmpleosSolicitados.add(this.spinnerEmpSolic);
		
		this.panel_botones = new JPanel();
		this.panel_botones.setBackground(SystemColor.inactiveCaption);
		this.contentPane.add(this.panel_botones, BorderLayout.SOUTH);
		
		this.btnAgregar = new JButton("Agregar");
		this.btnAgregar.setActionCommand("AgregarTicketEmpleador");
		this.btnAgregar.setBackground(UIManager.getColor("CheckBox.focus"));
		this.btnAgregar.setForeground(Color.BLACK);
		this.btnAgregar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.panel_botones.add(this.btnAgregar);
		
		this.btnFinalizar = new JButton("Finalizar");
		this.btnFinalizar.setActionCommand("FinalizarRegistroEmpleador");
		this.btnFinalizar.setBackground(UIManager.getColor("CheckBox.focus"));
		this.btnFinalizar.setForeground(Color.BLACK);
		this.btnFinalizar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.panel_botones.add(this.btnFinalizar);
	}
	

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	public JSpinner getSpinnerLocacion() {
		return spinnerLocacion;
	}

	public JSpinner getSpinnerRemuneracion() {
		return spinnerRemuneracion;
	}

	public JSpinner getSpinnerCargaHoraria() {
		return spinnerCargaHoraria;
	}

	public JSpinner getSpinnerTipoPuesto() {
		return spinnerTipoPuesto;
	}

	public JSpinner getSpinnerRangoEtario() {
		return spinnerRangoEtario;
	}
	
	public JSpinner getSpinnerExperiencia() {
		return spinnerExperiencia;
	}

	public JSpinner getSpinnerEstudios() {
		return spinnerEstudios;
	}

	public JSpinner getSpinnerEmpSolic() {
		return spinnerEmpSolic;
	}

	public ActionListener getActionlistener() {
		return actionlistener;
	}


	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	public ButtonGroup getButtonGroup_1() {
		return buttonGroup_1;
	}

	public ButtonGroup getButtonGroup_2() {
		return buttonGroup_2;
	}

	public ButtonGroup getButtonGroup_3() {
		return buttonGroup_3;
	}

	public ButtonGroup getButtonGroup_4() {
		return buttonGroup_4;
	}

	public ButtonGroup getButtonGroup_5() {
		return buttonGroup_5;
	}

	public ButtonGroup getButtonGroup_6() {
		return buttonGroup_6;
	}

	
	
	public JRadioButton getRdbtnHomeOfficeEmpleador() {
		return rdbtnHomeOfficeEmpleador;
	}

	public JRadioButton getRdbtnPresencialEmpleador() {
		return rdbtnPresencialEmpleador;
	}

	public JRadioButton getRdbtnIndistintoEmpleador() {
		return rdbtnIndistintoEmpleador;
	}

	public JRadioButton getRdbtnRemuneracion1Empleador() {
		return rdbtnRemuneracion1Empleador;
	}

	public JRadioButton getRdbtnRemuneracion2Empleador() {
		return rdbtnRemuneracion2Empleador;
	}

	public JRadioButton getRdbtnRemuneracion3Empleador() {
		return rdbtnRemuneracion3Empleador;
	}

	public JRadioButton getRdbtnMedia() {
		return rdbtnMedia;
	}

	public JRadioButton getRdbtnCompleta() {
		return rdbtnCompleta;
	}

	public JRadioButton getRdbtnExtendida() {
		return rdbtnExtendida;
	}

	public JRadioButton getRdbtnSenior() {
		return rdbtnSenior;
	}

	public JRadioButton getRdbtnJunior() {
		return rdbtnJunior;
	}

	public JRadioButton getRdbtnManagement() {
		return rdbtnManagement;
	}

	public JRadioButton getRdbtnMenosDe40() {
		return rdbtnMenosDe40;
	}

	public JRadioButton getRdbtnEntre40y50() {
		return rdbtnEntre40y50;
	}

	public JRadioButton getRdbtnMayorde50() {
		return rdbtnMayorde50;
	}

	public JRadioButton getRdbtnNada() {
		return rdbtnNada;
	}

	public JRadioButton getRdbtnExpeMedia() {
		return rdbtnExpeMedia;
	}

	public JRadioButton getRdbtnMucha() {
		return rdbtnMucha;
	}

	public JRadioButton getRdbtnPrimario() {
		return rdbtnPrimario;
	}

	public JRadioButton getRdbtnSecundario() {
		return rdbtnSecundario;
	}

	public JRadioButton getRdbtnTerciario() {
		return rdbtnTerciario;
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btnAgregar.addActionListener(actionListener);
		this.btnFinalizar.addActionListener(actionListener);
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