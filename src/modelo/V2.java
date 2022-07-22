package modelo;

/**
 * @author Usuario
 * V2 que hereda de Remuneracion
 */
public class V2 extends Remuneracion
{

	public V2()
	{
		super(80000.);
	}

	
	/**
	 * Llama al método de la Remuneracion con la que se está comparando cuando la que invocó originalemnte es V2.
	 */
	@Override
	public double calcularRemuneracion(Remuneracion remuneracion)
	{
		return remuneracion.v2();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Remuneracion que invoca es V1 y la pasada como parámetro es V2.
	 */
	@Override
	public double v1()
	{
		return 1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Remuneracion que invoca es V2 y la pasada como parámetro es V2.
	 */
	@Override
	public double v2()
	{
		return 1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Remuneracion que invoca es V3 y la pasada como parámetro es V2.
	 */
	@Override
	public double v3()
	{
		return -0.5;
	}

	/**
	 * Muestra que la Remuneracion es V2.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "80.000";
	}

}
