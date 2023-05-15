package phanmemquanlynhanvien.frame;

import java.sql.PreparedStatement;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;

import phanmemquanlynhanvien.classes.KetNoiDatabase;
import phanmemquanlynhanvien.frame.labels.TeamLabels;
import phanmemquanlynhanvien.frame.panels.ButtonPanels;
import phanmemquanlynhanvien.frame.panels.CapNhatNhanVienPanels;
import phanmemquanlynhanvien.frame.panels.ChonNhanVienCapNhat;
import phanmemquanlynhanvien.frame.panels.SetThongTinPanels;
import phanmemquanlynhanvien.frame.panels.TimKiemPanels;
import phanmemquanlynhanvien.frame.panels.ViewPanels;
import phanmemquanlynhanvien.frame.panels.XoaNhanVienPanels;

public class MainFrame extends JFrame implements ActionListener {

    private JPanel teamPanel;
    private TeamLabels teamLabels;
    private ButtonPanels buttonPanel;
    private KetNoiDatabase dB;
    private ViewPanels viewPanel;
    private SetThongTinPanels setThongTinPanel;
    private TimKiemPanels timKiemPanel;
    private XoaNhanVienPanels xoaPanel;
    private ChonNhanVienCapNhat chonNhanVienPanel;
    private CapNhatNhanVienPanels capNhatNhanVien;

    public MainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500, 1000);
        this.setLocation(250, 50);
        this.setResizable(false);
        this.setLayout(null);

        /*
        teamLabels: gom cac label dung de hien thi ten va maSv
                width: 1200     height: 1000
         */
        teamLabels = new TeamLabels();

        /*
        buttonPanel: chua cac nut che do
            - xem danh sach nhan vien               |
            - xem luong cua nhan vien               |
            - xem danh sach phong ban               |
            - xem danh sach nguoi Quan ly           |
            - xem Danh Sach nhom lam de tai         .....
         */
        buttonPanel = new ButtonPanels();
        buttonPanel.setVisible(true);
        buttonPanel.getNutXemDanhSachNhanVien().addActionListener(this);
        buttonPanel.getNutThemNhanVien().addActionListener(this);
        buttonPanel.getNutXoaNhanVien().addActionListener(this);
        buttonPanel.getNutCapNhatNhanVien().addActionListener(this);
        buttonPanel.getNutXemDanhSachNhom().addActionListener(this);
        this.add(buttonPanel);

        /*
        bangDanhSachNhanVien:
            - chua thong tin ve nhan vien
         */
        viewPanel = new ViewPanels();

        /*
        teamPanel: Chua cac label de hien thi thong tin cua cac thanh vien trong nhom
         */
        teamPanel = new JPanel();
        teamPanel.setBounds(300, 0, 1200, 1000);
        teamPanel.setLayout(null);
        teamPanel.add(teamLabels);
        teamPanel.setVisible(true);
        this.add(teamPanel);

        /*
        setThongTinPanel: dung de them cac thong tin cho nhan vien moi
         */
        setThongTinPanel = new SetThongTinPanels();

        /*
        timKiemPabel:chua cac component dung de tim kiem
         */
        timKiemPanel = new TimKiemPanels();

        /**
         * xoaPanels: chua cac component dung de xoa mot nhan vien
         */
        xoaPanel = new XoaNhanVienPanels();

        /**
         * chonNhanVienPanel
         */
        chonNhanVienPanel = new ChonNhanVienCapNhat();

        /**
         * capNhatNhanVienPanel
         */
        capNhatNhanVien = new CapNhatNhanVienPanels((String) chonNhanVienPanel.getPhongBan(), (String) chonNhanVienPanel.getMaNhanVien());


        /*
        Set MainFrame --> Visible
         */
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }

    /*
    METHOD
     */
    // removeAllComponentExcept(Component componet)
    private void removeAllComponentExcept(Component component) {
        for (Component comp : this.getContentPane().getComponents()) {
            if (comp != component) {
                this.remove(comp);
            }
        }
        this.revalidate(); // update the layout
        this.repaint(); // update the display
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        /**
         * Neu nhan nut xem danh sach nhan vien
         */
        if (ae.getSource() == buttonPanel.getNutXemDanhSachNhanVien()) {
            buttonPanel.enableAllButtonExcept(buttonPanel.getNutXemDanhSachNhanVien());
            removeAllComponentExcept(buttonPanel);

            viewPanel = new ViewPanels();
            viewPanel.taoDanhSachNhanVien(viewPanel.getDsNhanVien());
            viewPanel.setVisible(true);
            viewPanel.getDsNhanVien().setVisible(true);
            this.add(viewPanel);

            timKiemPanel = new TimKiemPanels();
            timKiemPanel.setVisible(true);
            timKiemPanel.getTimKiemTheoPb().addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    viewPanel.refreshTable("ma_phong_ban", (String) timKiemPanel.getTimKiemTheoPb().getSelectedItem());
                }
            });
            timKiemPanel.getTimKiemTheoMaNhanVien().addItemListener(e -> {
                viewPanel.refreshTable("ma_nhan_vien", (String) timKiemPanel.getTimKiemTheoMaNhanVien().getSelectedItem());
            }
            );
            timKiemPanel.getNutTimKiemTheoTen().addActionListener(e -> {
                viewPanel.refershTableAndFindNameEmp("ten_nhan_vien", timKiemPanel.getTimKiemTheoTen().getText());
            });
            this.add(timKiemPanel);

        }

        /**
         * Neu nhan nut them nhan vien
         */
        if (ae.getSource() == buttonPanel.getNutThemNhanVien()) {
            removeAllComponentExcept(buttonPanel);
            buttonPanel.enableAllButtonExcept(buttonPanel.getNutThemNhanVien());

            setThongTinPanel = new SetThongTinPanels();
            setThongTinPanel.setVisible(true);
            this.add(setThongTinPanel);
        }

        /**
         * Neu nhan nut xoa nhan vien:
         */
        if (ae.getSource() == buttonPanel.getNutXoaNhanVien()) {
            buttonPanel.enableAllButtonExcept(buttonPanel.getNutXoaNhanVien());
            removeAllComponentExcept(buttonPanel);

            viewPanel = new ViewPanels();
            viewPanel.taoDanhSachNhanVien(viewPanel.getDsNhanVien());
            viewPanel.setVisible(true);
            viewPanel.getDsNhanVien().setVisible(true);
            this.add(viewPanel);

            xoaPanel = new XoaNhanVienPanels();
            xoaPanel.setVisible(true);
            xoaPanel.getTimKiemTheoPb().addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedMaPhongBan = (String) e.getItem();

                    xoaPanel.getTimKiemTheoMaNhanVien().removeAllItems();

                    try {
                        KetNoiDatabase dB = new KetNoiDatabase();
                        String query = "SELECT ma_nhan_vien FROM danh_sach_nhan_vien WHERE ma_phong_ban = ?";
                        PreparedStatement pstmt = dB.connection.prepareStatement(query);
                        pstmt.setString(1, selectedMaPhongBan);
                        ResultSet rs = pstmt.executeQuery();
                        while (rs.next()) {
                            xoaPanel.getTimKiemTheoMaNhanVien().addItem(rs.getString("ma_nhan_vien"));
                        }
                        viewPanel.refreshTable("ma_phong_ban", (String) xoaPanel.getTimKiemTheoPb().getSelectedItem());
                        xoaPanel.getTimKiemTheoMaNhanVien().setEnabled(true);
                        xoaPanel.getTimKiemTheoMaNhanVien().setVisible(true);
                        rs.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
            xoaPanel.getTimKiemTheoMaNhanVien().addItemListener(e -> {
                String selectedMaNhanVien = (String) xoaPanel.getTimKiemTheoMaNhanVien().getSelectedItem();
                viewPanel.refreshTable("ma_nhan_vien", selectedMaNhanVien);
            });
            xoaPanel.getNutReset().addActionListener(e -> {
                this.remove(xoaPanel);
                this.remove(viewPanel);

                viewPanel = new ViewPanels();
                viewPanel.taoDanhSachNhanVien(viewPanel.getDsNhanVien());
                viewPanel.setVisible(true);
                viewPanel.getDsNhanVien().setVisible(true);
                this.add(viewPanel);

                xoaPanel = new XoaNhanVienPanels();
                xoaPanel.setVisible(true);
                xoaPanel.getTimKiemTheoPb().addItemListener(ee -> {
                    if (ee.getStateChange() == ItemEvent.SELECTED) {
                        String selectedMaPhongBan = (String) ee.getItem();

                        xoaPanel.getTimKiemTheoMaNhanVien().removeAllItems();

                        try {
                            KetNoiDatabase dB = new KetNoiDatabase();
                            String query = "SELECT ma_nhan_vien FROM danh_sach_nhan_vien WHERE ma_phong_ban = ?";
                            PreparedStatement pstmt = dB.connection.prepareStatement(query);
                            pstmt.setString(1, selectedMaPhongBan);
                            ResultSet rs = pstmt.executeQuery();
                            while (rs.next()) {
                                xoaPanel.getTimKiemTheoMaNhanVien().addItem(rs.getString("ma_nhan_vien"));
                            }
                            viewPanel.refreshTable("ma_phong_ban", (String) xoaPanel.getTimKiemTheoPb().getSelectedItem());
                            xoaPanel.getTimKiemTheoMaNhanVien().setEnabled(true);
                            xoaPanel.getTimKiemTheoMaNhanVien().setVisible(true);
                            rs.close();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                xoaPanel.getTimKiemTheoMaNhanVien().addItemListener(ee -> {
                    String selectedMaNhanVien = (String) xoaPanel.getTimKiemTheoMaNhanVien().getSelectedItem();
                    viewPanel.refreshTable("ma_nhan_vien", selectedMaNhanVien);
                });
                xoaPanel.getNutXoaNhanVien().addActionListener(ee -> {
                    try {
                        KetNoiDatabase dB = new KetNoiDatabase();
                        String query = "DELETE FROM danh_sach_nhan_vien WHERE ma_nhan_vien = ?";
                        PreparedStatement preStatement = dB.connection.prepareStatement(query);
                        preStatement.setString(1, ((String) xoaPanel.getTimKiemTheoMaNhanVien().getSelectedItem()));
                        preStatement.executeUpdate();

                        JOptionPane.showMessageDialog(null, "DA XOA!!!!");

                        preStatement.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
                this.add(xoaPanel);

                this.validate();
                this.repaint();
            });
            xoaPanel.getNutXoaNhanVien().addActionListener(e -> {
                try {
                    KetNoiDatabase dB = new KetNoiDatabase();
                    String query = "DELETE FROM danh_sach_nhan_vien WHERE ma_nhan_vien = ?";
                    PreparedStatement preStatement = dB.connection.prepareStatement(query);
                    preStatement.setString(1, ((String) xoaPanel.getTimKiemTheoMaNhanVien().getSelectedItem()));
                    preStatement.executeUpdate();

                    JOptionPane.showMessageDialog(null, "DA XOA!!!!");

                    preStatement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            this.add(xoaPanel);
        }

        /**
         * neu nhan nut cap nhat: hien thi panel tim kiem thong tin nhan vien
         * can cap nhat: ma_phong_ban, ma_nhan_vien, ten_nhan_vien
         */
        if (ae.getSource() == buttonPanel.getNutCapNhatNhanVien()) {

            removeAllComponentExcept(buttonPanel);
            buttonPanel.enableAllButtonExcept(buttonPanel.getNutCapNhatNhanVien());

            chonNhanVienPanel = new ChonNhanVienCapNhat();
            chonNhanVienPanel.setVisible(true);
            this.add(chonNhanVienPanel);

        }

        /**
         * Neu nhan nut xem danh sach nhom: ==> hienn thi thong tin ve thanh
         * vien nhom
         */
        if (ae.getSource() == buttonPanel.getNutXemDanhSachNhom()) {
            removeAllComponentExcept(buttonPanel);
            buttonPanel.enableAllButtonExcept(buttonPanel.getNutXemDanhSachNhom());

            teamPanel = new JPanel();
            teamPanel.setBounds(300, 0, 1200, 1000);
            teamPanel.setLayout(null);
            teamPanel.add(teamLabels);
            teamPanel.setVisible(true);
            this.add(teamPanel);
        }
    }
}
