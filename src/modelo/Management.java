package modelo;

/**
 * @author Usuario
 * Management que hereda de TipoPuesto
 */
public class Management extends TipoPuesto
{
    private double comision = 1.;
	
	/**
	 * Llama al método de TipoPuesto con el que se está comparando cuando el que invocó originalemnte es Management.
	 */
	@Override
	public double calcularTipoPuesto(TipoPuesto tipoPuesto)
	{
		return tipoPuesto.management();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el TipoPuesto que invoca es Junior y el pasado como parámetro es Management.
	 */
	@Override
	public double junior()
	{
		return -1.;
	}

	/**
	  * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el TipoPuesto que invoca es Senior y el pasado como parámetro es Management.
	 */
	@Override
	public double senior()
	{
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando el TipoPuesto que invoca es Management y el pasado como parámetro es Management.
	 */
	@Override
	public double management()
	{
		return 1.0;
	}

	/**
	 * Muestra que el TipoPuesto es Management.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Management";
	}

}
