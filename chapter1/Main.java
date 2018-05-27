import movies.Movie;
import movies.Rental;
import movies.Customer;

class Main {
    public static void main(String[] args) {
        Movie mib = new Movie("Men in Black", 0);
        Rental rentMib = new Rental(mib, 5);

        Movie mib2 = new Movie("Men in Black2", 1);
        Rental rentMib2 = new Rental(mib2, 5);

        Customer hiro = new Customer("hiro");
        hiro.addRental(rentMib);
        hiro.addRental(rentMib2);

        String result = hiro.statement();
        System.out.println(result);
    }
}
