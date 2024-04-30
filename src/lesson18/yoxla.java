package lesson18;

import java.util.*;

public class yoxla {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();
        Set<Integer>arr=new HashSet<>();
        arr.add(1);
        arr.add(12);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        List<Integer>nums=new ArrayList<>();
        nums.add(9);
        nums.add(10);
        nums.add(45);
        nums.add(32);
        nums.add(8);
        yoxla(arr,num);
    }

    public static void yoxla(Collection<Integer> arr, int num) {

            if ( arr.contains( num)) {
                System.out.println("Yes");
            } else {
                System.out.println("Null");
            }




        }

    }
