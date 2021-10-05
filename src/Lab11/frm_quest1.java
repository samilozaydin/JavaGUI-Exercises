
package Lab11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class frm_quest1 extends javax.swing.JFrame {

    public frm_quest1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_first = new javax.swing.JTextField();
        btn_1 = new javax.swing.JButton();
        lbl_first = new javax.swing.JLabel();
        lbl_second = new javax.swing.JLabel();
        txt_second = new javax.swing.JTextField();
        btn_2 = new javax.swing.JButton();
        lbl_text3 = new javax.swing.JLabel();
        txt_text3 = new javax.swing.JTextField();
        btn_3 = new javax.swing.JButton();
        lbl_text4 = new javax.swing.JLabel();
        txt_text4 = new javax.swing.JTextField();
        btn_4 = new javax.swing.JButton();
        lbl_text5 = new javax.swing.JLabel();
        txt_text5 = new javax.swing.JTextField();
        btn_5 = new javax.swing.JButton();
        lbl_text6 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JButton();
        txt_text6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        btn_1.setText("Run");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        lbl_first.setText(" ");

        lbl_second.setText(" ");

        btn_2.setText("Run");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        lbl_text3.setText(" ");

        btn_3.setText("Run");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        lbl_text4.setText(" ");

        btn_4.setText("Run");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        lbl_text5.setText(" ");

        btn_5.setText("Run");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        lbl_text6.setText(" ");

        btn_6.setText("Run");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_text6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_6))
                    .addComponent(lbl_text6, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_text5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_5))
                    .addComponent(lbl_text5, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_text4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_4))
                    .addComponent(lbl_text4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_text3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btn_3))
                            .addComponent(lbl_text3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_second, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btn_2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_first, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btn_1))
                            .addComponent(lbl_first, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_second, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_first)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_second)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_text3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_text4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_text5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_text6)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed

        Matcher matcher;
        if (txt_first.getText().isEmpty()) {
            lbl_first.setText("please, start with 'The' then put something if you want and end with 'end'");
            lbl_first.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(The).+(end)$").matcher(txt_first.getText());
            if (!matcher.find()) {
                lbl_first.setText(" please, start with 'The' then put something if you want and end with 'end'");
                lbl_first.setVisible(true);
                return;
            } else {
                lbl_first.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        Matcher matcher;
        if (txt_second.getText().isEmpty()) {
            lbl_second.setText("Must be abc, abcbcbc,abcbc");
            lbl_second.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(a)(bc)+$").matcher(txt_second.getText());
            if (!matcher.find()) {
                lbl_second.setText("Must be 'abc,abcbc,abcbcbcbc");
                lbl_second.setVisible(true);
                return;
            } else {
                lbl_second.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        Matcher matcher;
        if (txt_text3.getText().isEmpty()) {
            lbl_text3.setText("Must be 1abc,1ab,ab");
            lbl_text3.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(?=(1)?(ab)+)(?!(abc))(1)?[a-c]{0,3}$").matcher(txt_text3.getText());
            if (!matcher.find()) {
                lbl_text3.setText("Must be 1abc,1bc,ab");
                lbl_text3.setVisible(true);
                return;
            } else {
                lbl_text3.setVisible(false);
            }
        }

    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        Matcher matcher;
        if (txt_text4.getText().isEmpty()) {
            lbl_text4.setText("Must be ab,ac,a1,a ,");
            lbl_text4.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(?=(a)([b-c]|(1)|\\s))[a-c]{0,2}(1)?$").matcher(txt_text4.getText());
            if (!matcher.find()) {
                lbl_text4.setText("Must be ab,ac,a1,a ,");
                lbl_text4.setVisible(true);
                return;
            } else {
                lbl_text4.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        Matcher matcher;
        if (txt_text5.getText().isEmpty()) {
            lbl_text5.setText("Must be ab,ac,a1,a ,");
            lbl_text5.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(?=(a)([b-c]|(1)|\\s))[a-c]{0,2}(1)?$").matcher(txt_text5.getText());
            if (!matcher.find()) {
                lbl_text5.setText("Must be ab,ac,a1,a ,");
                lbl_text5.setVisible(true);
                return;
            } else {
                lbl_text5.setVisible(false);
            }
        }    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        Matcher matcher;
        if (txt_text6.getText().isEmpty()) {
            lbl_text6.setText("Must not start with a-g letter");
            lbl_text6.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(?![a-g][\\w\\d]*)[\\w\\d]+$").matcher(txt_text6.getText());
            if (!matcher.find()) {
                lbl_text6.setText("Must not start with a-g letter");
                lbl_text6.setVisible(true);
                return;
            } else {
                lbl_text6.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_6ActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_quest1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JLabel lbl_first;
    private javax.swing.JLabel lbl_second;
    private javax.swing.JLabel lbl_text3;
    private javax.swing.JLabel lbl_text4;
    private javax.swing.JLabel lbl_text5;
    private javax.swing.JLabel lbl_text6;
    private javax.swing.JTextField txt_first;
    private javax.swing.JTextField txt_second;
    private javax.swing.JTextField txt_text3;
    private javax.swing.JTextField txt_text4;
    private javax.swing.JTextField txt_text5;
    private javax.swing.JTextField txt_text6;
    // End of variables declaration//GEN-END:variables
}
