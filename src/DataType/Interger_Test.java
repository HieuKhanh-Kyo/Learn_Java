package DataType;

import java.util.Scanner;

public class Interger_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a = ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b = ");
        int b = sc.nextInt();
        int tong = a + b;
        System.out.println("Tong = "+tong);
        System.out.println("Hieu = "+ Math.abs(b-a));
    }
}
