package modelo;

/**
 * @author Usuario
 * Carga Completa que hereda de Carga Horaria.
 */
public class CargaCompleta extends CargaHoraria
{

	/**
	 * Llama al método de la CargaHoraria con la que se está comparando cuando la que invocó originalmente es Completa.
	 */
	public double calcularCargaHoraria(CargaHoraria cargahoraria)
	{
		return cargahoraria.completa();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Media y la pasada como parámetro es Completa.
	 */
	@Override
	public double media()
	{
		// TODO Auto-generated method stub
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Completa y la pasada como parámetro es Completa.
	 */
	@Override
	public double completa()
	{
		// TODO Auto-generated method stub
		return 1;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la CargaHoraria que invoca es Extendida y la pasada como parámetro es Completa.
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
