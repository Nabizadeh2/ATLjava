package lesson31;

import java.util.function.BiFunction;

public class lesson32 {
    public static void main(String[] args) {


       /* MyFunctionalInterface funcInterface = new MyFunctionalInterface() {
            @Override
            public void myMethod(int a, int b, String str) {
                System.out.println("Parameters: " + a + ", " + b + ", " + str);

            }
        };

        funcInterface.myMethod(10, 20, "Hello");
    }

    interface MyFunctionalInterface {
        void myMethod(int a, int b, String str);*/



    }
      /*      public interface BiFunction<T,U,R >
        {
            R apply(T t,U u);


        }*/

         BiFunction<Integer,Integer,String> biFunction=new BiFunction<Integer, Integer, String>() {
        @Override
        public String apply(Integer integer, Integer integer2) {
            return  integer +"" +integer2;
        }
    };
    {

    }

}






