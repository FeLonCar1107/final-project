package pulpaSAS;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Queue;


public class Planta {

	Queue<Vendedor> colaVendedores = new PriorityQueue<Vendedor>();
	
	public void agregarVendedor(Vendedor vendedor) {
		colaVendedores.add(vendedor);
	}
	
	int cant= 1; 
	public float obtenerTotalVentasPlanta() {
		float total = 0;
	    for (Vendedor vendedor : colaVendedores) {
	    	System.out.println(cant+". " + vendedor.nombre);
	    	cant++;
			total = total + vendedor.obtenerTotalVentasVendedor();
		}
	    return total;
	}
	
	public String obtenerProductoMasVendido() {
		Hashtable<String, Integer> hashProductos = new Hashtable<String, Integer>();
		
		for (Vendedor vendedor : colaVendedores) {
			for (String producto : vendedor.ListaProductos) {
				int cant = 1;
				if (hashProductos.containsKey(producto)) {
					cant = hashProductos.get(producto);
					cant++;
				}
				hashProductos.put(producto, cant);
			}
		}
		int mayor = 0;
		String productoMasVendido = "";
		
		Enumeration<String> enumeration = hashProductos.keys();
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			 if (hashProductos.get(key) > mayor) {
				mayor = hashProductos.get(key);
				productoMasVendido = key;
			}
			
		}
		
		return productoMasVendido;
	}
}
