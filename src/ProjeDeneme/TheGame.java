/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjeDeneme;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Bilal
 */
public class TheGame extends javax.swing.JFrame {

    private JPanel[][] gameBlocks;
    private Color blockColor;

    public TheGame() {
        initComponents();
        gameBlocks = new JPanel[5][7];

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        pnl_menuSection = new DegradedPanel(new Color(56,250,193), new Color(51,255,255));
        btn_start = new javax.swing.JButton();
        btn_refreshTable = new javax.swing.JButton();
        pnl_timeSection = new DegradedPanel(new Color(76,230,193), new Color(41,215,255));
        jLabel1 = new javax.swing.JLabel();
        btn_scoreTable = new javax.swing.JButton();
        pnl_gameArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(742, 511));
        setPreferredSize(new java.awt.Dimension(742, 511));
        getContentPane().setLayout(new java.awt.GridLayout());

        jSplitPane1.setDividerLocation(100);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setEnabled(false);

        btn_start.setText("Start Game");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        btn_refreshTable.setText("Refresh Table");

        pnl_timeSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");

        javax.swing.GroupLayout pnl_timeSectionLayout = new javax.swing.GroupLayout(pnl_timeSection);
        pnl_timeSection.setLayout(pnl_timeSectionLayout);
        pnl_timeSectionLayout.setHorizontalGroup(
            pnl_timeSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_timeSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_timeSectionLayout.setVerticalGroup(
            pnl_timeSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_timeSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_scoreTable.setText("Score Table");

        javax.swing.GroupLayout pnl_menuSectionLayout = new javax.swing.GroupLayout(pnl_menuSection);
        pnl_menuSection.setLayout(pnl_menuSectionLayout);
        pnl_menuSectionLayout.setHorizontalGroup(
            pnl_menuSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuSectionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnl_menuSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_refreshTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(145, 145, 145)
                .addComponent(pnl_timeSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btn_scoreTable)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pnl_menuSectionLayout.setVerticalGroup(
            pnl_menuSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuSectionLayout.createSequentialGroup()
                .addGroup(pnl_menuSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_menuSectionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnl_timeSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_menuSectionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_start)
                        .addGap(18, 18, 18)
                        .addComponent(btn_refreshTable)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_menuSectionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_scoreTable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(pnl_menuSection);

        pnl_gameArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_gameAreaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnl_gameAreaMouseReleased(evt);
            }
        });
        pnl_gameArea.setLayout(new java.awt.GridLayout(7, 5, 1, 1));
        jSplitPane1.setRightComponent(pnl_gameArea);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        createGameBlock();
        addGameBlock();
    }//GEN-LAST:event_btn_startActionPerformed
    public void createGameBlock() {
        int count = 0;
        for (int i = 0; i < gameBlocks.length; i++) {
            for (int j = 0; j < gameBlocks[i].length; j++) {
                JPanel add_panel = new JPanel();
                add_panel.setSize(50, 50);
                add_panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

                specifyColor(add_panel, i, j);

                add_panel.addMouseListener(new MouseAdapter() {
                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        add_panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

                    }

                    public void mouseReleased(java.awt.event.MouseEvent evt) {
                        add_panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
//                    add_panel.setBorder(BorderFactory.createLineBorder(blockColor,2));
                    }

                });
                gameBlocks[i][j] = add_panel;
                blockColor = null;

            }

        }
    }

    public void specifyColor(JPanel add_panel, int xposition, int yposition) {
        boolean control = true;
        while (control) {
            int color = ((int) ((Math.random()) * 3));

            if (color == 0) {
                blockColor = Color.YELLOW;
                add_panel.setBackground(blockColor);
            } else if (color == 1) {
                blockColor = Color.RED;
                add_panel.setBackground(blockColor);
            } else {
                blockColor = Color.BLUE;
                add_panel.setBackground(blockColor);
            }
            
            colorControl(xposition,yposition);
        }

    }
    public void colorControl(int xposition,int yposition){
        
        
    }
    public void addGameBlock() {
        for (int i = 0; i < gameBlocks.length; i++) {
            for (int j = 0; j < gameBlocks[i].length; j++) {
                pnl_gameArea.add(gameBlocks[i][j]);
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        pnl_gameArea.revalidate();
                    }
                });
            }
        }
    }
    private void pnl_gameAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_gameAreaMousePressed

    }//GEN-LAST:event_pnl_gameAreaMousePressed

    private void pnl_gameAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_gameAreaMouseReleased
    }//GEN-LAST:event_pnl_gameAreaMouseReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refreshTable;
    private javax.swing.JButton btn_scoreTable;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel pnl_gameArea;
    private javax.swing.JPanel pnl_menuSection;
    private javax.swing.JPanel pnl_timeSection;
    // End of variables declaration//GEN-END:variables
}
