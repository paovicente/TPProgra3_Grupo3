package modelo;

/**
 * @author Usuario
 *Clase Secundario que hereda de EstudiosCursados
 */
public class Secundario extends EstudiosCursados
{

	/**
	 *Método que calcula las coincidencias laborales (específicamente de los EstudiosCursados) usando el patrón double dispatch<br>
	 *<b> Pre: </b>Los EstudiosCursados recibido como parámetro no debe ser null.<br>
	 *<b> Post: </b> Se calculó la coincidencia laboral entre los EstudiosCursados que invoca y los EstudiosCursados pasado como parámetro<br>
	 *@param estudiosCursados: parámetro que representa los EstudiosCursados con la cual se comparará los EstudiosCursados que invoca <br>
	 *@return double: informando el valor de coincidencia que tuvo los EstudiosCursados que invoca con los EstudiosCursados pasado como parámetro <br> 
	 */
	@Override
	public double calcularEstudiosCursados(EstudiosCursados estudiosCursados)
	{
		return estudiosCursados.secundario();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el EstudiosCursados que invoca es Primario y el pasado como parámetro es Secundario.
	 */
	@Override
	public double primario()
	{
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el EstudiosCursados que invoca es Secundario y el pasado como parámetro es Secundario.
	 */
	@Override
	public double secundario()
	{
		return 1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el EstudiosCursados que invoca es Terciario y el pasado como parámetro es Secundario.
	 */
	@Override
	public double terciario()
	{
		return 1.5;
	}

	/**
	 * Muestra que EstudiosCursados es Secundario.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Secundario";
	}

}
