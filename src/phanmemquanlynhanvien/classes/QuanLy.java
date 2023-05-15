
package phanmemquanlynhanvien.classes;

import java.util.ArrayList;

public class QuanLy{
    private NhanVien nguoiQuanLy;
    private ArrayList<NhanVien> dsQuanLy;
    
    /*
    CONSTRUCTOR
    */
    public QuanLy(){
        
    }
    
    /*
    SETTER
    */
    public void setQuanLY(NhanVien nguoiQuanLy){
        this.nguoiQuanLy = nguoiQuanLy;
    }
    
    /*
    GETTER
    */
    public NhanVien getNguoiQuanLy(){
        return nguoiQuanLy;
    }
    
    public ArrayList<NhanVien> getDsQuanLy(){
        return dsQuanLy;
    }
}
