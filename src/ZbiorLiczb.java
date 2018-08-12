import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class ZbiorLiczb {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        int average = sredniaLiczb(numbers);
        System.out.println(average);
        wiekszeOdSredniej(numbers);
    }

    public static int sredniaLiczb(TreeSet<Integer> numbers) {
        int suma = 0;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            suma += next;
        }
        return suma / numbers.size();
    }
    public static void wiekszeOdSredniej(TreeSet<Integer> numbers) {
        ArrayList<Integer> liczbyWieksze = new ArrayList<>();
        float average = sredniaLiczb(numbers);
        for (Integer num : numbers) {
            if (num > average) {
                liczbyWieksze.add(num);
            }
            for (int i = 0; i < liczbyWieksze.size(); i++) {
                System.out.println(liczbyWieksze.get(i));
            }
        }
    }
}
