package modelo;

import java.time.LocalDate;

public abstract class Lista
{
    private LocalDate fecha;

	public Lista()
	{
		super();
		this.fecha = LocalDate.now();
	}

	public LocalDate getFecha()
	{
		return this.fecha;
	}
	
	
      
}
