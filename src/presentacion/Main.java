package presentacion;

import modelo.DecoratorComercioInternacional;
import modelo.DecoratorComercioLocal;
import modelo.DecoratorSalud;
import modelo.Empleado;
import modelo.Empleador;
import modelo.FormularioDeBusqueda;
import modelo.HomeOffice;
import modelo.Indistinto;
import modelo.PersonaFisica;
import modelo.PersonaJuridica;
import modelo.Presencial;
import modelo.TicketBuscaEmpleo;
import negocio.Sistema;

public class Main {
	public static void main(String[] args) {
		ControladorPersistencia controladorPersistencia = new ControladorPersistencia();
		//ControladorThreads controladorThreads = new ControladorThreads();
		Controlador controlador = new Controlador();
		
	}
}
