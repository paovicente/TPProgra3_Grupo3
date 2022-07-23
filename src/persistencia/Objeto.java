package persistencia;

import java.io.Serializable;
import java.util.ArrayList;

//import paquete.Contrataciones;
import modelo.UsuarioInteractivo;

public class Objeto implements Serializable{
	private ArrayList<UsuarioInteractivo> empleados;
	private ArrayList<UsuarioInteractivo> empleadores;
	//private ArrayList<Contrataciones> contrataciones;
	
	
	
	/*public Objeto(ArrayList<UsuarioInteractivo> empleados, ArrayList<UsuarioInteractivo> empleadores,
			ArrayList<Contrataciones> contrataciones) {
		super();
		this.empleados = empleados;
		this.empleadores = empleadores;
		this.contrataciones = contrataciones;
	} */

	public Objeto(ArrayList<UsuarioInteractivo> empleados, ArrayList<UsuarioInteractivo> empleadores) {
		super();
		this.empleados = empleados;
		this.empleadores = empleadores;
	}

	public Objeto() {
		super();
	}

	public ArrayList<UsuarioInteractivo> getEmpleados() {
		return empleados;
	}

	public ArrayList<UsuarioInteractivo> getEmpleadores() {
		return empleadores;
	}

//	public ArrayList<Contrataciones> getContrataciones() {
	//	return contrataciones;
	//}

	//@Override
	//public String toString() {
	//	return "Objeto [empleados=" + empleados + ", empleadores=" + empleadores + ", contrataciones=" + contrataciones
	//			+ "]";
	//}
	
	
	
}