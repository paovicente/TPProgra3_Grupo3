package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class VentanaThreads extends JFrame implements IVista{

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private ActionListener actionListener;
	private JButton btnCerrar;
	private JButton btnIniciarPrueba;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */

	public JTextArea getTextArea() {
		return textArea;
	}



	/**
	 * Create the frame.
	 */
	public VentanaThreads() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(SystemColor.inactiveCaption);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.panel = new JPanel();
		this.panel.setBackground(SystemColor.inactiveCaption);
		this.contentPane.add(this.panel, BorderLayout.WEST);
		
		this.panel_1 = new JPanel();
		this.panel_1.setBackground(SystemColor.inactiveCaption);
		this.contentPane.add(this.panel_1, BorderLayout.NORTH);
		
		this.panel_2 = new JPanel();
		this.panel_2.setBackground(SystemColor.inactiveCaption);
		this.contentPane.add(this.panel_2, BorderLayout.EAST);
		
		this.panel_3 = new JPanel();
		this.panel_3.setBackground(SystemColor.inactiveCaption);
		this.contentPane.add(this.panel_3, BorderLayout.SOUTH);
		
		this.btnIniciarPrueba = new JButton("Iniciar Prueba");
		this.btnIniciarPrueba.setActionCommand("IniciarPrueba");
		this.panel_3.add(this.btnIniciarPrueba);
		
		this.btnCerrar = new JButton("Cerrar");
		this.btnCerrar.setActionCommand("Cerrar");
		this.panel_3.add(this.btnCerrar);
		
		this.scrollPane = new JScrollPane();
		this.contentPane.add(this.scrollPane, BorderLayout.CENTER);
		
		this.textArea = new JTextArea();
		this.scrollPane.setViewportView(this.textArea);
	}



	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btnCerrar.addActionListener(actionListener);
		this.btnIniciarPrueba.addActionListener(actionListener);
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
