package lesson38;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Long,String>hashMap= new HashMap<>();
        hashMap.put(1L,"Gunel");
        hashMap.put(2l,"Xeyransa ");
        System.out.println(hashMap);
        System.out.println("===================================");

        Hashtable<Long,String> hashtable= new Hashtable<>();
        hashtable.put(1L,"Elgun");
        hashtable.put(2l,"Cahid ");
        hashtable.put(3L,"Leman");
        System.out.println(hashtable);
        System.out.println("=====================================");

        TreeMap<Long,String>treeMap=new TreeMap<>();
        treeMap.put(5L,"Leyla");
        treeMap.put(1L,"Immi");
        treeMap.put(2L,"Asya");
        treeMap.put(3L,"Cemile");
        System.out.println(treeMap);
    }
}
