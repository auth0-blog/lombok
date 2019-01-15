package com.auth0.lomboktest;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Course {
  @Getter @Setter
  private String courseName;
  @Getter @Setter
  private String courseCode;

  @Override
  public String toString() {
    return "LombokCourse{" +
      "courseName='" + courseName + '\'' +
      ", courseCode='" + courseCode + '\'' +
      '}';
  }
}
