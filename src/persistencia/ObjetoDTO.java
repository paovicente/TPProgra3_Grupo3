package persistencia;

import java.io.Serializable;
import java.util.ArrayList;

public class ObjetoDTO implements Serializable {
	private ArrayList<EmpleadoDTO> empleados;
	private ArrayList<EmpleadorDTO> empleadores;
	
	public ObjetoDTO(ArrayList<EmpleadoDTO> empleados, ArrayList<EmpleadorDTO> empleadores) {
		super();
		this.empleados = empleados;
		this.empleadores = empleadores;
	}
	
	public ArrayList<EmpleadoDTO> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<EmpleadoDTO> empleados) {
		this.empleados = empleados;
	}
	public ArrayList<EmpleadorDTO> getEmpleadores() {
		return empleadores;
	}
	public void setEmpleadores(ArrayList<EmpleadorDTO> empleadores) {
		this.empleadores = empleadores;
	}
	
	
	
	
	

}
