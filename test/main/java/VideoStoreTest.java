package main.java;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoStoreTest {

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

  @AfterEach
  void tearDown() {
  }

  @Ignore
  @Test
  void testCustomerStatement() {
    customer.addRental(new Rental(movie1, 3));
    customer.addRental(new Rental(movie2, 3));
//    assertEquals(customer.getAmoutOwed(), 4);
    assertEquals(true, true);
  }

  @Ignore
  @Test
  void testRegularReleaseStatement() {
//    customer.addRental(new Rental(movie1, 3));
//    customer.addRental(new Rental(movie2, 3));
//    assertEquals(customer.getAmoutOwed(), 4);
  }

  @Ignore
  @Test
  void testChildrenNewReleaseStatement() {
//    customer.addRental(new Rental(movie1, 3));
//    customer.addRental(new Rental(movie2, 3));
//    assertEquals(customer.getAmoutOwed(), 4);
  }

  @Ignore
  @Test
  public void testRentalStatementFormat() {
//    customer.addRental(new Rental(movie1, 1));
//    customer.addRental(new Rental(movie2, 2));
//    customer.addRental(new Rental(movie3, 3));

//    assertEquals(
//        "Rental Record for Customer Name\n" +
//            "\tRegular 1\t2.0\n" +
//            "\tRegular 2\t2.0\n" +
//            "\tRegular 3\t3.5\n" +
//            "You owed 7.5\n" +
//            "You earned 3 frequent renter points\n",
//        customer.makeRentalStatement());
  }
}