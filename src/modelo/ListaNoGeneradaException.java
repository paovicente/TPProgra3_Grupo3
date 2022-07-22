package modelo;

public class ListaNoGeneradaException extends Exception {

	private String nombreDeUsuario;
	
	public ListaNoGeneradaException(String nombreDeUsuario) {
		super();
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	
}