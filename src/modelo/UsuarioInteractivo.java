package modelo;

public class UsuarioInteractivo extends Usuario 
{

	private int puntaje;
	private Elecciones elecciones;

	public UsuarioInteractivo(String nombre, String nombreDeUsuario, String contrasenia)
	{
		super(nombre, nombreDeUsuario, contrasenia);
		this.puntaje = 0;
		this.elecciones = new Elecciones();
	}

	public int getPuntaje()
	{
		return puntaje;
	}

	public void setPuntaje(int puntaje)
	{
		this.puntaje = puntaje;
	}

	public Elecciones getElecciones()
	{
		return elecciones;
	}
	
	
	


}
