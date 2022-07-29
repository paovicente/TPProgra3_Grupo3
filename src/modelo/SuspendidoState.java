package modelo;

import java.io.Serializable;

public class SuspendidoState implements IState, Serializable
{

	private Ticket ticket;
	
	public SuspendidoState(Ticket ticket)
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
		return "Suspendido";
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
		//Ticet ya suspendido previamente.
		
	}
	
	/**
	 * Cancela el ticket.
	 */

	@Override
	public void cancela()
	{
		this.ticket.setEstado(new CanceladoState(this.ticket));
		
	}
	
	/**
	 * Finaliza el ticket.
	 */
	
	@Override
	public void finaliza()
	{
		//El ticket debe estar activado para poder ser finalizado.
		
	}

}
