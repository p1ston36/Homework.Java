import Helper.HomeTask1;
import Helper.HomeTask2;
import Helper.HomeTask3;
import Helper.HomeTask4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        homeTask1();
//        homeTask2();
//        homeTask3();
        homeTask4();

    }

    public static void homeTask1() {
        HomeTask1 help = new HomeTask1();
        List<Integer> listA = help.createList(150);
        List<Integer> listB = help.maxValues(listA, 15);
        help.output(listA);
        help.output(listB);

    }

    public static void homeTask2() {
        new HomeTask2()
                .setPairList(10)
                .sortPairList()
                .outputPairList();

    }

    public static void homeTask3() {
        new HomeTask3()
                .inputSting()
                .outputReverseString();
    }

    public static void homeTask4() {
        new HomeTask4()
                .inputSting()
                .outputSortString();
    }


}





