/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 * Clase que proporcion la vista informes
 * @author Juanra
 */
public class PanelInformes extends javax.swing.JPanel {

    /**
     * Creates new form PanelInformes
     */
    public PanelInformes() {
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

        jLabel1 = new javax.swing.JLabel();
        informe1 = new javax.swing.JButton();
        informe2 = new javax.swing.JButton();
        informe3 = new javax.swing.JButton();
        informe4 = new javax.swing.JButton();
        pdf1 = new javax.swing.JButton();
        pdf2 = new javax.swing.JButton();
        pdf3 = new javax.swing.JButton();
        pdf4 = new javax.swing.JButton();
        informe5 = new javax.swing.JButton();
        informe6 = new javax.swing.JButton();
        pdf5 = new javax.swing.JButton();
        pdf6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtOficina = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(445, 314));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("INFORMES");

        informe1.setBackground(new java.awt.Color(0, 0, 0));
        informe1.setForeground(new java.awt.Color(255, 255, 255));
        informe1.setText("Informe 1");
        informe1.setFocusPainted(false);
        informe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informe1ActionPerformed(evt);
            }
        });

        informe2.setBackground(new java.awt.Color(0, 0, 0));
        informe2.setForeground(new java.awt.Color(255, 255, 255));
        informe2.setText("Informe 2");
        informe2.setFocusPainted(false);

        informe3.setBackground(new java.awt.Color(0, 0, 0));
        informe3.setForeground(new java.awt.Color(255, 255, 255));
        informe3.setText("Informe 3");
        informe3.setFocusPainted(false);

        informe4.setBackground(new java.awt.Color(0, 0, 0));
        informe4.setForeground(new java.awt.Color(255, 255, 255));
        informe4.setText("Informe 4");
        informe4.setFocusPainted(false);

        pdf1.setBackground(new java.awt.Color(0, 0, 0));
        pdf1.setForeground(new java.awt.Color(255, 255, 255));
        pdf1.setText("PDF 1");
        pdf1.setFocusPainted(false);

        pdf2.setBackground(new java.awt.Color(0, 0, 0));
        pdf2.setForeground(new java.awt.Color(255, 255, 255));
        pdf2.setText("PDF 2");
        pdf2.setFocusPainted(false);

        pdf3.setBackground(new java.awt.Color(0, 0, 0));
        pdf3.setForeground(new java.awt.Color(255, 255, 255));
        pdf3.setText("PDF 3");
        pdf3.setFocusPainted(false);

        pdf4.setBackground(new java.awt.Color(0, 0, 0));
        pdf4.setForeground(new java.awt.Color(255, 255, 255));
        pdf4.setText("PDF 4");
        pdf4.setFocusPainted(false);

        informe5.setBackground(new java.awt.Color(0, 0, 0));
        informe5.setForeground(new java.awt.Color(255, 255, 255));
        informe5.setText("Informe 5");
        informe5.setFocusPainted(false);

        informe6.setBackground(new java.awt.Color(0, 0, 0));
        informe6.setForeground(new java.awt.Color(255, 255, 255));
        informe6.setText("Informe 6");
        informe6.setFocusPainted(false);

        pdf5.setBackground(new java.awt.Color(0, 0, 0));
        pdf5.setForeground(new java.awt.Color(255, 255, 255));
        pdf5.setText("PDF 5");
        pdf5.setFocusPainted(false);

        pdf6.setBackground(new java.awt.Color(0, 0, 0));
        pdf6.setForeground(new java.awt.Color(255, 255, 255));
        pdf6.setText("PDF 6");
        pdf6.setFocusPainted(false);

        jLabel2.setText("Numero de oficina:");

        txtOficina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOficinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pdf1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(informe1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(informe2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(pdf2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pdf3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(informe3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(informe5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdf5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOficina))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informe4)
                    .addComponent(pdf4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(informe6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pdf6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(informe1)
                    .addComponent(informe2)
                    .addComponent(informe3)
                    .addComponent(informe5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf1)
                    .addComponent(pdf2)
                    .addComponent(pdf3)
                    .addComponent(pdf5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(informe6)
                    .addComponent(jLabel2)
                    .addComponent(informe4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf6)
                    .addComponent(txtOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdf4))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void informe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_informe1ActionPerformed

    private void txtOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOficinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOficinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton informe1;
    public javax.swing.JButton informe2;
    public javax.swing.JButton informe3;
    public javax.swing.JButton informe4;
    public javax.swing.JButton informe5;
    public javax.swing.JButton informe6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JButton pdf1;
    public javax.swing.JButton pdf2;
    public javax.swing.JButton pdf3;
    public javax.swing.JButton pdf4;
    public javax.swing.JButton pdf5;
    public javax.swing.JButton pdf6;
    public javax.swing.JTextField txtOficina;
    // End of variables declaration//GEN-END:variables
}