package lesson28;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape ucbucaq = new Ucbucaq(2, 3, 6);
        Shape kvadrat = new Kvadrat(2);
        ArrayList<Shape> arrayList = new ArrayList<>();
        arrayList.add(ucbucaq);
        arrayList.add(kvadrat);
        ucbucaq.perimetr();
        ucbucaq.sahe();
        kvadrat.sahe();
        kvadrat.perimetr();
          
    }
}
