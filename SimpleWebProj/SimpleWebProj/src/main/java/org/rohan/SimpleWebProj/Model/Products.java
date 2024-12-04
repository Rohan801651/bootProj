package org.rohan.SimpleWebProj.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
@Entity  // linked with database
public class Products {

    private String prodName;
    @Id // like primary key
    private int prodId;
    private double price;

    // can use lombok


    public Products(String prodName, int prodId, int price) {
        this.prodName = prodName;
        this.prodId = prodId;
        this.price = price;
    }

    public Products() {

    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "prodName='" + prodName + '\'' +
                ", prodId=" + prodId +
                ", price=" + price +
                '}';
    }
}
