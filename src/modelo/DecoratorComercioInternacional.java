package modelo;

public class DecoratorComercioInternacional extends DecoratorRubros
{

	public DecoratorComercioInternacional(IPersona encapsulado)
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
		// TODO Auto-generated method stub
		return this.encapsulado.calcularComision()+0.8;
	}
	
	/**
	 * Devuelve un String con el nombre del rubro
	 */

	@Override
	public String diceRubro()
	{
		// TODO Auto-generated method stub
		return "RubroComercioInternacional";
	}

}
