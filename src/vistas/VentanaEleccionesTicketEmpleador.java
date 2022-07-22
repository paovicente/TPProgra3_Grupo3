package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;

import modelo.UsuarioInteractivo;

import java.awt.Color;

public class VentanaEleccionesTicketEmpleador extends JFrame implements IVista {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnSeguir;
	private JScrollPane scrollPane;
	private JList list;
	private DefaultListModel modeloLista;
	private ActionListener actionListener;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaElecciones frame = new VentanaElecciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaEleccionesTicketEmpleador() {
		setTitle("Ronda de Elecciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 578);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane = new JScrollPane();
		this.panel.add(this.scrollPane, BorderLayout.CENTER);
		
		this.list = new JList();
		this.modeloLista = new DefaultListModel<UsuarioInteractivo>();
		this.list.setModel(modeloLista);
		this.scrollPane.setViewportView(this.list);
		
		this.panel_1 = new JPanel();
		this.panel_1.setBackground(SystemColor.inactiveCaption);
		this.contentPane.add(this.panel_1, BorderLayout.SOUTH);
		
		this.btnSeguir = new JButton("Seguir");
		this.btnSeguir.setActionCommand("SeguirTicketEmpleador");
		this.btnSeguir.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.btnSeguir.setBackground(SystemColor.inactiveCaption);
		this.btnSeguir.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		this.panel_1.add(this.btnSeguir);
	}

	
	
	public JList getList() {
		return list;
	}

	public DefaultListModel getModeloLista() {
		return modeloLista;
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btnSeguir.addActionListener(actionListener);
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
