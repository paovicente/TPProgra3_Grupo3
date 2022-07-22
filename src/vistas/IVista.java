package vistas;

import java.awt.event.ActionListener;

public interface IVista {
	void setActionListener(ActionListener actionListener);
	void cerrar();
	void mostrar();
}
