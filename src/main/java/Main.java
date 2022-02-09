import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // task #1
        double inch = 2.54;

        double centimeter = 10 / inch;
        double sdf = inch * 25;

        {
            System.out.println("TASK 1");
            System.out.println(centimeter + " inches in 10 centimeters");
            System.out.println(sdf + " centimeters in 25 inches");
        }
        //task #2
        int euro = 28;
        int suma = 5000 * 2 / euro;

        {
            System.out.println("TASK 2");
            System.out.println("Vasya has " + suma + " euros for the trip");
        }

        System.out.println("TASK 3");
        Scanner s = new Scanner(System.in);
        int num = s.hasNext() ? s.nextInt() : 0;
        {
            System.out.println(num % 10 + " " + num / 10);
        }
        System.out.println("TASK 4");
        Scanner x = new Scanner(System.in);
        int numb = x.hasNext() ? x.nextInt() : 0;
        {
            System.out.println(numb - numb % 10 + "+" + numb % 10);
        }
        System.out.println("TASK 5");
        Scanner y = new Scanner(System.in);
        int numbe = y.hasNext() ? y.nextInt() : 0;

        System.out.println(numbe % 10 + numbe / 10);

        System.out.println("TASK 7");
        Scanner z = new Scanner(System.in);
        int number = z.hasNext() ? z.nextInt() : 0;
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println("The number is zero");
        } else if (number < 0) {
            System.out.println("The number is negative");
        }


        System.out.println("TASK 8");
        Scanner k = new Scanner(System.in);
        int numberr = k.hasNext() ? k.nextInt() : 0;
        if (numberr >= 100) {
            System.out.println(numberr - 1);
        } else if (numberr <= 99) {
            System.out.println(numberr);
        }

        System.out.println("TASK 9");
        Scanner m = new Scanner(System.in);
        int nnumber = m.hasNext() ? m.nextInt() : 0;
        if (nnumber >= 10 && nnumber <= 99) {
            if (nnumber > nnumber % 10 + nnumber / 10) {
                System.out.println(nnumber);
            } else if (nnumber < nnumber % 10 + nnumber / 10) {
                System.out.println(nnumber);
            }
        } else if (nnumber >= 100) {
            System.out.println(nnumber);
        }

    }

}