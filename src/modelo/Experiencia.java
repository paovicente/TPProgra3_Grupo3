package modelo;

/**
 * @author Usuario
 * La experiencia especificada en el FormularioDeBusqueda.
 */
public abstract class Experiencia
{
	/**
	 * Calcula el valor resultante de la matriz de Experiencia en la Ronda de Encuentros Laborales.<br> 
	 * <b>Pre: </b>experiencia no es null.<br>
	 * <b>Post: </b>Se obtiene el resultado de la matriz de Experiencia.<br> 
	 * @param experiencia: Experiencia del FormularioDeBusqueda con el que se está comparando.
	 * @return Devuelve la puntuación obtenida al comparar Experiencia de ambos FormularioDeBusqueda.
	 */
	public abstract double calcularExperiencia(Experiencia experiencia);
	/**
	 * Se calcula el valor de la puntuación de Experiencia cuando una de ellas es Nada.
	 * @return: puntuación al comparar con Nada.
	 */
	public abstract double nada();
	/**
	 * Se calcula el valor de la puntuación de Experiencia cuando una de ellas es Media.
	 * @return: puntuación al comparar con Media.
	 */
	public abstract double media();
	/**
	 * Se calcula el valor de la puntuación de Experiencia cuando una de ellas es Mucha.
	 * @return: puntuación al comparar con Mucha.
	 */
	public abstract double mucha();
	/**
	 * Dice el tipo de experiencia.
	 * @return: String indicando la sublase de Experiencia.
	 */
	public abstract String diceTipo();
	
	@Override
	public String toString() {
		return "[" + diceTipo() + "]";
	}
	
}
