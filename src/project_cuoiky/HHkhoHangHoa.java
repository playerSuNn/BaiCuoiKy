package project_cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class HHkhoHangHoa {
    private String id;//mã hàng
    private String tenMonHang;
    private double giaCa;
    private int soluong;
    private Date ngayNhap;

    public HHkhoHangHoa(String id, String tenMonHang, double giaCa, int soluong, String ngayNhap) throws ParseException
    {
        this.id = id;
        this.tenMonHang = tenMonHang;
        this.giaCa = giaCa;
        this.soluong = soluong;
        this.ngayNhap = hoanDoichuoiNgay(ngayNhap);
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setGiaCa(double giaCa) {
        this.giaCa = giaCa;
    }
    public double getGiaCa() {
        return giaCa;
    }
    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    public Date getNgayNhap() {
        return ngayNhap;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setTenMonHang(String tenMonHang) {
        this.tenMonHang = tenMonHang;
    }
    public String getTenMonHang() {
        return tenMonHang;
    }
    public static Date hoanDoichuoiNgay(String hoanDoi) throws ParseException
    {
        Date date;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(hoanDoi);//phân tích cú pháp
        return date;
    }
    public static String hoanDoingayChuoi(Date date)
    {
        String chuoiNgay = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        chuoiNgay = simpleDateFormat.format(date);
        return chuoiNgay;
    }
    public double thanhToan()
    {
        return (double)(getSoluong()*getGiaCa());
    }
    DecimalFormat df = new DecimalFormat("###,###,### VND");
    public String toString()
    {
        String s = " ";
        s+=String.format("|%-8s|%-25s|%-25s|%-23s|%-20s|", getId(),getTenMonHang(),getSoluong(), df.format(getGiaCa()),hoanDoingayChuoi(getNgayNhap()));
        return s;
    }

}
