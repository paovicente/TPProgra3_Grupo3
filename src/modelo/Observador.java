package modelo;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Observador implements Observer
{

	protected ArrayList<TicketSimplificado> observados = new ArrayList<TicketSimplificado>();

	/**
	 * Vincula al observer con el observable<br>
	 * <b>Pre: </b>ticket no puede ser null<br>
	 * <b>Post: </b>Le agrega un observer a ticket y agrega un observable al array de observados del observador.<br>
	 * 
	 * @param ticket: observable<br>
	 */
	
	public void agregarObservable(TicketSimplificado ticket)
	{
		ticket.addObserver(this);
		this.observados.add(ticket);
	}
	
	/**
	 * desvincula al observer con el observable<br>
	 * <b>Pre: </b>ticket no puede ser null<br>
	 * <b>Post: </b>Le elimina este observer a ticket y elimina un observable al array de observados del observador.<br>
	 * 
	 * @param ticket: observable<br>
	 */

	public void borrarObservable(TicketSimplificado ticket)
	{
		ticket.deleteObserver(this);
		this.observados.remove(ticket);
	}
	
	/**
	 * Cambia el estado del ticket simplificado.
	 */

	@Override
	public void update(Observable o, Object arg)
	{
		TicketSimplificado ticket = (TicketSimplificado) o;
		if (this.observados.contains(o))
		{
			ticket.setEstado((String) arg);
		}
		else
			throw new IllegalArgumentException();

	}

}
