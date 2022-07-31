package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListaDelEmpleador extends Lista implements Serializable
{
	/**
	 * @aggregation shared
	 */
	ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	ArrayList<Double> puntajes = new ArrayList<Double>();

	public ListaDelEmpleador()
	{
		super();
	}

	/**
	 * Inserta de forma ordenada un empleado con su respectivo puntaje a la lista.<br>
	 * <b>Pre: </b>empleado no es nulo.<br>
	 * <b>Post: </b>agrega un elemento a la lista.<br>
	 * 
	 * @param empleado: Empleado con el que se compara en la Ronda de Encuentros
	 *                  Laborales.
	 * @param puntaje:  double que simboliza el puntaje obtenido luego del calculo de coincidencias.
	 */
	public void insertar(Empleado empleado, double puntaje)
	{
		int pos = Collections.binarySearch(this.puntajes, puntaje);

		if (pos < 0)
		{
			this.empleados.add(-pos - 1, empleado);
			this.puntajes.add(-pos - 1, puntaje);
		}
		else
    	{
			this.empleados.add(pos, empleado);
			this.puntajes.add(pos, puntaje);
    	}
		
	}


	/**
	 * Muestra el nombre y el puntaje de los empleados de la lista, con un índice
	 * adelante.
	 */
	/*
	 * //ESTE METODO CREO QUE NO VA PORQUE HACE SYSTEM OUT!!! public void mostrar()
	 * {
	 * 
	 * Iterator<Empleado> itEmpleado = empleados.iterator(); Iterator<Double>
	 * itPuntajes = puntajes.iterator(); int i;
	 * 
	 * i = 0;
	 * 
	 * while (itEmpleado.hasNext() && itPuntajes.hasNext()) {
	 * System.out.println("\t Elemento " + i + "\n  Nombre: " +
	 * itEmpleado.next().getNombre() + "   Puntaje: "+itPuntajes.next()+"\n \n");
	 * i++; }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

	public ArrayList<Empleado> getEmpleados()
	{
		return empleados;
	}

	public ArrayList<Double> getPuntajes()
	{
		return puntajes;
	}

	@Override
	public String toString()
	{
		return "ListaDelEmpleador [empleados=" + empleados + ", puntajes=" + puntajes + "]";
	}

}
