package phanmemquanlynhanvien.classes;

import java.util.HashMap;

public class LuongNhanVien {

    private NhanVien nhanVien;
    private int luongCoBan;
    private double tongGioLamViec;
    private double baoHiemXaHoi = 0.08, baoHiemYTe = 0.015;
    private double bonuses;

    /*
    CONSTRUCTOR
     */
    public LuongNhanVien() {
    }

    public LuongNhanVien(NhanVien nhanVien,
            int luongCoBan,
            double tongGioLamViec) {
        this.nhanVien = nhanVien;
        this.luongCoBan = luongCoBan;
        this.tongGioLamViec = tongGioLamViec;
        this.bonuses = setBonuses();
    }

    /*
    SETTER
     */
    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setTongGioLamViec(int tongGioLamViec) {
        this.tongGioLamViec = tongGioLamViec;
        this.bonuses = setBonuses();
    }

    /*
    GETTER
     */
    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public double getTongGioLamViec() {
        return tongGioLamViec;
    }

    /*
    METHODS
     */
 /*
    Tinh Luong phu cap:
       lamThemGio = tongGioLamViec - 240;
        - lamThemGio > 10 --> bonuses = 20% luongCoBan
        - lamThemGio > 20 --> bonuses = 15% luongCoBan
        - lamThemGio > 25 --> bonuses = 25% luongCoBan
        - lamThemGio > 30 --> bonuses = 30% luongCoBan
     */
    public double setBonuses() {
        double lamThemGio = this.tongGioLamViec - 240;
        if(lamThemGio > 0 && lamThemGio <= 10){
            return 0.1;
        }else if(lamThemGio > 10 && lamThemGio <= 20){
            return 0.15;
        }else if(lamThemGio > 20 && lamThemGio <= 25){
            return 0.25;
        }else if(lamThemGio > 30){
            return 0.3;
        }else{
            return 0;
        }
    }
}
