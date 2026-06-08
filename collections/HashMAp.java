package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMAp {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("House1",1);
        hm.put("House2",1);
        hm.put("House3",0);
        hm.put("House4",3);

        System.out.println(hm);

        for(String key: hm.keySet())//contains key only
        {
            System.out.println(key+":"+hm.get(key));
        }

        for(Map.Entry<String,Integer> entry:hm.entrySet())//contains key value pair
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println(hm.putIfAbsent("House0",12));//if we forget to add it can add

        for(Map.Entry<String,Integer> entry:hm.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println(hm.putIfAbsent("House0",12));//give value

    }
}
