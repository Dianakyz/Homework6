public class Main {
    public static void main(String[] args) {

        // Задача 1.1
        System.out.println("Задача №1.1");

        for ( int i = 1; i < 11; i++ ) {
            System.out.println(i);
        }

        // Задача 1.2
        System.out.println("Задача №1.2");

        for (int a = 10; a > 0; a--) {
            System.out.println(a);
        }

        // Задача 1.3
        System.out.println("Задача №1.3");

        for (int b = 0; b <= 17; b = b+2) {
            System.out.println(b);
        }

        // Задача 1.4
        System.out.println("Задача №1.4");

        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }

        // Задача 2.1
        System.out.println("Задача №2.1");

        for (int d = 1904; d <= 2096; d = d + 4 ) {
            if (d % 4 == 0 && d % 100 != 0 || d % 400 == 0)
            System.out.println(d + " год является високосным");
        }

        // Задача 2.2
        System.out.println("Задача №2.2");

        for ( int e = 7; e <= 98; e = e + 7) {
            System.out.print(e + " ");
        }
        System.out.println(" ");

        // Задача 2.3
        System.out.println("Задача №2.3");

        for ( int f = 1; f <= 512; f = f * 2) {
            System.out.print(f + " ");
        }
        System.out.println(" ");

        // Задача 3.1
        System.out.println("Задача №3.1");

        int cash = 29_000;
        int total = 0;

        for (int g = 0; g <= 12; g++) {
            total = total + cash;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + total + " рублей");
        }

        // Задача 3.1
        System.out.println("Задача №3.1");

        int total1 = 0;

        for (int h = 0; h <= 12; h++) {
            total1 = total1 + total1/100;
            total1 = total1 + cash;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + total1 + " рублей");
        }
    }
}