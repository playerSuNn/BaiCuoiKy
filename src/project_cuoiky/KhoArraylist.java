package project_cuoiky;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoArraylist {
    static ArrayList<KhoSieuthi> dsHang = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public void nhapDanhSach()
    {
        while(true)
        {
            KhoSieuthi khoSieuthi = new KhoSieuthi();
            khoSieuthi.nhapThongtin();
            input.nextLine();
            dsHang.add(khoSieuthi);
            System.out.println("Nhập thêm hàng : (y/n)?");
            if(input.nextLine().equals("n"))
            break;
        }
    }
    public void xuatDanhSach(){
        for(KhoSieuthi khoSieuthi: dsHang)
        {
            khoSieuthi.inThongtin();
        }
    }
    
    
}
