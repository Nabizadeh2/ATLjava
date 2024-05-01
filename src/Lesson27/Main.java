package Lesson27;

public class Main {
    public static void main(String[] args) throws CustomException {
     Book book=new Book("Python","Elgun");
        System.out.println(book);

        if (book instanceof Book){
            System.out.println("Yes");
        }else {
            throw new CustomException("Yoxdur");
        }



    }
}
