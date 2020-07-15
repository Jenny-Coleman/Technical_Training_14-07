package foosball;

import java.awt.Image;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Alex
 */
public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeams = new javax.swing.JTable();
        rbtnSport = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbtnAge = new javax.swing.JRadioButton();
        rbtnPlayers = new javax.swing.JRadioButton();
        rbtnWins = new javax.swing.JRadioButton();
        rbtnLosses = new javax.swing.JRadioButton();
        rbtnMatches = new javax.swing.JRadioButton();
        btnLogOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTeams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sport", "Age Group", "Number of players", "Matches", "Wins", "Losses"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTeams);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 520, 122));

        rbtnSport.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnSport);
        rbtnSport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnSport.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSport.setText("Sport");
        rbtnSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSportActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnSport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sort by:");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Dashboard");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 143, 50));

        rbtnAge.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnAge);
        rbtnAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnAge.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAge.setText("Age group");
        rbtnAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAgeActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        rbtnPlayers.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnPlayers);
        rbtnPlayers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnPlayers.setForeground(new java.awt.Color(255, 255, 255));
        rbtnPlayers.setText("Number of Players");
        rbtnPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPlayersActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        rbtnWins.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnWins);
        rbtnWins.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnWins.setForeground(new java.awt.Color(255, 255, 255));
        rbtnWins.setText("Wins");
        rbtnWins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnWinsActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnWins, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        rbtnLosses.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnLosses);
        rbtnLosses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnLosses.setForeground(new java.awt.Color(255, 255, 255));
        rbtnLosses.setText("Losses");
        rbtnLosses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLossesActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnLosses, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        rbtnMatches.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnMatches);
        rbtnMatches.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnMatches.setForeground(new java.awt.Color(255, 255, 255));
        rbtnMatches.setText("Matches played");
        rbtnMatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMatchesActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnMatches, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 197, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sport(2).jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 640, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnWinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnWinsActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblTeams.getModel());
        tblTeams.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }//GEN-LAST:event_rbtnWinsActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        new Sports_management_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void rbtnSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSportActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblTeams.getModel());
        tblTeams.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }//GEN-LAST:event_rbtnSportActionPerformed

    private void rbtnAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAgeActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblTeams.getModel());
        tblTeams.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }//GEN-LAST:event_rbtnAgeActionPerformed

    private void rbtnPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPlayersActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblTeams.getModel());
        tblTeams.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }//GEN-LAST:event_rbtnPlayersActionPerformed

    private void rbtnLossesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLossesActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblTeams.getModel());
        tblTeams.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(5, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }//GEN-LAST:event_rbtnLossesActionPerformed

    private void rbtnMatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMatchesActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblTeams.getModel());
        tblTeams.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }//GEN-LAST:event_rbtnMatchesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Sports_management_login pro = new Sports_management_login();
            pro.createConnection();

            String sql = "SELECT * FROM teams";
            Statement stmt = Sports_management_login.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            rs.beforeFirst();
            DefaultTableModel tm = (DefaultTableModel) tblTeams.getModel();
            Object[] data = new Object[6];
            
            while (rs.next()) {
                data[0] = rs.getString("Sport");
                data[1] = rs.getString("Age_Group");
                data[2] = rs.getInt("Num_Players");
                data[3] = rs.getInt("Matches");
                data[4] = rs.getInt("Wins");
                data[5] = rs.getInt("Losses");
                
                tm.addRow(data);
            }
            
            Sports_management_login.conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnAge;
    private javax.swing.JRadioButton rbtnLosses;
    private javax.swing.JRadioButton rbtnMatches;
    private javax.swing.JRadioButton rbtnPlayers;
    private javax.swing.JRadioButton rbtnSport;
    private javax.swing.JRadioButton rbtnWins;
    private javax.swing.JTable tblTeams;
    // End of variables declaration//GEN-END:variables
}
