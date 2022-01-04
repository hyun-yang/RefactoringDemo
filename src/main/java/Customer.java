package main.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class Customer {

  private String _name;
  private ArrayList _rentals = new ArrayList();

  public Customer(String _name) {
    this._name = _name;
  }

  public void addRental(Rental rental) {
    _rentals.add(rental);
  }

  public String get_name() {
    return _name;
  }

  public String textStatement() {
    ListIterator rentals = this._rentals.listIterator();
    String result = "Rental Record for " + get_name() + "\n";

    while (rentals.hasNext()) {
      Rental rental = (Rental) rentals.next();
      // 이 대여에 대한 요금 계산결과 표시
      result += "\t" + rental.get_movie().get_title() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }

    // 풋터 추가
    result += "You owed " + String.valueOf(getTotalCharges()) + "\n";
    result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points\n";

    return result;
  }

  public String htmlStatement() {
    ListIterator rentals = this._rentals.listIterator();
    String result = "<h1>Rental Record for <em>" + get_name() + "</em></h1><p>\n";

    while (rentals.hasNext()) {
      Rental rental = (Rental) rentals.next();
      // 이 대여에 대한 요금 계산결과 표시
      result +=  rental.get_movie().get_title() + ": " + String.valueOf(rental.getCharge()) + "<br>\n";
    }

    // 풋터 추가
    result += "<p>You owed <em>" + String.valueOf(getTotalCharges()) + "</em></p>\n";
    result += "You earned <em>" + String.valueOf(getTotalFrequentRenterPoints()) + "</em> frequent renter points.<p>";

    return result;
  }

  private double getTotalCharges() {
    double result = 0;
    ListIterator rentals = this._rentals.listIterator();
    while (rentals.hasNext()) {
      Rental rental = (Rental) rentals.next();
      result += rental.getCharge();
    }
    return result;
  }

  private int getTotalFrequentRenterPoints() {
    int result = 0;
    ListIterator rentals = this._rentals.listIterator();
    while (rentals.hasNext()) {
      Rental rental = (Rental) rentals.next();
      result += rental.getFrequentRenterPoints();
    }
    return result;
  }
}
