package main.java;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
  private Customer customer;

  private Movie movie1;
  private Movie movie2;
  private Movie movie3;

  @BeforeEach
  void setUp() {
    customer = new Customer("우리 동네 비디오 가게");
    movie1 = new Movie("신규 영화", 1);
    movie2 = new Movie("일반 영화", 0);
    movie3 = new Movie("어린이 영화", 2);
  }

  @Ignore
  @Test
  void addRental() {

  }
}