import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class ZbiorLiczb {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Integer> numbers = new TreeSet<>();
        while (numbers.size()<50) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        double average = sredniaLiczb(numbers);
        System.out.println(average);
        wiekszeOdSredniej(numbers);
    }

    public static double sredniaLiczb(TreeSet<Integer> numbers) {
        int suma = 0;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            suma += next;
        }
        return suma / numbers.size();
    }
    public static void wiekszeOdSredniej(TreeSet<Integer> numbers) {
        double average = sredniaLiczb(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > average) {
                System.out.println(next);
            }
            }
        }
    }

