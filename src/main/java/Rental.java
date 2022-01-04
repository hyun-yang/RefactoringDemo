package main.java;

public class Rental {
  public static final int REGULAR = 0;
  private Movie _movie;
  private int _daysRented;

  public Rental(Movie movie, int daysRented) {
    this._movie = movie;
    this._daysRented = daysRented;
  }

  public Movie get_movie() {
    return _movie;
  }

  public int get_daysRented() {
    return _daysRented;
  }

  public double getCharge() {
    return _movie.getCharge(_daysRented);
  }

  public int getFrequentRenterPoints() {
    return _movie.getFrequentRenterPoints(_daysRented);
  }
}