package lesson35.resource;

import random.Random;

import java.io.*;
import java.util.Arrays;

public class FileApp3 {

    public static final String RESOURCE="src/lesson35/resource/";

    public static void main(String[] args) {
       byte [] bytes=new byte[20];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i]=(byte)(Math.random()*100);

        }
        System.out.println(Arrays.toString(bytes));

        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE+"a.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            bos.write(bytes);
            bos.close();
            fos.close();
        }catch (IOException e){
            e.getMessage();
        }

        try {
            FileInputStream fis=new FileInputStream(RESOURCE+"a.txt");
            BufferedInputStream bis= new BufferedInputStream(fis);
            byte[]bytes1=bis.readAllBytes();
            System.out.println(Arrays.toString(bytes1));

        }catch (IOException e){
            e.getMessage();
        }
    }
    }





