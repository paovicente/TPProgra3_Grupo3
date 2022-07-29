package persistencia;

import java.io.Serializable;

import modelo.Empleado;

public class EmpleadoDTO implements Serializable{
	private Empleado empleado;
	protected String nombre;
	protected String nombreDeUsuario;
	protected String contrasenia;
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	@Override
	public String toString() {
		return "EmpleadoDTO [nombre=" + nombre + ", nombreDeUsuario=" + nombreDeUsuario + ", contrasenia=" + contrasenia
				+ "]";
	}
	
	
	

}
