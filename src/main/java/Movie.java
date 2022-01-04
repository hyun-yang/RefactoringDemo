package main.java;

public class Movie {
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;
  public static final int CHILDREN = 2;

  private String _title;
  private Price _price;

  public Movie(String title, int priceCode) {
    this._title = title;
    set_priceCode(priceCode);
  }

  public Movie(String title) {
    this._title = title;
  }

  public double getCharge(int daysRented) {
    return _price.getCharge(daysRented);
  }

  public int getFrequentRenterPoints(int daysRented) {
    return _price.getFrequentRenterPoints(daysRented);
  }

  public int get_priceCode() {
    return _price.getPriceCode();
  }

  public void set_priceCode(int arg) {
    switch (arg) {
      case REGULAR:
        _price = new RegularPrice();
        break;

      case CHILDREN:
        _price = new ChildrenPrice();
        break;

      case NEW_RELEASE:
        _price = new NewReleasePrice();
        break;

      default:
        throw new IllegalArgumentException("Incorrect Price code");
    }
  }

  public String get_title() {
    return _title;
  }

  public void set_title(String _title) {
    this._title = _title;
  }

}