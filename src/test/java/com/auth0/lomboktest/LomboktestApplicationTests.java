package com.auth0.lomboktest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LomboktestApplicationTests {

  @Test
  void testAccessor() {
    String username = "some-user";
    String password = "some-password";
    User user = new User(username, password);

    assertEquals(username, user.getUsername());
    assertEquals(password, user.getPassword());
  }

  @Test
  void testBuilder() {
    String courseName = "Intro to CS";
    String courseCode = "cs50";
    Course course = Course.builder().courseName(courseName).courseCode(courseCode).build();

    assertEquals(courseName, course.getCourseName());
    assertEquals(courseCode, course.getCourseCode());
  }

  @Test
  void testToString() {
    String firstName = "John";
    String lastName = "Doe";
    String expectedResult = "Person(firstName=" + firstName + ", lastName=" + lastName + ")";

    Person person = new Person(firstName, lastName);
    assertEquals(expectedResult, person.toString());
  }

  @Test
  void testEqualsAndHashCode() {
    String lectureName = "Intro to Computer Science";
    String lectureCode = "cs50";

    Lecture l1 = new Lecture(lectureName, lectureCode);
    Lecture l2 = new Lecture(lectureName, lectureCode);

    assertEquals(l1, l2);
  }
}
