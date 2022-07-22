package modelo;

public class Usuario 
{
	protected String nombre;
	protected String nombreDeUsuario;
	protected String contrasenia;
	protected byte codUsuario;
	
	public Usuario(String nombre, String nombreDeUsuario, String contrasenia)
	{
		super();
		this.nombre = nombre;
		this.nombreDeUsuario = nombreDeUsuario;
		this.contrasenia = contrasenia;
	}
	
	public byte getCodUsuario() {
		return codUsuario;
	}

	public String getNombre()
	{
		return nombre;
	}

	public String getNombreDeUsuario()
	{
		return nombreDeUsuario;
	}

	public String getContrasenia()
	{
		return contrasenia;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", nombreDeUsuario=" + nombreDeUsuario + ", contrasenia=" + contrasenia
				+ ", codUsuario=" + codUsuario + "]";
	}
	
	
}
