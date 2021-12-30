package project_cuoiky;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
                case 1:choose();
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
    static void choose(){
        int choose1 = 0;
        Scanner sc1 = new Scanner(System.in);
        do
        {
            System.out.println("---------CÁC LOẠI HÀNG HÓA------------- ");
            System.out.println("|1.Thực phẩm                           |");
            System.out.println("|2.Đồ gốm sứ                           |");
            System.out.println("|3.Đồ điện máy                         |");
            System.out.println("|______________________________________|");
            System.out.println("Nhập chức năng bạn muốn thực hiện");
            choose1 = sc1.nextInt();
            switch(choose1)
            {
                case 1:
                {
                    System.out.println("Gian hàng thực phẩm : ");
                    System.out.println("1.Rau củ quả ");
                    System.out.println("2.Thịt cá trứng sửa");
                    System.out.println("3.Gạo ngô khoai sắn");
                };break;
                case 2:
                {
                    System.out.println("Gian hàng đồ gốm sứ :");
                    System.out.println("1.Đồ sành sứ");
                    System.out.println("2.Đồ cổ(có phân loại theo năm)");
                };break;
                case 3:
                {
                    System.out.println("Gian hàng đồ điện máy :");
                    System.out.println("1.Đồ dùng gia đình");
                    System.out.println("2.Đồ điện lạnh");
                    System.out.println("3.Đồ điện nhiệt");
                };break;
            }
        }while(choose1 != 0);
    }
    /*public static Date chuoiSangngay(String chuoiNgay) throws ParseException{
        //ngày Việt Nam
        Date date;
        /**
         * dd : ngày
         * mm : tháng 
         * yyyy : năm
         */
        /*SimpleDateFormat dmy = new SimpleDateFormat("dd/mm/yyyy");
        date = dmy.parse(chuoiNgay);
        return date;
    }
    public static String ngaySangchuoi(Date date)
    {
        String chuoiNgayVN = null;
        SimpleDateFormat dmy = new SimpleDateFormat("dd/mm/yyyy");
        chuoiNgayVN = dmy.format(date);
        return chuoiNgayVN;
    }*/
    
}
