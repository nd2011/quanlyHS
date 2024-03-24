import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    private List<HocSinh> danhSachHocSinh;

    public QuanLy() {
        this.danhSachHocSinh = new ArrayList<>();
    }

    public void nhapDS(int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("\n\t\tNhap Thong Tin Cua Hoc Sinh Thu " + (i + 1));
            System.out.print("Nhap ho va ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Nhap que quan: ");
            String queQuan = scanner.nextLine();
            System.out.println("Nhap ngay sinh: ");
            System.out.print("Nhap ngay: ");
            int ngay = scanner.nextInt();
            System.out.print("Nhap thang: ");
            int thang = scanner.nextInt();
            System.out.print("Nhap nam: ");
            int nam = scanner.nextInt();
            NgaySinh ngaySinh = new NgaySinh(ngay, thang, nam);
            System.out.print("Nhap diem toan: ");
            float toan = scanner.nextFloat();
            System.out.print("Nhap diem van: ");
            float van = scanner.nextFloat();
            System.out.print("Nhap diem anh: ");
            float anh = scanner.nextFloat();
            System.out.print("Nhap diem ly: ");
            float ly = scanner.nextFloat();
            System.out.print("Nhap diem sinh: ");
            float sinh = scanner.nextFloat();
            System.out.print("Nhap diem su: ");
            float su = scanner.nextFloat();
            System.out.print("Nhap diem dia: ");
            float dia = scanner.nextFloat();
            scanner.nextLine(); // Đọc bỏ dòng newline

            System.out.print("Nhap lop: ");
            String lop = scanner.nextLine();
            System.out.print("Nhap ma sinh vien: ");
            String msv = scanner.nextLine();

            HocSinh hocSinh = new HocSinh(hoTen, queQuan, ngaySinh, toan, van, anh, ly, sinh, su, dia, lop, msv);
            danhSachHocSinh.add(hocSinh);
            System.out.println("\t\t--------------------------------------");
        }
    }

    public void xuatDS() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sach hoc sinh rong!");
            return;
        }
        System.out.println("\n\t\tTHONG TIN HOC SINH\n");
        System.out.printf("%-20s%-20s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "Ho Ten", "Que Quan", "Ngay Sinh", "Toan", "Van", "Anh", "Ly", "Sinh", "Su", "Dia", "DTB", "Lop");
        for (HocSinh hocSinh : danhSachHocSinh) {
            System.out.printf("%-20s%-20s%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15s\n",
                    hocSinh.getHoTen(), hocSinh.getQueQuan(), hocSinh.getNgaySinh(), hocSinh.getToan(), hocSinh.getVan(),
                    hocSinh.getAnh(), hocSinh.getLy(), hocSinh.getSinh(), hocSinh.getSu(), hocSinh.getDia(),
                    hocSinh.tinhDiemTrungBinh(), hocSinh.getLop());
        }
    }

    public void sapXepTheoDTB() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sach hoc sinh rong!");
            return;
        }
        danhSachHocSinh.sort(Comparator.comparing(HocSinh::tinhDiemTrungBinh).reversed());
        System.out.println("Danh sach hoc sinh da duoc sap xep theo diem trung binh giam dan.");
    }

    public void xoaHocSinh(String msv) {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sach hoc sinh rong!");
            return;
        }
        boolean found = false;
        Iterator<HocSinh> iterator = danhSachHocSinh.iterator();
        while (iterator.hasNext()) {
            HocSinh hocSinh = iterator.next();
            if (hocSinh.getMsv().equals(msv)) {
                iterator.remove();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay hoc sinh co MSV " + msv + " trong danh sach.");
        } else {
            System.out.println("Da xoa hoc sinh co MSV " + msv + ".");
        }
    }

    public HocSinh timKiem(String msv) {
        for (HocSinh hocSinh : danhSachHocSinh) {
            if (hocSinh.getMsv().equals(msv)) {
                return hocSinh;
            }
        }
        return null;
    }
}
