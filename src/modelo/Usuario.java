package modelo;

public class Usuario 
{
	protected String nombre;
	protected String nombreDeUsuario;
	protected String contrasenia;
	protected byte codUsuario;
	
	public Usuario() {
		super();
	}
	
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public void setCodUsuario(byte codUsuario) {
		this.codUsuario = codUsuario;
	}
	
	
	
}
