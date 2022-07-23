package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

import modelo.AdminAgencia;
import modelo.CargaCompleta;
import modelo.CargaExtendida;
import modelo.CargaHoraria;
import modelo.CargaMedia;
import modelo.ContraseniaIncorrectaException;
import modelo.Entre40y50;
import modelo.EstudiosCursados;
import modelo.Experiencia;
import modelo.HomeOffice;
import modelo.Indistinto;
import modelo.Junior;
import modelo.ListaDelEmpleado;
import modelo.ListaDelEmpleador;
import modelo.Locacion;
import modelo.Management;
import modelo.MasDe50;
import modelo.Media;
import modelo.MenosDe40;
import modelo.Mucha;
import modelo.Nada;
import modelo.NombreIncorrectoException;
import modelo.Presencial;
import modelo.Primario;
import modelo.RangoEtario;
import modelo.Remuneracion;
import modelo.Secundario;
import modelo.Senior;
import modelo.Terciario;
import modelo.TicketBuscaEmpleado;
import modelo.TipoPuesto;
import modelo.Usuario;
import modelo.UsuarioInteractivo;
import modelo.V1;
import modelo.V2;
import modelo.V3;
import modelo.Empleado;
import modelo.Empleador;
import vistas.IVista;
import vistas.VentanaAgencia;
import vistas.VentanaElecciones;
import vistas.VentanaEleccionesTicketEmpleador;
import vistas.VentanaEmpleado;
import vistas.VentanaEmpleador;
import vistas.VentanaFormularioEmpleado;
import vistas.VentanaFormularioEmpleador;
import vistas.VentanaLogin;
import vistas.VentanaRegistro;
import vistas.VentanaRegistroAdmin;
import vistas.VentanaRegistroEmpleado;
import vistas.VentanaRegistroEmpleador;
import negocio.Sistema;

public class Controlador implements ActionListener{  //es correcto que el controlador cree (haga el new de) los objetos????
	
	private IVista vista;
	private Usuario usuario;
	private Sistema sistema = Sistema.getInstancia();
	private String nombreUsuario;
	private String contrasenia;
	private TicketBuscaEmpleado ticketEmpleador;

	public Controlador() {
		this.vista = new VentanaLogin();
		this.vista.setActionListener(this);
		this.vista.mostrar();
	}

	public IVista getVista() {
		return vista;
	}


	public void setVista(IVista vista) {
		this.vista = vista;
		this.vista.setActionListener(this);
		this.vista.mostrar();
	}

      //hacer!!!!!!! emprolijar la ventana de registro de admin, reciclé la de empleado solo para corroborar que funcionase 
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		System.out.println("Comando: "+ comando);
		if (comando.equalsIgnoreCase("REGISTRARSE")) {     
			this.vista.cerrar();
			this.setVista(new VentanaRegistro());
		} else if (comando.equalsIgnoreCase("IniciarSes")) {
			VentanaLogin ventLog = (VentanaLogin) vista;
			this.vista.cerrar();
			try {
				usuario = sistema.login(ventLog.getInputNombreUsuario().getText(), ventLog.getInputContraseña().getText());
				System.out.println("Codigo de usuario:"+ usuario.getCodUsuario());
				if (usuario.getCodUsuario()==1) {		
					this.setVista(new VentanaEmpleado());
				} else if (usuario.getCodUsuario()==2)
					this.setVista(new VentanaEmpleador());
				else if (usuario.getCodUsuario()==3)
					this.setVista(new VentanaAgencia());
			} catch(NombreIncorrectoException ex) {  
				JOptionPane.showMessageDialog(null,"Nombre de usuario incorrecto");
				this.vista.cerrar();
				this.setVista(new VentanaLogin());
			} catch (ContraseniaIncorrectaException ex1) {
				JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
				this.vista.cerrar();
				this.setVista(new VentanaLogin());
			}
		} else if (comando.equalsIgnoreCase("RegistrarseEmpleador")) {
			VentanaRegistroEmpleador ventRegEmpleador = (VentanaRegistroEmpleador) vista;
			String persona;
			String rubro;
			if (ventRegEmpleador.getRadioButtonFisica().isSelected())
				persona="Fisica";
			else
				persona="Juridica";
			
			if (ventRegEmpleador.getRadioButtonSalud().isSelected())
				rubro="Salud";
			else if (ventRegEmpleador.getRadioButtonComercioLocal().isSelected())
				rubro="ComercioLocal";
			else 
				rubro="ComercioInternacional";
			
			usuario = sistema.registroEmpleador(ventRegEmpleador.getInputNombreEmpleador().getText(),this.nombreUsuario , this.contrasenia, persona, rubro);
			this.vista.cerrar();
			this.setVista(new VentanaFormularioEmpleador());
		} else if (comando.equalsIgnoreCase("Siguiente")) {
			VentanaRegistro ventReg = (VentanaRegistro) vista;
			this.nombreUsuario = ventReg.getInput_NombreUsuario().getText();
			this.contrasenia = ventReg.getPasswordField().getText();

			this.vista.cerrar();
			if (ventReg.getRdbtn_opcionEmpleado().isSelected()) {
				this.setVista(new VentanaRegistroEmpleado());
			} else if (ventReg.getRdbtn_opcionEmpleador().isSelected()) {
				this.setVista(new VentanaRegistroEmpleador());
			} else if (ventReg.getRdbtn_opcionAdmin().isSelected()) {
				this.setVista(new VentanaRegistroAdmin());
			}
		} else if (comando.equalsIgnoreCase("RegistrarseEmpleado")) {
			VentanaRegistroEmpleado ventRegEmpleado = (VentanaRegistroEmpleado) vista;
			usuario = sistema.registroEmpleado(ventRegEmpleado.getInput_Nombre().getText(), this.nombreUsuario, this.contrasenia, ventRegEmpleado.getInput_Telefono().getText(), Integer.parseInt(ventRegEmpleado.getInput_Edad().getText()));
			//usuario = new Empleado(ventRegEmpleado.getInput_Nombre().getText(),this.nombreUsuario,this.contrasenia,ventRegEmpleado.getInput_Telefono().getText(),Integer.parseInt(ventRegEmpleado.getInput_Edad().getText()));
			this.vista.cerrar();
			this.setVista(new VentanaFormularioEmpleado());
		} else if (comando.equalsIgnoreCase("RegistrarseAdmin")) {
			VentanaRegistroAdmin ventRegAdmin= (VentanaRegistroAdmin) vista;
			usuario = sistema.registroAdmin(ventRegAdmin.getInput_Nombre().getText(), this.nombreUsuario, this.contrasenia);
			sistema.agregarAdmin((AdminAgencia) usuario);
			this.vista.cerrar();
			JOptionPane.showMessageDialog(null,"¡Registro de ADMIN exitoso!");
			this.setVista(new VentanaLogin());
			
		}else if (comando.equalsIgnoreCase("ContinuarRegEmpleado")) {
			VentanaFormularioEmpleado ventFormEmpleado = (VentanaFormularioEmpleado) vista;
			String cargaHoraria;
			String estudiosCursados;
			String experiencia;
			String locacion;
			String rangoEtario;
			String remuneracion;
			String tipoPuesto;   
			 //ver luego si hay forma mas prolija de hacer esto
			
			if (ventFormEmpleado.getRdbtnCompleta().isSelected())
				cargaHoraria = "CargaCompleta";
			else if (ventFormEmpleado.getRdbtnExtendida().isSelected())
				cargaHoraria = "CargaExtendida";
			else
				cargaHoraria = "CargaMedia";
			
			if (ventFormEmpleado.getRdbtnPrimario().isSelected())
				estudiosCursados = "Primario";
			else if (ventFormEmpleado.getRdbtnSecundario().isSelected())
				estudiosCursados = "Secundario";
			else 
				estudiosCursados = "Terciario";
			
			if (ventFormEmpleado.getRdbtnNada().isSelected())
				experiencia = "Nada";
			else if (ventFormEmpleado.getRdbtnExpeMedia().isSelected())
				experiencia = "Media";
			else 
				experiencia = "Mucha";
			
			if (ventFormEmpleado.getRdbtnPresencialEmpleado().isSelected())
				locacion = "Presencial";
			else if (ventFormEmpleado.getRdbtnHomeOfficeEmpleado().isSelected())
				locacion = "HomeOffice";
			else
				locacion = "Indistinto";
			
			if (ventFormEmpleado.getRdbtnMenosDe40().isSelected())
				rangoEtario = "MenosDe40";
			else if (ventFormEmpleado.getRdbtnEntre40y50().isSelected())
				rangoEtario = "Entre40y50";
			else
				rangoEtario = "MasDe50";
			
			if (ventFormEmpleado.getRdbtnRemuneracion1Empleado().isSelected())
				remuneracion = "V1";
			else if (ventFormEmpleado.getRdbtnRemuneracion2Empleado().isSelected())
				remuneracion = "V2";
			else
				remuneracion = "V3";
			
			if (ventFormEmpleado.getRdbtnManagement().isSelected())
				tipoPuesto = "Management";
			else if (ventFormEmpleado.getRdbtnJunior().isSelected())
				tipoPuesto = "Junior";
			else 
				tipoPuesto = "Senior";
	
			sistema.asignaTicketBuscaEmpleo((Empleado) usuario, locacion, remuneracion, cargaHoraria, tipoPuesto, rangoEtario, experiencia, estudiosCursados);
			JOptionPane.showMessageDialog(null,"¡Registro de empleado exitoso!");
			this.vista.cerrar();
			this.setVista(new VentanaLogin());

		} else if (comando.equalsIgnoreCase("AgregarTicketEmpleador")) {
			VentanaFormularioEmpleador ventFormEmpleador = (VentanaFormularioEmpleador) vista;
			String cargaHoraria;
			String estudiosCursados;
			String experiencia;
			String locacion;
			String rangoEtario;
			String remuneracion;
			String tipoPuesto;   
			 //ver luego si hay forma mas prolija de hacer esto
			
			if (ventFormEmpleador.getRdbtnCompleta().isSelected())
				cargaHoraria = "CargaCompleta";
			else if (ventFormEmpleador.getRdbtnExtendida().isSelected())
				cargaHoraria = "CargaExtendida";
			else
				cargaHoraria = "CargaMedia";
			
			if (ventFormEmpleador.getRdbtnPrimario().isSelected())
				estudiosCursados = "Primario";
			else if (ventFormEmpleador.getRdbtnSecundario().isSelected())
				estudiosCursados = "Secundario";
			else 
				estudiosCursados = "Terciario";
			
			if (ventFormEmpleador.getRdbtnNada().isSelected())
				experiencia = "Nada";
			else if (ventFormEmpleador.getRdbtnExpeMedia().isSelected())
				experiencia = "Media";
			else 
				experiencia = "Mucha";
			
			if (ventFormEmpleador.getRdbtnPresencialEmpleador().isSelected())
				locacion = "Presencial";
			else if (ventFormEmpleador.getRdbtnHomeOfficeEmpleador().isSelected())
				locacion = "HomeOffice";
			else
				locacion = "Indistinto";
			
			if (ventFormEmpleador.getRdbtnMenosDe40().isSelected())
				rangoEtario = "MenosDe40";
			else if (ventFormEmpleador.getRdbtnEntre40y50().isSelected())
				rangoEtario = "Entre40y50";
			else
				rangoEtario = "MasDe50";
			
			if (ventFormEmpleador.getRdbtnRemuneracion1Empleador().isSelected())
				remuneracion = "V1";
			else if (ventFormEmpleador.getRdbtnRemuneracion2Empleador().isSelected())
				remuneracion = "V2";
			else
				remuneracion = "V3";
			
			if (ventFormEmpleador.getRdbtnManagement().isSelected())
				tipoPuesto = "Management";
			else if (ventFormEmpleador.getRdbtnJunior().isSelected())
				tipoPuesto = "Junior";
			else 
				tipoPuesto = "Senior";
			
			ArrayList<Integer> pesos = new ArrayList<Integer>();
			pesos.add((int)ventFormEmpleador.getSpinnerLocacion().getValue());
			pesos.add((int)ventFormEmpleador.getSpinnerRemuneracion().getValue());
			pesos.add((int)ventFormEmpleador.getSpinnerCargaHoraria().getValue());
			pesos.add((int)ventFormEmpleador.getSpinnerTipoPuesto().getValue());
			pesos.add((int)ventFormEmpleador.getSpinnerRangoEtario().getValue());
			pesos.add((int)ventFormEmpleador.getSpinnerExperiencia().getValue());
			pesos.add((int)ventFormEmpleador.getSpinnerEstudios().getValue());
			
			sistema.agregaTicketBuscaEmpleado((Empleador ) usuario, Integer.parseInt(ventFormEmpleador.getSpinnerEmpSolic().getValue().toString()), locacion, remuneracion, cargaHoraria, tipoPuesto, rangoEtario, experiencia, estudiosCursados, pesos);
			this.vista.cerrar();
			JOptionPane.showMessageDialog(null,"¡Ticket agregado correctamente! \n Presione agregar para seguir agregando tickets o presione finalizar para culminar el registro");
			this.setVista(new VentanaFormularioEmpleador());

		} else if (comando.equalsIgnoreCase("FinalizarRegistroEmpleador")) {
			sistema.agregarEmpleador((Empleador) usuario);
			this.vista.cerrar();
			JOptionPane.showMessageDialog(null,"¡Registro de empleador exitoso!");
			this.setVista(new VentanaLogin());
		} else if (comando.equalsIgnoreCase("IniciarRondaEncuentros")) {
			sistema.RondaDeEncuentrosLaborales();
			this.vista.cerrar();
			JOptionPane.showMessageDialog(null,"Realizando ronda de encuentros laborales...");     
			this.setVista(new VentanaLogin());       // abrir ventana de admin y poner boton de deslogueo. setear atributo usuario = null en controlador
		} else if (comando.equalsIgnoreCase("AgregarAdmin")) {
			this.setVista(new VentanaRegistro());
		} else if (comando.equalsIgnoreCase("MostrarEmpleados")) {  //deshabilitar boton luego de esto, sino va a seguir agregando si se vuelve a apretar y no deberia
			VentanaAgencia ventAgencia = (VentanaAgencia) this.vista;
			ventAgencia.getListEmpleados();
			ArrayList<UsuarioInteractivo> empleados = sistema.getEmpleados();
			Iterator<UsuarioInteractivo> iterador = empleados.iterator();
			while (iterador.hasNext()) {
				ventAgencia.getModeloListaEmpleados().addElement(iterador.next());
			}
			ventAgencia.repaint();
		} else if (comando.equalsIgnoreCase("MostrarEmpleadores")) {  //deshabilitar boton luego de esto sino va a seguir agregando si se vuelve a apretar y no deberia
			VentanaAgencia ventAgencia = (VentanaAgencia) this.vista;
			ventAgencia.getListEmpleadores();
			ArrayList<UsuarioInteractivo> empleadores = sistema.getEmpleadores();
			Iterator<UsuarioInteractivo> iterador = empleadores.iterator();
			while (iterador.hasNext()) {
				ventAgencia.getModeloListaEmpleadores().addElement(iterador.next()); //agrego empleadores, ver como mostrar el ToString
			}
			ventAgencia.repaint();
		} else if (comando.equalsIgnoreCase("IniciarEleccionesEmpleado")) {
			Empleado empleado = (Empleado) usuario;
			if (empleado.getTicket().getLista()==null) {
				JOptionPane.showMessageDialog(null,"La ronda de encuentros aún no se ha realizado");	
			} else {
				this.vista.cerrar();
				this.setVista(new VentanaElecciones());
				VentanaElecciones ventElecciones = (VentanaElecciones) vista;
				ListaDelEmpleado lista = empleado.getTicket().getLista();
				for (int i=0;i<lista.getTickets().size();i++) { //anda mal, mete un solo ticket cuando deberia haber varios..... posibles errores: generacion lista empleado, generacion formulario empleador, forma de agregar
					ventElecciones.getModeloLista().addElement(lista.getTickets().get(i));  //muestro tickets.... ver como mejorar esto. deberia mostrar ticket y empleador. yo haria otra ventana con 3 listas de columna (puntaje, empleador/empleado y ticket). 
				}
				ventElecciones.repaint();
			/*	ArrayList<UsuarioInteractivo> empleadores = sistema.getEmpleadores();
				Iterator<UsuarioInteractivo> iterador = empleadores.iterator();
				ArrayList <TicketBuscaEmpleado> tickets;
				while (iterador.hasNext()) {     //recorro empleadores
					Empleador empleador =(Empleador) iterador.next();
					for (int i=0;i< empleador.getTickets().size();i++) {    //recorro tickets de empleadores
						ventElecciones.getModeloLista().addElement(empleador.getTickets().get(i));
					}
					ventElecciones.repaint();
				} */
				
			
			}	
		} else if(comando.equalsIgnoreCase("SeguirTicketEmpleador")){     //despues muestro la lista de empleadores para dicho ticket
			VentanaEleccionesTicketEmpleador ventElecciones = (VentanaEleccionesTicketEmpleador) vista;
			this.ticketEmpleador=(TicketBuscaEmpleado) ventElecciones.getList().getSelectedValue();
			this.vista.cerrar();
			this.setVista(new VentanaElecciones());
			Empleador empleador = (Empleador) usuario;  //creo que no es necesario
			VentanaElecciones ventElecciones1 = (VentanaElecciones) vista;
			ListaDelEmpleador lista= this.ticketEmpleador.getLista();
			for (int i=0;i<lista.getEmpleados().size();i++) {
				ventElecciones1.getModeloLista().addElement(lista.getEmpleados().get(i)); //muestro empleados
				//ventElecciones1.getModeloLista().addElement(lista.getTickets().get(i));   
			}
				
			
		}else if(comando.equalsIgnoreCase("IniciarRondaEleccionesEmpleador")){   //primero muestro para que el empleador elija un ticket
			Empleador empleador = (Empleador) usuario;
			if (empleador.getTickets().isEmpty()) {
				JOptionPane.showMessageDialog(null,"No tenes tickets");	
			} else {
				this.vista.cerrar();
				this.setVista(new VentanaEleccionesTicketEmpleador());
				VentanaEleccionesTicketEmpleador ventElecciones = (VentanaEleccionesTicketEmpleador) vista;
				for (int i=0;i<empleador.getTickets().size();i++) {
					ventElecciones.getModeloLista().addElement(empleador.getTickets().get(i));
				}
				ventElecciones.repaint();
				JOptionPane.showMessageDialog(null,"Selecciona un ticket");	
			}
	
		}else if (comando.equalsIgnoreCase("AgregarALista")) {
			VentanaElecciones ventElecciones = (VentanaElecciones) vista;
	  
			//esta validacion es porque usamos una misma ventana tanto para empleadores como para empleadores, podria no estar si hacemos una ventana para cada clase, pero no sé que conviene
			if (usuario.getCodUsuario()==1) {
				Empleado empleado = (Empleado) usuario;
				int indice= ventElecciones.getList().getSelectedIndex(); //devuelve el indice del arraylist de ticket, asi puedo acceder tanto al empleador como al ticket (ver ListaDelEmpleado). ¿restar 1?
				sistema.RondaDeEleccionDeUnEmpleado(empleado, empleado.getTicket().getLista().getTickets().get(indice), empleado.getTicket().getLista().getEmpleadores().get(indice));
				JOptionPane.showMessageDialog(null,"Empleador agregado correctamente");	
				this.vista.cerrar();
				this.setVista(new VentanaEmpleado());

			} else if (usuario.getCodUsuario()==2) {	
				sistema.RondaDeEleccionDeUnEmpleador((Empleador) usuario, ticketEmpleador, (Empleado) ventElecciones.getList().getSelectedValue());
				JOptionPane.showMessageDialog(null,"Empleado agregado correctamente");	
				this.vista.cerrar();
				this.setVista(new VentanaEmpleador());
			}
			
		} 
	}

}
