package org.rohan.SimpleWebProj.Services;

import org.rohan.SimpleWebProj.Model.Products;
import org.rohan.SimpleWebProj.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired /// to get the obj. spring data JPA is responsible for it
    ProductRepo repo;


/*    List<Products> products = new ArrayList<>(Arrays.asList(
            new Products("Iphone",1001,5000),
            new Products("Android", 1002, 10000),
            new Products("Camera", 1002, 2000)
    ));*/

    public List<Products> getProducts() {
        return repo.findAll();
    }

    public Products getProductById(int prodId) {
        /*for(Products i: products)
        {
            if(i.getProdId() == prodId)
            {
                return i;
            }
        }
        return null;*/
        return repo.findById(prodId).orElse(new Products());
    }

    public void addProduct(Products prod) {
//        /*this.*/products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Products prod) {
        /*int idx = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                idx = i;
            }
        }
        products.set(idx, prod);*/
        repo.save(prod);
    }

    public void deleteProductById(int prodId) {
        /*int idx = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                idx = i;
            }
        }
        products.remove(idx);*/
        repo.deleteById(prodId);
    }













}
