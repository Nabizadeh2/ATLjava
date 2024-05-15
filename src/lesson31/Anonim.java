package lesson31;

public class Anonim {

    public static void main(String[] args) {

        new java.lang.Thread(new Runnable() {


            @Override
            public void run() {
                System.out.println(java.lang.Thread.currentThread().getName());
            }
        }).start();
    }

}
