package com.auth0.lomboktest;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Lecture {
  private String lectureName;
  private String lectureCode;

  public Lecture(String lectureName, String lectureCode) {
    this.lectureName = lectureName;
    this.lectureCode = lectureCode;
  }
}
