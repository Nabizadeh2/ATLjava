package lesson35;

import lesson32.Person;

import java.io.*;
import java.util.Arrays;

public class FileApp2 {

    public static final String RESOURCE="src/lesson35/resource/";


    public static void main(String[] args) {
          try {
              FileOutputStream fos = new FileOutputStream(RESOURCE+"a.txt");
              BufferedOutputStream bos=new BufferedOutputStream(fos);
              bos.write("Jeyhuna".getBytes());
              bos.close();
              fos.close();
          }catch (IOException e){
              e.getMessage();
          }

          try {
              FileInputStream fis=new FileInputStream(RESOURCE+"a.txt");
              BufferedInputStream bis= new BufferedInputStream(fis);
              byte[]bytes=bis.readAllBytes();
              System.out.println(Arrays.toString(bytes));
              String st= new String(bytes);
              System.out.println(st);
          }catch (IOException e){
              e.getMessage();
          }
    }
}
