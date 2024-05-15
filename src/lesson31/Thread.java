package lesson31;

public class Thread {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        new java.lang.Thread(myThread).start();
    }

    public static class MyThread implements Runnable {

        @Override
        public void run() {

            System.out.println(java.lang.Thread.currentThread().getName());
        }
    }
}
