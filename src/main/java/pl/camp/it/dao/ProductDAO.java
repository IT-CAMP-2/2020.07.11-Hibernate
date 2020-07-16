package pl.camp.it.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import pl.camp.it.App;
import pl.camp.it.model.Product;

public class ProductDAO implements IProductDAO {
    @Override
    public Product getProductById(int id) {
        Session session = App.sessionFactory.openSession();
        Query<Product> query = session
                .createQuery("FROM pl.camp.it.model.Product WHERE id = :id");
        query.setParameter("id", id);
        Product result = query.getSingleResult();
        session.close();
        return result;
    }
}
