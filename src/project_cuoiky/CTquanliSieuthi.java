package project_cuoiky;

import java.util.Scanner;

public class CTquanliSieuthi {
    public static void main(String[] args) {
        int luaChon;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("|----------SIÊU THỊ LONG AN----------|");
            System.out.println("|      ---Chào mừng quý khách---     |");
            System.out.println("|1.Lựa chọn hàng hóa                 |");
            System.out.println("|2.Kiểm tra hàng(thêm/bớt)           |");
            System.out.println("|3.Sắp xếp                           |");
            System.out.println("|4.Thống kê số hàng                  |");
            System.out.println("|5.Thoát chương trình                |");
            System.out.println("|____________________________________|");
            System.out.println("Nhập chức năng bạn muốn thực hiện");
            luaChon = sc.nextInt();
            switch(luaChon)
            {
                case 1:break;
                case 2:
                case 3:
                case 4:
                case 5:
                default :
                {
                    System.out.println("Sai chức năng \nTự động quay lại giao diện mặc định \n(yes/no)");
                    sc.nextLine();
                }
            }
        }while(sc.nextLine().equals("y"));
    }
    
}
