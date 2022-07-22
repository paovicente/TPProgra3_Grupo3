package modelo;

import java.io.Serializable;

public class TicketBuscaEmpleo extends Ticket implements Serializable
{
	private boolean exito;

    /**
     * @aggregation composite
     */
    private ListaDelEmpleado lista;

	public TicketBuscaEmpleo(FormularioDeBusqueda formulario)
	{
		super(formulario);
		this.exito = false;
		this.lista = new ListaDelEmpleado();
	}
	
	public boolean isExito()
	{
		return exito;
	}

	public void setExito(boolean exito){
		this.exito = exito;
	}
	
	public ListaDelEmpleado getLista(){
		return this.lista;
	}

	public void setLista(ListaDelEmpleado lista){
		this.lista = lista;
	}

	@Override
	public String toString() {
		return super.toString()+"TicketBuscaEmpleo [exito=" + exito + "]";
	}
	
}
