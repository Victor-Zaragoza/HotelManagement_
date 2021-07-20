
package misframes;

import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import portadas.Menu;

public class EmpleadoDelMes extends javax.swing.JInternalFrame {

    public EmpleadoDelMes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jButtonConsulta = new javax.swing.JButton();
        jComboBoxMes = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDatosEmpleado = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 255, 204));
        setClosable(true);
        setTitle("Consulta Empleado del Mes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Consulta de Empleado del mes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 13, -1, -1));
        getContentPane().add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 99, 404, 468));

        jButtonConsulta.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonConsulta.setText("Consultar");
        jButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 99, -1, -1));

        jComboBoxMes.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio" }));
        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 100, 97, -1));

        jTextAreaDatosEmpleado.setEditable(false);
        jTextAreaDatosEmpleado.setBackground(new java.awt.Color(153, 255, 153));
        jTextAreaDatosEmpleado.setColumns(20);
        jTextAreaDatosEmpleado.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jTextAreaDatosEmpleado.setRows(5);
        jTextAreaDatosEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del Empleado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 20))); // NOI18N
        jScrollPane1.setViewportView(jTextAreaDatosEmpleado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 379, 404, 188));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed

    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void jButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaActionPerformed
        String ruta="", ocupacion="";
        String mes= this.jComboBoxMes.getSelectedItem().toString();
        
        if(mes.equals("Enero") || mes.equals("Febrero") ){
            
            String query="select * from cuentas where cuenta = "+"'Victor'";
            Menu.conn.Consult(query);
            
            
        }
        
        if(mes.equals("Marzo") || mes.equals("Abril") ){
            String query="select * from cuentas where cuenta = "+"'Victor'";
            Menu.conn.Consult(query);
        }
        if(mes.equals("Mayo") ){
            String query="select * from cuentas where cuenta = "+"'Victor'";
            Menu.conn.Consult(query);
        }
        if(mes.equals("Junio")){
            String query="select * from cuentas where cuenta = "+"'Victor'";
            Menu.conn.Consult(query);
        }
        
        try {
                ruta= Menu.conn.rs.getString(3);
                ocupacion= Menu.conn.rs.getString(4);
                Image aux = new ImageIcon(this.getClass().getResource("/imagenes/"+ruta)).getImage();
                ImageIcon aux2=new ImageIcon(aux);
                jLabelImagen.setIcon(aux2);
                
                this.jTextAreaDatosEmpleado.setText("   Nombre del empleado:  "+ Menu.conn.rs.getString(1)
                +"\n   Puesto en el Hotel: "+ocupacion);
            } catch (SQLException ex) {
                
            }
    }//GEN-LAST:event_jButtonConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsulta;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDatosEmpleado;
    // End of variables declaration//GEN-END:variables
}
