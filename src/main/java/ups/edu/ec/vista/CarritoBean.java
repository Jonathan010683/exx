package ups.edu.ec.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ups.edu.ec.modelo.Carrito;
import ups.edu.ec.negocio.CarritoON;

@ManagedBean
@ApplicationScoped
public class CarritoBean {

	@Inject
	private CarritoON carritoON;

	private Carrito carrito;

	@PostConstruct
	public void init() {
		carrito = new Carrito();

	}

	public CarritoON getCarritoON() {
		return carritoON;
	}

	public void setCarritoON(CarritoON carritoON) {
		this.carritoON = carritoON;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public void optenetCodigoProducto(int codigo) {
		int cont = 0;
		int[] dato = new int[cont];
		for (int i = 0; i < dato.length; i++) {
			dato[i] = codigo;
			cont++;
			System.out.println("datos de arreglo : "+dato[i]);
		}
	}
	public String guardarCarrito() {
		try {
			carritoON.guardarCarritoON(carrito);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
