/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColorSelect;

/**
 *
 * @author M. Kester
 */
public class ColorSelect extends javax.swing.JFrame {

    /**
     * Creates new form ColorSelect
     */
    public ColorSelect() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCombo = new javax.swing.JPanel();
        comboColors = new javax.swing.JComboBox<>();
        panelCheck = new javax.swing.JPanel();
        checkBack = new javax.swing.JCheckBox();
        checkFore = new javax.swing.JCheckBox();
        panelButton = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ColorSelect");
        getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        comboColors.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        comboColors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RED", "GREEN", "BLUE" }));

        javax.swing.GroupLayout panelComboLayout = new javax.swing.GroupLayout(panelCombo);
        panelCombo.setLayout(panelComboLayout);
        panelComboLayout.setHorizontalGroup(
            panelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboColors, 0, 542, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelComboLayout.setVerticalGroup(
            panelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboColors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelCombo);

        checkBack.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        checkBack.setText("Background");
        panelCheck.add(checkBack);

        checkFore.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        checkFore.setText("Foreground");
        panelCheck.add(checkFore);

        getContentPane().add(panelCheck);

        btnOk.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnOk.setText("OK");
        panelButton.add(btnOk);

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCancel.setText("Cancel");
        panelButton.add(btnCancel);

        getContentPane().add(panelButton);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ColorSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox checkBack;
    private javax.swing.JCheckBox checkFore;
    private javax.swing.JComboBox<String> comboColors;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelCheck;
    private javax.swing.JPanel panelCombo;
    // End of variables declaration//GEN-END:variables
}