package Modelos;

import java.util.ArrayList;
import java.util.List;

public class Listado {

	List<Producto> listado = null;

	public Listado() {
		listado = new ArrayList<Producto>();
	}

	public List getListado() {
		return listado;
	}

	public void addProducto(Producto E) {

		listado.add(E);

	}

	public Producto buscarProducto(String nombre) {
		for (Producto E : listado) {
			if (E.getNombre().equals(nombre)) {
				return E;
			}
		}
		return null;
	}

	public void deleteProducto(String nombre) {
		for (Producto E : listado) {
			if (E.getNombre().equals(nombre)) {
				listado.remove(E);
			}
		}
	}

	public void modProducto(Producto E, String nombre, String seccion, int stock) {
		E.modificar(nombre, seccion, stock);
	}

}
