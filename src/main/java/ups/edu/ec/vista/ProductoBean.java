package ups.edu.ec.vista;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ups.edu.ec.modelo.Producto;
import ups.edu.ec.negocio.ProductoON;

@ManagedBean
@ApplicationScoped
public class ProductoBean {
	
	@Inject
	private ProductoON productoON;
	
	private Producto producto;
	private List<Producto> listProducto;
	
	
	
	@PostConstruct
	public void init() {
		producto = new Producto();
		listProducto = new ArrayList<>();
	}
	
	
	
	public Producto getProducto() {
		return producto;
	}



	public void setProducto(Producto producto) {
		this.producto = producto;
	}



	public String guardarProducto(){
		try {
			productoON.guardarProductoON(producto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public List<Producto>listaProducto() throws Exception{
		return productoON.listarProductoON();
		
	}
}
