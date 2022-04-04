import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("can nang cua ban: ");
        weight = sc.nextDouble();
        System.out.printf("chieu cao cua ban: ");
        height = sc.nextDouble();

        bmi= weight/(height*height);
        System.out.printf("%-20s%s","bmi","Interpretation\n");

        if (bmi<18)
            System.out.printf("%-20.2f%s",bmi,"thieu can");
        else if (bmi<25.0)
            System.out.printf("%-20.2f%s",bmi,"binh thuong");
        else if (bmi<30.0)
            System.out.printf("%-20.2f%s",bmi,"thua can");
        else
            System.out.printf("%-20.2f%s",bmi,"bao phi");

    }
}
