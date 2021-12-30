package project_cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;

public class HHsanhsu extends HHkhoHangHoa{
    private String noiSanxuat;

    public HHsanhsu(String id, String tenMonHang, double giaCa, int soluong, String ngayNhap, String noiSanxuat) throws ParseException
    {
        super("HSS-" + id, tenMonHang, giaCa, soluong, ngayNhap);
        this.noiSanxuat = noiSanxuat;
    }
    public void setNoiSanxuat(String noiSanxuat) {
        this.noiSanxuat = noiSanxuat;
    }
    public String getNoiSanxuat() {
        return noiSanxuat;
    }

    DecimalFormat df = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s;
        s = super.toString() + String.format("%-20s|%-20s|", getNoiSanxuat(),df.format(thanhToan()));
        return s;
    }
    
    
}
