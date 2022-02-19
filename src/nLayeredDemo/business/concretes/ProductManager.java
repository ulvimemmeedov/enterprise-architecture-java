package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

public class ProductManager implements ProductService {
    // Dependency Injection
    private ProductDao ProductDao;

    public ProductManager(nLayeredDemo.dataAccess.abstracts.ProductDao productDao) {
        super();
        ProductDao = productDao;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategoriyada mehsul qebul edilmir");
            return;
        }
        this.ProductDao.add(product);   
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
