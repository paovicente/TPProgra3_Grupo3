package modelo;

public class PersonaJuridica extends Persona{

	
	public boolean juridica() {
		return true;
	}

	/**
	 * Calcula la comision a cobrar a una Persona Juridica.<br> 
	 */
	@Override
	public double calcularComision()
	{
		return 0.2;
	}

	@Override
	public String diceRubro()
	{
		return "";
	}
	
}
