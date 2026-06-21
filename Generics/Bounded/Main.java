package Generics.Bounded;

public class Main {
    public static void main(String[] args) {
        Bounded<Integer> b=new Bounded<>();
        b.setPrice(10);
        System.out.println(b.getPrice());
    }
}
