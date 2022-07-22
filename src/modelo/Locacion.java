package modelo;

/**
 * @author Usuario
 * La locacion especificada en el FormularioDeBusqueda.
 */
public abstract class Locacion
{ 
	/**
	 * Calcula el valor resultante de la matriz de Locacion en la Ronda de Encuentros Laborales.<br> 
	 * <b>Pre: </b>locacion no es null.<br>
	 * <b>Post: </b>Se obtiene el resultado de la matriz de Locacion.<br> 
	 * @param locacion: Locacion del FormularioDeBusqueda con el que se est� comparando.
	 * @return Devuelve la puntuaci�n obtenida al comparar Locacion de ambos FormularioDeBusqueda.
	 */
	public abstract double calcularLocacion(Locacion locacion);
	/**
	 * Se calcula el valor de la puntuaci�n de Locacion cuando una de ellas es HomeOffice.
	 * @return: puntuaci�n al comparar con HomeOffice.
	 */
	public abstract double homeOffice();
	/**
	 * Se calcula el valor de la puntuaci�n de Locacion cuando una de ellas es Indistinto.
	 * @return: puntuaci�n al comparar con Indistinto.
	 */
	public abstract double indistinto();
	/**
	 * Se calcula el valor de la puntuaci�n de Locacion cuando una de ellas es Presencial.
	 * @return: puntuaci�n al comparar con Presencial.
	 */
	public abstract double presencial();
	/**
	 * Dice el tipo de locacion.
	 * @return: String indicando la sublase de Locacion.
	 */
	public abstract String diceTipo();
}
