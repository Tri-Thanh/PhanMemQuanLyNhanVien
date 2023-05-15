package phanmemquanlynhanvien.frame.panels;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import phanmemquanlynhanvien.classes.KetNoiDatabase;

/*
        viewPanel:
            - dung de chua cac thong tin tu database
 */
public class ViewPanels extends JPanel {

    private KetNoiDatabase dB;
    private JTable bangDanhSachNhanVien;
    private JScrollPane scrollPane;

    public ViewPanels() {
        this.setBounds(300, 200, 1200, 1000);
        this.setLayout(null);
        this.setBackground(Color.green);
        this.setVisible(true);

        /*
        bangDanhSachNhanVien:
            - chua thong tin ve nhan vien
         */
        bangDanhSachNhanVien = new JTable();
        scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1200, 1000);
    }

    /*
    GETTER
     */
    public JTable getDsNhanVien() {
        return bangDanhSachNhanVien;
    }

    /*
    SETTER
     */
    public void setBangDanhSachNhanVien(JTable bangDanhSachNhanVien) {
        this.bangDanhSachNhanVien = bangDanhSachNhanVien;
    }

    public void setScrollPane(JScrollPane jsp) {
        this.scrollPane = jsp;
    }

    /*
    taoDanhSachNhanVien
     */
    public void taoDanhSachNhanVien(JTable table) {
        try {
            table = new JTable();
            dB = new KetNoiDatabase();
            ResultSet rs = dB.statement.executeQuery("SELECT * FROM danh_sach_nhan_vien");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 0, 1200, 1000);
        this.add(scrollPane);
    }

    /*
    refreshTable(): display database base on selected Item in JComboBox
     */
    public void refreshTable(String column, String selectedItem) {

        String query = "SELECT * FROM danh_sach_nhan_vien WHERE " + column + " = '" + selectedItem + "'";
        try {
            dB = new KetNoiDatabase();
            ResultSet rs = dB.statement.executeQuery(query);
            bangDanhSachNhanVien.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        scrollPane.setViewportView(bangDanhSachNhanVien);
    }

    public void refershTableAndFindNameEmp(String column, String textField) {
        String query = "SELECT * FROM danh_sach_nhan_vien WHERE lower(" + column + ") LIKE '%" + textField.toLowerCase() + "%' ";

        try {
            dB = new KetNoiDatabase();
            ResultSet rs = dB.statement.executeQuery(query);
            bangDanhSachNhanVien.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        scrollPane.setViewportView(bangDanhSachNhanVien);
    }

    /**
     * reset(JContainer container): reset viewPanels
     */
}
