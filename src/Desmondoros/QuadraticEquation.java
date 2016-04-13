package desmondoros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by student on 10.04.2016.
 */

public class QuadraticEquation {

    public static void main (String[] args) throws IOException {
        System.out.println("Введите коэфициенты равнения ax^2+bx+c=0");
        double a=readDouble("a=","Неверное значение!");
        double b=readDouble("b=","Неверное значение!");
        double c=readDouble("c=","Неверное значение!");
        if (a==0) {
            if (b == 0) {
                System.out.println("Как а и b могут равнятся 0? Не похоже не уравнение...");
            }
            else System.out.format("%sx+%s=0 \nЛинейное уравнение! x=%s", b, c, -c/b);
        }
        else {
            // ax^2+bx+c=0 // %sx^2+%sx+%s=0\n // a, b, c,
            double d = QuadraticEquation.discriminant(a, b, c);
            System.out.println("D=" + d);
            if (d < 0) {
                System.out.format("%sx^2+%sx+%s=0\nНет ответа", a, b, c);
            } else if (d == 0) {
                System.out.format("%sx^2+%sx+%s=0\nЕсть один ответ, х=", a, b, c);
            } else {
                System.out.format("%sx^2+%sx+%s=0\nОтвет: х1=%s; x2=%s", a, b, c, (-b - Math.sqrt(d) / (2 * a)), (-b - Math.sqrt(d) / (2 * a)));
            }
        }
    }

    public static BufferedReader stdIn= new BufferedReader(new InputStreamReader(System.in));

    public static double readDouble (String prompt,String errorMsg) throws IOException {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(stdIn.readLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
    }
    static double discriminant (double a, double b, double c) { return b*b-4*a*c; }
}