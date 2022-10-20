/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ExerciseController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Exercise;

/**
 *
 * @author Tommy
 */
public class HomeAdminView extends javax.swing.JFrame implements iView{

    /**
     * Creates new form HomeAdminView
     */
    private List<Exercise> exercises;
    private DefaultTableModel defaultTableModel;
    private ExerciseController exerciseController;
    public HomeAdminView() {
        initComponents();
        this.setLocationRelativeTo(null);
        exercises = new ArrayList<>();
        // ????
        defaultTableModel = (DefaultTableModel) tbExercises.getModel();
        exerciseController = new ExerciseController();
        ShowExercise();
    }
    public void addExercise(Exercise exercise){
        exercises.add(exercise);
        this.showData(exercises, defaultTableModel);
        exerciseController.writeToFile(exercises,"Exercises.txt");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupDiff = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbExercises = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbSort = new javax.swing.JComboBox<>();
        btnEasy = new javax.swing.JRadioButton();
        btnMedium = new javax.swing.JRadioButton();
        btnHard = new javax.swing.JRadioButton();
        btnAll = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbExercises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Desciption", "Difficulty"
            }
        ));
        jScrollPane1.setViewportView(tbExercises);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sort By:");

        cbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "By Title", "By Difficulty" }));
        cbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortActionPerformed(evt);
            }
        });

        btnGroupDiff.add(btnEasy);
        btnEasy.setText("Easy");
        btnEasy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnEasyItemStateChanged(evt);
            }
        });
        btnEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEasyActionPerformed(evt);
            }
        });

        btnGroupDiff.add(btnMedium);
        btnMedium.setText("Medium");
        btnMedium.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnMediumItemStateChanged(evt);
            }
        });
        btnMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediumActionPerformed(evt);
            }
        });

        btnGroupDiff.add(btnHard);
        btnHard.setText("Hard");
        btnHard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnHardItemStateChanged(evt);
            }
        });

        btnGroupDiff.add(btnAll);
        btnAll.setText("All");
        btnAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnAllItemStateChanged(evt);
            }
        });
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEasy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMedium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEasy)
                            .addComponent(btnMedium)
                            .addComponent(btnHard)
                            .addComponent(btnAll))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new addExcerciseView(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortActionPerformed
         int index = cbSort.getSelectedIndex();
         if(index == 0){
             exerciseController.sortByTitle(exercises);
         }else if(index == 1){
             exerciseController.sortByDifficulty(exercises);
         }
         this.showData(exercises, defaultTableModel);
    }//GEN-LAST:event_cbSortActionPerformed

    private void btnEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEasyActionPerformed
 
    }//GEN-LAST:event_btnEasyActionPerformed

    private void btnMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediumActionPerformed
 
    }//GEN-LAST:event_btnMediumActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
    
    }//GEN-LAST:event_btnAllActionPerformed

    private void btnEasyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnEasyItemStateChanged
        // TODO add your handling code here:
        String query = getSelected();
        filter(query);
    }//GEN-LAST:event_btnEasyItemStateChanged

    private void btnMediumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnMediumItemStateChanged
        // TODO add your handling code here:
        String query = getSelected();
        filter(query);
    }//GEN-LAST:event_btnMediumItemStateChanged

    private void btnHardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnHardItemStateChanged
        // TODO add your handling code here:
        String query = getSelected();
        filter(query);
    }//GEN-LAST:event_btnHardItemStateChanged

    private void btnAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnAllItemStateChanged
        // TODO add your handling code here:
        String query = getSelected();
        filter(query);
    }//GEN-LAST:event_btnAllItemStateChanged
    // filter data by difficulty
    private  String getSelected(){
        if(btnEasy.isSelected()){
            return "Easy";
        }else if(btnMedium.isSelected()){
            return "Medium";
        }else if(btnHard.isSelected()){
            return "Hard";
        }else{
            return "All";
        }
    }
    private  void filter(String query){
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(defaultTableModel);
        tbExercises.setRowSorter(trs);
        if(!"All".equals(query)){
            trs.setRowFilter(RowFilter.regexFilter(query));
        }else{
            tbExercises.setRowSorter(trs);
        }
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
            java.util.logging.Logger.getLogger(HomeAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeAdminView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAll;
    private javax.swing.JRadioButton btnEasy;
    private javax.swing.ButtonGroup btnGroupDiff;
    private javax.swing.JRadioButton btnHard;
    private javax.swing.JRadioButton btnMedium;
    private javax.swing.JComboBox<String> cbSort;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbExercises;
    // End of variables declaration//GEN-END:variables

    @Override
    public <T> void showData(List<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for (T t : list) {
            if(t instanceof Exercise exercise){
                model.addRow(new Object[] {
                    exercise.getId(),exercise.getTitle(),exercise.getDescription(),exercise.getDifficulty()
                });
            }          
        }
    }

    private void ShowExercise() {
        exercises = exerciseController.readDataFromFile("Exercises.txt");
        if(!exercises.isEmpty()){                          
            int lastID = exercises.get(exercises.size()-1).getId()+1;
            Exercise.setsID(lastID);
        }
        this.showData(exercises, defaultTableModel);
    }
}
