package lesson22;

import java.time.LocalDateTime;

public class exception {

    public static void main(String[] args) {
         book(2);
         sky("aa");
         person(LocalDateTime.now());
    }
    
    public static void book (Integer a){
        if (a==null){
            throw new NullPointerException("Integer= Null");
        }
        
    }
    
    public static void  sky (String b) {
        if (b == null) {
       throw  new NullPointerException("String=null");
        }
    }
    
    public static void person (LocalDateTime localDate){
            if (localDate==null){

                throw new NullPointerException("localDate=null");
            }
        }
}
