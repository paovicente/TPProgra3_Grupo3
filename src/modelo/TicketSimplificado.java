package modelo;

import java.io.Serializable;
import java.util.Observable;

public class TicketSimplificado extends Observable implements Serializable//no se extiende de ticket!!
{

	private String tipoDeTrabajo;
	private String locacion;
	private String estado;
	private Empleador empleador;
	
	public TicketSimplificado(String tipoDeTrabajo, String locacion, Empleador empleador)
	{
		this.tipoDeTrabajo = tipoDeTrabajo;
		this.locacion = locacion;
		this.estado = "disponible";
		this.empleador = empleador;
	}

	public String getTipoDeTrabajo()
	{
		return tipoDeTrabajo;
	}

	public void setTipoDeTrabajo(String tipoDeTrabajo)
	{
		this.tipoDeTrabajo = tipoDeTrabajo;
	}

	public String getLocacion()
	{
		return locacion;
	}

	public void setLocacion(String locacion)
	{
		this.locacion = locacion;
	}

	public String getEstado()
	{
		return estado;
	}

	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	public Empleador getEmpleador()
	{
		return empleador;
	}

	public void setEmpleador(Empleador empleador)
	{
		this.empleador = empleador;
	}
	
	/**
	 * Invoca a los metodos de la clase Observable setChanged y notifyObservers.
	 */
	
	public void cambiaEstado(String estado)
	{
		this.setChanged();
		this.notifyObservers(estado);
	}
	


}
