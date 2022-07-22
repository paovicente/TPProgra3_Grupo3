package presentacion;

import negocio.Sistema;

public class Main {
	public static void main(String[] args) {
		Sistema sistema = Sistema.getInstancia();
		Controlador controlador = new Controlador();
	}
}
