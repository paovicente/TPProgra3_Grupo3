package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import negocio.Sistema;
import vistas.IVista;
import vistas.VentanaLogin;
import vistas.VentanaPersistir;

public class ControladorPersistencia implements ActionListener{
	private Sistema sistema = Sistema.getInstancia();
	private IVista vista;
	public ControladorPersistencia() {
		this.vista = new VentanaPersistir();
		this.vista.setActionListener(this);
		this.vista.mostrar();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		 if(comando.equalsIgnoreCase("Persistir")) {
			try {
				sistema.escribirPersistencia();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (comando.equalsIgnoreCase("LeerPersistencia")) {
			try {
				sistema.leerPersistencia();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	public void setVista(IVista vista) {
		this.vista = vista;
		this.vista.setActionListener(this);
		this.vista.mostrar();
	}

}
