package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Elecciones implements Serializable
{
    private ArrayList<TicketBuscaEmpleado> tickets = new ArrayList<TicketBuscaEmpleado>();
    private ArrayList<UsuarioInteractivo> emps = new ArrayList<UsuarioInteractivo>();
    
    /**
	 * Agrega los elementos seleccionados en la Ronda de Elecciones.<br>
	 * <b>Pre: </b>ni ticket ni emp pueden ser null.<br>
	 * <b>Post: </b>agrega el ticet del empleador al ArrayList tickets y el usuario seleccionado al ArrayList emps.<br>
	 * 
	 * @param ticket: ticket del empleador por el cual se hace la eleccion.
	 * @param emp: usuario que selecciono el otro usuario para contratar o ser contratado.
	 */
    
    public void agregar(TicketBuscaEmpleado ticket, UsuarioInteractivo emp)
    {
    	this.tickets.add(ticket);
    	this.emps.add(emp);
    }
    
    public void addTicket(TicketBuscaEmpleado ticket) {
    	this.tickets.add(ticket);
    }
    
    public void addEmpelador(UsuarioInteractivo empleador) {
    	this.emps.add(empleador);
    }

	public ArrayList<TicketBuscaEmpleado> getTickets()
	{
		return tickets;
	}

	public ArrayList<UsuarioInteractivo> getEmps()
	{
		return emps;
	}
    
    
}
