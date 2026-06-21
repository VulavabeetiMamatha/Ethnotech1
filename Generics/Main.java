package Generics;

public class Main {
    public static void main(String[] args) {
        Content<String> c=new Content<>();
        c.setName("Mamatha");
        System.out.println(c.getName());

        Content<Integer> c1=new Content<>();
        c1.setName(1);
        System.out.println(c1.getName());

        Items<String,Double,Boolean> i=new Items<>("banana",20.0,true);
        System.out.println(i.getName()+" "+i.getPrice()+" "+i.getIsGood());

    }
}
