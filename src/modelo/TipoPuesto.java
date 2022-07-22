package modelo;

/**
 * @author Usuario
 * Tipo de Puesto especificado en el FormularioDeBusqueda.
 */
public abstract class TipoPuesto
{
	private double comision;
	/**
	 * Calcula el valor resultante de la matriz de TipoPuesto en la Ronda de Encuentros Laborales.<br> 
	 * <b>Pre: </b>tipoPuesto no es null.<br>
	 * <b>Post: </b>Se obtiene el resultado de la matriz de TipoPuesto.<br> 
	 * @param tipoPuesto: TipoPuesto del FormularioDeBusqueda con el que se está comparando.
	 * @return Devuelve la puntuación obtenida al comparar TipoPuesto de ambos FormularioDeBusqueda.
	 */
	public abstract double calcularTipoPuesto(TipoPuesto tipoPuesto);

	/**
	 * Se calcula el valor de la puntuación de TipoPuesto cuando uno de ellos es Junior.
	 * @return: puntuación al comparar con Junior.
	 */
	public abstract double junior();
	/**
	 * Se calcula el valor de la puntuación de TipoPuesto cuando uno de ellos es Senior.
	 * @return: puntuación al comparar con Senior.
	 */
	public abstract double senior();
	/**
	 * Se calcula el valor de la puntuación de TipoPuesto cuando uno de ellos es Management.
	 * @return: puntuación al comparar con Management.
	 */
	public abstract double management();
	/**
	 * Dice el tipo del tipo de puesto.
	 * @return: String indicando la sublase de TipoPuesto.
	 */
	public abstract String diceTipo();
	
	public double getComision()
	{
		return this.comision;
	}
}
