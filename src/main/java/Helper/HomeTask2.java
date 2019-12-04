package Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeTask2 {
    private List<Pair> pairs = new ArrayList<>();


    public HomeTask2 setPairList(int size) {
        if (size > 9) {
            Random r = new Random();
            for (int i = 0; i < size; i++) {
                pairs.add(new Pair(r.nextInt(), r.nextInt()));
            }
        } else {
            System.out.println("You should to set size as 10 or more");
        }
        return this;
    }

    public HomeTask2 sortPairList() {
        boolean cont = true;
        while (cont) {
            cont = false;
            for (int i = 0; i < pairs.size() - 1; i++) {
                if (pairs.get(i).getSumm() < pairs.get(i + 1).getSumm()) {
                    Pair buf = pairs.get(i);
                    pairs.set(i, pairs.get(i + 1));
                    pairs.set(i + 1, buf);
                    cont = true;
                }
            }
        }

        return this;
    }

    public void outputPairList() {
        for (Pair p :
                pairs) {
            System.out.println("Val1: " + p.getVal1() + " and Val2: " + p.getVal2() + ", summ: " + p.getSumm());
        }
    }
}
