
    class Diem extends Nguoi {
        protected float toan, van, anh, ly, sinh, su, dia;
    
        public Diem(String hoTen, String queQuan, NgaySinh ngaySinh, float toan, float van, float anh, float ly, float sinh, float su, float dia) {
            super(hoTen, queQuan, ngaySinh);
            this.toan = toan;
            this.van = van;
            this.anh = anh;
            this.ly = ly;
            this.sinh = sinh;
            this.su = su;
            this.dia = dia;
        }
    
        // Các phương thức getter
        public float getToan() {
            return toan;
        }
    
        public float getVan() {
            return van;
        }
    
        public float getAnh() {
            return anh;
        }
    
        public float getLy() {
            return ly;
        }
    
        public float getSinh() {
            return sinh;
        }
    
        public float getSu() {
            return su;
        }
    
        public float getDia() {
            return dia;
        }
    
        // Tính điểm trung bình
        public float tinhDiemTrungBinh() {
            return (toan + van + anh + ly + sinh + su + dia) / 7;
        }
    
        @Override
        public String toString() {
            return super.toString() + ", Toan: " + toan + ", Van: " + van + ", Anh: " + anh +
                    ", Ly: " + ly + ", Sinh: " + sinh + ", Su: " + su + ", Dia: " + dia + ", DTB: " + tinhDiemTrungBinh();
        }
    }

