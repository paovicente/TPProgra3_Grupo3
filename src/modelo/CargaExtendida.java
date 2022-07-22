package modelo;

/**
 * @author Usuario
 * Carga Extendida que hereda de Carga Horaria.
 */
public class CargaExtendida extends CargaHoraria
{

	/**
	 * Llama al m�todo de la CargaHoraria con la que se est� comparando cuando la que invoc� originalemnte es Extendida.
	 */
	public double calcularCargaHoraria(CargaHoraria cargahoraria)
	{
		return cargahoraria.extendida();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Media y la pasada como par�metro es Extendida.
	 */
	@Override
	public double media()
	{
		return -1;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Completa y la pasada como par�metro es Extendida.
	 */
	@Override
	public double completa()
	{
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Extendida y la pasada como par�metro es Extendida.
	 */
	@Override
	public double extendida()
	{
		return 1;
	}

	/**
	 * Muestra que la Carga Horaria es Extendida.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Carga Extendida";
	}

}
