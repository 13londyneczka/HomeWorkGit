package Lesson10.Exercise5;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordTest {
  @Test
  void shouldBeMatchPassword() {
    String password = "W1sdfsdfsdfsdf";
    assertTrue(Password.isPasswordGood(password));
  }
}
