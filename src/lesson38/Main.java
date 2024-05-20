package lesson38;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<User,String > map= new TreeMap<>();
        List<User>list=new ArrayList<>();
        list.add(new User(2,"S",29));
        System.out.println(list);
    }
}
