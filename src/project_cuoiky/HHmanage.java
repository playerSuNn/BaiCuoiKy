package project_cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class HHmanage {
    private static final int Comparator = 0;
    private ArrayList<HHkhoHangHoa> list ;
    private Scanner sc = new Scanner(System.in);

    HHmanage(){
        list = new ArrayList<HHkhoHangHoa>(30);
    }
    public ArrayList<HHkhoHangHoa> getList() {
        return list;
    }
    public void setList(ArrayList<HHkhoHangHoa> list) {
        this.list = list;
    }
    //CHỨC NĂNG THÊM HÀNG HÓA TRỰC TIẾP
    public void themNhanh(HHkhoHangHoa x) throws ParseException{
        int dem = 0 ;
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa sanPham = list.get(i);
            if(sanPham.getId().equalsIgnoreCase(x.getId()) || sanPham.getId().equalsIgnoreCase("HTP-") ||sanPham.getId().equalsIgnoreCase("HSS-") || sanPham.getId().equalsIgnoreCase("HDM-") ){
                System.out.println("HANG HOA BI TRUNG !!!!  VUI LONG NHAP LAI !!!!");
                dem++ ;
                them();
                break;
            }
        }
        if(dem == 0){
            list.add(x);
        }
    }
    //CHỨC NĂNG THÊM HÀNG HÓA BẰNG DỮ LIỆU NHẬP TỪ BÀN PHÍM
    public void them() throws ParseException {
        System.out.println("=============MENU=============");
        System.out.println("| 1.Hang thuc pham           |");
        System.out.println("| 2.Hang sanh su             |");
        System.out.println("| 3.Hang dien may            |");
		System.out.println("| 0.Quay lai                 |");
        System.out.println("=============MENU=============");
        System.out.print("Nhap lua chon loai hang hoa : ");
    	int luaChon = sc.nextInt();
        HHkhoHangHoa x;
        switch(luaChon){
            case 1 : {
				//HÀNG THỰC PHẨM
				System.out.println("\n\n\tNHAP THONG TIN HANG THUC PHAM");
                System.out.print("Nhap ma hang hoa : ");
				sc.nextLine();
				String idHH = sc.nextLine();
				System.out.print("Nhap ten hang hoa (khong dau) : ");
				String tenHH = sc.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soluong = sc.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int giaHH = sc.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                sc.nextLine();
				String ngayNK = sc.nextLine();
                System.out.print("Nhap ngay het han (dd/mm/yyyy) : ");
				String ngayHH = sc.nextLine();
				x = new HHthucpham( idHH, tenHH , giaHH , soluong , ngayNK , ngayHH );
				themNhanh(x);
                break;
            }
			case 2 : {
				//HÀNG SÀNH SỨ
				System.out.println("\n\n\tNHAP THONG TIN HANG SANH SU"); 
                System.out.print("Nhap ma hang hoa : ");
				sc.nextLine();
				String idHH = sc.nextLine();
				System.out.print("Nhap ten hang hoa (khong dau) : ");
				String tenHH = sc.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soluong = sc.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int giaHH = sc.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                sc.nextLine();
				String ngayNK = sc.nextLine();
                System.out.print("Nhap nha cung cap : ");
                String nhaCC = sc.nextLine();
				x = new HHsanhsu(idHH, tenHH, giaHH , soluong , ngayNK , nhaCC);
                themNhanh(x);
                break;
			}
			case 3 : {
				//HÀNG ĐIỆN TỬ
				System.out.println("\n\n\tNHAP THONG TIN HANG DIEN TU");
                System.out.print("Nhap ma hang hoa : ");
				sc.nextLine();
				String idHH = sc.nextLine();
				System.out.print("Nhap ten hang hoa (khong dau) : ");
				String tenHH = sc.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soluong = sc.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int giaHH = sc.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                sc.nextLine();
				String ngayNK = sc.nextLine();
                System.out.print("Nhap cong suat thiet bi : ");
                int P =sc.nextInt();
                System.out.println("Nhap thoi gian bao hanh : ");
                int t = sc.nextInt();
				x = new HHdienmay(idHH, tenHH , giaHH , soluong, ngayNK, P , t) ;
				themNhanh(x);
                break;
			}
			default : break;
        } 
	}
    //CHỨC NĂNG XÓA HÀNG HÓA THEO MÃ HÀNG
    public void xoa(){
        int dem = 0;
        sc.nextLine();
        System.out.print("Nhap ma hang hoa can xoa (Ma Hang Hoa Vd HDM-123) : ");
		String idHH = sc.nextLine();
		for(int i = 0 ; i <list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x.getId().equals(idHH)){
                list.remove(x);
                System.out.println("Da xoa hang hoa co ma " + idHH + " khoi danh sach !!!");
            }
            else dem++;
        }
        if(dem == list.size()){
            System.out.println("Khong co ma hang " + idHH + " trong danh sach !!! Enter de nhap lai !!!");
            xoa();
        }
    }
    //xuất hàng 
    public void xuatHHthucpham(){
        System.out.println("HANG THUC PHAM");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","ID","Ten Mon Hang","So Luong","Gia Nhap","Ngay Nhap","Han Su Dung","Tong gia tien");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HHkhoHangHoa HHkhoHangHoa : list) {
            if(HHkhoHangHoa instanceof HHthucpham){
                System.out.println(HHkhoHangHoa);
            }
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();

    }
    public void xuatHHsanhsu(){
        System.out.println("HANG SANH SU");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","ID","Ten Mon Hang","So Luong","Gia Nhap","Ngay Nhap","Noi San Xuat","Tong gia tien");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HHkhoHangHoa HHkhoHangHoa : list) {
            if(HHkhoHangHoa instanceof HHsanhsu){
                System.out.println(HHkhoHangHoa);
            }
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatHHdienmay(){
        System.out.println("HANG DIEN MAY");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|%-20s|\n","ID","Ten Mon Hang","So Luong","Gia Nhap","Ngay Nhap","Cong suat(P)","Bao Hanh","Tong gia tien");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HHkhoHangHoa HHkhoHangHoa : list) {
            if(HHkhoHangHoa instanceof HHdienmay){
                System.out.println(HHkhoHangHoa);
            }
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatHHthucphamTrucTiep(HHkhoHangHoa x){
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","ID","Ten Mon Hang","So Luong","Gia Nhap","Ngay Nhap","Han su dung","Tong gia tien");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();

    }
    public void xuatHHsanhsuTrucTiep(HHkhoHangHoa x){
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","ID","Ten Mon Hang","So Luong","Gia Nhap","Ngay Nhap","Noi San Xuat","Tong gia tien");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatHHdienmayTrucTiep(HHkhoHangHoa x){
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|%20-s|\n","ID","Ten Mon Hang","So Luong","Gia Nhap","Ngay Nhap","Cong suat(P)","Bao hanh","Tong gia tien");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatHHthucphamTheoDanhSach(ArrayList<HHkhoHangHoa> l){
        System.out.println("\t\t\t\t\t\t\t\tHANG THUC PHAM");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","ID","Ten Mon Hang","So Luong","Gia Nhap","Ngay Nhap","Han su dung","Tong gia tien");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HHkhoHangHoa HHkhoHangHoa : l) {
            System.out.println(HHkhoHangHoa);
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();

    }
    public void xuatHHsanhsuTheoDanhSach(ArrayList<HHkhoHangHoa> l){
        System.out.println("\t\t\t\t\t\t\t\tHANG SANH SU");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","ID","Ten Mon Hang","So Luong","Gia Nhap","Ngay Nhap","Noi San Xuat","Tong gia tien");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HHkhoHangHoa HHkhoHangHoa : l) {
            System.out.println(HHkhoHangHoa);
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();

    }
    public void xuatHHdienmayTheoDanhSach(ArrayList<HHkhoHangHoa> l){
        System.out.println("\t\t\t\t\t\t\t\tHANG DIEN MAY");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|%-20s|\n","ID","Ten Mon Hang","So Luong","Gia Nhap","Ngay Nhap","Cong suat(P)","Bao hanh","Tong gia tien");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HHkhoHangHoa HHkhoHangHoa : l) {
            System.out.println(HHkhoHangHoa);
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatTatCa(){
        for(int i = 0 ; i < list.size() ; i++){
           HHkhoHangHoa x = list.get(i);
            if(x instanceof HHthucpham){
                xuatHHthucphamTrucTiep(x);
            }
            else if(x instanceof HHsanhsu){
                xuatHHsanhsuTrucTiep(x);
            }
            else if(x instanceof HHdienmay){
                xuatHHdienmayTrucTiep(x);
            }
        }
    }
    //CÁC CHỨC NĂNG SẮP XẾP TĂNG DẦN GIẢM DẦN
    public void sapXepHHkhoHangHoaGiamDanTheoGia(){
        Collections.sort(list,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getGiaCa() < o2.getGiaCa()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaCa() == o2.getGiaCa()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatTatCa();
    }
    public void sapXepHHkhoHangHoaTangDanTheoGia(){
        Collections.sort(list,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getGiaCa() < o2.getGiaCa()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaCa() == o2.getGiaCa()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatTatCa();
    }
    public void sapXepHHkhoHangHoaTangDanTheoNgay(){
        Collections.sort(list,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getNgayNhap().after(o2.getNgayNhap())){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhap().equals(o2.getNgayNhap())){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatTatCa();
    }
    public void sapXepHHkhoHangHoaGiamDanTheoNgay(){
        Collections.sort(list,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatTatCa();
    }
    public void SapXepTangDanTheoLoaiVaTheoNgayNhap(){
        ArrayList<HHkhoHangHoa> list1 = new ArrayList<HHkhoHangHoa>();
        ArrayList<HHkhoHangHoa> list2 = new ArrayList<HHkhoHangHoa>();
        ArrayList<HHkhoHangHoa> list3 = new ArrayList<HHkhoHangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x instanceof HHthucpham){
                list1.add(x);
            }
            else if(x instanceof HHsanhsu){
                list2.add(x);
            }
            else if(x instanceof HHdienmay){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHHthucphamTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHHsanhsuTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHHdienmayTheoDanhSach(list3);
    }
    public void SapXepGiamDanTheoLoaiVaTheoNgayNhap(){
        ArrayList<HHkhoHangHoa> list1 = new ArrayList<HHkhoHangHoa>();
        ArrayList<HHkhoHangHoa> list2 = new ArrayList<HHkhoHangHoa>();
        ArrayList<HHkhoHangHoa> list3 = new ArrayList<HHkhoHangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x instanceof HHthucpham){
                list1.add(x);
            }
            else if(x instanceof HHsanhsu){
                list2.add(x);
            }
            else if(x instanceof HHdienmay){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHHthucphamTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHHsanhsuTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhap().compareTo(o2.getNgayNhap()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHHdienmayTheoDanhSach(list3);
    }
    public void SapXepTangDanTheoLoaiVaTheoGia(){
        ArrayList<HHkhoHangHoa> list1 = new ArrayList<HHkhoHangHoa>();
        ArrayList<HHkhoHangHoa> list2 = new ArrayList<HHkhoHangHoa>();
        ArrayList<HHkhoHangHoa> list3 = new ArrayList<HHkhoHangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x instanceof HHthucpham){
                list1.add(x);
            }
            else if(x instanceof HHsanhsu){
                list2.add(x);
            }
            else if(x instanceof HHdienmay){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getGiaCa() < o2.getGiaCa()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaCa() == o2.getGiaCa()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHHthucphamTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getGiaCa() < o2.getGiaCa()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaCa() == o2.getGiaCa()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHHsanhsuTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getGiaCa() < o2.getGiaCa()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaCa() == o2.getGiaCa()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHHdienmayTheoDanhSach(list3);
    }
    public void SapXepGiamDanTheoLoaiVaTheoGia(){
        ArrayList<HHkhoHangHoa> list1 = new ArrayList<HHkhoHangHoa>();
        ArrayList<HHkhoHangHoa> list2 = new ArrayList<HHkhoHangHoa>();
        ArrayList<HHkhoHangHoa> list3 = new ArrayList<HHkhoHangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x instanceof HHthucpham){
                list1.add(x);
            }
            else if(x instanceof HHsanhsu){
                list2.add(x);
            }
            else if(x instanceof HHdienmay){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getGiaCa() < o2.getGiaCa()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaCa() == o2.getGiaCa()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHHthucphamTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getGiaCa() < o2.getGiaCa()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaCa() == o2.getGiaCa()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHHsanhsuTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HHkhoHangHoa>(){
            @Override
            public int compare(HHkhoHangHoa o1, HHkhoHangHoa o2) {
                if(o1.getGiaCa() < o2.getGiaCa()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaCa() == o2.getGiaCa()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHHdienmayTheoDanhSach(list3);
    }
    //CÁC CHỨC NĂNG TÌM KIẾM 
    public void timKiemTheoLoai(){
        int luaChon = 0;
        System.out.println("=========================");
		System.out.println("| 1. Hang thuc pham     |");
		System.out.println("| 2. Hang sanh su       |");
		System.out.println("| 3. Hang dien may      |");
		System.out.println("=========================");
		System.out.print("Nhap lua chon cua ban : ");
		luaChon = sc.nextInt();
		switch(luaChon){
			case 1 :{System.out.println("CAC LOAI HANG THUC PHAM LA :");
					 xuatHHthucpham();
					 break;
					}
			case 2 :{System.out.println("CAC LOAI HANG SANH SU LA : ");
					 xuatHHsanhsu();
					 break;
					}
			case 3 :{System.out.println("CAC LOAI HANG ĐIEN MAY LA :");
					 xuatHHdienmay();
					 break;
					}
		}
    }
    public void timKiemTheoNgay() throws ParseException{
        System.out.println("Nhap khoang thoi gian can tim kiem tu ngay : ");
		String ngayBatDau = sc.nextLine();
		System.out.println(" den ngay :");
		String ngayKetThuc = sc.nextLine();
        if(hoanDoichuoiNgay(ngayBatDau).compareTo(hoanDoichuoiNgay(ngayKetThuc))<=0){
            System.out.println("CAC LOAI HANG DA NHAP KHO TU NGAY " + ngayBatDau +" DEN NGAY " + ngayKetThuc + " LA :");
            for(int i = 0 ; i<list.size() ; i++){
                HHkhoHangHoa x = list.get(i);
                if(x.getNgayNhap().compareTo(hoanDoichuoiNgay(ngayBatDau)) >= 0 && x.getNgayNhap().compareTo(hoanDoichuoiNgay(ngayKetThuc))<=0  ){
                    if(x instanceof HHthucpham){
                        xuatHHthucphamTrucTiep(x);
                    }
                    else if(x instanceof HHsanhsu){
                        xuatHHsanhsuTrucTiep(x);
                    }
                    else if(x instanceof HHdienmay){
                        xuatHHdienmayTrucTiep(x);
                    }
                }
            }
        }
        else {
            System.out.println("Khoang thoi gian vua nhap khong hop le !!! Vui long nhap lai");
            timKiemTheoNgay();
        }
    }
    public void timKiemTheoGia(){
        System.out.println("Nhap khoang gia can tim kiem tu : ");
		long giaBatDau = sc.nextInt();
		System.out.println(" den : ");
		long giaKetThuc = sc.nextInt();
        if(giaBatDau <= giaKetThuc){
            for(int i = 0 ; i < list.size() ; i++){
                HHkhoHangHoa x = list.get(i);
                if(x.getGiaCa() >= giaBatDau && x.getGiaCa() <= giaKetThuc){
                    if(x instanceof HHthucpham){
                        xuatHHthucphamTrucTiep(x);
                    }
                    else if(x instanceof HHsanhsu){
                        xuatHHsanhsuTrucTiep(x);
                    }
                    else if(x instanceof HHdienmay){
                        xuatHHdienmayTrucTiep(x);
                    }
                }
            }
        }
        else{
            System.out.println("Khoang thoi gian vua nhap khong hop le !!! Vui long nhap lai");
            timKiemTheoGia();} 
    }
/*    public void timKiemSanPhamGiaTriCao(){
        HHkhoHangHoa y = list.get(0);
        long max = y.getGiaCa();

        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x.getGiaCa() > max){
                max = x.getGiaCa();
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x.getGiaCa() == max){
                System.out.println("San pham co gia tri cao nhat la : ");
                xuatHHsanhsuTrucTiep(x);
            }
        }
    } 
    public void timKiemSanPhamTongGiaTriCaoNhat(){
        HHkhoHangHoa y = list.get(0);
        long max = y.thanhToan();

        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x.thanhToan() > max){
                max = x.thanhToan();
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x.thanhToan() == max){
                System.out.println("San pham co tong gia tri cao nhat la : ");
                xuatHHsanhsuTrucTiep(x);
            }
        }
    } 
    public void timKiemSanPhamGiaTriThapNhat(){
        HHkhoHangHoa y = list.get(0);
        long max = y.getGiaCa();

        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x.getGiaCa() < max){
                max = x.getGiaCa();
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x.getGiaCa() == max){
                System.out.println("San pham co gia tri thap nhat la : ");
                xuatHHsanhsuTrucTiep(x);
            }
        }
    } 
    public void timKiemSanPhamTongGiaTriThapNhat(){
        HHkhoHangHoa y = list.get(0);
        long max = y.thanhToan();

        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x.thanhToan() < max){
                max = x.thanhToan();
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x.thanhToan() == max){
                System.out.println("San pham co tong gia tri thap nhat la : ");
                xuatHHsanhsuTrucTiep(x);
            }
        }
    } */

    public static Date hoanDoichuoiNgay(String chuoiNgay) throws ParseException{
        //ngày việt nam
        Date date;
        /**
         * dd: ngày
         * mm: tháng
         * yyyy: năm
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoiNgay);
        return date;
    }
    
    DecimalFormat ft = new DecimalFormat("###,###,### VND");
    public void thongKeTongHHkhoHangHoa(){
        long tongSoLuong = 0 ,tongChiPhi = 0;
        for (HHkhoHangHoa HHkhoHangHoa : list) {
            tongSoLuong += HHkhoHangHoa.getSoluong();
            tongChiPhi += HHkhoHangHoa.thanhToan();
        }
		SapXepTangDanTheoLoaiVaTheoGia();
        System.out.println("\t\t\t\t\t\t\t\tBANG THONG KE");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-34s|%-112d|\n","Tong so luong",tongSoLuong);
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-34s|%-25s%-67s%-20s|\n","Tong chi phi"," "," ",ft.format(tongChiPhi));
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();

    }
    public void thongKeTheoLoaiHHkhoHangHoa(){
        long tongGiaTriHTP = 0;
        long tongGiaTriHSS = 0;
        long tongGiaTriHDM = 0;
        long tongSoLuongHTP = 0;
        long tongSoLuongHSS = 0;
        long tongSoLuongHDM = 0;
        for(int i = 0 ; i < list.size() ; i++){
            HHkhoHangHoa x = list.get(i);
            if(x instanceof HHthucpham){
                tongGiaTriHTP+=x.thanhToan();
                tongSoLuongHTP+=x.getSoluong();
            }
            else if(x instanceof HHsanhsu){
                tongGiaTriHSS+=x.thanhToan();
                tongSoLuongHSS+=x.getSoluong();
            }
            else if(x instanceof HHdienmay){
                tongGiaTriHDM+= x.thanhToan();
                tongSoLuongHDM+=x.getSoluong();
            }
        }
        System.out.println("=============MENU=============");
        System.out.println("| 1.Hang thuc pham           |");
        System.out.println("| 2.Hang sanh su             |");
        System.out.println("| 3.Hang dien may            |");
		System.out.println("| 0.Quay lai                 |");
        System.out.println("=============MENU=============");
        System.out.print("Nhap lua chon loai hang hoa : ");
    	int luaChon = sc.nextInt();
        switch(luaChon){
            case 1 : {
                xuatHHthucpham();
                for (int i =0; i< 149; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-34s|%-112d|\n","Tong so luong",tongSoLuongHTP);
                for (int i =0; i< 149; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-34s|%-25s%-67s%-20s|\n","Tong chi phi"," "," ",ft.format(tongGiaTriHTP));
                for (int i =0; i< 149; i++) {
                    System.out.print("-");
                }
                System.out.println();
                break;
            }
            case 2 : {
                xuatHHsanhsu();
                for (int i =0; i< 149; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-34s|%-112d|\n","Tong so luong",tongSoLuongHSS);
                for (int i =0; i< 149; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-34s|%-25s%-67s%-20s|\n","Tong chi phi"," "," ",ft.format(tongGiaTriHSS));
                for (int i =0; i< 149; i++) {
                    System.out.print("-");
                }
                System.out.println();
                break;
            }
            case 3 : {
                xuatHHdienmay();
                for (int i =0; i< 149; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-34s|%-112d|\n","Tong so luong",tongSoLuongHDM);
                for (int i =0; i< 149; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-34s|%-25s%-67s%-20s|\n","Tong chi phi"," "," ",ft.format(tongGiaTriHDM));
                for (int i =0; i< 149; i++) {
                    System.out.print("-");
                }
                System.out.println();
                break;

            }
        }
    }
}
