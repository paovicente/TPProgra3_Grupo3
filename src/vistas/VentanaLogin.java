package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame implements IVista {

	private JPanel contentPane;
	private JPanel panel_TituloImagen;
	private JPanel panelLoginRegistro;
	private JPanel panelDatos;
	private JPanel panelBotones;
	private JLabel labelNombreUsuario;
	private JLabel labelContraseña;
	private JTextField inputContraseña;
	private JPanel panel_NombreUsuario;
	private JPanel panel_inputNombreUsuario;
	private JPanel panel_Contraseña;
	private JPanel panel_inputContraseña;
	private JPanel panel_InputCentrado;
	private JTextField inputNombreUsuario;
	private JPanel panel_InputContraseñaCentrado;
	private JButton btnIniciarSesion;
	private JPanel panelBotonRegistro;
	private JPanel panelBotonIniciarSesion;
	private JPanel panel_Title;
	private JPanel panel_Foto;
	private JLabel lblAgenciaDeEmpleo;
	private JLabel labelFoto;
	private JButton btnRegistrarse;
	private ActionListener actionListener;
	
	public ActionListener getActionListener() {
		return actionListener;
	}

	/*public void setActionListener(ActionListener actionListener) {
		this.actionListener = actionListener;
	} */

	
	public void setActionListener(ActionListener actionlistener) {
		this.btnIniciarSesion.addActionListener(actionlistener);
        this.btnRegistrarse.addActionListener(actionlistener);
        this.actionListener = actionlistener;
    }
	

	/**
	 * Launch the application.
	 */
	/* public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}  */

	/**
	 * Create the frame.
	 */
	public VentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 479);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_TituloImagen = new JPanel();
		this.panel_TituloImagen.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.contentPane.add(this.panel_TituloImagen);
		this.panel_TituloImagen.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_Title = new JPanel();
		this.panel_Title.setBackground(SystemColor.inactiveCaption);
		this.panel_Title.setPreferredSize(new Dimension(30, 30));
		this.panel_TituloImagen.add(this.panel_Title);
		this.panel_Title.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.lblAgenciaDeEmpleo = new JLabel("Agencia de Empleo \"Grupo 3\"");
		this.lblAgenciaDeEmpleo.setBackground(SystemColor.inactiveCaption);
		this.lblAgenciaDeEmpleo.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblAgenciaDeEmpleo.setFont(new Font("Century Gothic", Font.BOLD, 24));
		this.panel_Title.add(this.lblAgenciaDeEmpleo);
		
		this.panel_Foto = new JPanel();
		this.panel_Foto.setBackground(SystemColor.inactiveCaption);
		this.panel_TituloImagen.add(this.panel_Foto);
		this.panel_Foto.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.labelFoto = new JLabel("");
		this.labelFoto.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelFoto.setIcon(new ImageIcon("C:\\Users\\Gamer\\Downloads\\TPG_P1\\img\\agencia_sm.png"));
		this.panel_Foto.add(this.labelFoto);
		
		this.panelLoginRegistro = new JPanel();
		this.panelLoginRegistro.setBorder(null);
		this.contentPane.add(this.panelLoginRegistro);
		this.panelLoginRegistro.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panelDatos = new JPanel();
		this.panelDatos.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panelLoginRegistro.add(this.panelDatos);
		this.panelDatos.setLayout(new GridLayout(2, 2, 0, 0));
		
		this.panel_NombreUsuario = new JPanel();
		this.panel_NombreUsuario.setBackground(SystemColor.inactiveCaption);
		this.panel_NombreUsuario.setBorder(null);
		this.panelDatos.add(this.panel_NombreUsuario);
		this.panel_NombreUsuario.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.labelNombreUsuario = new JLabel("Nombre Usuario");
		this.labelNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelNombreUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		this.panel_NombreUsuario.add(this.labelNombreUsuario);
		
		this.panel_inputNombreUsuario = new JPanel();
		this.panel_inputNombreUsuario.setMaximumSize(new Dimension(50, 50));
		this.panel_inputNombreUsuario.setForeground(Color.WHITE);
		this.panel_inputNombreUsuario.setBorder(null);
		this.panel_inputNombreUsuario.setPreferredSize(new Dimension(20, 20));
		this.panelDatos.add(this.panel_inputNombreUsuario);
		this.panel_inputNombreUsuario.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_InputCentrado = new JPanel();
		this.panel_InputCentrado.setBackground(SystemColor.inactiveCaption);
		this.panel_inputNombreUsuario.add(this.panel_InputCentrado);
		this.panel_InputCentrado.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));
		
		this.inputNombreUsuario = new JTextField();
		this.inputNombreUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.inputNombreUsuario.setMargin(new Insets(2, 0, 2, 0));
		this.inputNombreUsuario.setColumns(10);
		this.panel_InputCentrado.add(this.inputNombreUsuario);
		
		this.panel_Contraseña = new JPanel();
		this.panel_Contraseña.setBackground(SystemColor.inactiveCaption);
		this.panel_Contraseña.setBorder(null);
		this.panelDatos.add(this.panel_Contraseña);
		this.panel_Contraseña.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.labelContraseña = new JLabel("Contrase\u00F1a");
		this.labelContraseña.setBackground(Color.WHITE);
		this.labelContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelContraseña.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		this.panel_Contraseña.add(this.labelContraseña);
		
		this.panel_inputContraseña = new JPanel();
		this.panel_inputContraseña.setBorder(null);
		this.panelDatos.add(this.panel_inputContraseña);
		this.panel_inputContraseña.setLayout(new GridLayout(1, 1, 0, 0));
		
		this.panel_InputContraseñaCentrado = new JPanel();
		this.panel_InputContraseñaCentrado.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout = (FlowLayout) this.panel_InputContraseñaCentrado.getLayout();
		flowLayout.setHgap(0);
		flowLayout.setVgap(40);
		this.panel_inputContraseña.add(this.panel_InputContraseñaCentrado);
		
		this.inputContraseña = new JTextField();
		this.inputContraseña.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		this.inputContraseña.setMargin(new Insets(2, 0, 2, 0));
		this.panel_InputContraseñaCentrado.add(this.inputContraseña);
		this.inputContraseña.setColumns(10);
		
		this.panelBotones = new JPanel();
		this.panelBotones.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		this.panelLoginRegistro.add(this.panelBotones);
		this.panelBotones.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panelBotonRegistro = new JPanel();
		this.panelBotonRegistro.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout_1 = (FlowLayout) this.panelBotonRegistro.getLayout();
		flowLayout_1.setVgap(35);
		this.panelBotones.add(this.panelBotonRegistro);
		
		this.btnRegistrarse = new JButton("Registrarse");
		this.btnRegistrarse.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.panelBotonRegistro.add(this.btnRegistrarse);
		
		this.panelBotonIniciarSesion = new JPanel();
		this.panelBotonIniciarSesion.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout_2 = (FlowLayout) this.panelBotonIniciarSesion.getLayout();
		flowLayout_2.setVgap(35);
		this.panelBotones.add(this.panelBotonIniciarSesion);
		
		this.btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		this.btnIniciarSesion.setActionCommand("IniciarSes");
		this.btnIniciarSesion.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		this.panelBotonIniciarSesion.add(this.btnIniciarSesion);
	}
	
	

	public JTextField getInputContraseña() {
		return inputContraseña;
	}

	public void setInputContraseña(JTextField inputContraseña) {
		this.inputContraseña = inputContraseña;
	}

	public JTextField getInputNombreUsuario() {
		return inputNombreUsuario;
	}

	public void setInputNombreUsuario(JTextField inputNombreUsuario) {
		this.inputNombreUsuario = inputNombreUsuario;
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
