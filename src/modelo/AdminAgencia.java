package modelo;

public class AdminAgencia extends Usuario
{

	public AdminAgencia(String nombre, String nombreDeUsuario, String contrasenia)
	{
		super(nombre, nombreDeUsuario, contrasenia);
		this.codUsuario=3;
	}

}
