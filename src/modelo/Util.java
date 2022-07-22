package modelo;

import java.util.Random;

public class Util
{
	private static Random r = new Random();

	
	/**
	 * El thread que en el que se invoca se detiene unos milisegundos<br>
	 * <b>Pre: </b>num debe ser natural o cero<br>
	 * <b>Post: </b>llama a la funcion sleep o lanza la excepcion InterruptedException.<br>
	 * 
	 * @param num: limite de milisegundos a esperar<br>
	 */
	public static void espera(int num)
	{
		try
		{
			Thread.sleep(r.nextInt(num));
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}