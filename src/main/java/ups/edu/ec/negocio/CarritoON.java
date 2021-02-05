package ups.edu.ec.negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.dao.CarritoDAO;
import ups.edu.ec.modelo.Carrito;

@Stateless
public class CarritoON {

	@Inject
	private CarritoDAO carritoDAO;
	
	public boolean guardarCarritoON(Carrito carrito) {
		return carritoDAO.guardarCarritoDAO(carrito);
	}
}
