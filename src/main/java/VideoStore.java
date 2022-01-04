package main.java;

public class VideoStore {
    public static void main(String[] args) {
        Customer customer = new Customer("우리 동네 비디오 가게");

        Movie movie1 = new Movie("신규 영화", 1);
        Movie movie2 = new Movie("일반 영화", 0);
        Movie movie3 = new Movie("어린이 영화", 2);

        customer.addRental(new Rental(movie1, 1));
        customer.addRental(new Rental(movie2, 2));
        customer.addRental(new Rental(movie3, 1));

        System.out.println(customer.textStatement());
        System.out.println(customer.htmlStatement());
    }
}
