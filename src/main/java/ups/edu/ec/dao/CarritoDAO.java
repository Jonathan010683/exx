package ups.edu.ec.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelo.Carrito;

@Stateless
public class CarritoDAO {

	@PersistenceContext(name = "ClienteCarrito")
	private EntityManager em;
	
	public boolean guardarCarritoDAO(Carrito carrito){
		boolean  aux;
		try {
			em.persist(carrito);
			aux=true;
		} catch (Exception e) {
			e.printStackTrace();
			aux=false;
		}
		return aux;
	}
}
