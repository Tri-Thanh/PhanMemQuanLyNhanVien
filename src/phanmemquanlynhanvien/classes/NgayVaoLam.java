package phanmemquanlynhanvien.classes;

public class NgayVaoLam {

    private int ngayVaoLam, thangVaoLam, namVaoLam;
    private String ngayThangNamVaoLam;

    /*
    COSNTRUCTOR
     */
    public NgayVaoLam() {
    }

    public NgayVaoLam(int ngayVaoLam, int thangVaoLam, int namVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
        this.thangVaoLam = thangVaoLam;
        this.namVaoLam = namVaoLam;
    }

    public NgayVaoLam(String ngayThangNamVaoLam) {
        this.ngayThangNamVaoLam = ngayThangNamVaoLam;
    }

    /*
    SETTER
     */
    public void setNgaySinh(int ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public void setThangSinh(int thangVaoLam) {
        this.thangVaoLam = thangVaoLam;
    }

    public void setNamSinh(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    /*
    GETTER
     */
    public int getNgaySinh() {
        return ngayVaoLam;
    }

    public int getThangSinh() {
        return thangVaoLam;
    }

    public int getNamSinh() {
        return namVaoLam;
    }
}
