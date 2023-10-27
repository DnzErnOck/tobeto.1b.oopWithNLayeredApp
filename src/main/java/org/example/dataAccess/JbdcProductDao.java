package org.example.dataAccess;

import org.example.entities.Product;

public class JbdcProductDao implements ProductDao{
    @Override
    public void add(Product product) {
        System.out.println("JDBC ile " + product.getName() + " veritabanına eklendi.");
    }
}
