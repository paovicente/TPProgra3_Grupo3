package modelo;

import java.io.Serializable;

public class FinalizadoState implements IState, Serializable
{

	private Ticket ticket;

	public FinalizadoState(Ticket ticket)
	{
		super();
		this.ticket = ticket;
	}
	
	/**
	 * Devuelve un String con el nombre del estado.
	 */
	@Override
	public String diceEstado()
	{
		// TODO Auto-generated method stub
		return "Finalizado";
	}
	
	/**
	 * Activa el ticket.
	 */

	@Override
	public void activa()
	{
		this.ticket.setEstado(new ActivoState(this.ticket));
		
	}

	/**
	 * Suspende el ticket.
	 */
	@Override
	public void suspende()
	{
		//Ticket finalizado.
		
	}

	/**
	 * Cancela el ticket.
	 */
	@Override
	public void cancela()
	{
		//Ticket finalizado.
		
	}

	/**
	 * Finaliza el ticket.
	 */
	@Override
	public void finaliza()
	{
		//Ticket ya finalizado previamente.
		
	}

}
