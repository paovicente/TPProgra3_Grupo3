package negocio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.AdminAgencia;
import modelo.CargaCompleta;
import modelo.CargaExtendida;
import modelo.CargaMedia;
import modelo.ContraseniaIncorrectaException;
import modelo.DecoratorComercioInternacional;
import modelo.DecoratorComercioLocal;
import modelo.DecoratorSalud;
import modelo.Empleado;
import modelo.Empleador;
import modelo.Entre40y50;
import modelo.FormularioDeBusqueda;
import modelo.HomeOffice;
import modelo.IPersona;
import modelo.Indistinto;
import modelo.Junior;
import modelo.Management;
import modelo.MasDe50;
import modelo.Media;
import modelo.MenosDe40;
import modelo.Mucha;
import modelo.Nada;
import modelo.NombreDeUsuarioDuplicadoException;
import modelo.NombreIncorrectoException;
import modelo.PersonaFisica;
import modelo.PersonaJuridica;
import modelo.Presencial;
import modelo.Primario;
import modelo.Secundario;
import modelo.Senior;
import modelo.Terciario;
import modelo.Ticket;
import modelo.TicketBuscaEmpleado;
import modelo.TicketBuscaEmpleo;
import modelo.Usuario;
import modelo.UsuarioInteractivo;
import modelo.V1;
import modelo.V2;
import modelo.V3;
import persistencia.EmpleadoDTO;
import persistencia.EmpleadorDTO;
import persistencia.IPersistencia;
import persistencia.ObjetoDTO;
import persistencia.PersistenciaBIN;
import persistencia.UtilDTO;

public class Sistema
{
	private static Sistema instancia = null;
	private ArrayList<UsuarioInteractivo> empleados = new ArrayList<UsuarioInteractivo>();
	private ArrayList<UsuarioInteractivo> empleadores = new ArrayList<UsuarioInteractivo>();
	private ArrayList<AdminAgencia> admins = new ArrayList<AdminAgencia>();

	public static Sistema getInstancia()
	{ // patron singleton
		if (instancia == null)
			instancia = new Sistema();
		return instancia;
	}

	/**
	 * Registra a un nuevo empleado.<br>
	 * <b>Pre: </b>ninguna variable puede ser null.<br>
	 * <b>Post: </b>crea un nuevo objeto de la clase Empleado o lanza una excepcion
	 * si el nombre de usuario ya existia.<br>
	 * 
	 * @param nombre:          nombre completo del empleado a registrar.
	 * @param nombreDeUsuario: nombre de usuario del empleado a registrar.
	 * @param contrasenia:     contrasenia del empleado a registrar.
	 * @param telefono:        telefono del empleado a registrar.
	 * @param edad:            edad del empleado a registrar.
	 * @return: un empleado.
	 */

	public Empleado registroEmpleado(String nombre, String nombreDeUsuario, String contrasenia, String telefono,
			int edad) 
	{
			return new Empleado(nombre, nombreDeUsuario, contrasenia, telefono, edad);
		
			
	}

	public ArrayList<UsuarioInteractivo> getEmpleados()
	{
		return empleados;
	}

	public ArrayList<UsuarioInteractivo> getEmpleadores()
	{
		return empleadores;
	}

	/**
	 * Registra a un admin.<br>
	 * <b>Pre: </b>ninguna variable puede ser null.<br>
	 * <b>Post: </b>crea un nuevo objeto de la clase AdminAgencia.<br>
	 * 
	 * @param nombre:          nombre completo del admin a registrar.
	 * @param nombreDeUsuario: nombre de usuario del admin a registrar.
	 * @param contrasenia:     contrasenia del admin a registrar.
	 * @return: un admin.
	 */

	public AdminAgencia registroAdmin(String nombre, String nombreDeUsuario, String contrasenia) throws NombreDeUsuarioDuplicadoException
	{
		if (!this.nombreDeUsuarioDuplicado(nombreDeUsuario))
			return new AdminAgencia(nombre, nombreDeUsuario, contrasenia);
		else
			throw new NombreDeUsuarioDuplicadoException(nombreDeUsuario);
	}

	/**
	 * Registra a un nuevo empleador.<br>
	 * <b>Pre: </b>ninguna variable puede ser null.<br>
	 * <b>Post: </b>crea un nuevo objeto de la clase Empleador o lanza una excepcion
	 * si el nombre de usuario ya existia.<br>
	 * 
	 * @param nombre:          nombre completo del empleador a registrar.
	 * @param nombreDeUsuario: nombre de usuario del empleador a registrar.
	 * @param contrasenia:     contrasenia del empleador a registrar.
	 * @param persona:         tipo de persona del empleador a registrar.
	 * @param rubro:           rubro del empleador a registrar
	 * @return: un empleador.
	 */

	public Empleador registroEmpleador(String nombre, String nombreDeUsuario, String contrasenia, String persona,
			String rubro)
	{
			IPersona encapsulado;
			IPersona respuesta = null;
			if (persona.equals("Juridica"))
				encapsulado = new PersonaJuridica();
			else
				encapsulado = new PersonaFisica();

			if (rubro.equals("Salud"))
				respuesta = new DecoratorSalud(encapsulado);
			else if (rubro.equals("ComercioInternacional"))
				respuesta = new DecoratorComercioLocal(encapsulado);
			else if (rubro.equals("ComercioNacional"))
				respuesta = new DecoratorComercioInternacional(encapsulado);

			return new Empleador(nombre, nombreDeUsuario, contrasenia, respuesta);
	}

	/**
	 * Verifica que no no se quiera registrar un usuario con un nombre de usuario ya
	 * existente<br>
	 * <b>Pre: </b>ningun parametro puede ser null.<br>
	 * <b>Post: </b>informa si el nombre de usuario ya existe.<br>
	 * 
	 * @param nombreDeUsuario: nombre de usuario del usuario que quiere registrarse.
	 * @param usuarios:        arrayList del tipo de usuario que se quiere
	 *                         registrar.
	 * @return: verdadero si el nombre de usuario ya existe, falso si no.
	 */

	
	public boolean nombreDeUsuarioDuplicado(String nombreDeUsuario) throws NombreDeUsuarioDuplicadoException
	{
		int i = 0;
		while (i < empleados.size() && !empleados.get(i).getNombreDeUsuario().equals(nombreDeUsuario))
			i++;

		if (!(i < empleados.size()))
		{
			i = 0;
			while (i < empleadores.size() && !empleadores.get(i).getNombreDeUsuario().equals(nombreDeUsuario))
				i++;
			if (!(i < empleadores.size()))
			{
				i = 0;
				while (i < admins.size() && !admins.get(i).getNombreDeUsuario().equals(nombreDeUsuario))
					i++;

				return i < admins.size();
			} else
				throw new NombreDeUsuarioDuplicadoException(nombreDeUsuario);
		} else
			throw new NombreDeUsuarioDuplicadoException(nombreDeUsuario);
	}

	
/*	public boolean nombreDeUsuarioDuplicado(String nombreDeUsuario)
	{
		int i = 0;
		while (i < empleados.size() && !empleados.get(i).getNombreDeUsuario().equals(nombreDeUsuario))
			i++;

		if (!(i < empleados.size()))
		{
			i = 0;
			while (i < empleadores.size() && !empleadores.get(i).getNombreDeUsuario().equals(nombreDeUsuario))
				i++;
			if (!(i < empleadores.size()))
			{
				i = 0;
				while (i < admins.size() && !admins.get(i).getNombreDeUsuario().equals(nombreDeUsuario))
					i++;

				return i < admins.size();
			} else
				return true;
		} else
			return true;
	} */
	/**
	 * Se inicia sesion<br>
	 * <b>Pre: </b>ningun parametro puede ser null y el usuario ya debe haber sido
	 * registrado previamente.<br>
	 * <b>Post: </b> devuelve el usuario o lanza excepcion en caso de que la
	 * contrasenia o el nombre de usuario sean incorrectos.<br>
	 * 
	 * @param nombreDeUsuario: nombre de usuario del usuario que quiere inciar
	 *                         sesion.
	 * @param contrasenia:     contrasenia del usaurio que quiere iniciar sesion.
	 * @return: usuario que quiere iniciar sesion.
	 */
	public Usuario login(String nombreDeUsuario, String contrasenia)
			throws NombreIncorrectoException, ContraseniaIncorrectaException
	{
		Usuario respuesta = null;
		int i = 0;
		while (i < empleados.size() && !nombreDeUsuario.equals(empleados.get(i).getNombreDeUsuario()))
			i++;

		if (i < empleados.size())
			if (empleados.get(i).getContrasenia().equals(contrasenia))
				respuesta = empleados.get(i);
			else
				throw new ContraseniaIncorrectaException(nombreDeUsuario, contrasenia);
		else
		{
			i = 0;
			while (i < empleadores.size() && !nombreDeUsuario.equals(empleadores.get(i).getNombreDeUsuario()))
				i++;

			if (i < empleadores.size())
				if (empleadores.get(i).getContrasenia().equals(contrasenia))
					respuesta = empleadores.get(i);
				else
					throw new ContraseniaIncorrectaException(nombreDeUsuario, contrasenia);
			else
			{
				i = 0;
				while (i < admins.size() && !nombreDeUsuario.equals(admins.get(i).getNombreDeUsuario()))
					i++;
				if (i < admins.size()) // no me caí del arraylist de admin -> encontré nombre de usuario
					if (admins.get(i).getContrasenia().equals(contrasenia)) // login correcto
						respuesta = admins.get(i);
					else
						throw new ContraseniaIncorrectaException(nombreDeUsuario, contrasenia);
				else
					throw new NombreIncorrectoException(nombreDeUsuario);
			}
		}
		return respuesta;
	}

	/**
	 * Crea un nuevo ticekt Busca Empleado<br>
	 * <b>Pre: </b>ningun parametro puede ser null<br>
	 * <b>Post: </b> devuelve un Ticket Busca Empleado<br>
	 * 
	 * @param cantEmp:          cantidad de empleados que se buscan contratar.
	 * @param locacion:         locacion del formulario de busqueda.
	 * @param remuneracion:     remuneracion del formulario de busqueda.
	 * @param cargaHoraria:     carga horaria del formulario de busqueda.
	 * @param tipoPuesto:       tipo de puesto del formulario de busqueda.
	 * @param rangoEtario:      rango etario que se buscan en un empleado pretenso.
	 * @param experiencia:      experiencia que se buscan en un empleado pretenso.
	 * @param estudiosCursados: estudios cursados que se buscan en un empleado
	 *                          pretenso
	 * @param pesos:            importancia que se le da a cada aspecto del
	 *                          formulario de busqueda.
	 * @return: Ticket Busca Empleado con las especificaciones deseadas.
	 */

	public void agregaTicketBuscaEmpleado(Empleador empleador, int cantEmp, String locacion, String remuneracion,
			String cargaHoraria, String tipoPuesto, String rangoEtario, String experiencia, String estudiosCursados,
			ArrayList<Integer> pesos)
	{

		empleador.addTicket(new TicketBuscaEmpleado(crearFormulario(locacion, remuneracion, cargaHoraria, tipoPuesto,
				rangoEtario, experiencia, estudiosCursados), cantEmp, pesos));
	}

	public void agregarEmpleador(Empleador empleador)
	{
		empleadores.add(empleador);
	}

	public void agregarAdmin(AdminAgencia admin)
	{
		this.admins.add(admin);
	}

	public void agregarEmpleado(Empleado empleado){
		this.empleados.add(empleado);
	}
	
	/*
	 * public TicketBuscaEmpleado creaTicketBuscaEmpleado(int cantEmp, String
	 * locacion, String remuneracion, String cargaHoraria, String tipoPuesto, String
	 * rangoEtario, String experiencia, String estudiosCursados, ArrayList<Double>
	 * pesos) {
	 * 
	 * return new TicketBuscaEmpleado(crearFormulario(locacion, remuneracion,
	 * cargaHoraria, tipoPuesto, rangoEtario, experiencia, estudiosCursados),
	 * cantEmp, pesos); }
	 */

	/**
	 * Crea un nuevo ticekt Busca Empleo<br>
	 * <b>Pre: </b>ningun parametro puede ser null<br>
	 * <b>Post: </b> devuelve un Ticket Busca Empleo<br>
	 * 
	 * @param locacion:         locacion del formulario de busqueda.
	 * @param remuneracion:     remuneracion del formulario de busqueda.
	 * @param cargaHoraria:     carga horaria del formulario de busqueda.
	 * @param tipoPuesto:       tipo de puesto del formulario de busqueda.
	 * @param rangoEtario:      rango etario del empleado pretenso.
	 * @param experiencia:      experiencia del empleado pretenso.
	 * @param estudiosCursados: estudios cursados del empleado pretenso
	 * @return: Ticket Busca Empleo con las especificaciones deseadas.
	 */

	public void asignaTicketBuscaEmpleo(Empleado usuario, String locacion, String remuneracion, String cargaHoraria,
			String tipoPuesto, String rangoEtario, String experiencia, String estudiosCursados) // asigna ticket y
																								// agrega a arraylist de
																								// empleados
	{
		usuario.setTicket(new TicketBuscaEmpleo(crearFormulario(locacion, remuneracion, cargaHoraria, tipoPuesto,
				rangoEtario, experiencia, estudiosCursados)));
		//empleados.add(usuario);
	}

	/*
	 * public TicketBuscaEmpleo creaTicketBuscaEmpleo(String locacion, String
	 * remuneracion, String cargaHoraria, String tipoPuesto, String rangoEtario,
	 * String experiencia, String estudiosCursados) { return new
	 * TicketBuscaEmpleo(crearFormulario(locacion, remuneracion, cargaHoraria,
	 * tipoPuesto, rangoEtario, experiencia, estudiosCursados)); }
	 */

	/**
	 * Crea un Formulario de Busqueda<br>
	 * <b>Pre: </b>ningun parametro puede ser null<br>
	 * <b>Post: </b> Devuelve un formulario para agregar al ticket<br>
	 * 
	 * @param locacion:         locacion que busca el formulario de busqueda.
	 * @param remuneracion:     remuneracion que busca el formulario de busqueda.
	 * @param cargaHoraria:     carga horaria que busca el formulario de busqueda.
	 * @param tipoPuesto:       tipo de puesto que busca el formulario de busqueda.
	 * @param rangoEtario:      rango etario que busca el formulario de busqueda.
	 * @param experiencia:      experiencia que busca el formulario de busqueda.
	 * @param estudiosCursados: estudios cursados que busca el formulario de
	 *                          busqueda.
	 * @return: Formulario de busqueda con las preferencias especificadas.
	 */

	public FormularioDeBusqueda crearFormulario(String locacion, String remuneracion, String cargaHoraria,
			String tipoPuesto, String rangoEtario, String experiencia, String estudiosCursados)
	{
		FormularioDeBusqueda respuesta = new FormularioDeBusqueda();

		if (locacion.equals("HomeOffice"))
			respuesta.setLocacion(new HomeOffice());
		else if (locacion.equals("Indistinto"))
			respuesta.setLocacion(new Indistinto());
		else if (locacion.equals("Presencial"))
			respuesta.setLocacion(new Presencial());

		if (remuneracion.equals("V1"))
			respuesta.setRemuneracion(new V1());
		else if (remuneracion.equals("V2"))
			respuesta.setRemuneracion(new V2());
		else if (remuneracion.equals("V3"))
			respuesta.setRemuneracion(new V3());

		if (cargaHoraria.equals("CargaMedia"))
			respuesta.setCargahoraria(new CargaMedia());
		else if (cargaHoraria.equals("CargaCompleta"))
			respuesta.setCargahoraria(new CargaCompleta());
		else if (cargaHoraria.equals("CargaExtendida"))
			respuesta.setCargahoraria(new CargaExtendida());

		if (tipoPuesto.equals("Junior"))
			respuesta.setTipoPuesto(new Junior());
		else if (tipoPuesto.equals("Senior"))
			respuesta.setTipoPuesto(new Senior());
		else if (tipoPuesto.equals("Management"))
			respuesta.setTipoPuesto(new Management());

		if (rangoEtario.equals("MenosDe40"))
			respuesta.setRangoEtario(new MenosDe40());
		else if (rangoEtario.equals("Entre40y50"))
			respuesta.setRangoEtario(new Entre40y50());
		else if (rangoEtario.equals("MasDe50"))
			respuesta.setRangoEtario(new MasDe50());

		if (experiencia.equals("Nada"))
			respuesta.setExperiencia(new Nada());
		else if (experiencia.equals("Media"))
			respuesta.setExperiencia(new Media());
		else if (experiencia.equals("Mucha"))
			respuesta.setExperiencia(new Mucha());

		if (estudiosCursados.equals("Primario"))
			respuesta.setEstudiosCursados(new Primario());
		else if (estudiosCursados.equals("Secundario"))
			respuesta.setEstudiosCursados(new Secundario());
		else if (estudiosCursados.equals("Terciario"))
			respuesta.setEstudiosCursados(new Terciario());

		return respuesta;
	}

	/**
	 * Realiza la ronda de encuentros laborales. Analiza los tickets y determina las
	 * coincidencias, para elaborar las Listas de Asignaciones.<br>
	 * <b>Pre: </b>debe haber empleados y empleadores registrados previamente.<br>
	 * <b>Post: </b> crea las listas de asignaciones ordenadas segun las
	 * coincidencias.<br>
	 */

	public void RondaDeEncuentrosLaborales()
	{ // throw excepcion

		int i, j, k;
		double aux = 0;

		for (i = 0; i < this.empleados.size(); i++)
		{

			for (j = 0; j < this.empleadores.size(); j++) // para todos los empleadores disponibles
			{

				for (k = 0; k < ((Empleador) this.empleadores.get(j)).getTickets().size(); k++)// todos los ticket
																								// de cada empleador
				{

					if (((Empleador) this.empleadores.get(j)).getTickets().get(k).diceEstado().equals("Activo")
							&& ((Empleado) this.empleados.get(i)).getTicket().diceEstado().equals("Activo"))
					{ // si ambos tickets estána ctivos
						aux = this.calculaCoincidencias((Empleado) empleados.get(i),
								((Empleador) empleadores.get(j)).getTickets().get(k)); // calculo puntaje
						((Empleado) this.empleados.get(i)).getTicket().getLista().insertar(
								(Empleador) empleadores.get(j), ((Empleador) empleadores.get(j)).getTickets().get(k),
								aux);
						((Empleador) this.empleadores.get(j)).getTickets().get(k).getLista()
								.insertar((Empleado) empleados.get(i), aux);
					}
				}
			}
			// suma 10 puntos al Empleador que este ultimo en la lista (el que tiene mas
			// puntos)
			ArrayList<Empleador> empleadoresAux = ((Empleado) this.empleados.get(i)).getTicket().getLista()
					.getEmpleadores();
			Empleador maxEmpr = empleadoresAux.get(empleadoresAux.size() - 1);
			maxEmpr.setPuntaje(maxEmpr.getPuntaje() + 10);
		}

		// resta 5 puntos a cada empleado que quede primero en la lista (el que tiene
		// menos puntos) y suma 5 puntos a cada empleado que quede ultimo en la lista
		// (el que tiene
		// mas puntos)
		for (i = 0; i < this.empleadores.size(); i++)
			for (j = 0; j < ((Empleador) this.empleadores.get(i)).getTickets().size(); j++)
			{
				ArrayList<Empleado> empleadosAux = ((Empleador) this.empleadores.get(i)).getTickets().get(j).getLista()
						.getEmpleados();
				Empleado minEmp = empleadosAux.get(0);
				Empleado maxEmp = empleadosAux.get(empleadosAux.size() - 1);
				minEmp.setPuntaje(minEmp.getPuntaje() - 5);
				maxEmp.setPuntaje(maxEmp.getPuntaje() + 5);
			}
	}

	/**
	 * Calcula las coincidencais segun las matriz de coincidencias.<br>
	 * <b>Pre: </b>ningun parametro puede ser null<br>
	 * <b>Post: </b> devuelve el valor de compatibilidad.<br>
	 * 
	 * @param empleado: empleado a comparar.
	 * @param ticket:   ticket a comprar del empleador.
	 * @return: sumatoria todas las coincidencias especificadas en la matriz
	 *          (afectadas por el peso).
	 */

	private double calculaCoincidencias(Empleado empleado, TicketBuscaEmpleado ticket) // calculo de puntaje
	{
		double aux = 0.;

		aux += empleado.getTicket().getFormulario().getLocacion().calcularLocacion(ticket.getFormulario().getLocacion())
				* ticket.getPesos().get(0);
		aux += empleado.getTicket().getFormulario().getRemuneracion()
				.calcularRemuneracion(ticket.getFormulario().getRemuneracion()) * ticket.getPesos().get(1);
		aux += empleado.getTicket().getFormulario().getCargaHoraria()
				.calcularCargaHoraria(ticket.getFormulario().getCargaHoraria()) * ticket.getPesos().get(2);
		aux += empleado.getTicket().getFormulario().getTipoPuesto()
				.calcularTipoPuesto(ticket.getFormulario().getTipoPuesto()) * ticket.getPesos().get(3);
		aux += empleado.getTicket().getFormulario().getRangoEtario()
				.calcularRangoEtario(ticket.getFormulario().getRangoEtario()) * ticket.getPesos().get(4);
		aux += empleado.getTicket().getFormulario().getExperiencia()

				.calcularExperiencia(ticket.getFormulario().getExperiencia()) * ticket.getPesos().get(5);
		aux += empleado.getTicket().getFormulario().getEstudiosCursados()
				.calcularEstudiosCursados(ticket.getFormulario().getEstudiosCursados()) * ticket.getPesos().get(6);

		return aux;

	}

	/**
	 * El empleador elige a un empleado para contratar<br>
	 * <b>Pre: </b>ningun parametro puede ser null y se hizo previamente la Ronda de
	 * Encuentros Laborales.<br>
	 * <b>Post: </b>agrega el ticket propio del empleador y el empleado que quiere
	 * contratar a su atributo 'elecciones'<br>
	 * 
	 * @param empleador: empleador que quiere contratar a un empleado.
	 * @param ticket:    ticket del empleador por el cual quiere contratar a un
	 *                   empleado.
	 * @param empleado:  empleado que quiere contratar el empleador.
	 */

	public void RondaDeEleccionDeUnEmpleador(Empleador empleador, TicketBuscaEmpleado ticket, Empleado empleado)
	{
		empleador.getElecciones().agregar(ticket, empleado);
		// System.out.println("Empleador: "+empleador.toString()+"Agregado el ticket"+
		// ticket.toString() + "del empleado "+ empleado.toString());
	}

	/**
	 * El empleado elige a un empleador para que lo contrate<br>
	 * <b>Pre: </b>ningun parametro puede ser null y se hizo previamente la Ronda de
	 * Encuentros Laborales.<br>
	 * <b>Post: </b>agrega el empleador y el ticket del empleado que quiere que lo
	 * contrate a su atributo 'elecciones'<br>
	 * 
	 * @param empleado:  empleado que quiere ser contratado por un empleador.
	 * @param ticket:    ticket del empleador por el cual quiere ser contratado el
	 *                   empleado.
	 * @param empleador: empleador por el cual quiere ser contratado el empleado.
	 */

	public void RondaDeEleccionDeUnEmpleado(Empleado empleado, TicketBuscaEmpleado ticket, Empleador empleador)
	{
		empleado.getElecciones().agregar(ticket, empleador);
		empleador.setElegido(true);
	}

	/**
	 * Ronda de contrataciones. Se juntan los empleados y empleadores que se
	 * eligieron mutuamente<br>
	 * <b>Pre: </b> se debe haber hecho la ronda de elecciones previamente.<br>
	 * <b>Post: </b>finalizan los tickets de los empleados contratados. Se suman la
	 * cantidad de empleados contratados en el ticket del empleador (si llega al
	 * limite, se finaliza). Se suman los puntos a los usuarios
	 * correspondientes.<br>
	 */

	public void RondaDeContrataciones()
	{

		for (int i = 0; i < this.empleadores.size(); i++) // agarro un empleador
		{
			ArrayList<UsuarioInteractivo> empl = this.empleadores.get(i).getElecciones().getEmps();
			for (int j = 0; j < empl.size(); j++) // agarro un empleado de los que eligio
				if (empl.get(j).getElecciones().getEmps().contains(this.empleadores.get(i))) // verifico si ese empleado
																								// tambien lo eligio
				{
					int indice = empl.get(j).getElecciones().getEmps().indexOf(this.empleadores.get(i)); // tomo el
																											// indice en
																											// donde se
																											// encuentra
																											// el
																											// empleador
																											// en las
																											// elecciones
																											// del
																											// empleado
					TicketBuscaEmpleado ticket = this.empleadores.get(i).getElecciones().getTickets().get(j); // ticket
																												// del
																												// empleador
																												// que
																												// quiero
																												// verificar
																												// compatibilidad

					if (empl.get(j).getElecciones().getTickets().get(indice).equals(ticket)
							&& ticket.getCantEmpObt() != ticket.getCantEmpSolic()) // verifico que elticket este en el
																					// mismo indice que el empleado
					{
						// Contratado!!
						System.out.println("El empleador: " + empleadores.get(i) + "ha contratado a: " + empl);
						((Empleado) empl.get(j)).getTicket().finaliza();
						empl.get(j).setPuntaje(empl.get(j).getPuntaje() + 10);
						ticket.setCantEmpObt(ticket.getCantEmpObt() + 1); // sumo 1 a la cantidad de Empleados obtenidos

						if (ticket.getCantEmpObt() == ticket.getCantEmpSolic())
						{
							ticket.finaliza();
							empl.get(j).setPuntaje(empl.get(j).getPuntaje() + 50);
						}
					}
				}

			if (!((Empleador) this.empleadores.get(i)).isElegido())
				this.empleadores.get(i).setPuntaje(this.empleadores.get(i).getPuntaje() - 20); // por no ser elegido por
																								// ningún empleado
																								// pretenso resta 20
																								// puntos
		}
	}

	/**
	 * Se calcula la comision a cobrarle al empleado<br>
	 * <b>Pre: </b>empleado no puede ser null y ya se debe haber efectuado la ronda
	 * de contrataciones.<br>
	 * <b>Post: </b> devuelve la comision a cobrarle al empleado.<br>
	 * 
	 * @param empleado: empleado a cobrar comision.
	 * @return: comision a cobrar.
	 */

	public double comisionEmpleado(Empleado empleado)
	{
		double aux = empleado.getTicket().getFormulario().getRemuneracion().getValor()
				* empleado.getTicket().getFormulario().getTipoPuesto().getComision();
		return aux - aux * empleado.getPuntaje() * 0.01;
	}

	/**
	 * Se calcula la comision a cobrarle al empleador<br>
	 * <b>Pre: </b>ni empleador ni ticket pueden ser null y ya se debe haber
	 * efectuado la ronda de contrataciones.<br>
	 * <b>Post: </b> devuelve la comision a cobrarle al empleador.<br>
	 * 
	 * @param empleador: empleador a cobrar comision.
	 * @param ticket:    ticket por el cual se quiere cobrar comision.
	 * @return: comision a cobrar.
	 */

	public double comisionEmpleador(Empleador empleador, TicketBuscaEmpleado ticket)
	{
		double aux = empleador.getPersona().calcularComision() * ticket.getFormulario().getRemuneracion().getValor();
		return (aux - aux * empleador.getPuntaje() * 0.01);
	}

	/**
	 * Cambia el estado del ticket segun se desee.<br>
	 * <b>Pre: </b>ni ticket ni estado puede ser null<br>
	 * <b>Post: </b> llama al metodo del ticket que corresponda segun el estado
	 * especificado.<br>
	 * 
	 * @param ticket: ticket del cual se desea gestionar.
	 * @param estado: estado por el cual se desea modificar el ticekt.
	 */
	public void gestionTicket(Ticket ticket, String estado)
	{
		if (estado.equals("Activar"))
			ticket.activa();
		else if (estado.equals("Cancelar"))
			ticket.cancela();
		else if (estado.equals("Suspender"))
			ticket.suspende();
	}

	public void escribirPersistencia() throws IOException
	{ // catchear excepcion en el main
		ArrayList<EmpleadoDTO> empleadosDTO = UtilDTO.EmpleadosToDTO(empleados);
		ArrayList<EmpleadorDTO> empleadoresDTO = UtilDTO.EmpleadoresToDTO(empleadores);
		ObjetoDTO objetoDTO = new ObjetoDTO(empleadosDTO, empleadoresDTO);
		IPersistencia persistencia = new PersistenciaBIN();
		persistencia.abrirOutput("Datos.bin");
		System.out.println("Creando archivo de escritura");
		persistencia.escribir(objetoDTO);
		System.out.println("Datos grabados exitosamente");
		persistencia.cerrarOutput();
		System.out.println("Archivo cerrado");
		Iterator<UsuarioInteractivo> iterador = UtilDTO.DTOToEmpleados(objetoDTO.getEmpleados()).iterator();
		while (iterador.hasNext())
			System.out.println("Empleados cargados:" + iterador.next().toString());
		iterador = UtilDTO.DTOToEmpleadores(objetoDTO.getEmpleadores()).iterator();
		while (iterador.hasNext())
			System.out.println("Empleadores cargados:" + iterador.next().toString());
		// System.out.println("Objeto cargado: "+ objeto.toString()); */

		/*
		 * Objeto objeto = new Objeto(this.empleados,this.empleadores); IPersistencia
		 * persistencia = new PersistenciaBIN(); persistencia.abrirOutput("Datos.bin");
		 * System.out.println("Creando archivo de escritura");
		 * persistencia.escribir(objeto);
		 * System.out.println("Datos grabados exitosamente");
		 * persistencia.cerrarOutput(); System.out.println("Archivo cerrado");
		 * Iterator<UsuarioInteractivo> iterador = objeto.getEmpleadores().iterator();
		 * while (iterador.hasNext()) System.out.println("Empleadores cargados:"+
		 * iterador.next().toString()); iterador = objeto.getEmpleados().iterator();
		 * while (iterador.hasNext()) System.out.println("Empleados cargados:"+
		 * iterador.next().toString()); //System.out.println("Objeto cargado: "+
		 * objeto.toString());
		 */
	}

	/**
	 * Hace la lectura de la persistencia.<br>
	 * 
	 */

	public void leerPersistencia() throws ClassNotFoundException, IOException, Exception
	{
		IPersistencia persistencia = new PersistenciaBIN();
		persistencia.abrirInput("Datos.bin");
		System.out.println("Archivo abierto");
		ObjetoDTO objeto = (ObjetoDTO) persistencia.leer();
		System.out.println("Datos recuperados");
		persistencia.cerrarInput();
		System.out.println("Archivo cerrado");
		this.empleadores = UtilDTO.DTOToEmpleadores(objeto.getEmpleadores());
		this.empleados = UtilDTO.DTOToEmpleados(objeto.getEmpleados());
		Iterator<UsuarioInteractivo> iterador = this.empleadores.iterator();
		while (iterador.hasNext())
			System.out.println("Empleadores cargados:" + iterador.next().toString());
		iterador = this.empleados.iterator();
		while (iterador.hasNext())
			System.out.println("Empleados cargados:" + iterador.next().toString());
		// ArrayList<EmpleadorDTO> empleadoresDTO = UtilDTO.DTOToEmpleadores(null);
		/*
		 * IPersistencia persistencia = new PersistenciaBIN();
		 * persistencia.abrirInput("Datos.bin"); System.out.println("Archivo abierto");
		 * Objeto objeto = (Objeto) persistencia.leer();
		 * System.out.println("Datos recuperados"); persistencia.cerrarInput();
		 * System.out.println("Archivo cerrado"); this.empleados =
		 * objeto.getEmpleados(); this.empleadores = objeto.getEmpleadores();
		 * Iterator<UsuarioInteractivo> iterador = this.empleadores.iterator(); while
		 * (iterador.hasNext()) System.out.println("Empleadores cargados:"+
		 * iterador.next().toString()); iterador = this.empleados.iterator(); while
		 * (iterador.hasNext()) System.out.println("Empleados cargados:"+
		 * iterador.next().toString()); //this.contrataciones =
		 * objeto.getContrataciones();
		 */

	}

}