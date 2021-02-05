package ups.edu.ec.dao;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.modelo.Producto;

@Stateless
public class ProductoDAO {
	
	@PersistenceContext(name = "ServidorProducto")
	private EntityManager em;
	
	public boolean guardarProductoDAO(Producto  producto) {
		boolean aux;
		try {
			em.persist(producto);
			aux=true;
		} catch (Exception e) {
			e.printStackTrace();
			aux = false;
		}
		return aux;
	}
	
	public List<Producto>listaProductoDAO() throws Exception{
		
			String jpql ="SELECT p FROM Producto p ";
			Query q = em.createQuery(jpql, Producto.class);
			List<Producto> listPro =q.getResultList();
			return listPro;
		
	}
	
	public Producto buscaProdutoDAO(int codigo) throws Exception{
		try {
			String spql ="SELECT * FROM Producto where codigo = :codigo";
			Query q =em.createQuery(spql, Producto.class);
			q.setParameter("codigo", codigo);
			Producto pro =(Producto) q.getSingleResult();
			return pro;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}
}
