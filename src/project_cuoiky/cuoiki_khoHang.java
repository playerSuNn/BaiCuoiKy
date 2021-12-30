package project_cuoiky;

public class cuoiki_khoHang {
    private String tenSP;
    private String maSP;
    private double giaSP;
    private int soluongSP;

    public cuoiki_khoHang(){}

    public cuoiki_khoHang(String tenSP,String maSP,double giaSP,int soluongSP)
    {
        super();
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.giaSP = giaSP;
        this.soluongSP = soluongSP;
    }

    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public double getGiaSP() {
        return giaSP;
    }
    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
    public int getSoluongSP() {
        return soluongSP;
    }
    public void setSoluongSP(int soluongSP) {
        this.soluongSP = soluongSP;
    }
    
}
