package com.sena.senaapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "tbl_products")
@Data

public class Product {

    @Id 
    private long IdProduct;
    private String name;
    private String brand;
    private boolean expired;
    private float price;

    @ManyToOne
    @JoinColumn(
          name = "id",
          referencedColumnName = "id_local"
    )
    private Local Local;
}
