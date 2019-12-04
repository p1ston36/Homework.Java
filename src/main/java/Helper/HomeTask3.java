package Helper;

import java.util.Scanner;

public class HomeTask3 {
    protected String str;

    public HomeTask3 inputSting() {
        Scanner buf = new Scanner(System.in);
        System.out.println("Please, input your string: ");
        if (buf.hasNext())
            str = buf.nextLine();
        return this;
    }

    public void outputReverseString() {
        char[] tmp = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--)
            tmp[str.length() - i - 1] = str.charAt(i);
        str = new String(tmp);
        System.out.println("Reverse string is: " + str);
    }

}
