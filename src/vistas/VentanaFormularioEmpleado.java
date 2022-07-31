package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.UIManager;

public class VentanaFormularioEmpleado extends JFrame implements IVista {

	private JPanel contentPane;
	private JPanel panelFormularioEmpleado;
	private JPanel panelLocacion;
	private JPanel panel_Remuneracion;
	private JPanel panel_CargaHoraria;
	private JPanel panel_tipoPuesto;
	private JPanel panel_RangoEtario;
	private JPanel panel_Experiencia;
	private JPanel panel_Estudios;
	private JPanel panel_LabelLocacion;
	private JPanel panel_opcionesLocacion;
	private JRadioButton rdbtnHomeOfficeEmpleado;
	private JRadioButton rdbtnPresencialEmpleado;
	private JRadioButton rdbtnIndistintoEmpleado;
	private JLabel labelLocacion;
	private JPanel panel_labelRemuneracion;
	private JPanel panel_opcionesRemuneracion;
	private JLabel labelRemuneracion;
	private JRadioButton rdbtnRemuneracion1Empleado;
	private JRadioButton rdbtnRemuneracion2Empleado;
	private JRadioButton rdbtnRemuneracion3Empleado;
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
	private JPanel panel_btnContinuar;
	private JButton btn_Continuar;
	private ActionListener actionlistener;

	/**
	 * Create the frame.
	 */
	public VentanaFormularioEmpleado() {
		setTitle("Formulario Empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 606);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panelFormularioEmpleado = new JPanel();
		this.panelFormularioEmpleado.setBackground(Color.BLACK);
		this.contentPane.add(this.panelFormularioEmpleado);
		this.panelFormularioEmpleado.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panelLocacion = new JPanel();
		this.panelLocacion.setBackground(SystemColor.inactiveCaption);
		this.panelLocacion.setBorder(null);
		this.panelFormularioEmpleado.add(this.panelLocacion);
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
		
		this.rdbtnHomeOfficeEmpleado = new JRadioButton("Home Office");
		this.rdbtnHomeOfficeEmpleado.setBackground(SystemColor.inactiveCaption);
		this.rdbtnHomeOfficeEmpleado.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup.add(this.rdbtnHomeOfficeEmpleado);
		this.panel_opcionesLocacion.add(this.rdbtnHomeOfficeEmpleado);
		
		this.rdbtnPresencialEmpleado = new JRadioButton("Presencial");
		this.rdbtnPresencialEmpleado.setBackground(SystemColor.inactiveCaption);
		this.rdbtnPresencialEmpleado.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup.add(this.rdbtnPresencialEmpleado);
		this.panel_opcionesLocacion.add(this.rdbtnPresencialEmpleado);
		
		this.rdbtnIndistintoEmpleado = new JRadioButton("Indistinto");
		this.rdbtnIndistintoEmpleado.setBackground(SystemColor.inactiveCaption);
		this.rdbtnIndistintoEmpleado.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup.add(this.rdbtnIndistintoEmpleado);
		this.panel_opcionesLocacion.add(this.rdbtnIndistintoEmpleado);
		
		this.panel_Remuneracion = new JPanel();
		this.panel_Remuneracion.setBackground(SystemColor.inactiveCaption);
		this.panelFormularioEmpleado.add(this.panel_Remuneracion);
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
		
		this.rdbtnRemuneracion1Empleado = new JRadioButton("$40.000");
		this.rdbtnRemuneracion1Empleado.setBackground(SystemColor.inactiveCaption);
		this.rdbtnRemuneracion1Empleado.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_1.add(this.rdbtnRemuneracion1Empleado);
		this.panel_opcionesRemuneracion.add(this.rdbtnRemuneracion1Empleado);
		
		this.rdbtnRemuneracion2Empleado = new JRadioButton("$80.000");
		this.rdbtnRemuneracion2Empleado.setBackground(SystemColor.inactiveCaption);
		this.rdbtnRemuneracion2Empleado.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_1.add(this.rdbtnRemuneracion2Empleado);
		this.panel_opcionesRemuneracion.add(this.rdbtnRemuneracion2Empleado);
		
		this.rdbtnRemuneracion3Empleado = new JRadioButton("$120.000");
		this.rdbtnRemuneracion3Empleado.setBackground(SystemColor.inactiveCaption);
		this.rdbtnRemuneracion3Empleado.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_1.add(this.rdbtnRemuneracion3Empleado);
		this.panel_opcionesRemuneracion.add(this.rdbtnRemuneracion3Empleado);
		
		this.panel_CargaHoraria = new JPanel();
		this.panel_CargaHoraria.setBackground(SystemColor.inactiveCaption);
		this.panelFormularioEmpleado.add(this.panel_CargaHoraria);
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
		this.rdbtnCompleta.setBackground(SystemColor.inactiveCaption);
		this.rdbtnCompleta.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_2.add(this.rdbtnCompleta);
		this.panel_opcionesCargaHoraria.add(this.rdbtnCompleta);
		
		this.rdbtnExtendida = new JRadioButton("Extendida");
		this.rdbtnExtendida.setBackground(SystemColor.inactiveCaption);
		this.rdbtnExtendida.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_2.add(this.rdbtnExtendida);
		this.panel_opcionesCargaHoraria.add(this.rdbtnExtendida);
		
		this.panel_tipoPuesto = new JPanel();
		this.panel_tipoPuesto.setBackground(SystemColor.inactiveCaption);
		this.panelFormularioEmpleado.add(this.panel_tipoPuesto);
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
		this.rdbtnSenior.setBackground(SystemColor.inactiveCaption);
		this.rdbtnSenior.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_3.add(this.rdbtnSenior);
		this.panel_opcionesTipoPuesto.add(this.rdbtnSenior);
		
		this.rdbtnJunior = new JRadioButton("Junior");
		this.rdbtnJunior.setBackground(SystemColor.inactiveCaption);
		this.rdbtnJunior.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_3.add(this.rdbtnJunior);
		this.panel_opcionesTipoPuesto.add(this.rdbtnJunior);
		
		this.rdbtnManagement = new JRadioButton("Management");
		this.rdbtnManagement.setBackground(SystemColor.inactiveCaption);
		this.rdbtnManagement.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_3.add(this.rdbtnManagement);
		this.panel_opcionesTipoPuesto.add(this.rdbtnManagement);
		
		this.panel_RangoEtario = new JPanel();
		this.panel_RangoEtario.setBackground(SystemColor.inactiveCaption);
		this.panelFormularioEmpleado.add(this.panel_RangoEtario);
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
		this.rdbtnEntre40y50.setBackground(SystemColor.inactiveCaption);
		this.rdbtnEntre40y50.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_4.add(this.rdbtnEntre40y50);
		this.panel_opcionesRangoEtario.add(this.rdbtnEntre40y50);
		
		this.rdbtnMayorde50 = new JRadioButton("Mayor de 50");
		this.rdbtnMayorde50.setBackground(SystemColor.inactiveCaption);
		this.rdbtnMayorde50.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_4.add(this.rdbtnMayorde50);
		this.panel_opcionesRangoEtario.add(this.rdbtnMayorde50);
		
		this.panel_Experiencia = new JPanel();
		this.panel_Experiencia.setBackground(SystemColor.inactiveCaption);
		this.panelFormularioEmpleado.add(this.panel_Experiencia);
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
		this.rdbtnNada.setBackground(SystemColor.inactiveCaption);
		this.rdbtnNada.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_5.add(this.rdbtnNada);
		this.panel_opcionesExperiencia.add(this.rdbtnNada);
		
		this.rdbtnExpeMedia = new JRadioButton("Media");
		this.rdbtnExpeMedia.setBackground(SystemColor.inactiveCaption);
		this.rdbtnExpeMedia.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_5.add(this.rdbtnExpeMedia);
		this.panel_opcionesExperiencia.add(this.rdbtnExpeMedia);
		
		this.rdbtnMucha = new JRadioButton("Mucha");
		this.rdbtnMucha.setBackground(SystemColor.inactiveCaption);
		this.rdbtnMucha.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_5.add(this.rdbtnMucha);
		this.panel_opcionesExperiencia.add(this.rdbtnMucha);
		
		this.panel_Estudios = new JPanel();
		this.panel_Estudios.setBackground(SystemColor.inactiveCaption);
		this.panelFormularioEmpleado.add(this.panel_Estudios);
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
		this.rdbtnPrimario.setBackground(SystemColor.inactiveCaption);
		this.rdbtnPrimario.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_6.add(this.rdbtnPrimario);
		this.panel_opcionesEstudios.add(this.rdbtnPrimario);
		
		this.rdbtnSecundario = new JRadioButton("Secundario");
		this.rdbtnSecundario.setBackground(SystemColor.inactiveCaption);
		this.rdbtnSecundario.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_6.add(this.rdbtnSecundario);
		this.panel_opcionesEstudios.add(this.rdbtnSecundario);
		
		this.rdbtnTerciario = new JRadioButton("Terciario");
		this.rdbtnTerciario.setBackground(SystemColor.inactiveCaption);
		this.rdbtnTerciario.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buttonGroup_6.add(this.rdbtnTerciario);
		this.panel_opcionesEstudios.add(this.rdbtnTerciario);
		
		this.panel_btnContinuar = new JPanel();
		this.panel_btnContinuar.setBackground(SystemColor.inactiveCaption);
		this.panelFormularioEmpleado.add(this.panel_btnContinuar);
		
		this.btn_Continuar = new JButton("Continuar");
		this.btn_Continuar.setActionCommand("ContinuarRegEmpleado");
		this.btn_Continuar.setBackground(UIManager.getColor("CheckBox.focus"));
		this.btn_Continuar.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.panel_btnContinuar.add(this.btn_Continuar);
	}

	public JRadioButton getRdbtnHomeOfficeEmpleado() {
		return rdbtnHomeOfficeEmpleado;
	}

	public JRadioButton getRdbtnPresencialEmpleado() {
		return rdbtnPresencialEmpleado;
	}

	public JRadioButton getRdbtnIndistintoEmpleado() {
		return rdbtnIndistintoEmpleado;
	}

	public JRadioButton getRdbtnRemuneracion1Empleado() {
		return rdbtnRemuneracion1Empleado;
	}

	public JRadioButton getRdbtnRemuneracion2Empleado() {
		return rdbtnRemuneracion2Empleado;
	}

	public JRadioButton getRdbtnRemuneracion3Empleado() {
		return rdbtnRemuneracion3Empleado;
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

	public JButton getBtn_Continuar() {
		return btn_Continuar;
	}


	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_Continuar.addActionListener(actionListener);
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
	
	public void nuevoComando() {
		this.btn_Continuar.setText("Finalizar");
		this.btn_Continuar.setActionCommand("Finalizar");
	}
}