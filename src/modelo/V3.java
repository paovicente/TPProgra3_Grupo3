package modelo;

/**
 * @author Usuario
 * V3 que hereda de Remuneracion
 */
public class V3 extends Remuneracion
{
	
	
	public V3()
	{
		super(120000.);
	}


	/**
	 * Llama al m�todo de la Remuneracion con la que se est� comparando cuando la que invoc� originalemnte es V3.
	 */
	@Override
	public double calcularRemuneracion(Remuneracion remuneracion)
	{
		return remuneracion.v3();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Remuneracion que invoca es V1 y la pasada como par�metro es V3.
	 */
	@Override
	public double v1()
	{
		return 1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Remuneracion que invoca es V2 y la pasada como par�metro es V3.
	 */
	@Override
	public double v2()
	{
		return 1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Remuneracion que invoca es V3 y la pasada como par�metro es V3.
	 */
	@Override
	public double v3()
	{
		return 1.;
	}

	/**
	 * Muestra que la Remuneracion es V2.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "120.000";
	}

}
