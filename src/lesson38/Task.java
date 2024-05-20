package lesson38;

import java.util.HashMap;
import java.util.function.BiFunction;

public class Task {
    public static void main(String[] args) {
       final String word = "AZERBAIJAN";
         char[]chars=word.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();
//        hashMap.put('A',1);
//        hashMap.put('Z',1);
//        hashMap.put('e',1);
//        hashMap.put('r',1);
//        hashMap.put('b',1);
//        hashMap.put('a',2);
//        hashMap.put('y',1);
//        hashMap.put('c',1);
//        hashMap.put('n',1);
        for (char c:chars) {
            if (hashMap.containsKey(c)){
                Integer count=hashMap.get(c);
                hashMap.put(c,count+1);
                //bu kodu birde merge methodu ile yoxlayaq
                hashMap.merge(c, 1, new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }

                });
            }else {
                hashMap.put(c,1);
            }
        }

        System.out.println(hashMap);


    }
}


