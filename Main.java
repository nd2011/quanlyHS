import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLy quanLy = new QuanLy();
        int choice;
        do {
            System.out.println("\t\t==================================MENU=====================================");
            System.out.println("\t| Nhan phim 1 de nhap hoc sinh");
            System.out.println("\t| Nhan phim 2 de xuat danh sach");
            System.out.println("\t| Nhan phim 3 de sap xep theo diem trung binh");
            System.out.println("\t| Nhan phim 4 de xoa hoc sinh");
            System.out.println("\t| Nhan phim 5 de tim hoc sinh");
            System.out.println("\t| Nhan phim 0 de thoat");
            System.out.print("\n\t Vui long nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng newline

            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong hoc sinh can them: ");
                    int n = scanner.nextInt();
                    quanLy.nhapDS(n);
                    break;
                case 2:
                    quanLy.xuatDS();
                    break;
                case 3:
                    quanLy.sapXepTheoDTB();
                    break;
                case 4:
                    System.out.print("Nhap MSV hoc sinh can xoa: ");
                    String msv = scanner.nextLine();
                    quanLy.xoaHocSinh(msv);
                    break;
                case 5:
                    System.out.print("Nhap MSV hoc sinh can tim: ");
                    msv = scanner.nextLine();
                    HocSinh timHocSinh = quanLy.timKiem(msv);
                    if (timHocSinh != null) {
                        System.out.println("Tim thay hoc sinh:");
                        System.out.println(timHocSinh);
                    } else {
                        System.out.println("Khong tim thay hoc sinh co MSV " + msv + " trong danh sach.");
                    }
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        } while (choice != 0);
        scanner.close();
    }
}