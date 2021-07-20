
package misframes;

import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JOptionPane;
import portadas.Menu;

public class Cambios extends javax.swing.JInternalFrame {

    String nombre_anterior;
    
    public Cambios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumHab = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNuevoNombre = new javax.swing.JTextField();
        jButtonCambios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonLimpiar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Cambio de Propietario de Habitación");

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel2.setText("Indique el número de habitación: ");

        jTextFieldNumHab.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jTextFieldNumHab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNumHabKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel3.setText("Ingrese nuevo propietario:");

        jTextFieldNuevoNombre.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jTextFieldNuevoNombre.setEnabled(false);

        jButtonCambios.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonCambios.setText("Guardar cambios");
        jButtonCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiosActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 255, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualización de cambios realizados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 20))); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jButtonLimpiar.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCambios)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNumHab, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(jTextFieldNuevoNombre)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCambios, jButtonLimpiar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCambios)
                    .addComponent(jButtonLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCambios, jButtonLimpiar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumHabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumHabKeyReleased
        
        if(evt.getKeyCode() == VK_ENTER){
            String query = "select * from clientes where HABITACION = " + "'" + this.jTextFieldNumHab.getText().trim() + "' ";
            Menu.conn.Consult(query);
            int n = 0;
            try {
                n = Menu.conn.rs.getInt(3);
                nombre_anterior = Menu.conn.rs.getString(1);
                this.jTextFieldNumHab.setEditable(false);
                this.jTextFieldNuevoNombre.setEnabled(true);
                this.jTextFieldNuevoNombre.setFocusable(true);
                 
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "La habitación es incorrecta.");
                this.jTextFieldNumHab.setText(""); 
            }  
        }
    }//GEN-LAST:event_jTextFieldNumHabKeyReleased

    private void jButtonCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiosActionPerformed
        
        String hab = this.jTextFieldNumHab.getText().trim();
        String nombre_actual = this.jTextFieldNuevoNombre.getText();
        if (!nombre_actual.matches("[A-Za-z ]+$")){
            JOptionPane.showMessageDialog(this, "El nombre con formato no válido");
        }
        else{
            String query="Update clientes set NAME= '"+ nombre_actual +"' where HABITACION = "+ hab;
            Menu.conn.Update(query);
            this.jTextArea1.setText("\nNúmero de Habitación: "+ hab + "\n\tNombre del propietario anterior ---> " + nombre_anterior +
                    "\n\tNombre del propietario actual ---> " + nombre_actual);
            this.jTextFieldNuevoNombre.setEnabled(false);
        }     
    }//GEN-LAST:event_jButtonCambiosActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
       
        this.jTextFieldNumHab.setText("");
        this.jTextFieldNumHab.setEditable(true);
        this.jTextFieldNuevoNombre.setText("");
        this.jTextFieldNuevoNombre.setEnabled(false);
        this.jTextArea1.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambios;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldNuevoNombre;
    private javax.swing.JTextField jTextFieldNumHab;
    // End of variables declaration//GEN-END:variables
}
