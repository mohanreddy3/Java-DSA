package HashMap;
import java.util.*;
public class h2 {
    public static void main(String[] args){
        //HashMap
        HashMap<String , Integer> map = new HashMap<>();
        //put()
        map.put("Mohan" , 69);
        map.put("banu" , 99);
        map.put("bob" , 90);
        //get()
        System.out.println(map.get("Mohan"));
        //getOrDefault()
        System.out.println(map.getOrDefault("lily", 100));
        //containsKey()
        System.out.println(map.containsKey("bob"));
        //keySet()
        System.out.println(map.keySet());
        System.out.println(map);


        //HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(69);
        set.add(12);
        set.add(56);
        set.add(87);
        set.add(56);
        System.out.println(set);



        //TreeMap
        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("Mohan" , 69);
        map1.put("banu" , 99);
        map1.put("bob" , 90);
        System.out.println(map1.get("bob"));
        System.out.println(map1);
    }
    
}
