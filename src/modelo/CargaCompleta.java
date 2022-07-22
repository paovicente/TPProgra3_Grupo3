package modelo;

/**
 * @author Usuario
 * Carga Completa que hereda de Carga Horaria.
 */
public class CargaCompleta extends CargaHoraria
{

	/**
	 * Llama al m�todo de la CargaHoraria con la que se est� comparando cuando la que invoc� originalmente es Completa.
	 */
	public double calcularCargaHoraria(CargaHoraria cargahoraria)
	{
		return cargahoraria.completa();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Media y la pasada como par�metro es Completa.
	 */
	@Override
	public double media()
	{
		// TODO Auto-generated method stub
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Completa y la pasada como par�metro es Completa.
	 */
	@Override
	public double completa()
	{
		// TODO Auto-generated method stub
		return 1;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Extendida y la pasada como par�metro es Completa.
	 */
	@Override
	public double extendida()
	{
		// TODO Auto-generated method stub
		return -0.5;
	}

	/**
	 * Muestra que la Carga Horaria es Completa.
	 */
	@Override
	public String diceTipo()
	{
		return "Carga Completa";
	}

}
