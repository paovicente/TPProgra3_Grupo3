package modelo;

/**
 * @author Usuario
 * CargaMedia que herda de CargaHoraria
 */
public class CargaMedia extends CargaHoraria
{

	/**
	 * Llama al m�todo de la CargaHoraria con la que se est� comparando cuando la que invoc� originalemnte es Media.
	 */
	@Override
	public double calcularCargaHoraria(CargaHoraria cargahoraria)
	{
		return cargahoraria.media();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Media y la pasada como par�metro es Media.
	 */
	@Override
	public double media()
	{
		// TODO Auto-generated method stub
		return 1;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Completa y la pasada como par�metro es Media.
	 */
	@Override
	public double completa()
	{
		// TODO Auto-generated method stub
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Extendida y la pasada como par�metro es Media.
	 */
	@Override
	public double extendida()
	{
		// TODO Auto-generated method stub
		return -1;
	}

	/**
	 * Muestra que la Carga Horaria es Media.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Carga Media";
	}

}
