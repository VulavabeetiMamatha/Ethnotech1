package Generics.WildCards;

import java.util.List;

public class WildClass {
    public static void display(List<?> l)
    {
        System.out.println(l);
    }

    public static void main(String[] args) {
        display(List.of(1,2,3,4,5));
        display(List.of("Mammu","Ramu"));
    }
}
