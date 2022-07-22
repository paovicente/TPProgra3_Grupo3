package modelo;

/**
 * @author Usuario
 * MasDe50 que hereda de RangoEtario.
 */
public class MasDe50 extends RangoEtario
{

	/**
	 * Llama al método de RangoEtario con el que se está comparando cuando el que invocó originalemnte es MasDe50.
	 */
	@Override
	public double calcularRangoEtario(RangoEtario rangoEtario)
	{
		return rangoEtario.masDe50();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el RangoEtario que invoca es MenosDe40 y el pasado como parámetro es MasDe50.
	 */
	@Override
	public double menosDe40()
	{
		return -1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el RangoEtario que invoca es Entre40y50 y el pasado como parámetro es MasDe50.
	 */
	@Override
	public double entre40y50()
	{
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el RangoEtario que invoca es MasDe50 y el pasado como parámetro es MasDe50.
	 */
	@Override
	public double masDe50()
	{
		return 1.0;
	}

	/**
	 * Muestra que el Rango Etario es MasDe50.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Mas de 50";
	}

}
