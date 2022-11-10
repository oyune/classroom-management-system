package cms.SchedulePackage;

import javax.swing.JOptionPane;

//import LabManagement.Schedule;
import cms.ConnectDB.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 정수연
 */
public class InputSchedule extends javax.swing.JFrame {

    public InputSchedule() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        weekDay = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        gradeNum = new javax.swing.JTextField();
        gradeName = new javax.swing.JTextField();
        proName = new javax.swing.JTextField();
        classNum = new javax.swing.JComboBox<>();
        UndoBtn = new javax.swing.JButton();
        OkBtn = new javax.swing.JButton();
        startTime = new javax.swing.JTextField();
        endTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("시간표 입력");

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel1.setText("시간표 입력");

        jLabel2.setText("과목번호");

        jLabel3.setText("호실");

        jLabel4.setText("교수명");

        jLabel5.setText("과목명");

        jLabel6.setText("시작시간");

        jLabel7.setText("끝시간");

        jLabel8.setText("요일");

        jLabel9.setText("날짜");

        weekDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "월요일", "화요일", "수요일", "목요일", "금요일" }));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024" }));

        jLabel10.setText("년");

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel11.setText("월");

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        jLabel12.setText("일");

        classNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "911호", "915호", "916호", "918호" }));

        UndoBtn.setText("이전");
        UndoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoBtnActionPerformed(evt);
            }
        });

        OkBtn.setText("등록");
        OkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UndoBtn)
                                .addGap(18, 18, 18)
                                .addComponent(OkBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(39, 39, 39)
                                    .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(112, 112, 112)
                                    .addComponent(jLabel7)
                                    .addGap(41, 41, 41)
                                    .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(30, 30, 30)
                                            .addComponent(classNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                            .addComponent(jLabel9)
                                            .addGap(37, 37, 37)
                                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(gradeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(gradeName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel12)
                                            .addGap(35, 35, 35)
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(weekDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(proName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(gradeNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(weekDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(classNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UndoBtn)
                    .addComponent(OkBtn))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void UndoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoBtnActionPerformed
        // 이전 버튼 -> 관리자 메인화면 이동
        // if 교수일 때 메인화면 이동
        // else if 조교일 때 메인화면 이동
    }//GEN-LAST:event_UndoBtnActionPerformed

    private void OkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkBtnActionPerformed
        // 특강 및 세미나 등록 버튼 구현

        ConnectDB db = new ConnectDB();  // DB 객체 생성
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = db.getConnection();
            ps = conn.prepareStatement("insert into Schedule values(?,?,?,?,?,?,?,?)");
            rs = ps.executeQuery();
            
            ArrayList<String> year1 = new ArrayList<String>();
            ArrayList<String> month1 = new ArrayList<String>();
            ArrayList<String> day1 = new ArrayList<String>();
            
            if (rs.next()) {
                ps.setString(1, gradeNum.getText());
                ps.setString(2, classNum.getSelectedItem().toString());
                ps.setString(3, proName.getText());
                ps.setString(4, gradeName.getText());
                ps.setString(5, startTime.getText());
                ps.setString(6, endTime.getText());
                ps.setString(7, weekDay.getSelectedItem().toString());
                //ps.setString(8, year.getSelectedItem().toString() && month.getSelectedItem().toString() && day.getSelectedItem().toString()); //날짜
                
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "시간표 등록이 완료되었습니다.", "등록 완료", JOptionPane.PLAIN_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "옳바르지 않은 입력입니다. 다시 입력해주세요.", "등록 실패", JOptionPane.WARNING_MESSAGE);
            }

            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "옳바르지 않은 입력입니다. 다시 입력해주세요.", "등록 실패", JOptionPane.WARNING_MESSAGE);
        }

        //String start = cmbStart.getSelectedItem().toString() + " " + startHour + ":" + startMinute;
        //String end = cmbEnd.getSelectedItem().toString() + " " + endHour + ":" + endMinute;
//        if (gradeNum.equals("")) {
//            JOptionPane.showMessageDialog(null, "과목번호를 입력해주세요","등록 실패", JOptionPane.WARNING_MESSAGE);
//            gradeNum.requestFocus();
//            return;
//        } else if (gradeName.equals("")) {
//            JOptionPane.showMessageDialog(null, "과목명을 입력해주세요.","등록 실패", JOptionPane.WARNING_MESSAGE);
//            gradeName.requestFocus();
//            return;
//        } else if (proName.equals("")) {
//            JOptionPane.showMessageDialog(null, "교수명을 입력해주세요","등록 실패", JOptionPane.WARNING_MESSAGE);
//            proName.requestFocus();
//            return;
//        } else if (classNum.toString().equals("")) {
//            JOptionPane.showMessageDialog(null, "호실을 입력해주세요","등록 실패", JOptionPane.WARNING_MESSAGE);
//            return;
//        } else if (year.toString().equals("") || month.toString().equals("") || day.toString().equals("")) {
//            JOptionPane.showMessageDialog(null, "날짜를 입력해주세요","등록 실패", JOptionPane.WARNING_MESSAGE);
//            return;
//        } else if (weekDay.toString().equals("")) {
//            JOptionPane.showMessageDialog(null, "요일을 입력해주세요","등록 실패", JOptionPane.WARNING_MESSAGE);
//            return;
//        } else if (startTime.equals("")) {
//            JOptionPane.showMessageDialog(null, "시작 시간을 입력해주세요","등록 실패", JOptionPane.WARNING_MESSAGE);
//            return;
//        } else if (endTime.equals("")) {
//            JOptionPane.showMessageDialog(null, "끝 시간 입력해주세요","등록 실패", JOptionPane.WARNING_MESSAGE);
//            return;
//        } else {
//            Schedule.register(schedule); // 시간표 추가
//
//            JOptionPane.showMessageDialog(null, "시간표가 추가되었습니다.");
//            InputSchedule s = new InputSchedule();
//            s.setVisible(true);
//            dispose(); // 프레임 종료
//
//            // 시간표 업데이트.update();
//        }
    }//GEN-LAST:event_OkBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OkBtn;
    private javax.swing.JButton UndoBtn;
    private javax.swing.JComboBox<String> classNum;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JTextField endTime;
    private javax.swing.JTextField gradeName;
    private javax.swing.JTextField gradeNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField proName;
    private javax.swing.JTextField startTime;
    private javax.swing.JComboBox<String> weekDay;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
