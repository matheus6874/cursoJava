package comparator.application;

import comparator.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.0));
        list.add(new Product("Notebook",1200.0));
        list.add(new Product("Tablet",400.0));

        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }
    }
}
