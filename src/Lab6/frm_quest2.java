/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ToggleButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bilal
 */
public class frm_quest2 extends javax.swing.JFrame {

    ArrayList<JToggleButton> buttons;
    JToggleButton firstSelected;
    JToggleButton secondSelected;
    int point;
    int found;
    DefaultTableModel tbl_scoresModel;

    /**
     * Creates new form frm_quest1
     */
    public frm_quest2() {
        initComponents();
        tbl_scoresModel = new DefaultTableModel();
        tbl_scoresModel.setColumnIdentifiers(new Object[]{"ID", "NAME", "POINT"});
        tbl_score.setModel(tbl_scoresModel);
        GetScores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbp_main = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        panel_control = new javax.swing.JPanel();
        lbl_current = new javax.swing.JLabel();
        spn_value = new javax.swing.JSpinner();
        btn_newGame = new javax.swing.JButton();
        lbl_pointText = new javax.swing.JLabel();
        lbl_point = new javax.swing.JLabel();
        panel_game = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_score = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(400, 300));

        panel_control.setBackground(new java.awt.Color(102, 255, 102));
        panel_control.setMinimumSize(new java.awt.Dimension(398, 100));

        lbl_current.setText("Current: ");

        spn_value.setModel(new javax.swing.SpinnerNumberModel(2, 2, 20, 2));

        btn_newGame.setText("New Game");
        btn_newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newGameActionPerformed(evt);
            }
        });

        lbl_pointText.setText("Score:");

        lbl_point.setText("0");

        javax.swing.GroupLayout panel_controlLayout = new javax.swing.GroupLayout(panel_control);
        panel_control.setLayout(panel_controlLayout);
        panel_controlLayout.setHorizontalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_controlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbl_current)
                .addGap(18, 18, 18)
                .addComponent(spn_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_newGame)
                .addGap(28, 28, 28)
                .addComponent(lbl_pointText)
                .addGap(18, 18, 18)
                .addComponent(lbl_point, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panel_controlLayout.setVerticalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_controlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_current)
                    .addComponent(spn_value, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_newGame)
                    .addComponent(lbl_pointText)
                    .addComponent(lbl_point))
                .addGap(46, 46, 46))
        );

        jSplitPane1.setTopComponent(panel_control);

        panel_game.setBackground(new java.awt.Color(0, 153, 255));
        panel_game.setMinimumSize(new java.awt.Dimension(398, 193));
        jSplitPane1.setRightComponent(panel_game);

        tbp_main.addTab("Game", jSplitPane1);

        jScrollPane1.setViewportView(tbl_score);

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btn_delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbp_main.addTab("Scores", jPanel1);

        getContentPane().add(tbp_main);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newGameActionPerformed

        buttons = new ArrayList<JToggleButton>();
        int count = (int) spn_value.getValue();

        firstSelected = null;
        secondSelected = null;
        point = 0;
        found = 0;
        lbl_point.setText(point + "");
        for (int i = 0; i < count; i++) {
            JToggleButton ntbtn1 = new JToggleButton();
            ntbtn1.setText("?");
            ntbtn1.setName("ntbtn_A_" + i);
            buttons.add(ntbtn1);

            JToggleButton ntbtn2 = new JToggleButton();
            ntbtn2.setText("?");
            ntbtn2.setName("ntbtn_B_" + i);
            buttons.add(ntbtn2);

        }
        Random rand = new Random();

        while (buttons.size() > 0) {

            int index = rand.nextInt(buttons.size());
            JToggleButton stbtn = buttons.get(index);
            stbtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    JToggleButton tbtn = (JToggleButton) evt.getSource();
                    if ((firstSelected != null && firstSelected == tbtn) || (secondSelected != null && secondSelected == tbtn)) {
                        firstSelected.setSelected(true);
                        return;
                    }

                    if (firstSelected == null) {
                        firstSelected = tbtn;
                        String nameFirst = tbtn.getName();
                        int firstNumber = getNumber(nameFirst);
                        firstSelected.setText(Integer.toString(firstNumber));

                    } else if (secondSelected == null) {
                        secondSelected = tbtn;
                        String secondName = tbtn.getName();
                        int secondNumber = getNumber(secondName);
                        secondSelected.setText(secondNumber + "");

                        String nameFirst = firstSelected.getName();
                        int firstNumber = getNumber(nameFirst);

                        if (firstNumber == secondNumber) {
                            point += 10;
                            firstSelected.setEnabled(false);
                            secondSelected.setEnabled(false);
                            firstSelected = null;
                            secondSelected = null;

                            found++;
                            if (found == count) {

                                String name = JOptionPane.showInputDialog(rootPane, "Please enter your name", "SAVE", JOptionPane.INFORMATION_MESSAGE);
                                InsertPoint(name, point);
                                GetScores();
                                panel_game.removeAll();

                            }
                        } else {
                            point -= 5;
                        }
                        lbl_point.setText(point + "");
                    } else {
                        firstSelected.setSelected(false);
                        secondSelected.setSelected(false);
                        firstSelected.setText("?");
                        secondSelected.setText("?");
                        firstSelected = null;
                        secondSelected = null;

                        firstSelected = tbtn;
                        String nameFirst = tbtn.getName();
                        int firstNumber = getNumber(nameFirst);
                        firstSelected.setText(Integer.toString(firstNumber));
                    }

                }
            });

            panel_game.add(stbtn);
            buttons.remove(index);

        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                panel_game.revalidate();
            }
        });
    }//GEN-LAST:event_btn_newGameActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int row = tbl_score.getSelectedRow();
        int id = (int) tbl_score.getValueAt(row, 0);
        Delete(id);
        GetScores();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    public int getNumber(String value) {
        int number = -1;
        if (value.contains("ntbtn_A")) {
            number = Integer.parseInt(value.replace("ntbtn_A_", ""));
        } else {
            number = Integer.parseInt(value.replace("ntbtn_B_", ""));
        }
        return number;
    }

    public boolean InsertPoint(String name, int point) {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDB", "sa", "as");
            Statement stmt = con.createStatement();
            String query = "SELECT COUNT(*) FROM TBL_USER";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int id = rs.getInt(1)+1;
            query = "INSERT INTO TBL_USER VALUES (" + id + ",'" + name + "'," + point + ")";
            stmt.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(frm_quest2.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frm_quest2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean GetScores() {
        tbl_scoresModel.setRowCount(0);
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDB", "sa", "as");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM TBL_USER ORDER BY POINT DESC";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                int point = rs.getInt("POINT");
                tbl_scoresModel.addRow(new Object[]{id, name, point});
            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(frm_quest2.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frm_quest2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean Delete(int id) {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDB", "sa", "as");
            Statement stmt = con.createStatement();
            String query = "DELETE FROM TBL_USER WHERE ID=" + id;
            stmt.executeUpdate(query);
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(frm_quest2.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frm_quest2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frm_quest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_quest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_quest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_quest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_quest2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_newGame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbl_current;
    private javax.swing.JLabel lbl_point;
    private javax.swing.JLabel lbl_pointText;
    private javax.swing.JPanel panel_control;
    private javax.swing.JPanel panel_game;
    private javax.swing.JSpinner spn_value;
    private javax.swing.JTable tbl_score;
    private javax.swing.JTabbedPane tbp_main;
    // End of variables declaration//GEN-END:variables
}