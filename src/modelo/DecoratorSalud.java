package modelo;

public class DecoratorSalud extends DecoratorRubros
{
	
	public DecoratorSalud(IPersona encapsulado)
	{
		super(encapsulado);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calcula la comision a cobrar al Empleador
	 */
	
	@Override
	public double calcularComision()
	{
		return this.encapsulado.calcularComision()+0.6;
	}
	
	/**
	 * Devuelve un String con el nombre del rubro
	 */

	@Override
	public String diceRubro()
	{
		return "RubroSalud";
	}

}
