package pulpaSAS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;


public class Program {


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		TreeVendedor tree = new TreeVendedor();
		
		Planta planta = new Planta();
		
		/*BufferedReader bf = new BufferedReader(new FileReader("datos-pulpaSAS.txt"));
		
		 int vendedores = Integer.parseInt(bf.readLine());
		 
		 String[] arrDataVendedores;
		 
		 for(int i=0; i<vendedores; i++) {
				arrDataVendedores = bf.readLine().split(",");
				Vendedor v = new Vendedor(arrDataVendedores[0],Integer.parseInt(arrDataVendedores[1]),(ArrayList<String>) Arrays.asList(arrDataVendedores[2]));
				planta.agregarVendedor(v);
				tree.addVendedor(v);
		 }*/
		

		Vendedor v1 = new Vendedor();
		v1.nombre = "Felipe";
		v1.id = 11;
		v1.ListaProductos.add("Piña");
		v1.ListaProductos.add("Fresa");
		v1.ListaProductos.add("Mora");
		planta.agregarVendedor(v1);
		tree.addVendedor(v1);
		
		Vendedor v2 = new Vendedor();
		v2.nombre = "Sebastian";
		v2.id = 2;
		v2.ListaProductos.add("Piña");
		v2.ListaProductos.add("Guanabana");
		v2.ListaProductos.add("Mora");
		v2.ListaProductos.add("Lulo");
		v2.ListaProductos.add("Maracuya");
		planta.agregarVendedor(v2);
		tree.addVendedor(v2);
		
		System.out.println("Lista de mejores vendedores:");
		System.out.println("Total recaudado por la empresa: " + planta.obtenerTotalVentasPlanta());
		System.out.println("El producto mas vendido es: " + planta.obtenerProductoMasVendido());
		System.out.println("El mayor numero de ventas es: " + tree.obtenerMayor());
		
		
		
	}

}
