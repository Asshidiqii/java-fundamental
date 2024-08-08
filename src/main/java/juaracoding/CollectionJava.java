package juaracoding;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionJava {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // create
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());

        // read/get all data
        for (String car : cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // read/get 1 data
        System.out.println(cars.get(2));

        // update
        cars.set(2, "Toyota");
        System.out.println(cars.get(2));

        // delete
        System.out.println("--- delete ---");
        cars.remove(2);
        for (String car : cars) {
            System.out.println(car);
        }

    }
}
