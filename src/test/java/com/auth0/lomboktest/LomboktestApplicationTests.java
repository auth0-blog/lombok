package com.auth0.lomboktest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LomboktestApplicationTests {

  @Test
  void testAccessor() {
    String username = "some-user";
    String password = "some-password";
    User user = new User(username, password);

    assertEquals(user.getUsername(), username);
    assertEquals(user.getPassword(), password);
  }

  @Test
  void testBuilder() {
    String courseName = "Intro to CS";
    String courseCode = "cs50";
    Course course = Course.builder().courseName(courseName).courseCode(courseCode).build();

    assertEquals(course.getCourseName(), courseName);
    assertEquals(course.getCourseCode(), courseCode);
  }
}
