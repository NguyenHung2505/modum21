import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("nhap nam");
        year = sc.nextInt();
        boolean namnhuan = false;
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    namnhuan =true;
                }
            } else {
                namnhuan = true;
            }
        }
        if (namnhuan){
            System.out.println(year + " là năm nhuận");
        }
        else {
            System.out.println(year + " không là năm nhuận");
        }
    }
}