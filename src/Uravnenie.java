/**
 * Created by Александр on 15.02.2015.
 */
public class Uravnenie {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 1.0;
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (Math.sqrt(d) - b) / (2 * a);
            double x2 = (-Math.sqrt(d) - b) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        else
            if (d == 0) {
                double x = (-b / (2 * a));
                System.out.println("x=" + x);
            }
            else
                System.out.println("Уравнение не содержит действительных переменных");


    }
}

