package pulpaSAS;

public class NodoVendedor {

	public NodoVendedor(Vendedor newVendedor) {
		this.vendedor = newVendedor;
	}
	
	Vendedor vendedor;
	NodoVendedor left;
	NodoVendedor right;
	
}
