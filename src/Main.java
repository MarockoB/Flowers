import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String bukvi = readBukvi();
        flower(bukvi);
    }
    private static String readBukvi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Требуется вывести три английских буквы: «G», «C» и «V» (заглавные буквы без пробелов) ");
        String s = scanner.next();
        return s;
    }

    private static void flower(String bukvi) {
        for (char symbol : bukvi.toCharArray()) {
            switch (symbol) {
                case 'G': geran();  break;
                case 'C': krokus(); break;
                case 'V': fialka(); break;

                default: System.out.println("Сбой программы");
            }
        }
    }

    public static void geran() {
        System.out.println("Герань");

    }
    public static void krokus( ) {
        System.out.println("Крокус");

    }
    public static void fialka() {
        System.out.println("Фиалка");

    }
}