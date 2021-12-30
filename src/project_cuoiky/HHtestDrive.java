package project_cuoiky;

import java.text.ParseException;
import java.util.Scanner;

public class HHtestDrive {
    public static void main(String[] args) throws ParseException {
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        //Tạo danh sách Quản lí manage
        HHmanage manage = new HHmanage();
        //Tạo đối tượng HÀNG THỰC PHẨM 
        //HHkhoHangHoa x = new HHthucpham(maHang, tenHHkhoHangHoa, giaCa, soluong, ngayNhapKho, hánudung) 
        HHkhoHangHoa sp1 = new HHthucpham("100", "Thit", 15000 ,1231, "22/11/2023","25/11/2021");
        HHkhoHangHoa sp2 = new HHthucpham("101", "Ca", 150000 ,893, "29/12/2022","01/01/2022");
        HHkhoHangHoa sp3 = new HHthucpham("102", "Trung", 100000 ,562, "26/01/2021","26/02/2021");
        HHkhoHangHoa sp4 = new HHthucpham("103", "Sua", 200000 ,747, "12/02/2020","19/02/2020");
        HHkhoHangHoa sp5 = new HHthucpham("104", "Rau", 120000 ,903, "30/11/2019","10/12/2029");
        HHkhoHangHoa sp6 = new HHthucpham("105", "Cu qua", 12000 ,2041, "13/04/2018","20/04/2018");
        //Tạo đối tượng HÀNG SÀNH SỨ
        //HHkhoHangHoa x = new HHsanhsu(maHang, tenHHkhoHangHoa, giaCa, soluong, ngayNhapKho, noiSãnuat)
        HHkhoHangHoa sp7 = new HHsanhsu("100", "Binh Hoa", 50000, 235, "20/11/2014", "Bat Trang");
        HHkhoHangHoa sp8 = new HHsanhsu("101", "Am Tra", 55000, 940, "19/11/2012", "TP HCM");
        HHkhoHangHoa sp9 = new HHsanhsu("102", "Tuong Dat", 70000, 322, "20/02/2013", "Ha Noi");
        HHkhoHangHoa sp10 = new HHsanhsu("103", "Noi Dat", 45000, 446, "30/01/2011", "Nghe An");
        HHkhoHangHoa sp11 = new HHsanhsu("104", "Chen Su", 500000, 783, "21/12/2028", "Da Nang");
        HHkhoHangHoa sp12 = new HHsanhsu("105", "Chau", 700000, 621, "30/04/2010", "Long An");
        HHkhoHangHoa sp13 = new HHsanhsu("106", "Am Su", 800000, 1225, "20/12/2015", "Bat Trang");
        //Tạo đối tượng HÀNG ĐIỆN MÁY
        //HHkhoHangHoa x = new HHdienmay(maHang, tenHHkhoHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, P , t)
        //HHkhoHangHoa spkk = new HHdienmay("122", "May Xay ", 100000, 1, "14/11/2001", 300, 3);
        HHkhoHangHoa sp14 = new HHdienmay("100", "May Lanh", 10000000, 55,"20/11/2017", 500 , 6);
        HHkhoHangHoa sp15 = new HHdienmay("101", "May Giat", 15000000, 46,"23/03/2016", 700 , 12);
        HHkhoHangHoa sp16 = new HHdienmay("102", "Ti Vi", 899000, 23,"17/07/2024", 250 , 6);
        HHkhoHangHoa sp17 = new HHdienmay("103", "May Xay Toc", 1299000, 39,"20/11/2027", 1000 , 12);
        HHkhoHangHoa sp18 = new HHdienmay("104", "Loa", 2355000, 42,"16/12/2025", 1500 , 6);
        HHkhoHangHoa sp19 = new HHdienmay("105", "May Quat", 490000, 15,"26/06/2009", 125 , 6);
        HHkhoHangHoa sp20 = new HHdienmay("106", "Am Dien", 12500000, 66,"15/05/2002", 100 , 12);
        //THÊM 20 SẢN PHẨM VÀO DANH SÁCH L SP1->SP20
        manage.themNhanh(sp1);
        manage.themNhanh(sp2);
        manage.themNhanh(sp3);
        manage.themNhanh(sp4);
        manage.themNhanh(sp5);
        manage.themNhanh(sp6);
        manage.themNhanh(sp7);
        manage.themNhanh(sp8);
        manage.themNhanh(sp9);
        manage.themNhanh(sp10);
        manage.themNhanh(sp11);
        manage.themNhanh(sp12);
        manage.themNhanh(sp13);
        manage.themNhanh(sp14);
        manage.themNhanh(sp15);
        manage.themNhanh(sp16);
        manage.themNhanh(sp17);
        manage.themNhanh(sp18);
        manage.themNhanh(sp19);
        manage.themNhanh(sp20);
        //MENU TỔNG
        System.out.println("_______________________________________________");
        System.out.println("||   TRUONG DAI HOC GIA DINH                 ||");
        System.out.println("||   TEN SINH VIEN : NGUYEN LE NHUT          ||");
        System.out.println("||   MSSV : 2008110101                       ||");
        System.out.println("||   MON : LAP TRINH HUONG DOI TUONG         ||");
        System.out.println("||   GIAO VIEN : LE HUYNH PHUOC              ||");
        System.out.println("||___________________________________________||");
		while(luaChon != 6)
        {
            System.out.println("===================MENU======================");
            System.out.println("|          1.Thao tac voi hang hoa :        |");
            System.out.println("|          2.Tim kiem theo :                |");
            System.out.println("|          3.Sap xep tang va giam theo :    |");
            System.out.println("|          4.Thong ke :                     |");
            System.out.println("|          0.Thoat chuong trinh             |");
            System.out.println("===================MENU======================\n\n\n");
            System.out.print("Nhap lua chon cua ban : ");
            luaChon = sc.nextInt();
            switch(luaChon)
            {
                case 1 : 
                {
                    //Thao tác nhập sản phẩm từ bàn phím
                    System.out.println("==========MENU===========");
                    System.out.println("| 1.1 Them hang hoa     |");
                    System.out.println("| 1.2 Xoa hang hoa      |");
                    System.out.println("| 0.  Thoat             |");
                    System.out.println("=========================");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = sc.nextInt();
                    sc.nextLine();
                    switch(luaChon){
                        case 1 : manage.them();;break;
                        case 2 : manage.xoa();;break;
                        default : break;
                    }
                    break;
                }
                case 2 : 
                {
                    //Phần tìm kiếm 
                    System.out.println("=============MENU==============");
                    System.out.println("| 2.1 Tim kiem theo loai      |");
                    System.out.println("| 2.2 Tim kiem theo ngay nhap |");
                    System.out.println("| 2.3 Tim kiem theo gia       |");
                    System.out.println("| 0.  Thoat                   |");
                    System.out.println("===============================");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = sc.nextInt();
                    switch(luaChon){
                        case 1 : manage.timKiemTheoLoai();break;
                        case 2 : manage.timKiemTheoNgay();break;
                        case 3 : manage.timKiemTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 3 : 
                {
                    //Phần sắp xếp
                    System.out.println("===================MENU=======================");
                    System.out.println("| 3. Sap xep tang va giam theo :           |");
                    System.out.println("|******---------Phan tang-------------******|");
                    System.out.println("|    3.1 Gia nhap                            |");
                    System.out.println("|    3.2 Ngay nhap                           |");
                    System.out.println("|    3.3 Loai va ngay nhap                   |");
                    System.out.println("|    3.4 Loai va gia nhap                    |");
                    System.out.println("|******---------Phan giam-------------******|");
                    System.out.println("|    3.5 Gia nhap                            |");
                    System.out.println("|    3.6 Ngay nhap                           |");
                    System.out.println("|    3.7 Loai va ngay nhap                   |");
                    System.out.println("|    3.8 Loai va gia nhap                    |");
                    System.out.println("|    0. Thoat                               |");
                    System.out.println("==============================================");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = sc.nextInt();
                    switch(luaChon){
                        case 1 : manage.sapXepHHkhoHangHoaTangDanTheoGia();break;
                        case 2 : manage.sapXepHHkhoHangHoaTangDanTheoNgay();break;
                        case 3 : manage.SapXepTangDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : manage.SapXepTangDanTheoLoaiVaTheoGia();break;
                        case 5 : manage.sapXepHHkhoHangHoaGiamDanTheoGia();break;
                        case 6 : manage.sapXepHHkhoHangHoaGiamDanTheoNgay();break;
                        case 7 : manage.SapXepGiamDanTheoLoaiVaTheoNgayNhap();break;
                        case 8 : manage.SapXepGiamDanTheoLoaiVaTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 4 : 
                {
                    //Phần thống kê
                System.out.println("==========MENU=============");
                System.out.println("| 4.1 Thong ke theo loai  |");
                System.out.println("| 4.2 Thong ke tat ca     |");
                System.out.println("| 0.  Thoat               |");
                System.out.println("===========================");
                System.out.print("Nhap lua chon cua ban : ");
                luaChon = sc.nextInt();
                switch(luaChon){
                    case 1 : manage.thongKeTheoLoaiHHkhoHangHoa();break;
                    case 2 : manage.thongKeTongHHkhoHangHoa();break;
                    default : break;
                } 
                };break;
                default : break;
                
            }
            
        }
        
    }
    
}
