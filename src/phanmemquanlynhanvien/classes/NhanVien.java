package phanmemquanlynhanvien.classes;

public class NhanVien {

    private String maNV;
    private int maDinhDanh;
    private String tenNV;
    private NgaySinhNhanVien ngaySinh;
    private String gioiTinh;
    private NgayVaoLam ngayVaoLam;
    private String chucVu;
    private String diaChi;
    private String soDienThoai;
    private String maNguoiQuanLy;
    private String maPhongBan;
    private int luongCoBan;    

    /*
    CONSTRUCTOR
    */
    public NhanVien() {
    }

    public NhanVien(String maNV,
            int maDinhDanh,
            String tenNV,
            NgaySinhNhanVien ngaySinh,
            String gioiTinh,
            NgayVaoLam ngayVaoLam,
            String chucVu,
            String diaChi,
            String soDienThoai  ) {
        this.maNV = maNV;
        this.maDinhDanh = maDinhDanh;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.ngayVaoLam = ngayVaoLam;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    /*
    GETTER
     */
    public String getMaNV() {
        return maNV;
    }

    public int getMaDinhDanh() {
        return maDinhDanh;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public NgaySinhNhanVien getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setMaDinhDanh(int maDinhDanh) {
        this.maDinhDanh = maDinhDanh;
    }

    public NgayVaoLam getNgayVaoLam() {
        return ngayVaoLam;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    /*
    SETTER
     */
    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setNgaySinh(NgaySinhNhanVien ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgayVaoLam(NgayVaoLam ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
