package modelo;

/**
 * @author Usuario
 * remuneracion especificada en el FormularioDeBusqueda.
 */
public abstract class Remuneracion
{
	
private double valor;
	
	public Remuneracion(double valor)
	{
		this.valor = valor;
	}
	
	
	public double getValor()
	{
		return valor;
	}
	
	/**
	 * Calcula el valor resultante de la matriz de Remuneracion en la Ronda de Encuentros Laborales.<br> 
	 * <b>Pre: </b>remuneracion no es null.<br>
	 * <b>Post: </b>Se obtiene el resultado de la matriz de Remuneracion.<br> 
	 * @param remuneracion: Remuneracion del FormularioDeBusqueda con el que se está comparando.
	 * @return Devuelve la puntuación obtenida al comparar Remuneracion de ambos FormularioDeBusqueda.
	 */
	public abstract double calcularRemuneracion(Remuneracion remuneracion);
	/**
	 * Se calcula el valor de la puntuación de Remuneracion cuando una de ellas es V1.
	 * @return: puntuación al comparar con V1.
	 */
	public abstract double v1();
	/**
	 * Se calcula el valor de la puntuación de Remuneracion cuando una de ellas es V2.
	 * @return: puntuación al comparar con V2.
	 */
	public abstract double v2();
	/**
	 * Se calcula el valor de la puntuación de Remuneracion cuando una de ellas es V3.
	 * @return: puntuación al comparar con V3.
	 */
	public abstract double v3();
	/**
	 * Dice el tipo de remuneracion.
	 * @return: String indicando la sublase de Remuneracion.
	 */
	public abstract String diceTipo();

	@Override
	public String toString() {
		return "[" + diceTipo() + "]";
	}
	
}
