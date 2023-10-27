package org.example.dataAccess;

import org.example.entities.Product;

public class HibernateProductDao implements ProductDao{

    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile " + product.getName() + " veritabanına eklendi.");
    }
}
