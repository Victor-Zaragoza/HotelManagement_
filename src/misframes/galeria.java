
package misframes;

import basededatos.MySqlConn;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class galeria extends javax.swing.JInternalFrame {

    AudioClip sonido;
    int count=1;
    int max=0;
    String titles[]={"HABITACION SIMPLE","HABITACION DOBLE","HABITACION TRIPLE","SALA DE ESTAR","BAÑO","AREA RECREATIVA","GIMNASIO","ALBERCA","RESTAURANTE","ZONA DE SPA"};
    MySqlConn cc=new MySqlConn();
    Connection cn=cc.conn;
    public galeria() {
        initComponents();
        sonido= java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/Audio.wav"));
        sonido.play();
        String ruta="";
        
        try {
            
            Statement st;
            ResultSet rs;
            st=cn.createStatement();
            rs=st.executeQuery("SELECT COUNT(*) FROM galeria;");
            while(rs.next()){
                max=rs.getInt(1);
            }
            
            st = cn.createStatement();
            rs=st.executeQuery("SELECT RUTA FROM galeria WHERE ID = 1 ");
            
            while(rs.next()){
                ruta=rs.getString(1);
            }
            Image aux = new ImageIcon(this.getClass().getResource("/imagenes/"+ruta)).getImage();
            ImageIcon aux2=new ImageIcon(aux);
            
            jLabel1.setIcon(aux2);
            

        } catch (SQLException e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSiguiente = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonMusica = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1051, 665));
        setPreferredSize(new java.awt.Dimension(1051, 665));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSiguiente.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 110, 60));

        jButtonAnterior.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 110, 60));

        jButtonMusica.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonMusica.setText("Parar música");
        jButtonMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMusicaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 260, 50));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 510, 290));

        jLabel2.setFont(new java.awt.Font("Dubai", 2, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HABITACION SIMPLE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 510, 70));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel3.setText("Galería");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        // TODO add your handling code here:
        String ruta="";
        
        count++;
        
         if(count>max){
             count=1;
         }
         this.jLabel2.setText(titles[count-1]); 
         
         
        try {
            Statement st;
            ResultSet rs;
            
            st = cn.createStatement();
            rs=st.executeQuery("SELECT RUTA FROM galeria WHERE ID = "+count+" ");
            
            while(rs.next()){
                ruta=rs.getString(1);
            }
            Image aux = new ImageIcon(this.getClass().getResource("/imagenes/"+ruta)).getImage();
            ImageIcon aux2=new ImageIcon(aux);
            jLabel1.setIcon(aux2);
            

        } catch (SQLException e) {
                
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        String ruta="";
        
        count--;
        
         if(count<1){
             count=max;
         }
         this.jLabel2.setText(titles[count-1]);  
         
         
        try {
            Statement st;
            ResultSet rs;
            
            st = cn.createStatement();
            rs=st.executeQuery("SELECT RUTA FROM galeria WHERE ID = "+count+" ");
            
            while(rs.next()){
                ruta=rs.getString(1);
            }
            Image aux = new ImageIcon(this.getClass().getResource("/imagenes/"+ruta)).getImage();
            ImageIcon aux2=new ImageIcon(aux);
            jLabel1.setIcon(aux2);
            

        } catch (SQLException e) {
                
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMusicaActionPerformed
        // TODO add your handling code here:
        
        if(this.jButtonMusica.getText()=="Parar música"){
            sonido.stop();
            this.jButtonMusica.setText("Escuchar música");
        }else{
            sonido.play();
            this.jButtonMusica.setText("Parar música");
        }
        
        
    }//GEN-LAST:event_jButtonMusicaActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        sonido.stop();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonMusica;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
    
    
    
    
}
