import java.util.Scanner;

public class demo11 {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        int a = 3;
//        double b = 3.5;
//        String srt = "str";
//
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextInt();
//        b = scanner.nextDouble();
//        str = scanner.nextLine();

        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào a");
        a = scanner.nextInt();
        System.out.println("nhập vào b");
        b = scanner.nextInt();
        System.out.println("tổng của chúng là" + (a + b));
    }
}
