package lesson32;

import task.FesillerCls;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Person person = new Person("Ayten", 2, "Ayan");
        Field age = person.getClass().getDeclaredField("age");
        age.setAccessible(true);
        age.set(person, 1000);
        System.out.println(age.get(person));

        // person.getClass().getName();

        // Field []field=person.getClass().getFields();
    }


}
