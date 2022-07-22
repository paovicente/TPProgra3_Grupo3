package modelo;

/**
 * @author Usuario
 *Clase Nada que hereda de Experiencia
 */
public class Nada extends Experiencia
{

	/**
	 *Método que calcula las coincidencias laborales (específicamente de la Experiencia) usando el patrón double dispatch<br>
	 *<b> Pre: </b>La Experiencia recibida como parámetro no debe ser null.<br>
	 *<b> Post: </b> Se calculó la coincidencia laboral entre la Experiencia que invoca y la Experiencia pasada como parámetro<br>
	 *@param experiencia: parámetro que representa la Experiencia con la cual se comparará la Experiencia que invoca <br>
	 *@return double: informando el valor de coincidencia que tuvo la Experiencia que invoca con la Experiencia pasada como parámetro <br> 
	 */
	@Override
	public double calcularExperiencia(Experiencia experiencia)
	{
		return experiencia.nada();
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Experiencia que invoca es Nada y la pasada como parámetro es Nada.
	 */
	@Override
	public double nada()
	{
		return 1.;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Experiencia que invoca es Media y la pasada como parámetro es Nada.
	 */
	@Override
	public double media()
	{
		return 1.5;
	}

	/**
	 * Devuelve el resultado de la matriz de Ronda de Encuentros Laborales cuando la Experiencia que invoca es Mucha y la pasada como parámetro es Nada.
	 */
	@Override
	public double mucha()
	{
		return 2;
	}

	/**
	 * Muestra que la Experiencia es Nada.
	 */
	@Override
	public String diceTipo()
	{
		// TODO Auto-generated method stub
		return "Nada";
	}

}
