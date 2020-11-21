package pulpaSAS;

import java.util.ArrayList;

public class Vendedor implements Comparable<Vendedor> {

    /*public Vendedor(String nombre, int id, ArrayList<String> ListaProductos) {
		this.nombre = nombre;
		this.id = id;
		this.ListaProductos = ListaProductos;
	}*/
	
	
	public String nombre;
	public int id;
	public int numeroVentas;
	ArrayList<String> ListaProductos = new ArrayList<>();
	
	public int prioridad = ListaProductos.size();
	
	public int compareTo(Vendedor otroVendedor) {
		return -1;
	} 
	
	
	public float obtenerTotalVentasVendedor() {
		float total = 0;
		total = 2000 * ListaProductos.size();
		return total;
	}
}
