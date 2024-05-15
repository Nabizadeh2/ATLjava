package lesson28;

public class Kvadrat implements Shape {
    private int teref1;


    public Kvadrat(int teref1) {
        this.teref1 = teref1;

    }

    @Override
    public void perimetr() {
        System.out.println("Kvadratin perimetri "+(4 * this.teref1));
    }

    @Override
    public void sahe() {
        System.out.println("Kvadratin sahesi  "+ (this.teref1 * this.teref1));
    }


    @Override
    public String toString() {
        return "Kvadrat{" +
                "teref1=" + teref1 +
                '}';
    }
}
