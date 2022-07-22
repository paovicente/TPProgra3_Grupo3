package modelo;

/**
 * @author Usuario
 * HomeOffice que hereda de Locacion.
 */
public class HomeOffice extends Locacion
{
	

	/**
	 * Llama al m�todo de Locacion con la que se est� comparando cuando la que invoc� originalemnte es HomeOffice.
	 */
	@Override
	public double calcularLocacion(Locacion locacion)
	{
		return locacion.homeOffice();
	}
	
	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Locacion que invoca es HomeOffice y la pasada como par�metro es HomeOffice.
	 */
	public double homeOffice()
	{
		return 1;
	}
	
	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Locacion que invoca es Presencial y la pasada como par�metro es HomeOffice.
	 */
	public double presencial()
	{
		return -1;
	}
	
	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Locacion que invoca es Indistinto y la pasada como par�metro es HomeOffice.
	 */
	public double indistinto()
	{
		return 1;
	}

	/**
	 * Muestra que la Locacion es HomeOffice.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Home Office";
	}

}
