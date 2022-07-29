package modelo;

import java.io.Serializable;

public abstract class DecoratorRubros implements IPersona, Serializable{
    protected IPersona encapsulado;

	public DecoratorRubros(IPersona encapsulado)
	{
		super();
		this.encapsulado = encapsulado;
	}
    
    
}
