package Helper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HomeTask1 {

    public static void output(List<Integer> list) {
        System.out.println(list.toString());
        try (FileWriter temp = new FileWriter("Task1.txt", false)) {
            temp.write(list.toString());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static List<Integer> createList(int size) {
        List<Integer> temp = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < 150; i++)
            temp.add(i, random.nextInt(200));
        return temp;
    }

    public static List<Integer> maxValues(List<Integer> list, int size) {
        List<Integer> temp = new ArrayList<>(list.size());
        temp.addAll(list);
        Collections.sort(temp);
        return temp.subList(list.size() - size, list.size());
    }

}
