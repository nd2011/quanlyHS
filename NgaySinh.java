public class NgaySinh {
    protected int ngay, thang, nam;

    public NgaySinh(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    // Các phương thức getter
    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    // Phương thức kiểm tra ngày tháng năm hợp lệ
    public boolean kiemTraNgayThang() {
        // Kiểm tra năm nhuận
        boolean namNhuan = nam % 4 == 0 && (nam % 100 != 0 || nam % 400 == 0);

        // Kiểm tra số ngày của từng tháng
        if (thang < 1 || thang > 12)
            return false;
        if (thang == 2) // Tháng 2
            return (namNhuan && ngay >= 1 && ngay <= 29) || (!namNhuan && ngay >= 1 && ngay <= 28);
        else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) // Tháng 4, 6, 9, 11
            return ngay >= 1 && ngay <= 30;
        else // Các tháng còn lại
            return ngay >= 1 && ngay <= 31;
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
} 

