package modelo;

/**
 * @author Usuario
 * rango etario especificado en el FormularioDeBusqueda.
 */
public abstract class RangoEtario
{
	/**
	 * Calcula el valor resultante de la matriz de RangoEtario en la Ronda de Encuentros Laborales.<br> 
	 * <b>Pre: </b>rangoEtario no es null.<br>
	 * <b>Post: </b>Se obtiene el resultado de la matriz de RangoEtario.<br> 
	 * @param rangoEtario: RangoEtario del FormularioDeBusqueda con el que se está comparando.
	 * @return Devuelve la puntuación obtenida al comparar RangoEtario de ambos FormularioDeBusqueda.
	 */
	public abstract double calcularRangoEtario(RangoEtario rangoEtario);
	/**
	 * Se calcula el valor de la puntuación de RangoEtario cuando uno de ellos es MenosDe40.
	 * @return: puntuación al comparar con MenosDe40.
	 */
	public abstract double menosDe40();
	/**
	 * Se calcula el valor de la puntuación de RangoEtario cuando uno de ellos es Entre40y50.
	 * @return: puntuación al comparar con Entre40y50.
	 */
	public abstract double entre40y50();
	/**
	 * Se calcula el valor de la puntuación de RangoEtario cuando uno de ellos es MasDe50.
	 * @return: puntuación al comparar con MasDe50.
	 */
	public abstract double masDe50();
	/**
	 * Dice el tipo de rango etario.
	 * @return: String indicando la sublase de RangoEtario.
	 */
	public abstract String diceTipo();
}
