package org.rohan.SimpleWebProj.Repository;

import org.rohan.SimpleWebProj.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {

}
