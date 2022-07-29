package persistencia;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Empleado;
import modelo.Empleador;
import modelo.UsuarioInteractivo;

public class UtilDTO {
	
	public static ArrayList<EmpleadoDTO> EmpleadosToDTO (ArrayList<UsuarioInteractivo> empleados) {
		Iterator <UsuarioInteractivo> iterador = empleados.iterator();
		ArrayList<EmpleadoDTO> empleadosDTO = new ArrayList<EmpleadoDTO>();
		Empleado empleado;
		
		while (iterador.hasNext()) {
			empleado = (Empleado) iterador.next();
			EmpleadoDTO empleadoDTO = new EmpleadoDTO();
			empleadoDTO.setEmpleado(empleado);
			empleadoDTO.setContrasenia(empleado.getContrasenia());
			empleadoDTO.setNombre(empleado.getNombre());
			empleadoDTO.setNombreDeUsuario(empleado.getNombreDeUsuario());
			empleadosDTO.add(empleadoDTO);
			System.out.println("Acabamos de cargar al empleado "+ empleadoDTO.toString());
		} 
		
		for (int i = 0;i<empleadosDTO.size();i++) {
			System.out.println("EmpleadosDTO: "+ empleadosDTO.get(i).toString());
		}
		return empleadosDTO;
		
		/*	int i;
		 * for ( i=0;i<empleados.size();i++) {
			empleado = (Empleado) empleados.get(i);
			empleadoDTO.setEmpleado(empleado);
			empleadoDTO.setContrasenia(empleado.getContrasenia());
			empleadoDTO.setNombre(empleado.getNombre());
			empleadoDTO.setNombreDeUsuario(empleado.getNombreDeUsuario());
			empleadosDTO.add(empleadoDTO);
			System.out.println("Acabamos de cargar al empleado "+ empleadoDTO.toString());
		} */
	}
	
	
	public static ArrayList<UsuarioInteractivo> DTOToEmpleados(ArrayList<EmpleadoDTO> empleadosDTO){
		ArrayList<UsuarioInteractivo> empleados = new ArrayList<UsuarioInteractivo>();
		Iterator <EmpleadoDTO> iterador = empleadosDTO.iterator();
		EmpleadoDTO empleadoDTO;
		while (iterador.hasNext()) {
			empleadoDTO = iterador.next();
			Empleado empleado = empleadoDTO.getEmpleado();
			empleado.setCodUsuario((byte) 1);
			empleado.setContrasenia(empleadoDTO.getContrasenia());
			empleado.setNombre(empleadoDTO.getNombre());
			empleado.setNombreDeUsuario(empleadoDTO.getNombreDeUsuario());
			empleados.add(empleado);
		}
		return empleados;
	}
	
	public static ArrayList<EmpleadorDTO> EmpleadoresToDTO (ArrayList<UsuarioInteractivo> empleadores){
		Iterator <UsuarioInteractivo> iterador = empleadores.iterator();
	//	EmpleadorDTO empleadorDTO = new EmpleadorDTO();
		ArrayList<EmpleadorDTO> empleadoresDTO = new ArrayList<EmpleadorDTO>();
		while (iterador.hasNext()) {
			EmpleadorDTO empleadorDTO = new EmpleadorDTO();
			Empleador empleador = (Empleador) iterador.next();
			empleadorDTO.setEmpleador(empleador);
			empleadorDTO.setContrasenia(empleador.getContrasenia());
			empleadorDTO.setNombre(empleador.getNombre());
			empleadorDTO.setNombreDeUsuario(empleador.getNombreDeUsuario());
			empleadoresDTO.add(empleadorDTO);
		}
		return empleadoresDTO;
	}
	
	public static ArrayList<UsuarioInteractivo> DTOToEmpleadores(ArrayList<EmpleadorDTO> empleadoresDTO){
		ArrayList<UsuarioInteractivo> empleadores = new ArrayList<UsuarioInteractivo>();
		Iterator <EmpleadorDTO> iterador = empleadoresDTO.iterator();
		EmpleadorDTO empleadorDTO;
		while (iterador.hasNext()) {
			empleadorDTO = iterador.next();
			Empleador empleador = empleadorDTO.getEmpleador();
			empleador.setCodUsuario((byte) 2);
			empleador.setContrasenia(empleadorDTO.getContrasenia());
			empleador.setNombre(empleadorDTO.getNombre());
			empleador.setNombreDeUsuario(empleadorDTO.getNombreDeUsuario());
			empleadores.add(empleador);
		}
		
		return empleadores;
	}
	
	/*public static EmpleadosDTO EmpleadosToDTO(ArrayList<UsuarioInteractivo> empleados) {
		Iterator <UsuarioInteractivo> iterador = empleados.iterator();
		EmpleadosDTO empleadosDTO= new EmpleadosDTO();
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();
			empleadosDTO.addEmpleado(empleado);
			empleadosDTO.addNombre(empleado.getNombre());
			empleadosDTO.addContrasenia(empleado.getContrasenia());
			empleadosDTO.addNombreUsuario(empleado.getNombreDeUsuario());
		}
		return empleadosDTO;
	}
	
	public static ArrayList<UsuarioInteractivo> DTOToEmpleados(EmpleadosDTO empleadosDTO){
		ArrayList<UsuarioInteractivo> empleados = new ArrayList<UsuarioInteractivo>();
		Iterator <UsuarioInteractivo> iterador = empleadosDTO.getEmpleados().iterator();
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();
			empleado.setCodUsuario((byte) 1);
			empleado.setNombre(null);
			
		}
		
		return null;
	} */

}
