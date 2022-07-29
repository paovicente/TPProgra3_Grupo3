package modelo;

import java.io.Serializable;

/**
 * @author Usuario
 * Son los estudios cursados especificados en el FormularioDeBusqueda
 */
public abstract class EstudiosCursados implements Serializable
{
	/**
	 * Calcula el valor resultante de la matriz de Estudios Cursados en la Ronda de Encuentros Laborales.<br> 
	 * <b>Pre: </b>estudiosCursados no es null.<br>
	 * <b>Post: </b>Se obtiene el resultado de la matriz de Estudios Cursados.<br> 
	 * @param estudiosCursados: EstudiosCursados del FormularioDeBusqueda con el que se está comparando.
	 * @return Devuelve la puntuación obtenida al comparar EstudiosCursados de ambos FormularioDeBusqueda.
	 */
	public abstract double calcularEstudiosCursados(EstudiosCursados estudiosCursados);
	/**
	 * Se calcula el valor de la puntuación de EstudiosCursados cuando uno de ellos es Primario.
	 * @return: puntuación al comparar con Primario.
	 */
	public abstract double primario();
	/**
	 * Se calcula el valor de la puntuación de EstudiosCursados cuando uno de ellos es Secundario.
	 * @return: puntuación al comparar con Secundario.
	 */
	public abstract double secundario();
	/**
	 * Se calcula el valor de la puntuación de EstudiosCursados cuando uno de ellos es Terciario.
	 * @return: puntuación al comparar con Terciario.
	 */
	public abstract double terciario();
	/**
	 * Dice el tipo de Estudios Cursados.
	 * @return: String indicando la sublase de Estudios Cursados.
	 */
	public abstract String diceTipo();
	
	@Override
	public String toString() {
		return "[" + diceTipo() + "]";
	}
	
}
