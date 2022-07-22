package modelo;

import java.util.Random;

import presentacion.BolsaDeTrabajo;

public class Empleado extends UsuarioInteractivo implements Runnable
{

	private String telefono;
	private int edad;
	private TicketBuscaEmpleo ticket = null;
	private TicketSimplificado ticketSimplificado;

	public Empleado(String nombre, String nombreDeUsuario, String contrasenia,
			String telefono, int edad)
	{
		super(nombre, nombreDeUsuario, contrasenia);
		this.telefono = telefono;
		this.edad = edad;
		this.codUsuario=1;
	}

	public TicketBuscaEmpleo getTicket()
	{
		return ticket;
	}

	public void setTicket(TicketBuscaEmpleo ticket)
	{
		this.ticket = ticket;
	}

	public TicketSimplificado getTicketSimplificado()
	{
		return ticketSimplificado;
	}

	public void setTicketSimplificado(TicketSimplificado ticketSimplificado)
	{
		this.ticketSimplificado = ticketSimplificado;
	}

	public String getTelefono()
	{
		return telefono;
	}

	
	
	public int getEdad()
	{
		return edad;
	}
	
	@Override
	public void run()
	{
		int i = 0;
		while (i < 10 && this.ticketSimplificado == null)
		{
			TicketSimplificado ticket;
			String tipoDeTrabajo = null;
			Random r = new Random();
			int num = r.nextInt(3);
			switch (num)
			{
			case 0:
				tipoDeTrabajo = "RubroComercioInternacional";
				break;
			case 1:
				tipoDeTrabajo = "RubroComercioLocal";
				break;
			case 2:
				tipoDeTrabajo = "RubroSalud";
				break;
			}
			ticket = BolsaDeTrabajo.getInstancia().buscaEmpleo(this.getNombre(), tipoDeTrabajo);
			if (ticket != null)
			{
				Util.espera(3000);
				String locEmpl = this.getTicket().getFormulario().getLocacion().diceTipo();
				if (locEmpl.equals(ticket.getLocacion()) || locEmpl.equals("Indistinto")
						|| ticket.getLocacion().equals("Indistinto"))
				{
					this.ticketSimplificado = ticket;
					BolsaDeTrabajo.getInstancia().noDevuelveTicket(this.getNombre(), ticket);
				} else
					BolsaDeTrabajo.getInstancia().devuelveTicket(this.getNombre(), ticket);

			}
			i++;
		}
	}

	@Override
	public String toString() {
		return super.toString()+" [telefono=" + telefono + ", edad=" + edad + "]";
	}

}
