import movies.Movie;
import movies.Rental;
import movies.Customer;

class Main {
    public static void main(String[] args) {
        Customer hiro = new Customer("hiro");
        String result = hiro.statement();

        System.out.println(result);
    }
}
