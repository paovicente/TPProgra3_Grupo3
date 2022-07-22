package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Ticket implements Serializable
{
    /**
     * @aggregation composite
     */
    private transient FormularioDeBusqueda formulario; //transient para que no lo persista 
	private transient LocalDate fecha;             //si quisiera persistir estos objetos deberia hacerlos serializables junto con todos sus atributos
	private transient IState estado;
	private Lista lista;

	public Ticket(FormularioDeBusqueda formulario)
	{
		super();
		this.formulario = formulario;
		this.fecha = LocalDate.now();	//le pone la fecha actual del sistema
		this.estado = new ActivoState(this);
	}

	public FormularioDeBusqueda getFormulario()
	{
		return formulario;
	}

	public void setFormulario(FormularioDeBusqueda formulario)
	{
		this.formulario = formulario;
	}

	public IState getEstado()
	{
		return estado;
	}

	public void setEstado(IState estado)
	{
		this.estado = estado;
	}

	public abstract Lista getLista();

	public void setLista(Lista lista){
		this.lista = lista;
	}
    
    
    /**
	 * Cambia el estado del ticket a activado.<br> 
	 * 
	 */
    
    public void activa()
    {
    	this.estado.activa();
    }
    
    /**
	 * Cambia el estado del ticket a suspendido.<br> 
	 * 
	 */
    
    public void suspende()
    {
    	this.estado.suspende();
    }
    
    /**
	 * Cambia el estado del ticket a cancelado.<br> 
	 * 
	 */
    
    public void cancela()
    {
    	this.estado.cancela();
    }
    
    /**
	 * Cambia el estado del ticket a finalizado.<br> 
	 * 
	 */
    
    public void finaliza()
    {
    	this.estado.finaliza();
    }
    
    /**
	 * Retorna un string con el nombre del estado.<br> 
	 * 
	 */
    
    public String diceEstado()
    {
    	return this.estado.diceEstado();
    }

	@Override
	public String toString()
	{
		return "Ticket [" + this.formulario.toString() + ", fecha=" + this.fecha + ", estado=" + this.estado + "]";
	}

}
