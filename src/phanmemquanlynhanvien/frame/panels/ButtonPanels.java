package phanmemquanlynhanvien.frame.panels;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanels extends JPanel {

    private JButton nutXemDanhSachNhanVien, nutThemNhanVien,
            nutXoaNhanVien,
            nutCapNhatNhanVien,
            nutXemDanhSachNhom;

    public ButtonPanels() {
        this.setLayout(null);
        this.setBounds(0, 0, 300, 1000);

        nutXemDanhSachNhanVien = new JButton("DANH SACH NHAN VIEN");
        nutXemDanhSachNhanVien.setBounds(0, 0, 300, 200);
        nutXemDanhSachNhanVien.setFocusable(false);
        nutXemDanhSachNhanVien.setFont(new Font("Ink Free", Font.BOLD, 20));

        nutThemNhanVien = new JButton("THEM NHAN VIEN");
        nutThemNhanVien.setBounds(0, 200, 300, 200);
        nutThemNhanVien.setFocusable(false);
        nutThemNhanVien.setFont(new Font("Ink Free", Font.BOLD, 20));

        nutXoaNhanVien = new JButton("XOA NHAN VIEN");
        nutXoaNhanVien.setBounds(0, 400, 300, 200);
        nutXoaNhanVien.setFocusable(false);
        nutXoaNhanVien.setFont(new Font("Ink Free", Font.BOLD, 20));

        nutCapNhatNhanVien = new JButton("CAP NHAT NHAN VIEN");
        nutCapNhatNhanVien.setBounds(0, 600, 300, 200);
        nutCapNhatNhanVien.setFocusable(false);
        nutCapNhatNhanVien.setFont(new Font("Ink Free", Font.BOLD, 20));

        /* nutXemDanhSachNhom --> danh sach nhom lam de tai --> teamPanel
        Khi nhan nutXemDanhSachNhom:
            - functionPanel se khong duoc hien thi
            - teamPannel se hien thi nhung thong tin sau:
                   Ten Thanh Vien               MSSV
                    LE TRI THANH            N19DCVT061
                    Nguyen Ba Tan           N19DCVT0XX
                    Le Dai Hung             N19DCVT0XX
                    Phan Van Tam            N19DCVT0XX
                    Le Tuan Hung            N19DCVT0X
         */
        nutXemDanhSachNhom = new JButton("DANH SACH NHOM");
        nutXemDanhSachNhom.setBounds(0, 800, 300, 200);
        nutXemDanhSachNhom.setFocusable(false);
        nutXemDanhSachNhom.setFont(new Font("Ink Free", Font.BOLD, 20));

        this.add(nutXemDanhSachNhanVien);
        this.add(nutThemNhanVien);
        this.add(nutXoaNhanVien);
        this.add(nutCapNhatNhanVien);
        this.add(nutXemDanhSachNhom);
    }

    /*
    GETTER
     */
    public JButton getNutXemDanhSachNhanVien() {
        return nutXemDanhSachNhanVien;
    }

    public JButton getNutThemNhanVien() {
        return nutThemNhanVien;
    }

    public JButton getNutXoaNhanVien() {
        return nutXoaNhanVien;
    }

    public JButton getNutCapNhatNhanVien() {
        return nutCapNhatNhanVien;
    }

    public JButton getNutXemDanhSachNhom() {
        return nutXemDanhSachNhom;
    }

    /*
    SETTER
     */
    public void setNutXemDanhSachNhanVien(JButton nutXemDanhSachNhanVien) {
        this.nutXemDanhSachNhanVien = nutXemDanhSachNhanVien;
    }

    public void setNutThemNhanVien(JButton nutThemNhanVien) {
        this.nutThemNhanVien = nutThemNhanVien;
    }

    public void setNutXoaNhanVien(JButton nutXoaNhanVien) {
        this.nutXoaNhanVien = nutXoaNhanVien;
    }

    public void setNutCapNhatNhanVien(JButton nutCapNhatNhanVien) {
        this.nutCapNhatNhanVien = nutCapNhatNhanVien;
    }

    /*
    METHOD
     */
    // enableAllButtonExcept(): disable all button in ButtonPanel except button passing
    public void enableAllButtonExcept(JButton disabledButton) {
        Component[] components = this.getComponents();
        for (Component component : this.getComponents()) {
            if (component instanceof JButton && component != disabledButton) {
                component.setBackground(null);
                component.setEnabled(true);
            }
        }
        setDisabledButtonColer(disabledButton);
    }

    public void setDisabledButtonColer(JButton disabledButton) {
        Color disabledBackgroundColor = Color.YELLOW;
        disabledButton.setBackground(disabledBackgroundColor);
        disabledButton.setEnabled(false);
    }

}
