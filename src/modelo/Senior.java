package modelo;

/**
 * @author Usuario
 *Clase Senior que hereda de TipoPuesto
 */
public class Senior extends TipoPuesto
{

	private double comision = 0.9;
	
	/**
	 *M�todo que calcula las coincidencias laborales (espec�ficamente del TipoPuesto) usando el patr�n double dispatch<br>
	 *<b> Pre: </b>El TipoPuesto recibido como par�metro no debe ser null.<br>
	 *<b> Post: </b> Se calcul� la coincidencia laboral entre el TipoPuesto que invoca y el TipoPuesto pasado como par�metro<br>
	 *@param tipoPuesto: par�metro que representa el TipoPuesto con el cual se comparar� el TipoPuesto que invoca <br>
	 *@return double: informando el valor de coincidencia que tuvo el TipoPuesto que invoca con el TipoPuesto pasado como par�metro <br> 
	 */
	@Override
	public double calcularTipoPuesto(TipoPuesto tipoPuesto)
	{
		return tipoPuesto.senior();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el TipoPuesto que invoca es Junior y el pasado como par�metro es Senior.
	 */
	@Override
	public double junior()
	{
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el TipoPuesto que invoca es Senior y el pasado como par�metro es Senior.
	 */
	@Override
	public double senior()
	{
		return 1;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el TipoPuesto que invoca es Management y el pasado como par�metro es Senior.
	 */
	@Override
	public double management()
	{
		return -0.5;
	}

	/**
	 * Muestra que TipoPuesto es Senior.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Senior";
	}

}
