package modelo;

/**
 * @author Usuario
 * Media que hereda de Experiencia
 */
public class Media extends Experiencia
{

	/**
	 * Llama al m�todo de la Experiencia con la que se est� comparando cuando la que invoc� originalemnte es Media.
	 */
	@Override
	public double calcularExperiencia(Experiencia experiencia)
	{
		return experiencia.media();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Experiencia que invoca es Nada y la pasada como par�metro es Media.
	 */
	@Override
	public double nada()
	{
		return -0.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Experiencia que invoca es Media y la pasada como par�metro es Media.
	 */
	@Override
	public double media()
	{
		return 1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Experiencia que invoca es Mucha y la pasada como par�metro es Media.
	 */
	@Override
	public double mucha()
	{
		return 1.5;
	}

	/**
	 * Muestra que la Experiencia es Media.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Media";
	}

}
