package modelo;

/**
 * @author Usuario
 * Clase Menosde40 que hereda de RangoEtario
 *
 */
public class MenosDe40 extends RangoEtario
{

	/**
	 *M�todo que calcula las coincidencias laborales (espec�ficamente del rangoEtario) usando el patr�n double dispatch<br>
	 *<b> Pre: </b>El RangoEtario recibido como par�metro no debe ser null.<br>
	 *<b> Post: </b> Se calcul� la coincidencia laboral entre el RangoEtario que invoca y el RangoEtario pasado como par�metro<br>
	 *@param rangoEtario: par�metro que representa el RangoEtario con el cual se comparar� el RangoEtario que invoca <br>
	 *@return double: informando el valor de coincidencia que tuvo el RangoEtario que invoca con el RangoEtario pasado como par�metro <br> 
	 */
	@Override
	public double calcularRangoEtario(RangoEtario rangoEtario)
	{
		return rangoEtario.menosDe40();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el RangoEtario que invoca es MenosDe40 y el pasado como par�metro es MenosDe40.
	 */
	@Override
	public double menosDe40()
	{
		return 1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el RangoEtario que invoca es Entre40y50 y el pasado como par�metro es MenosDe40.
	 */
	@Override
	public double entre40y50()
	{
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el RangoEtario que invoca es masDe50 y el pasado como par�metro es MenosDe40.
	 */
	@Override
	public double masDe50()
	{
		return -1.;
	}

	/**
	 * Muestra que el RangoEtario es MenosDe40.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Menos de 40";
	}

}
