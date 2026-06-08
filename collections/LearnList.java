package collections;

import java.util.ArrayList;

public class LearnList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Beat it");
        list.add("depscatio");
        list.add("Kolavi Di");
        list.add("koyila");

       for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
       //for Each
        System.out.println("For each");
        for(String s:list)
        {
            System.out.println(s);
        }
       //pretty print
        System.out.println(list);
        //remove
        System.out.println(list.remove(1));
        System.out.println(list);

        //update
        list.set(2,"barbie");
        System.out.println(list);

        //contains
        System.out.println(list.contains("Beat it"));
    }

}
