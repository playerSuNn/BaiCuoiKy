package project_cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;

public class HHdienmay extends HHkhoHangHoa{
    private int P;//công suất
    private int t;//thời gian bảo hành

    public HHdienmay(String id, String tenMonHang, double giaCa, int soluong, String ngayNhap, int P, int t) throws ParseException
    {
        super("HDM-" + id, tenMonHang, giaCa, soluong, ngayNhap);
        this.P = P;
        this.t = t;
    }

    public void setP(int p) {
        P = p;
    }
    public int getP() {
        return P;
    }
    public void setT(int t) {
        this.t = t;
    }
    public int getT() {
        return t;
    }

    DecimalFormat df = new DecimalFormat("#### W");
    DecimalFormat df1 = new DecimalFormat("## month");
    DecimalFormat df2 = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s;
        s = super.toString() + String.format("%-20s|%-20s|", df.format(getP()),df1.format(getT()),df2.format(thanhToan()));
        return s;
    }
    
}
