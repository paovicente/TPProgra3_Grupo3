package modelo;

public class CanceladoState implements IState
{

	private Ticket ticket;

	public CanceladoState(Ticket ticket)
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
		return "Cancelado";
	}
	
	/**
	 * Activa el ticket.
	 */

	@Override
	public void activa()
	{
		//Ticket cancelado. Imposible activar nuevamente
		
	}
	
	/**
	 * Suspende el ticket.
	 */

	@Override
	public void suspende()
	{
		//Ticket cancelado
		
	}
	
	/**
	 * Cancela el ticket.
	 */

	@Override
	public void cancela()
	{
		//Ticket ya cancelado previamente.
		
	}
	
	/**
	 * Finaliza el ticket.
	 */

	@Override
	public void finaliza()
	{
		//Ticket cancelado.
		
	}
	
	

}
