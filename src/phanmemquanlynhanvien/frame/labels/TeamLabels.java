package phanmemquanlynhanvien.frame.labels;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class TeamLabels extends JLabel{

    private JLabel tenThanhVienLabel, maSvLabel,
            triThanhLabel, xx061Label,
            baTanLabel, xx52Label,
            daiHungLabel, xx14Label,
            vanTamLabel, xxYYLabel,
            tuanHungLabel, xxZZLabel;
    
    public TeamLabels(){
        this.setLayout(null);
        this.setBounds(0, 0, 1200, 1000);
        tenThanhVienLabel = new JLabel("TEN THANH VIEN");
        tenThanhVienLabel.setBounds(0, 0, 600, 100);
        tenThanhVienLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        tenThanhVienLabel.setHorizontalAlignment(JLabel.CENTER);
        tenThanhVienLabel.setBackground(Color.CYAN);
        tenThanhVienLabel.setOpaque(true);
        tenThanhVienLabel.setForeground(Color.red);
        tenThanhVienLabel.setBorder(new LineBorder(Color.BLACK, 3));

        maSvLabel = new JLabel("MSSV");
        maSvLabel.setBounds(600, 0, 600, 100);
        maSvLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        maSvLabel.setHorizontalAlignment(JLabel.CENTER);
        maSvLabel.setBackground(Color.CYAN);
        maSvLabel.setOpaque(true);
        maSvLabel.setForeground(Color.red);
        maSvLabel.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        Ten Thanh Vien: Le Tri Thanh
         */
        triThanhLabel = new JLabel("Le Tri Thanh");
        triThanhLabel.setBounds(0, 100, 600, 180);
        triThanhLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        triThanhLabel.setHorizontalAlignment(JLabel.CENTER);
        triThanhLabel.setBackground(Color.CYAN);
        triThanhLabel.setOpaque(true);
        triThanhLabel.setForeground(Color.red);
        triThanhLabel.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        MSSV: N19DCVT061
         */
        xx061Label = new JLabel("N19DCVT061");
        xx061Label.setBounds(600, 100, 600, 180);
        xx061Label.setFont(new Font("Ink Free", Font.BOLD, 40));
        xx061Label.setHorizontalAlignment(JLabel.CENTER);
        xx061Label.setBackground(Color.CYAN);
        xx061Label.setOpaque(true);
        xx061Label.setForeground(Color.red);
        xx061Label.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        Ten thanh vien: NGuyen Ba Tan
         */
        baTanLabel = new JLabel("Nguyen Ban Tan");
        baTanLabel.setBounds(0, 280, 600, 180);
        baTanLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        baTanLabel.setHorizontalAlignment(JLabel.CENTER);
        baTanLabel.setBackground(Color.CYAN);
        baTanLabel.setOpaque(true);
        baTanLabel.setForeground(Color.red);
        baTanLabel.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        MSSV: N19DCVT052
         */
        xx52Label = new JLabel("N19DCVT052");
        xx52Label.setBounds(600, 280, 600, 180);
        xx52Label.setFont(new Font("Ink Free", Font.BOLD, 40));
        xx52Label.setHorizontalAlignment(JLabel.CENTER);
        xx52Label.setBackground(Color.CYAN);
        xx52Label.setOpaque(true);
        xx52Label.setForeground(Color.red);
        xx52Label.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        Ten thanh vien: Le Dai Hung
         */
        daiHungLabel = new JLabel("Le Dai Hung");
        daiHungLabel.setBounds(0, 460, 600, 180);
        daiHungLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        daiHungLabel.setHorizontalAlignment(JLabel.CENTER);
        daiHungLabel.setBackground(Color.CYAN);
        daiHungLabel.setOpaque(true);
        daiHungLabel.setForeground(Color.red);
        daiHungLabel.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        MSSV: N19DCVT014
         */
        xx14Label = new JLabel("N19DCVT014");
        xx14Label.setBounds(600, 460, 600, 180);
        xx14Label.setFont(new Font("Ink Free", Font.BOLD, 40));
        xx14Label.setHorizontalAlignment(JLabel.CENTER);
        xx14Label.setBackground(Color.CYAN);
        xx14Label.setOpaque(true);
        xx14Label.setForeground(Color.red);
        xx14Label.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        Ten thanh vien: Phan Van Tam
         */
        vanTamLabel = new JLabel("Phan Van Tam");
        vanTamLabel.setBounds(0, 620, 600, 180);
        vanTamLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        vanTamLabel.setHorizontalAlignment(JLabel.CENTER);
        vanTamLabel.setBackground(Color.CYAN);
        vanTamLabel.setOpaque(true);
        vanTamLabel.setForeground(Color.red);
        vanTamLabel.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        MSSV: xxYY
         */
        xxYYLabel = new JLabel("N19DCVT0YY");
        xxYYLabel.setBounds(600, 620, 600, 180);
        xxYYLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        xxYYLabel.setHorizontalAlignment(JLabel.CENTER);
        xxYYLabel.setBackground(Color.CYAN);
        xxYYLabel.setOpaque(true);
        xxYYLabel.setForeground(Color.red);
        xxYYLabel.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        Ten Thanh Vien: Le Tuan Hung
         */
        tuanHungLabel = new JLabel("Le Tuanb Hung");
        tuanHungLabel.setBounds(0, 800, 600, 180);
        tuanHungLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        tuanHungLabel.setHorizontalAlignment(JLabel.CENTER);
        tuanHungLabel.setBackground(Color.CYAN);
        tuanHungLabel.setOpaque(true);
        tuanHungLabel.setForeground(Color.red);
        tuanHungLabel.setBorder(new LineBorder(Color.BLACK, 3));

        /*
        MSSV: xxZZ
         */
        xxZZLabel = new JLabel("N19DCVT0YY");
        xxZZLabel.setBounds(600, 800, 600, 180);
        xxZZLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        xxZZLabel.setHorizontalAlignment(JLabel.CENTER);
        xxZZLabel.setBackground(Color.CYAN);
        xxZZLabel.setOpaque(true);
        xxZZLabel.setForeground(Color.red);
        xxZZLabel.setBorder(new LineBorder(Color.BLACK, 3));
        
        this.add(tenThanhVienLabel);
        this.add(maSvLabel);
        this.add(triThanhLabel);
        this.add(baTanLabel);
        this.add(daiHungLabel);
        this.add(vanTamLabel);
        this.add(tuanHungLabel);
        this.add((xx061Label));
        this.add(xx52Label);
        this.add(xx14Label);
        this.add(xxYYLabel);
        this.add(xxZZLabel);
    }
}
