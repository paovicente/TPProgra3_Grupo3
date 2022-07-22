package modelo;

public class ActivoState implements IState
{

	private Ticket ticket;
	
	
	
	public ActivoState(Ticket ticket)
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
		return "Activo";
		
	}

	/**
	 * Activa el ticket.
	 */
	
	@Override
	public void activa()
	{
		//Ticket ya previamente activado.
		
	}
	
	/**
	 * Suspende el ticket.
	 */

	@Override
	public void suspende()
	{
		this.ticket.setEstado(new SuspendidoState(this.ticket));
		
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
		this.ticket.setEstado(new FinalizadoState(this.ticket));
		
	}

}
