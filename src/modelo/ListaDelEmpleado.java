package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Usuario Lista creada luego de la ronda de encuentros laborales. Está
 *         formada por el conjunto de empleadores ordenados por el puntaje que
 *         el empleado obtuvo como calificación.
 *
 */
public class ListaDelEmpleado extends Lista implements Serializable
{

	/**
	 * @aggregation shared
	 */
	ArrayList<Empleador> empleadores = new ArrayList<Empleador>();

	/**
	 * @aggregation shared
	 */
	ArrayList<TicketBuscaEmpleado> tickets = new ArrayList<TicketBuscaEmpleado>();
	ArrayList<Double> puntajes = new ArrayList<Double>();

	/**
	 * Ordena la lista en base al puntaje obtenido luego de la ronda de encuentros
	 * laborales.<br>
	 * <b>Pre: </b>Se realizó la ronda de encuentros laborales.<br>
	 * <b>Post: </b>Ordena la lista.<br>
	 */

	public ListaDelEmpleado()
	{
		super();
	}



	/**
	 * Muestra el nombre y el puntaje de los empleadores de la lista, con un índice
	 * adelante.
	 */

	// ESTE METODO CREO QUE NO VA PORQUE HACE SYSTEM OUT!!!
	/*
	 * public void mostrar() { Iterator<Empleador> itEmpleador =
	 * empleadores.iterator(); Iterator<TicketBuscaEmpleado> itTicket =
	 * tickets.iterator(); Iterator<Double> itPuntajes = puntajes.iterator(); int i;
	 * 
	 * i = 0; while (itEmpleador.hasNext() && itPuntajes.hasNext()) {
	 * System.out.println("\t Elemento " + i + "\n  Nombre: " +
	 * itEmpleador.next().getNombre() + "   Puntaje: " + itPuntajes.next() +
	 * "\n \n"); i++; }
	 * 
	 * }
	 */

	/**
	 * Inserta de forma ordenada un empleador con su respectivo ticket y puntaje a la lista.<br>
	 * <b>Pre: </b>empleador y ticket no son nulos.<br>
	 * <b>Post: </b>agrega un elemento a la lista.<br>
	 * 
	 * @param empleador: Empleador con el que se compara en la Ronda de Encuentros
	 *                   Laborales.
	 * @param ticket:    TicketBuscaEmpleado de empleador.
	 * @param puntaje:   double que simboliza el puntaje obtenido luego del calculo de coincidencias.
	 */
	public void insertar(Empleador empleador, TicketBuscaEmpleado ticket, double puntaje)
	{
		int pos = Collections.binarySearch(this.puntajes, puntaje);
		if (pos < 0)
		{
			this.empleadores.add(-pos-1, empleador);
			this.tickets.add(-pos-1, ticket);
			this.puntajes.add(-pos-1, puntaje);
		}
		else
    	{
			this.empleadores.add(pos, empleador);
			this.tickets.add(pos, ticket);
			this.puntajes.add(pos, puntaje);
    	}
	}
	


	public ArrayList<Empleador> getEmpleadores()
	{
		return empleadores;
	}

	public ArrayList<TicketBuscaEmpleado> getTickets()
	{
		return tickets;
	}

	public ArrayList<Double> getPuntajes()
	{
		return puntajes;
	}

}
