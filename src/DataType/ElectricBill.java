package DataType;

/*
Viết chương trình tính tiền điện gồm các khoảng sau:

        – Tiền thuê bao điện kế: 1000đ/tháng

            – Định mức sử dụng điện cho mỗi hộ là: 50 KW với giá 230đ/KW

            – Nếu phần vượt định mức <= 50KW thì tính giá 480đ/KW

            – Nếu 50KW < phần vượt định mức < 100KW thì tính giá 700đ/KW

            – Nếu phần vượt định mức >= 100KW thì tính giá 900đ/KW

Chỉ số mới và cũ được nhập vào từ bàn phím

            – In ra màn hình chỉ số cũ, chỉ số mới, tiền trả định mức, tiền trả vượt định mức, tổng tiền phải trả.
*/
import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" === Program to calculate the amount of electric bill === ");

        System.out.print("Nhap vao so dien cu = ");
        int SoDienCu = sc.nextInt();
        System.out.print("Nhap vao so dien moi = ");
        int SoDienMoi = sc.nextInt();

        int SoDien = SoDienMoi - SoDienCu;
        int SoTien = 1000;

        if (SoDien < 50) {
            SoTien = SoDien + (SoDien * 230);
        } else if (SoDien < 100) {
            SoTien = SoDien + 49 * 230 + ((SoDien - 49) * 480);
        } else if (SoDien < 150) {
            SoTien = SoDien + 49 * 230 + ((SoDien - 49) * 480) + ((SoDien - 98) * 700);
        } else {
            SoTien = SoDien + 49 * 230 + ((SoDien - 49) * 480) + ((SoDien - 98) * 700) + ((SoDien - 140) * 900);
        }

        if (SoDien < 50) {
            System.out.println("Tien tra dinh muc = " + (SoDien * 230 + 1000));
        } else {
            System.out.println("Tien tra dinh muc = " + 49 * 230);
            System.out.println("Tien tra vuot dinh muc = " + (SoDien - (49 * 230)));
            System.out.println("Tong tien phai tra la = " + SoTien);
        }
    }
}
