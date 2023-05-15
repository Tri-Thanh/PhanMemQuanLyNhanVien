package phanmemquanlynhanvien.classes;



public class NgaySinhNhanVien {
    private int ngaySinh, thangSinh, namSinh;
    private String ngayThangNamSinh;
    /*
    COSNTRUCTOR
    */
    public NgaySinhNhanVien(){}
    public NgaySinhNhanVien(int ngaySinh, int thangSinh, int namSinh){
        this.ngaySinh = ngaySinh;
        this.thangSinh = thangSinh;
        this.namSinh = namSinh;
    }
    public NgaySinhNhanVien(String ngayThangNamSinh){
        this.ngayThangNamSinh = ngayThangNamSinh;
    }
    
    /*
    SETTER
    */
    public void setNgaySinh(int ngaySinh){
        this.ngaySinh =  ngaySinh;
    }
    
    public void setThangSinh(int thangSinh){
        this.thangSinh = thangSinh;
    }
    
    public void setNamSinh(int namSinh){
        this.namSinh = namSinh;
    }
    
    /*
    GETTER
    */
    public int getNgaySinh(){
        return ngaySinh;
    }
    
    public int getThangSinh(){
        return thangSinh;
    }
    
    public int getNamSinh(){
        return namSinh;
    }
}
