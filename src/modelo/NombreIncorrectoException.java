package modelo;


public class NombreIncorrectoException extends Exception{
    
	private String nombreDeUsuario;

	public NombreIncorrectoException(String nombreDeUsuario){
		super();
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getNombreDeUsuario(){
		return nombreDeUsuario;
	}
       
}
