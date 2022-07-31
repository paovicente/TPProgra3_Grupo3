package modelo;

public class NombreDeUsuarioDuplicadoException extends Exception
{
    private String nombreDeUsuario;

	public NombreDeUsuarioDuplicadoException(String nombreDeUsuario)
	{
		super();
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getNombreDeUsuario()
	{
		return nombreDeUsuario;
	}
    
    
}
