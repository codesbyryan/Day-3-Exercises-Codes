import java.util.ArrayList;
import java.util.List;
public class Generics_Practice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("James Trafford");
        names.add("Jordan Pickford");
        names.add("Aaron Ramsdale");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(1);
        numbers.add(32);

        List<Double> prices = new ArrayList<>();
        prices.add(19.99);
        prices.add(29.99);
        prices.add(39.99);

        for (String name : names) {
            System.out.println(name);
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }

        for (Double price : prices) {
            System.out.println(price);
        }

        int total = calculateTotal(numbers);
        System.out.println("Sum of numbers: " + total);
    }

        public static int calculateTotal(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}