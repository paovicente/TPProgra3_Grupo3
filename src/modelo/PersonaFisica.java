package modelo;

public class PersonaFisica extends Persona
{

	public boolean juridica()
	{
		return false;
	}

	/**
	 * Calcula la comision a cobrar a una Persona Fisica.<br> 
	 */
	@Override
	public double calcularComision()
	{
		return 0.;
	}

	@Override
	public String diceRubro()
	{
		return "";
	}
}
