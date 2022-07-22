package modelo;

/**
 * @author Usuario
 * La carga horaria especificada en el FormularioDeBusqueda
 *
 */
public abstract class CargaHoraria
{
	/**
	 * Calcula el valor resultante de la matriz de Carga Horaria en la Ronda de Encuentros Laborales.<br> 
	 * <b>Pre: </b>cargahoraria no es null.<br>
	 * <b>Post: </b>Se obtiene el resultado de la matriz de Carga Horaria.<br> 
	 * @param cargahoraria: CargaHoraria del FormularioDeBusqueda con el que se está comparando.
	 * @return Devuelve la puntuación obtenida al comparar CargaHoraria de ambos FormularioDeBusqueda.
	 */
	public abstract double calcularCargaHoraria(CargaHoraria cargahoraria);
	/**
	 * Se calcula el valor de la puntuación de CargaHoraria cuando una de ellas es Media.
	 * @return: puntuación al comparar con Media.
	 */
	public abstract double media();
	/**
	 * Se calcula el valor de la puntuación de CargaHoraria cuando una de ellas es Completa.
	 * @return: puntuación al comparar con Completa.
	 */
	public abstract double completa();
	/**
	  * Se calcula el valor de la puntuación de CargaHoraria cuando una de ellas es Extendida.
	 * @return: puntuación al comparar con Extendida.
	 */
	public abstract double extendida();
	/**
	 * Dice el tipo de carga horaria.
	 * @return: String indicando la sublase de CargaHoraria.
	 */
	public abstract String diceTipo();

}
