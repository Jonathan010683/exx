package ups.edu.ec.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.dao.ProductoDAO;
import ups.edu.ec.modelo.Producto;

@Stateless
public class ProductoON {
	
	@Inject
	private ProductoDAO productoDAO;
	
	public boolean guardarProductoON(Producto producto) throws Exception{
		return productoDAO.guardarProductoDAO(producto);
	
	}
	
	public List<Producto>listarProductoON() throws Exception{
		return productoDAO.listaProductoDAO();
	}
	
	public Producto buscarProductoON(int codigo) throws Exception {
		return productoDAO.buscaProdutoDAO(codigo);
	}
}
