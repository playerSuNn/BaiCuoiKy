package project_cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;

public class HHthucpham extends HHkhoHangHoa{
    private Date hanSudung;

    public HHthucpham(String id, String tenMonHang,double giaCa, int soluong, String ngayNhap,String hanSudung)throws ParseException
    {
        super("HTP-" + id, tenMonHang, giaCa, soluong, ngayNhap);
        this.hanSudung = hoanDoichuoiNgay(hanSudung);
    }
    public void setHanSudung(Date hanSudung) {
        this.hanSudung = hanSudung;
    }
    public Date getHanSudung() {
        return hanSudung;
    }

    DecimalFormat df = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s;
        s = super.toString() + String.format("%-20s|%20s-|",hoanDoingayChuoi(getHanSudung()),df.format(thanhToan()));
        return s;
    }
    
}
