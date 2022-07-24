package questionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorVsComparable {
    public static void main(String[] args) {
        List<Laptops> laptopsList = new ArrayList<>();
        laptopsList.add(new Laptops("Dell", 1000, 16));
        laptopsList.add(new Laptops("HP", 1200, 32));
        laptopsList.add(new Laptops("Apple", 1600,16 ));

        Collections.sort(laptopsList);
        System.out.println("Comparator: sorting using price");
        for (Laptops laptops : laptopsList ){
            System.out.println(laptops);
        }

        Comparator<Laptops> comparator = new Comparator<Laptops>() {
            @Override
            public int compare(Laptops o1, Laptops o2) {
                if (o1.getRamSize() > o2.getRamSize()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(laptopsList, comparator);
        System.out.println("Comparable soring using RAM");
        for (Laptops laptops : laptopsList ){
            System.out.println(laptops);
        }
    }
}

// we use comparable in 2 scenarios
// we cannot implement laptop class, and we need more filters.