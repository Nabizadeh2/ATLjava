package lesson32;

public class Person {
    private static String name;
    private static int age;
    private static String surname;

    public Person() {
    }

    public Person(String name, int age, String surname) {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Person.surname = surname;
    }



    @Override
    public String toString() {
        return "Person{}";
    }
}
