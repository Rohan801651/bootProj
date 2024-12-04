package org.rohan.SimpleWebProj.Controller;

import org.rohan.SimpleWebProj.Model.Products;
import org.rohan.SimpleWebProj.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Products> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Products getProductById(@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products prod) { // accept product from the client
        System.out.println(prod);
        productService.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Products prod) {
        productService.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        productService.deleteProductById(prodId);
    }

}
