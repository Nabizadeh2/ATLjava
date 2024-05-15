package lesson28;

public class Ucbucaq implements Shape {

    private int teref1;
    private int teref2;
    private int teref3;

    public Ucbucaq(int teref1, int teref2, int teref3) {
        this.teref1 = teref1;
        this.teref2 = teref2;
        this.teref3 = teref3;
    }

    public Ucbucaq(int teref1, int teref2) {
    }

    @Override
    public void perimetr() {
        System.out.println( "Ucbucagin perimetri  "+ (this.teref1 + this.teref2 + this.teref3));
    }

    @Override
    public void sahe() {
        System.out.println(("Ucbucagin sahesi  "+ (this.teref1 + this.teref2 + this.teref3) / 2));
    }

    @Override
    public String toString() {
        return "Ucbucaq{" +
                "teref1=" + teref1 +
                ", teref2=" + teref2 +
                ", teref3=" + teref3 +
                '}';
    }
}
