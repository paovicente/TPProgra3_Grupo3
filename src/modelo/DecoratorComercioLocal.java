package modelo;

public class DecoratorComercioLocal extends DecoratorRubros
{

	public DecoratorComercioLocal(IPersona encapsulado)
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
		return this.encapsulado.calcularComision()+0.7;
	}
	
	/**
	 * Devuelve un String con el nombre del rubro
	 */

	@Override
	public String diceRubro()
	{
		// TODO Auto-generated method stub
		return "RubroComercioLocal";
	}

}
