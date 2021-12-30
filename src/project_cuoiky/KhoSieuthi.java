package project_cuoiky;

import java.util.Calendar;
import java.util.Scanner;

public class KhoSieuthi {
    private String thucPham;
    private String sanhSu;
    private String dienMay;
    private double giatien;


    static DateDemo ngaygio = new DateDemo();

    static Scanner sc = new Scanner(System.in);


    KhoSieuthi(){}

    void KhoSieuthi(String thucPham,String sanhSu,String dienMay)
    {
        thucPham = thucPham;
        sanhSu = sanhSu;
        dienMay = dienMay;
    }

    public void ngayThangnam()
    {
        Calendar lich = Calendar.getInstance();
        System.out.println(lich.getTime());
    }

    public void nhapThongtin()
    {
        System.out.println("Hàng THUC PHAM : ");
        System.out.println("Mã hàng : HTP001");
        System.out.print("Tên sản phẩm : ");
        thucPham = sc.nextLine();
        System.out.print("Giá tiền : ");
        giatien = sc.nextDouble();
        System.out.println("Hàng SANH SU : ");
        System.out.println("Mã hàng : HSS001");
        System.out.print("Tên sản phẩm : ");
        sanhSu = sc.nextLine();
        System.out.print("Giá tiền : ");
        giatien = sc.nextDouble();
        System.out.println("Hàng DIEN MAY : ");
        System.out.println("Mã hàng : HDM001");
        System.out.print("Tên sản phẩm : ");
        dienMay = sc.nextLine();
        System.out.print("Giá tiền : ");
        giatien = sc.nextDouble();
    }
    public void inThongtin()
    {
        Calendar lich = Calendar.getInstance();
        System.out.println("Hàng THỰC PHẨM");
        System.out.println("Mã hàng : ");
        System.out.println("Tên hàng : "+thucPham);
        System.out.println("Giá tiền  : "+giatien);
        System.out.println("Ngày nhập hàng : "+lich.getTime());
        /*System.out.println("Hang THUC PHAM");
        System.out.println("|ma hang|"+"          |gia tien|"+"      |ngay|");
        System.out.println("--------------------------------------------------");
        System.out.println("|"+thucPham+"                            |"+lich.getTime());
        System.out.println("--------------------------------------------------");
        System.out.println("Hang SANH SU");
        System.out.println("--------------------------------------------------");
        System.out.println("|"+sanhSu+"                              |"+lich.getTime());
        System.out.println("--------------------------------------------------");
        System.out.println("Hang DIEN MAY");
        System.out.println("--------------------------------------------------");
        System.out.println("|"+dienMay+"                             |"+lich.getTime());
        System.out.println("--------------------------------------------------");*/

    }
}
