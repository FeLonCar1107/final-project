package pulpaSAS;



public class TreeVendedor {
	
	NodoVendedor root;
	int cantVendedores;
	int mayor = 0;
	float sumaTarifa = 0;

     public void addVendedor(Vendedor newVendedor) {
	
    	 if (root == null) {
 			
 			root = new NodoVendedor(newVendedor);
 	        sumaTarifa = sumaTarifa + newVendedor.obtenerTotalVentasVendedor();
 	        cantVendedores++;
 	        if (newVendedor.ListaProductos.size() > mayor) {
 				mayor = newVendedor.ListaProductos.size();
 			}
 			return;
 			
 		}else 
 		
 		addVendedor(root,newVendedor);
 	}
 	
 	private void addVendedor(NodoVendedor nodo, Vendedor newVendedor) {
 		
 		if (nodo == null) {
 			return;
 		}
 		if(newVendedor.id > nodo.vendedor.id) {
 			
 		   if(nodo.right == null) {
 			nodo.right = new NodoVendedor(newVendedor);
 			sumaTarifa = sumaTarifa + newVendedor.obtenerTotalVentasVendedor();
 			cantVendedores++;
 			 if (newVendedor.ListaProductos.size() > mayor) {
 					mayor = newVendedor.ListaProductos.size();
 				}

 		   }
 		   else {
 			addVendedor(nodo.right, newVendedor);
 		   }
 	    }
 	       else if(newVendedor.id < nodo.vendedor.id) {
 	    	        
 	    	        if(nodo.left == null) {
 			        nodo.left = new NodoVendedor(newVendedor);
 			        sumaTarifa = sumaTarifa + newVendedor.obtenerTotalVentasVendedor();
 			        cantVendedores++;
 			        if (newVendedor.ListaProductos.size() > mayor) {
 						mayor = newVendedor.ListaProductos.size();
 					}
 	                
 	    	        }
 		             else {
 			               addVendedor(nodo.left, newVendedor);
 		            }
 	       }
 		else {
 		}
 	   }
    	
     public int obtenerMayor() {
 		int total = 0;
 	    total = total + mayor;
 		return total;
 	}
	
}
