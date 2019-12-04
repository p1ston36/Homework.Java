package Helper;

import java.text.Collator;
import java.util.*;

public class HomeTask4 extends HomeTask3 {

    @Override
    public HomeTask4 inputSting() {
        super.inputSting();
        return this;
    }

    public void outputSortString() {
        List<String> tmp = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (char c : str.toCharArray())
            tmp.add(String.valueOf(c));
        Collections.sort(tmp, Collator.getInstance(determineLocale(str)));
        for (String s : tmp) {
            builder.append(s);
        }
        System.out.println(builder.toString());
    }

    private Locale determineLocale(String from) {
        char[] ukr = {'і', 'ї', 'є', 'ґ', 'І', 'Ї', 'Є', 'Ґ'};
        char[] ru = {'ы', 'э', 'ъ', 'ё', 'Ы', 'Э', 'Ъ', 'Ё'};
        for (char c : ukr) {
            if (from.indexOf(c) >= 0)
                return new Locale("uk", "UA");
        }
        for (char c : ru) {
            if (from.indexOf(c) >= 0)
                return new Locale("ru", "RU");
        }
        return Locale.getDefault();
    }
}
