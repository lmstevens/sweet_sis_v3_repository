package com.sweets.website.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
// public class Product {
	
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "user_id")
//     private Long id;

//     private int quantity;
//     private int price;
    
//     private String name;
//     private String description;
//     private String brand;
//     private String category;
//     private String image;
    
// }

public class Product {
	

    @Id
    @Column(name = "product_id") // this used to be user_id
    private Long id;

    @Column(name = "price")
    private int price;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "name")
    private String name;

    @Column(name = "flavor")
    private String flavor;

    @Column(name = "color")
    private String color;

    @Column(name = "icing_flavor")
    private String icing_flavor;

    @Column(name = "cake_sprinkles")
    private String cake_sprinkles;
    
    @Column(name = "category")
    private String category;

    @Column(name = "img_url")
    private String img_url;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "brand")
    private String brand;
    
}
