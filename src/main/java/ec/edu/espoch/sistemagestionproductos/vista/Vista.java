/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espoch.sistemagestionproductos.vista;

/**
 *
 * @author Nayeli
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblIngreseNombre = new javax.swing.JLabel();
        lblIngreseProducto = new javax.swing.JLabel();
        txtFieldNombreProducto = new javax.swing.JTextField();
        txtFieldPrecioProducto = new javax.swing.JTextField();
        btnRadioDisponible = new javax.swing.JRadioButton();
        btnRadioNoDisponible = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaProductoDisponible = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaProductoNoDisponible = new javax.swing.JTextArea();
        btnAgregarProducto = new javax.swing.JButton();
        lblProductosDisponibles = new javax.swing.JLabel();
        lblProductosNoDisponibles = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("Sistema de Gestion de Productos");

        lblIngreseNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseNombre.setText("Ingrese el nombre del producto");

        lblIngreseProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseProducto.setText("Ingrese el precio del producto");

        txtFieldNombreProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFieldNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNombreProductoActionPerformed(evt);
            }
        });

        txtFieldPrecioProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFieldPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPrecioProductoActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnRadioDisponible);
        btnRadioDisponible.setText("Disponible");
        btnRadioDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioDisponibleActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnRadioNoDisponible);
        btnRadioNoDisponible.setText("No Disponible");
        btnRadioNoDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioNoDisponibleActionPerformed(evt);
            }
        });

        txtAreaProductoDisponible.setColumns(20);
        txtAreaProductoDisponible.setRows(5);
        txtAreaProductoDisponible.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txtAreaProductoDisponible);

        txtAreaProductoNoDisponible.setColumns(20);
        txtAreaProductoNoDisponible.setRows(5);
        txtAreaProductoNoDisponible.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(txtAreaProductoNoDisponible);

        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        lblProductosDisponibles.setText("Productos Disponibles");

        lblProductosNoDisponibles.setText("Productos no Disponibles");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIngreseNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIngreseProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldNombreProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldPrecioProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRadioDisponible)
                        .addGap(88, 88, 88)
                        .addComponent(btnRadioNoDisponible)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(232, 232, 232))))
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnAgregarProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblProductosDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProductosNoDisponibles)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngreseNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngreseProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtFieldPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRadioDisponible)
                    .addComponent(btnRadioNoDisponible))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarProducto)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductosDisponibles)
                    .addComponent(lblProductosNoDisponibles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNombreProductoActionPerformed

    private void txtFieldPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPrecioProductoActionPerformed

    private void btnRadioNoDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioNoDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadioNoDisponibleActionPerformed

    private void btnRadioDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadioDisponibleActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        System.exit(0);


    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed

        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    
     public String getIngreseProducto(){
        return txtFieldNombreProducto.getText();
        
    }
     public String getPrecioProducto(){
         return txtFieldPrecioProducto.getText();
     }
     
     
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JRadioButton btnRadioDisponible;
    private javax.swing.JRadioButton btnRadioNoDisponible;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIngreseNombre;
    private javax.swing.JLabel lblIngreseProducto;
    private javax.swing.JLabel lblProductosDisponibles;
    private javax.swing.JLabel lblProductosNoDisponibles;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaProductoDisponible;
    private javax.swing.JTextArea txtAreaProductoNoDisponible;
    private javax.swing.JTextField txtFieldNombreProducto;
    private javax.swing.JTextField txtFieldPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
