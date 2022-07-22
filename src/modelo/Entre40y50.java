package modelo;

/**
 * @author Usuario
 * Entre50y40 que hereda de RangoEtario
 */
public class Entre40y50 extends RangoEtario
{

	/**
	 * Llama al método de RangoEtario con el que se está comparando cuando el que invocó originalemnte es Entre40y50.
	 */
	@Override
	public double calcularRangoEtario(RangoEtario rangoEtario)
	{
		return rangoEtario.entre40y50();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el RangoEtario que invoca es MenosDe40 y el pasado como parámetro es Entre40y50.
	 */
	@Override
	public double menosDe40()
	{
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el RangoEtario que invoca es Entre40y50 y el pasado como parámetro es Entre40y50.
	 */
	@Override
	public double entre40y50()
	{
		// TODO Auto-generated method stub
		return 1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el RangoEtario que invoca es MasDe50 y el pasado como parámetro es Entre40y50.	 
	 */
	@Override
	public double masDe50()
	{
		// TODO Auto-generated method stub
		return -0.5;
	}

	/**
	 * Muestra que el Rango Etario es Entre40y50.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Entre 40 y 50";
	}

}
