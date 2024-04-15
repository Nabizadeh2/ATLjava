package lesson13;

public class Main {
    public static void main(String[] args) {
        Human mother= new Human("Gulnar","Huseynova",1970);
        Human father= new Human("Huseyn","Hesenov",1980);
        Pet pet= new Pet("HEKLLO","hwsjh");
       Human human=new Human("Gunel","Hasanova",2002,90,mother,father,new Pet());
        System.out.println(human);
        Pet pet1=new Pet("dog","sksdkjo");

        System.out.println(pet1);
       pet.eat();
       pet.foul();
       pet.respond();

       human.describePet();
       human.greetPet();

        System.out.println(mother);
        System.out.println(father);

    }
}
