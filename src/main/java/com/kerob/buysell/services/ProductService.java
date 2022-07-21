package com.kerob.buysell.services;

import com.kerob.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "PlayStation5","Simple Description", 500,"Moscow","Valod"));
        products.add(new Product(++ID, "PlayStation15","Simple Description2", 1000,"Moscow2","Valod2"));
    }

    public List<Product> listProducts(){
        return products;
    }

    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {

        for (Product product : products){
            if(product.getId().equals(id)) return product;
        }
        return null;
    }
}
