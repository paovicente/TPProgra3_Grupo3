package modelo;

import java.util.ArrayList;
import java.util.Random;

import presentacion.BolsaDeTrabajo;

public class Empleador extends UsuarioInteractivo implements Runnable
{

	private ArrayList<TicketBuscaEmpleado> tickets = new ArrayList<TicketBuscaEmpleado>();
	private IPersona persona;
	private Elecciones elecciones;
	private boolean elegido = false;
	/**
	 * @aggregation composite
	 */
	
	
	public void addTicket(TicketBuscaEmpleado ticket) {
		this.tickets.add(ticket);
	}

	public Empleador(String nombre, String nombreDeUsuario, String contrasenia, IPersona persona)
	{
		super(nombre, nombreDeUsuario, contrasenia);
		// this.juridica = juridica;
		this.persona = persona;
		this.codUsuario=2;
	}
	
	public ArrayList<TicketBuscaEmpleado> getTickets()
	{
		return tickets;
	}

	public void setTickets(ArrayList<TicketBuscaEmpleado> tickets)
	{
		this.tickets = tickets;
	}

	public IPersona getPersona()
	{
		return persona;
	}

	public void setPersona(IPersona persona)
	{
		this.persona = persona;
	}

	public Elecciones getElecciones()
	{
		return elecciones;
	}

	public boolean isElegido()
	{
		return elegido;
	}

	public void setElegido(boolean elegido)
	{
		this.elegido = elegido;
	}

	@Override
	public void run()
	{
		Observador obs = new Observador();
		TicketSimplificado ticket=null;
		for(int i = 0; i < 3; i++)
		{
			String locacion=null;
			Random r = new Random();
			int num = r.nextInt(3);
			switch (num)
			{
			case 0:
				locacion = "HomeOffice";
				break;
			case 1:
				locacion = "Presencial";
				break;
			case 2:
				locacion = "Indistinto";
				break;
			}
			ticket = new TicketSimplificado(this.persona.diceRubro(),locacion,this);
			obs.agregarObservable(ticket);
			BolsaDeTrabajo.getInstancia().agregaEmpleo(ticket);
			Util.espera(3000);
		}
		
	}

	@Override
	public String toString() {
		return super.toString()+"";
	}
	
}
