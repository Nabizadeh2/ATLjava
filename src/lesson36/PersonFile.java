package lesson36;

import lesson36.resource.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonFile {

    public static final String RESOURCE = "src/lesson36/resource/";

    public static void main(String[] args) {
        Person person = new Person("Onur", "Nabizada", 8);

        List<Person>mylist=new ArrayList<>();
        mylist.add(new Person("Gunel","Hasanova",22));
        mylist.add(new Person("Xeyransa ","Pashayeva",26));
        mylist.add(new Person("Shamil","Azaxov",25));

        try (FileOutputStream fos = new FileOutputStream(RESOURCE + "person.ser");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(mylist);
            oos.writeObject(person);
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }

        try (FileInputStream fos = new FileInputStream(RESOURCE + "person.ser");
             BufferedInputStream bos = new BufferedInputStream(fos);
             ObjectInputStream oos = new ObjectInputStream(bos)) {
            List<Person>readList=(List<Person>)oos.readObject();
            Object object = oos.readObject();
            System.out.println(object);
            //if (object instanceof Person) {
           //     System.out.println(object);
          //// }

            for(Person person1:readList){
                System.out.println(person1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
