package lesson13;

public class Pet {
    String species;
    String nicname;
    int age;
    int trickLevel;
    String habits;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNicname() {
        return nicname;
    }

    public void setNicname(String nicname) {
        this.nicname = nicname;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String getHabits() {
        return habits;
    }

    public void setHabits(String habits) {
        this.habits = habits;
    }

    public void  eat(){
        System.out.println("I am eating");
    }

    public void respond(){
        System.out.println("Hello ,owner.I am -[the name of the pet].I miss you!");
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return "PetCls{" +
                "species='" + species + '\'' +
                ", nicname='" + nicname + '\'' +
                ", trickLevel=" + trickLevel +
                ", habits='" + habits + '\'' +
                '}';

    }

    public Pet(String species, String nicname, int age, int trickLevel, String habits) {
        this.species = species;
        this.nicname = nicname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {
    }

    public Pet(String species, String nicname) {
        this.species = species;
        this.nicname = nicname;
    }

    public Pet(String species, int age) {
        this.species = species;
        this.age = age;
    }
}
