import java.util.Date;

class HocSinh extends Diem {
    private String lop, msv;

    public HocSinh(String hoTen, String queQuan, NgaySinh ngaySinh, float toan, float van, float anh, float ly, float sinh, float su, float dia, String lop, String msv) {
        super(hoTen, queQuan, ngaySinh, toan, van, anh, ly, sinh, su, dia);
        this.lop = lop;
        this.msv = msv;
    }

    // Các phương thức getter và setter
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lop: " + lop + ", MSV: " + msv;
    }
}
