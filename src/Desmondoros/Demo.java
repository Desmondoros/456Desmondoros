package desmondoros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by student on 10.04.2016.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        doWhileDemo();
    }

    public static void whileDemo() {
        int x = 0;
        while (x < 10) {
            System.out.format("%s Hello World!\na=%s b=%s x=%s\n", x, 10, 20, x + 2);
            x = x + 1;
        }
    }

    public static void forDemo(){
        for(int a=1; a<11; a++){
            System.out.format("%s. Hello world!\n", a);
        }
    }

    public static void doWhileDemo(){
        int a=20;
        do{
            System.out.format("%s. Hello world!\n", a);
            a++;
        }
        while(a<10);
    }


    public static void castDemo() {
        double a = (double) 1;
        int b = 1;
        int c = (int) 1.7d;
        String s = "" + c + a;
        System.out.println(s);
        double x = Double.parseDouble(s);
        System.out.println(x);
        //int y = Integer.parseInt(s);
        int y = (int) x;
        System.out.println(y);
    }

    public static void arrayDemo() {
        String[] list = new String[100];
        list[0] = "hello";
        list[1] = "world";
        System.out.format("length = %s\n", list.length);

        String[] a;
        a = list;
        a[2] = "xxx";

        System.out.println(a[2]);
        System.out.println(list[0]);
        System.out.println(list[1]);

    }

    public static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    public static void wordsAndNumbersArray() throws IOException {
        String[] strList = new String[100];
        Double[] dblList = new Double[100];
        int str = 0;
        int dbl = 0;
        int a = 0;
        while (true) {
            System.out.format("Введите строку №%s:\n", a + 1);
            String s = null;
            try {
                s = stdIn.readLine();
                a++;
                if (s.length() == 0) break;
                dblList[dbl] = Double.parseDouble(s);
                dbl++;
            } catch (NumberFormatException e) {
                strList[str] = s;
                str++;
            }
        }
        System.out.format("\nВы ввели %s строк(у):\n", str + dbl);
        Arrays.sort(strList, 0, str);
        Arrays.sort(dblList, 0, dbl);
        int x = 0;
        int y = 0;
        while (x < str) {
            System.out.println(strList[x]);
            x++;
        }
        while (y < dbl) {
            System.out.println(dblList[y]);
            y++;
        }
    }

    public static void oneStringArray(String[] kaktoIn, String outOne) throws IOException {
        String[] strList = new String[100];
        Double[] dblList = new Double[100];
        int str = 0;
        int dbl = 0;
        int a = 0;
        int lngh = 0;
        System.out.println (outOne);
        while (true) {
            String s = null;
            try {
                s = kaktoIn[a];
                a++;
                lngh=kaktoIn.length;
                if (a == lngh) break;
                dblList[dbl] = Double.parseDouble(s);
                dbl++;
            } catch (NumberFormatException e) {
                strList[str] = s;
                str++;
            }
        }
        Arrays.sort(strList, 0, str);
        Arrays.sort(dblList, 0, dbl);
        int x = 0;
        int y = 0;
        while (x < str) {
            System.out.println(strList[x]);
            x++;
        }
        while (y < dbl) {
            System.out.println(dblList[y]);
            y++;
        }
    }

    public static void splitDemo() throws IOException {
        System.out.println("Введите числа и слова через ПРОБЕЛ!");
        String s = stdIn.readLine();
        String[] strArray = s.split(" ");
        oneStringArray(strArray, "");
    }
}
