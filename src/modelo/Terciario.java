package modelo;

/**
 * @author Usuario
 *Clase Terciario que hereda de EstudiosCursados
 */
public class Terciario extends EstudiosCursados {

	/**
	 *Método que calcula las coincidencias laborales (específicamente de los EstudiosCursados) usando el patrón double dispatch<br>
	 *<b> Pre: </b>Los EstudiosCursados recibido como parámetro no debe ser null.<br>
	 *<b> Post: </b> Se calculó la coincidencia laboral entre los EstudiosCursados que invoca y los EstudiosCursados pasado como parámetro<br>
	 *@param locacion: parámetro que representa los EstudiosCursados con la cual se comparará los EstudiosCursados que invoca <br>
	 *@return double: informando el valor de coincidencia que tuvo los EstudiosCursados que invoca con los EstudiosCursados pasado como parámetro <br> 
	 */
	@Override
	public double calcularEstudiosCursados(EstudiosCursados estudiosCursados)
	{
		return estudiosCursados.terciario();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el EstudiosCursados que invoca es Primario y el pasado como parámetro es Terciario.
	 */
	@Override
	public double primario()
	{
		return -2.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el EstudiosCursados que invoca es Secundario y el pasado como parámetro es Terciario.
	 */
	@Override
	public double secundario()
	{
		return 1.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el EstudiosCursados que invoca es Terciario y el pasado como parámetro es Terciario.
	 */
	@Override
	public double terciario()
	{
		return 1.;
	}

	/**
	 * Muestra que EstudiosCursados es Terciario.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Terciario";
	}

}
