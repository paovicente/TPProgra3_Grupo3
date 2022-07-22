package modelo;

public class ContraseniaIncorrectaException extends Exception{

	private String nombreDeUsuario;
	private String contrasenia;

	public ContraseniaIncorrectaException(String nombreDeUsuario, String contrasenia){
		super();
		this.nombreDeUsuario = nombreDeUsuario;
		this.contrasenia = contrasenia;
	}

	public String getNombreDeUsuario(){
		return nombreDeUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}
}
