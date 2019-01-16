package com.auth0.lomboktest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
  private String title;
  private String description;
  private boolean available;
  private BigDecimal price;
  private BigDecimal weight;
}
