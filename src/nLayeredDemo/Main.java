package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        // Todo: Spring IoC solution
        ProductService productService = new ProductManager(new HibernateProductDao());
    
        Product product = new Product(1,2,"Orange",12,50);

        productService.add(product);
    }

}
