package thuchanh.th4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        // khoi tao doi tuong tu lop calculator
        Calculator calculator = new Calculator( ) ;
        // nhap vao 2 so a va b
        System.out.println("Nhap vao so a = ");
        double a = sc.nextDouble();
        System.out.println("Nhap vao so b = ");
        double b = sc.nextDouble();
       calculator.setA(a);
       calculator.setB(b);

        // dat gia tri cho 2 thuoc tinh cua doi tuong calculator


        // hien thi ca ket qua phep toan
        System.out.println("Tong cua 2 = " + calculator.sum());
        System.out.println("Hieu cua 2 = " + calculator.sub());
        System.out.println("Tich cua 2 = " + calculator.multi());
        System.out.println("Thuong cua 2 = " + calculator.div());
    }
}
