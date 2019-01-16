package com.auth0.lomboktest;

import lombok.Data;
import lombok.NonNull;

@Data
public class Magic {
  private @NonNull String title;
  private @NonNull Integer grade;
  private boolean works = true;
  private String description;
}
