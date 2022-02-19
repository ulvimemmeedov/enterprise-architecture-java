package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

public class ProductManager implements ProductService {
    // Dependency Injection
    private ProductDao ProductDao;
    private LoggerService loggerService;
    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        super();
        ProductDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategoriyada mehsul qebul edilmir");
            return;
        }
        this.ProductDao.add(product);   
        loggerService.logToSystem("Mehsul elave edildi "+product.getName());
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
