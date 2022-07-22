package modelo;

public abstract class DecoratorRubros implements IPersona{
    protected IPersona encapsulado;

	public DecoratorRubros(IPersona encapsulado)
	{
		super();
		this.encapsulado = encapsulado;
	}
    
    
}
