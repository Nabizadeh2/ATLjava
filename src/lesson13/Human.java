package lesson13;

public class Human {

    String name;
    String surname;
    int number;
    int iq;
    Human mother;
    Human father;
    Pet petCls;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String greetPet(){
        return "Hello " +petCls.nicname;
    }

    public String describePet(){
        return "I have " +petCls.species  + "he " +petCls.age + " years old"+
                ( petCls.trickLevel>50?"not sly":"sly");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", petCls=" + petCls +
                '}';
    }

    public Human(String name, String surname, int number, int iq, Human mother, Human father, Pet petCls) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.petCls = petCls;
    }

    public Human() {
    }

    public Human(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }
}
