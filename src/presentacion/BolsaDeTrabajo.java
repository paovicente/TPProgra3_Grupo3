package presentacion;

import java.util.ArrayList;

import modelo.TicketSimplificado;

public class BolsaDeTrabajo
{
	private static BolsaDeTrabajo _instancia = null;
	private ArrayList<TicketSimplificado> tickets = new ArrayList<TicketSimplificado>();

	public static BolsaDeTrabajo getInstancia()
	{
		if (_instancia == null)
			_instancia = new BolsaDeTrabajo();

		return _instancia;
	}

	/**
	 * Une al empleado con el ticket simplificado compatible en cuanto al tipo de trabajo (solo si esta disponible).<br>
	 * <b>Pre: </b>Ni nombre ni tipoDeTrabajo pueden ser null<br>
	 * <b>Post: </b>Devulve el ticket compatible en cuanto al tipo de trabajo. El estado del ticket pasa a estar en consulta.<br>
	 * 
	 * @param nombre: nombre del empleado<br>
	 * @param tipoDeTrabajo: tipo de trabajo del empleado<br>
	 */
	
	public synchronized TicketSimplificado buscaEmpleo(String nombre, String tipoDeTrabajo)
	{
		TicketSimplificado ticket = null;
		int i = 0;
		while(tickets.size() == 0) //si no hay tickets, debe esperar a que los empladores generen
			try
			{
				System.out.println("Todavia no hay empleos disponibles.");
				this.wait();
			} catch (InterruptedException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		while (i < tickets.size() && ticket == null)
		{
			if (tickets.get(i).getTipoDeTrabajo().equals(tipoDeTrabajo))
			{
				ticket = tickets.get(i);
				while (ticket.getEstado().equals("en consulta"))
					try
					{
						System.out.println(nombre + " no consulta el ticket de " + ticket.getEmpleador().getNombre()
								+ " porque ya esta en consulta.\n");
						this.wait();
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				if (!ticket.getEstado().equals("no disponible"))
				{
					ticket.cambiaEstado("en consulta"); //esto es para llamar a los metodos de observable
					System.out
							.println(nombre + " esta en proceso de consulta con '" + ticket.getEmpleador().getNombre()+"'.\n");
				} else
					ticket = null;
			}
			i++;
		}
		return ticket;
	}
	
	/**
	 * Cuando el ticket no es compatible en cuanto a la locacion.<br>
	 * <b>Pre: </b>Ni nombre ni ticket pueden ser null<br>
	 * <b>Post: </b>El ticket vuelve a estar disponible. Notifica a los demas threads el cambio del estado.<br>
	 * 
	 * @param nombre: nombre del empleado<br>
	 * @param ticket: ticket con el que no hubo compatibilidad en caunto a la locacion.<br>
	 */

	public synchronized void devuelveTicket(String nombre, TicketSimplificado ticket)
	{
		System.out.println(nombre + " no consigue trabajo porque su locacion no es compatible con la de '"
				+ ticket.getEmpleador().getNombre()+"'.\n");
		ticket.cambiaEstado("disponible"); //esto es para llamar a los metodos de observable
		this.notifyAll();
	}
	
	/**
	 * Cuando el ticket es compatible en cuanto a la locacion.<br>
	 * <b>Pre: </b>Ni nombre ni ticket pueden ser null<br>
	 * <b>Post: </b>El ticket pasa a estar no disponible. Notifica a los demas threads el cambio del estado. Se elimina el ticket del array de tickets de la bolsa de trabajo.<br>
	 * 
	 * @param nombre: nombre del empleado<br>
	 * @param ticket: ticket con el que hubo compatibilidad.<br>
	 */


	public synchronized void noDevuelveTicket(String nombre, TicketSimplificado ticket)
	{
		System.out.println(nombre + " consigue empleo con '" + ticket.getEmpleador().getNombre() + "'.\n");
		this.tickets.remove(ticket);
		ticket.cambiaEstado("no disponible"); //esto es para llamar a los metodos de observable
		this.notifyAll();
	}
	
	/**
	 * Agrega el ticket generado por el empleador al array de tickets de la bolsa de trabajo.<br>
	 * <b>Pre: </b>ticket no puede ser null<br>
	 * <b>Post: </b>Agrega un ticket array.<br>
	 * 
	 * @param ticket: ticket a agregar.<br>
	 */

	public synchronized void agregaEmpleo(TicketSimplificado ticket)
	{
		this.tickets.add(ticket);
		this.notifyAll();
	}
}