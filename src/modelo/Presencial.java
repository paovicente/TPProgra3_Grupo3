package modelo;

/**
 * @author Usuario
 *Clase Presencial que hereda de Locacion
 */
public class Presencial extends Locacion
{

	/**
	 *Método que calcula las coincidencias laborales (específicamente de la Locacion) usando el patrón double dispatch<br>
	 *<b> Pre: </b>La Locacion recibida como parámetro no debe ser null.<br>
	 *<b> Post: </b> Se calculó la coincidencia laboral entre la Locacion que invoca y la Locacion pasada como parámetro<br>
	 *@param locacion: parámetro que representa la Locacion con la cual se comparará la Locacion que invoca <br>
	 *@return double: informando el valor de coincidencia que tuvo la Locacion que invoca con la Locacion pasada como parámetro <br> 
	 */
	@Override
	public double calcularLocacion(Locacion locacion)
	{
		return locacion.presencial();
	}
	
	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Locacion que invoca es HomeOffice y la pasada como parámetro es Presencial.
	 */
	@Override
	public double homeOffice()
	{
		return -1;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Locacion que invoca es Indistinto y la pasada como parámetro es Presencial.
	 */
	@Override
	public double indistinto()
	{
		return 1;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Locacion que invoca es Presencial y la pasada como parámetro es Presencial.
	 */
	@Override
	public double presencial()
	{
		return 1;
	}
	
	/**
	 * Muestra que la Locacion es Presencial.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Presencial";
	}


}
