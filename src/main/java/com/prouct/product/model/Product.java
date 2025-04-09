package com.prouct.product.model;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
        private Long id;
        private String name;
        private Double price;
        private Integer quantityLeft;
}


