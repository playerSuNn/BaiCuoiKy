package project_cuoiky;

import java.util.Scanner;

public class testDrive {
    public static void main(String[] args) {
        KhoArraylist qlSieuthi = new KhoArraylist();
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("Siêu Thị đây");
            System.out.println("Chọn 1 2 3");
            int luaChon = sc.nextInt();
            switch(luaChon)
            {
                case 1:
                    qlSieuthi.nhapDanhSach();
                    break;
                case 2:
                    qlSieuthi.xuatDanhSach();
                    break;
                case 3:
                    System.out.println("Kết thúc");
                    System.exit(0);
                    break;
            }
            System.out.println("Quay lại menu (y/n)");
            sc.nextLine();
        }
        while(sc.nextLine().equals("y"));
    }
    
}
