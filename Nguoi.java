public class Nguoi {
    protected String hoTen, queQuan;
    protected NgaySinh ngaySinh;

    public Nguoi(String hoTen, String queQuan, NgaySinh ngaySinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    // Các phương thức getter
    public String getHoTen() {
        return hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", Que quan: " + queQuan + ", Ngay sinh: " + ngaySinh.toString();
    }
}

