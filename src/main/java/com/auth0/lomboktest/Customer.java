package com.auth0.lomboktest;

import lombok.NonNull;

public class Customer {
  private String name;
  private String phone;

  public Customer(@NonNull String name, String phone) {
    if (name == null) {
      throw new NullPointerException("Please, inform the customer name.");
    }

    this.name = name;
    this.phone = phone;
  }
}
