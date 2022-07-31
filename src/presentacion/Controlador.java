package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import modelo.ActivoState;
import modelo.AdminAgencia;
import modelo.CargaCompleta;
import modelo.CargaExtendida;
import modelo.CargaMedia;
import modelo.ContraseniaIncorrectaException;
import modelo.Empleado;
import modelo.Empleador;
import modelo.Entre40y50;
import modelo.FormularioDeBusqueda;
import modelo.HomeOffice;
import modelo.Indistinto;
import modelo.Junior;
import modelo.ListaDelEmpleado;
import modelo.ListaDelEmpleador;
import modelo.Management;
import modelo.MasDe50;
import modelo.Media;
import modelo.MenosDe40;
import modelo.Mucha;
import modelo.Nada;
import modelo.NombreDeUsuarioDuplicadoException;
import modelo.NombreIncorrectoException;
import modelo.Presencial;
import modelo.Primario;
import modelo.Secundario;
import modelo.Senior;
import modelo.Terciario;
import modelo.Ticket;
import modelo.TicketBuscaEmpleado;
import modelo.Usuario;
import modelo.UsuarioInteractivo;
import modelo.V1;
import modelo.V2;
import modelo.V3;
import negocio.Sistema;
import vistas.IVista;
import vistas.VentanaAgencia;
import vistas.VentanaElecciones;
import vistas.VentanaEleccionesTicketEmpleador;
import vistas.VentanaEmpleado;
import vistas.VentanaEmpleador;
import vistas.VentanaFormularioEmpleado;
import vistas.VentanaFormularioEmpleador;
import vistas.VentanaGestionTicket;
import vistas.VentanaLogin;
import vistas.VentanaRegistro;
import vistas.VentanaRegistroAdmin;
import vistas.VentanaRegistroEmpleado;
import vistas.VentanaRegistroEmpleador;

public class Controlador implements ActionListener
{ // es correcto que el controlador cree (haga el new de) los objetos????

	private IVista vista;
	private Usuario usuario;
	private Sistema sistema = Sistema.getInstancia();
	private String nombreUsuario;
	private String contrasenia;
	private TicketBuscaEmpleado ticketEmpleador;

	public Controlador()
	{
		this.vista = new VentanaLogin();
		this.vista.setActionListener(this);
		this.vista.mostrar();
	}

	public IVista getVista()
	{
		return vista;
	}

	public void setVista(IVista vista)
	{
		this.vista = vista;
		this.vista.setActionListener(this);
		this.vista.mostrar();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String comando = e.getActionCommand();
		System.out.println("Comando: " + comando);

		if (comando.equalsIgnoreCase("REGISTRARSE"))
		{
			this.vista.cerrar();
			this.setVista(new VentanaRegistro());
		} else if (comando.equalsIgnoreCase("IniciarSes"))
		{
			VentanaLogin ventLog = (VentanaLogin) vista;
			this.vista.cerrar();

			try
			{
				usuario = sistema.login(ventLog.getInputNombreUsuario().getText(),
						ventLog.getInputContrase�a().getText());
				System.out.println("Codigo de usuario:" + usuario.getCodUsuario());

				if (usuario.getCodUsuario() == 1)
				{
					this.setVista(new VentanaEmpleado());
				} else if (usuario.getCodUsuario() == 2)
					this.setVista(new VentanaEmpleador());
				else if (usuario.getCodUsuario() == 3)
					this.setVista(new VentanaAgencia());
			} catch (NombreIncorrectoException ex)
			{
				JOptionPane.showMessageDialog(null, "Nombre de usuario incorrecto");
				this.vista.cerrar();
				this.setVista(new VentanaLogin());
			} catch (ContraseniaIncorrectaException ex1)
			{
				JOptionPane.showMessageDialog(null, "Contrase�a incorrecta");
				this.vista.cerrar();
				this.setVista(new VentanaLogin());
			}
		} else if (comando.equalsIgnoreCase("RegistrarseEmpleador"))
		{
			VentanaRegistroEmpleador ventRegEmpleador = (VentanaRegistroEmpleador) vista;
			String persona;
			String rubro;
			if (ventRegEmpleador.getRadioButtonFisica().isSelected())
				persona = "Fisica";
			else
				persona = "Juridica";

			if (ventRegEmpleador.getRadioButtonSalud().isSelected())
				rubro = "Salud";
			else if (ventRegEmpleador.getRadioButtonComercioLocal().isSelected())
				rubro = "ComercioLocal";
			else
				rubro = "ComercioInternacional";

			// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
			
				usuario = sistema.registroEmpleador(ventRegEmpleador.getInputNombreEmpleador().getText(),
						this.nombreUsuario, this.contrasenia, persona, rubro);
				this.vista.cerrar();
				this.setVista(new VentanaFormularioEmpleador());			

		} else if (comando.equalsIgnoreCase("Siguiente"))
		{
			VentanaRegistro ventReg = (VentanaRegistro) vista;
			try {
				this.nombreUsuario = sistema.nombreDeUsuarioDuplicado(ventReg.getInput_NombreUsuario().getText())==true?null:ventReg.getInput_NombreUsuario().getText();
				this.vista.cerrar();
				if (ventReg.getRdbtn_opcionEmpleado().isSelected())
				{
					this.setVista(new VentanaRegistroEmpleado());
				} else if (ventReg.getRdbtn_opcionEmpleador().isSelected())
				{
					this.setVista(new VentanaRegistroEmpleador());
				} else if (ventReg.getRdbtn_opcionAdmin().isSelected())
				{
					this.setVista(new VentanaRegistroAdmin());
				}
	
			} catch (NombreDeUsuarioDuplicadoException e2) {
				JOptionPane.showMessageDialog(null, "Nombre de usuario existente");
			}
			this.contrasenia = ventReg.getPasswordField().getText();
			
		
			
		} else if (comando.equalsIgnoreCase("RegistrarseEmpleado"))
		{
			VentanaRegistroEmpleado ventRegEmpleado = (VentanaRegistroEmpleado) vista;

			// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
			try
			{
				usuario = sistema.registroEmpleado(ventRegEmpleado.getInput_Nombre().getText(), this.nombreUsuario,this.contrasenia, ventRegEmpleado.getInput_Telefono().getText(),
						Integer.parseInt(ventRegEmpleado.getInput_Edad().getText()));
				this.vista.cerrar();
				this.setVista(new VentanaFormularioEmpleado());
			} catch (NumberFormatException e1)
			{ 
				JOptionPane.showMessageDialog(null, "Edad inv�lida");
			} 
			// usuario = new
			// Empleado(ventRegEmpleado.getInput_Nombre().getText(),this.nombreUsuario,this.contrasenia,ventRegEmpleado.getInput_Telefono().getText(),Integer.parseInt(ventRegEmpleado.getInput_Edad().getText()));

		} else if (comando.equalsIgnoreCase("RegistrarseAdmin"))
		{
			VentanaRegistroAdmin ventRegAdmin = (VentanaRegistroAdmin) vista;
			try
			{
				usuario = sistema.registroAdmin(ventRegAdmin.getInput_Nombre().getText(), this.nombreUsuario,this.contrasenia);
				sistema.agregarAdmin((AdminAgencia) usuario);
				this.vista.cerrar();
				JOptionPane.showMessageDialog(null, "�Registro de ADMIN exitoso!");
				this.setVista(new VentanaLogin());
			} catch (NombreDeUsuarioDuplicadoException e1)
			{
				JOptionPane.showMessageDialog(null, "Nombre de usuario existente");
				e1.printStackTrace();
			}
			
			

		} else if (comando.equalsIgnoreCase("ContinuarRegEmpleado"))
		{
			VentanaFormularioEmpleado ventFormEmpleado = (VentanaFormularioEmpleado) vista;
			ticketEmpleado(ventFormEmpleado);
			sistema.agregarEmpleado((Empleado)usuario);
			JOptionPane.showMessageDialog(null, "�Registro de empleado exitoso!");
			this.vista.cerrar();
			this.setVista(new VentanaLogin());

		} else if (comando.equalsIgnoreCase("AgregarTicketEmpleador"))
		{
			VentanaFormularioEmpleador ventFormEmpleador = (VentanaFormularioEmpleador) vista;
			ticketEmpleador(ventFormEmpleador);
			
			this.vista.cerrar();
			JOptionPane.showMessageDialog(null,
					"�Ticket agregado correctamente! \n Presione agregar para seguir agregando tickets o presione finalizar para culminar el registro");
			this.setVista(new VentanaFormularioEmpleador());

		} else if (comando.equalsIgnoreCase("FinalizarRegistroEmpleador"))
		{
			sistema.agregarEmpleador((Empleador) usuario);
			this.vista.cerrar();
			JOptionPane.showMessageDialog(null, "�Registro de empleador exitoso!");
			this.setVista(new VentanaLogin());
		} else if (comando.equalsIgnoreCase("IniciarRondaEncuentros"))
		{
			sistema.RondaDeEncuentrosLaborales();
			this.vista.cerrar();
			JOptionPane.showMessageDialog(null, "Realizando ronda de encuentros laborales...");
			this.setVista(new VentanaAgencia()); // abrir ventana de admin y poner boton de deslogueo. setear atributo
													// usuario = null en controlador
		} else if (comando.equalsIgnoreCase("AgregarAdmin"))
		{
			this.setVista(new VentanaRegistro());
		} else if (comando.equalsIgnoreCase("MostrarEmpleados"))
		{ // deshabilitar boton luego de esto, sino va a seguir agregando si se vuelve a
			// apretar y no deberia
			VentanaAgencia ventAgencia = (VentanaAgencia) this.vista;
			ventAgencia.getListEmpleados();
			ArrayList<UsuarioInteractivo> empleados = sistema.getEmpleados();
			Iterator<UsuarioInteractivo> iterador = empleados.iterator();

			while (iterador.hasNext())
			{
				ventAgencia.getModeloListaEmpleados().addElement(iterador.next());
			}
			ventAgencia.repaint();
		} else if (comando.equalsIgnoreCase("MostrarEmpleadores"))
		{ // deshabilitar boton luego de esto sino va a seguir agregando si se vuelve a
			// apretar y no deberia
			VentanaAgencia ventAgencia = (VentanaAgencia) this.vista;
			ventAgencia.getListEmpleadores();
			ArrayList<UsuarioInteractivo> empleadores = sistema.getEmpleadores();
			Iterator<UsuarioInteractivo> iterador = empleadores.iterator();

			while (iterador.hasNext())
			{
				ventAgencia.getModeloListaEmpleadores().addElement(iterador.next()); // agrego empleadores, ver como
																						// mostrar el ToString
			}
			ventAgencia.repaint();
		} else if (comando.equalsIgnoreCase("IniciarEleccionesEmpleado"))
		{
			Empleado empleado = (Empleado) usuario;

			if (empleado.getTicket().getLista() == null)
			{
				JOptionPane.showMessageDialog(null, "La ronda de encuentros a�n no se ha realizado");
			} else
			{
				this.vista.cerrar();
				this.setVista(new VentanaElecciones());
				VentanaElecciones ventElecciones = (VentanaElecciones) vista;
				ListaDelEmpleado lista = empleado.getTicket().getLista();

				for (int i = 0; i < lista.getTickets().size(); i++)
				{ // anda mal, mete un solo ticket cuando deberia haber varios..... posibles
					// errores: generacion lista empleado, generacion formulario empleador, forma de
					// agregar
					ventElecciones.getModeloLista().addElement(lista.getTickets().get(i)); // muestro tickets.... ver
																							// como mejorar esto.
																							// deberia mostrar ticket y
																							// empleador. yo haria otra
																							// ventana con 3 listas de
																							// columna (puntaje,
																							// empleador/empleado y
																							// ticket).
				}
				ventElecciones.repaint();
			}
		} else if (comando.equalsIgnoreCase("MostrarEleccionesEmpleado"))
		{
			// VentanaEmpleado ventEmpleado = (VentanaEmpleado) this.vista;
			// ventEmpleado.getListEleccionesEmpleado();

			Empleado empleado = (Empleado) usuario;
			VentanaEmpleado ventEmpleado = (VentanaEmpleado) this.vista;
			Iterator<UsuarioInteractivo> iterador = empleado.getElecciones().getEmps().iterator();

			while (iterador.hasNext())
			{
				ventEmpleado.getModeloLista().addElement(iterador.next()); // solo estoy mostrando el empleador, deberia
																			// quizas mostrar tambien el ticket
			}

			// aaaaaaaaaaaaaa aca no se q va
			ventEmpleado.repaint();
		} else if (comando.equalsIgnoreCase("SeguirTicketEmpleador"))
		{ // despues muestro la lista de empleadores para dicho ticket
			VentanaEleccionesTicketEmpleador ventElecciones = (VentanaEleccionesTicketEmpleador) vista;
			this.ticketEmpleador = (TicketBuscaEmpleado) ventElecciones.getList().getSelectedValue();
			this.vista.cerrar();
			this.setVista(new VentanaElecciones());
			Empleador empleador = (Empleador) usuario; // creo que no es necesario
			VentanaElecciones ventElecciones1 = (VentanaElecciones) vista;
			ListaDelEmpleador lista = this.ticketEmpleador.getLista();

			for (int i = 0; i < lista.getEmpleados().size(); i++)
			{
				ventElecciones1.getModeloLista().addElement(lista.getEmpleados().get(i)); // muestro empleados
				// ventElecciones1.getModeloLista().addElement(lista.getTickets().get(i));
			}

		} else if (comando.equalsIgnoreCase("IniciarEleccionesEmpleador"))
		{ // primero muestro para que el empleador elija un ticket
			Empleador empleador = (Empleador) usuario;

			if (empleador.getTickets().isEmpty())
			{
				JOptionPane.showMessageDialog(null, "No tenes tickets");
			} else
			{
				this.vista.cerrar();
				this.setVista(new VentanaEleccionesTicketEmpleador());
				VentanaEleccionesTicketEmpleador ventElecciones = (VentanaEleccionesTicketEmpleador) vista;

				for (int i = 0; i < empleador.getTickets().size(); i++)
				{
					ventElecciones.getModeloLista().addElement(empleador.getTickets().get(i));
				}
				ventElecciones.repaint();
				JOptionPane.showMessageDialog(null, "Selecciona un ticket");
			}

		} else if (comando.equalsIgnoreCase("MostrarEleccionesEmpleador"))
		{
			VentanaEmpleador ventEmpleador = (VentanaEmpleador) vista;
			Empleador empleador = (Empleador) usuario;
			Iterator<UsuarioInteractivo> iterador = empleador.getElecciones().getEmps().iterator();

			while (iterador.hasNext())
			{
				ventEmpleador.getModeloLista().addElement(iterador.next()); // solo estoy mostrando el empleado, deberia
																			// quizas mostrar tambien el ticket con el
																			// que lo contrat�?
			}

		} else if (comando.equalsIgnoreCase("AgregarALista"))
		{
			VentanaElecciones ventElecciones = (VentanaElecciones) vista;

			// esta validacion es porque usamos una misma ventana tanto para empleadores
			// como para empleadores, podria no estar si hacemos una ventana para cada
			// clase, pero no s� que conviene
			if (usuario.getCodUsuario() == 1)
			{
				Empleado empleado = (Empleado) usuario;
				int indice = ventElecciones.getList().getSelectedIndex(); // devuelve el indice del arraylist de ticket,
																			// asi puedo acceder tanto al empleador como
																			// al ticket (ver ListaDelEmpleado). �restar
																			// 1?
				sistema.RondaDeEleccionDeUnEmpleado(empleado, empleado.getTicket().getLista().getTickets().get(indice),
						empleado.getTicket().getLista().getEmpleadores().get(indice));
				JOptionPane.showMessageDialog(null, "Empleador agregado correctamente");
				this.vista.cerrar();
				this.setVista(new VentanaEmpleado());

			} else if (usuario.getCodUsuario() == 2)
			{
				sistema.RondaDeEleccionDeUnEmpleador((Empleador) usuario, ticketEmpleador,
						(Empleado) ventElecciones.getList().getSelectedValue());
				JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
				this.vista.cerrar();
				this.setVista(new VentanaEmpleador());
			}

		} else if (comando.equalsIgnoreCase("IniciarContrataciones"))
		{
			
			sistema.RondaDeContrataciones();
			this.vista.cerrar();
			JOptionPane.showMessageDialog(null, "Realizando ronda de contrataciones...");
			this.setVista(new VentanaAgencia());
		} else if (comando.equalsIgnoreCase("CerrarSesion"))
		{
			this.vista.cerrar();
			this.usuario = null;
			this.setVista(new VentanaLogin());
		}else if (comando.equalsIgnoreCase("Suspender")) {
			this.vista.cerrar();
			suspenderTicket(usuario);
			this.setVista(this.usuario.getCodUsuario()==1?new VentanaEmpleado():new VentanaEmpleador());
		}else if (comando.equalsIgnoreCase("Cancelar") || comando.equalsIgnoreCase("Baja")) {
			this.vista.cerrar();
			cancelarTicket(usuario);
			this.setVista(this.usuario.getCodUsuario()==1?new VentanaEmpleado():new VentanaEmpleador());
		}else if(comando.equalsIgnoreCase("Consultar")) {
			this.vista.cerrar();
			consultarTicket(usuario);
			this.setVista(this.usuario.getCodUsuario()==1?new VentanaEmpleado():new VentanaEmpleador());
		}else if(comando.equalsIgnoreCase("Alta")){
			this.vista.cerrar();
			altaTicket(usuario);
		} else if (comando.equalsIgnoreCase("Modificar")) {
			this.vista.cerrar();
			modificarTicket(usuario);
			this.setVista(this.usuario.getCodUsuario()==1?new VentanaEmpleado():new VentanaEmpleador());
		} else if (comando.equalsIgnoreCase("GestionTicket")) {
			this.vista.cerrar();
			this.setVista(new VentanaGestionTicket());			
		}else if(comando.equalsIgnoreCase("Activar")) {
			this.vista.cerrar();
			activarTicket(usuario);
			this.setVista(this.usuario.getCodUsuario()==1?new VentanaEmpleado():new VentanaEmpleador());
		}else if(comando.equalsIgnoreCase("Finalizar")){
			JOptionPane.showMessageDialog(null, "Ticket dado de alta correctamente");
			this.vista.cerrar();
			if (usuario.getCodUsuario() == 1)
				this.setVista(new VentanaEmpleado());
			else if (usuario.getCodUsuario() == 2)
				this.setVista(new VentanaEmpleador());
		}
}
	
	private void ticketEmpleador(VentanaFormularioEmpleador ventFormEmpleador) {
		String cargaHoraria;
		String estudiosCursados;
		String experiencia;
		String locacion;
		String rangoEtario;
		String remuneracion;
		String tipoPuesto;

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
		pesos.add((int) ventFormEmpleador.getSpinnerLocacion().getValue());
		pesos.add((int) ventFormEmpleador.getSpinnerRemuneracion().getValue());
		pesos.add((int) ventFormEmpleador.getSpinnerCargaHoraria().getValue());
		pesos.add((int) ventFormEmpleador.getSpinnerTipoPuesto().getValue());
		pesos.add((int) ventFormEmpleador.getSpinnerRangoEtario().getValue());
		pesos.add((int) ventFormEmpleador.getSpinnerExperiencia().getValue());
		pesos.add((int) ventFormEmpleador.getSpinnerEstudios().getValue());

		sistema.agregaTicketBuscaEmpleado((Empleador) usuario,
				Integer.parseInt(ventFormEmpleador.getSpinnerEmpSolic().getValue().toString()), locacion,
				remuneracion, cargaHoraria, tipoPuesto, rangoEtario, experiencia, estudiosCursados, pesos);
	}
	
	private void ticketEmpleado(VentanaFormularioEmpleado ventFormEmpleado) {
		String cargaHoraria;
		String estudiosCursados;
		String experiencia;
		String locacion;
		String rangoEtario;
		String remuneracion;
		String tipoPuesto;

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

		sistema.asignaTicketBuscaEmpleo((Empleado) usuario, locacion, remuneracion, cargaHoraria, tipoPuesto,
				rangoEtario, experiencia, estudiosCursados);
	}
	
	private void modificarTicket(Usuario u) {
		this.vista.cerrar();
		FormularioDeBusqueda formulario=null;
		if (usuario.getCodUsuario()==1) {
			Empleado empleado = (Empleado) usuario;
			formulario = empleado.getTicket().getFormulario();
		} else if (usuario.getCodUsuario()==2) {
			Empleador empleador = (Empleador) usuario;
			int num=-1;
			while (num<0 || num >empleador.getTickets().size())
				num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ticket"));	
			formulario = empleador.getTickets().get(num).getFormulario();
		}
		
		String[] opcionesModificar = {"Carga Horaria", "Estudios Cursados", "Experiencia","Locaci�n","Rango Etario","Remuneraci�n","Tipo de Puesto"};
		int i = JOptionPane.showOptionDialog(null, "�Qu� elemento deseas modificar?", "Clickea una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesModificar, opcionesModificar[0])+1;
	
		int eleccion;
		
		switch (i)
		{
		case 1:
			String[] opciones2 = {"Media", "Completa", "Extendida"};
			eleccion  = JOptionPane.showOptionDialog(null, "Elija una carga horaria", "Clickea una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones2, opciones2[0])+1;
			
			switch (eleccion)
			{
			case 1:
				formulario.setCargahoraria(new CargaMedia());
				break;
			case 2:
				formulario.setCargahoraria(new CargaCompleta());
				break;
			case 3:
				formulario.setCargahoraria(new CargaExtendida());
				break;
			default:
				System.out.println("Valor de carga horaria ingresado incorrento");
			}
			break;
		case 2:
			String[] opciones6 = {"Primario", "Secundario", "Terciario"};
			eleccion  = JOptionPane.showOptionDialog(null, "Elija estudios", "Clickea una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones6, opciones6[0])+1;
	
			switch (eleccion)
			{
			case 1:
				formulario.setEstudiosCursados(new Primario());
				break;
			case 2:
				formulario.setEstudiosCursados(new Secundario());
				break;
			case 3:
				formulario.setEstudiosCursados(new Terciario());
				break;
			default:
				System.out.println("Valor de estudios ingresado incorrecto");
			}
			break;
		case 3:
			
			String[] opciones5 = {"Nada", "Media", "Mucha"};
			eleccion  = JOptionPane.showOptionDialog(null, "Elija una experiencia", "Clickea una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones5, opciones5[0])+1;
			
			switch (eleccion)
			{
			case 1:
				formulario.setExperiencia(new Nada());
				break;
			case 2:
				formulario.setExperiencia(new Media());
				break;
			case 3:
				formulario.setExperiencia(new Mucha());
				break;
			default:
				System.out.println("Valor de experiencia ingresado incorrecto");
			}
			break;
		case 4:
			
			String[] opciones = {"Home Office", "Presencial", "Indistinto"};
			eleccion = JOptionPane.showOptionDialog(null, "Elije una locacion de preferencia", "Clickea una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0])+1;
			
			switch (eleccion)
			{
			case 1:
				formulario.setLocacion(new HomeOffice());
				break;
			case 2:
				formulario.setLocacion(new Presencial());
				break;
			case 3:
				formulario.setLocacion(new Indistinto());
				break;
			default:
				System.out.println("Valor de Locacion ingresado incorrecto");
			}
			break;
		case 5:
			String[] opciones4 = {"Menos de 40", "Entre 40 y 50", "Mas de 50"};
			eleccion= JOptionPane.showOptionDialog(null, "Elije un rango etario", "Clickea una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones4, opciones4[0])+1;
			
			switch (eleccion)
			{
			case 1:
				formulario.setRangoEtario(new MenosDe40());
				break;
			case 2:
				formulario.setRangoEtario(new Entre40y50());
				break;
			case 3:
				formulario.setRangoEtario(new MasDe50());
				break;
			default:
				System.out.println("Valor de Rango Etario ingresado incorrecto");
			}
			break;
		case 6:
			String[] opciones1 = {"V1", "V2", "V3"};
			eleccion  = JOptionPane.showOptionDialog(null, "Elija una remuneraci�n", "Clickea una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones1, opciones1[0])+1;
			
			switch (eleccion)
			{
			case 1:
				formulario.setRemuneracion(new V1());
				break;
			case 2:
				formulario.setRemuneracion(new V2());
				break;
			case 3:
				formulario.setRemuneracion(new V3());
				break;
			default:
				System.out.println("Valor de Remuneracion ingresado incorrecto");
			}
			break;
		case 7:
			String[] opciones3 = {"Senior", "Junior", "Management"};
			eleccion  = JOptionPane.showOptionDialog(null, "Elija un tipo de puesto", "Clickea una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones3, opciones3[0])+1;
	
			switch (eleccion)
			{
			case 1:
				formulario.setTipoPuesto(new Junior());
				break;
			case 2:
				formulario.setTipoPuesto(new Senior());
				break;
			case 3:
				formulario.setTipoPuesto(new Management());
				break;
			default:
				System.out.println("Valor de Tipo de Puesto ingresado incorrecto");
			}
			break;
		}
	}
	
	private void altaTicket(Usuario u) {
		
		if (u.getCodUsuario() == 1) {
			
			VentanaFormularioEmpleado vista2 = new VentanaFormularioEmpleado();
			vista2.nuevoComando();
			this.setVista(vista2);
			
			ticketEmpleado(vista2); 	//con esto se da de alta un ticket de empleado
			
		}else if (u.getCodUsuario() == 2) {
			VentanaFormularioEmpleador vista2 = new VentanaFormularioEmpleador();
			vista2.ocultarBotonAgregar();
			this.setVista(vista2);	
			
			ticketEmpleador(vista2);	//con esto agrego el ticket al arraylist de tickets del empleador
			
		}
	}
	
	private void activarTicket(Usuario u) {
		Ticket ticket;
		if (usuario.getCodUsuario()==1) {	//empleado
			Empleado empleado = (Empleado) u;
			ticket = empleado.getTicket();
			ticket.setEstado(new ActivoState(ticket));
			JOptionPane.showMessageDialog(null, "Ticket activado correctamente");
		}else if (usuario.getCodUsuario()==2) {	//empleador
			Empleador empleador = (Empleador) u;
			int option = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ticket a activar"));
			while (option < 0 && option  > empleador.getTickets().size()) 
				option = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ticket a activar"));
			ticket = empleador.getTickets().get(option);
			ticket.setEstado(new ActivoState(ticket));
			JOptionPane.showMessageDialog(null, "Ticket activado correctamente");
		}
	}
	
	private void consultarTicket(Usuario u) {
		if (usuario.getCodUsuario()==1) {	//empleado
			Empleado empleado = (Empleado) u;
			JOptionPane.showMessageDialog(null, empleado.getTicket().toString());
		}else if (usuario.getCodUsuario()==2) {	//empleador
			Empleador empleador = (Empleador) u;
			int option = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ticket a consultar"));
			while (option < 0 && option  > empleador.getTickets().size()) 
				option = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ticket a consultar"));
			JOptionPane.showMessageDialog(null, empleador.getTickets().get(option).toString());
		}
	}
	
	private void cancelarTicket(Usuario u) {
		if (usuario.getCodUsuario()==1) {	//empleado
			Empleado empleado = (Empleado) u;
			empleado.getTicket().cancela();
			empleado.setPuntaje(empleado.getPuntaje()-1);
			JOptionPane.showMessageDialog(null, "Ticket cancelado");
		}else if (usuario.getCodUsuario()==2) {	//empleador
			Empleador empleador = (Empleador) u;
			int option = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ticket"));
			while (option < 0 && option  > empleador.getTickets().size()) 
				option = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ticket"));
			empleador.getTickets().get(option).cancela();
			JOptionPane.showMessageDialog(null, "Ticket cancelado/dado de baja");
		}
	}

	private void suspenderTicket(Usuario u) {
		if (usuario.getCodUsuario()==1) {	//empleado
			Empleado empleado = (Empleado) u;
			empleado.getTicket().suspende();
			JOptionPane.showMessageDialog(null, "Ticket suspendido");
		}else if (usuario.getCodUsuario()==2) {	//empleador
			Empleador empleador = (Empleador) u;
			int option = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ticket a suspender"));
			while (option < 0 && option  > empleador.getTickets().size()) 
				option = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ticket a suspender"));
			empleador.getTickets().get(option).suspende();
			JOptionPane.showMessageDialog(null, "Ticket suspendido");
		}
	}
}