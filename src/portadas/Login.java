
package portadas;

import basededatos.MySqlConn;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.apache.commons.codec.digest.DigestUtils;

public class Login extends javax.swing.JFrame {

    MySqlConn conn = new MySqlConn();
    private Object DigestUtils;
    AudioClip sonido;
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        SonidoLogin();
        
        jTextFieldCuenta.setBackground(new Color(0,0,0,0));
        jTextFieldCuenta.setOpaque(false);
        jTextFieldCuenta.setBorder(null);
        jTextFieldCuenta.setForeground(Color.WHITE);

        jPasswordFieldContraseña.setBackground(new Color(0, 0, 0, 0));
        jPasswordFieldContraseña.setOpaque(false);
        jPasswordFieldContraseña.setBorder(null);
        jPasswordFieldContraseña.setForeground(Color.WHITE);
        
       
        
        

        jPanelFondoPrincipal.setSize(1051, 665);

        try {
            //create the font to use. Specify the size!
            Font fuente = Font.createFont(Font.TRUETYPE_FONT, new File("src\\font\\Braxton Free.otf")).deriveFont(30f);
            Font fuente1 = Font.createFont(Font.TRUETYPE_FONT, new File("src\\font\\Braxton Free.otf")).deriveFont(60f);
            Font fuente2 = Font.createFont(Font.TRUETYPE_FONT, new File("src\\font\\Braxton Free.otf")).deriveFont(30f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(fuente);
            jLabelTitulo.setFont(fuente);
            jLabelTitulo1.setFont(fuente1);
            jLabeltitulo2.setFont(fuente2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
        

    }
    
    private void SonidoLogin(){
       sonido= java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/Audio.wav"));
       sonido.play(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondoPrincipal = new PanelIm("src/imagenes/fondop.jpg");
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCuenta = new javax.swing.JLabel();
        jTextFieldCuenta = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jLabelTitulo1 = new javax.swing.JLabel();
        jLabeltitulo2 = new javax.swing.JLabel();
        jPanel1 = new PanelIm("src/imagenes/logucci2.png");
        jPanel3 = new PanelIm("src/imagenes/logucci2.png");
        jButtonIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido a Froog Resort");
        setResizable(false);

        jPanelFondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Valle de los Sapos Arcoíris No. 129 Boullevard Martinaisse, Revachol.");
        jPanelFondoPrincipal.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 740, 70));

        jLabelCuenta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuenta.setText("Cuenta:");
        jPanelFondoPrincipal.add(jLabelCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 158, 44));

        jTextFieldCuenta.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jTextFieldCuenta.setOpaque(false);
        jPanelFondoPrincipal.add(jTextFieldCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 160, 40));

        jLabelContraseña.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setText("Contraseña:");
        jPanelFondoPrincipal.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, 60));

        jPasswordFieldContraseña.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jPasswordFieldContraseña.setOpaque(false);
        jPanelFondoPrincipal.add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 160, 40));

        jLabelTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("Froog Resort");
        jPanelFondoPrincipal.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabeltitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltitulo2.setText("Que empiece el confort");
        jPanelFondoPrincipal.add(jLabeltitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 270, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanelFondoPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 130));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanelFondoPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 160, 130));

        jButtonIngresar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        jPanelFondoPrincipal.add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        // TODO add your handling code here:
        String cuenta, contraseña, query;
        cuenta = this.jTextFieldCuenta.getText().trim();
        query = "select * from cuentas where cuenta = "+"'"+cuenta+"'";
        this.conn.Consult(query);
        try{
            String contraseñaMySql = this.conn.rs.getString(2);
            char [] passw = this.jPasswordFieldContraseña.getPassword();
            contraseña = new String(passw);
            String contraseñaencriptada;
            contraseñaencriptada = org.apache.commons.codec.digest.DigestUtils.md5Hex(contraseña);
            if(contraseñaMySql.equals(contraseñaencriptada)){
                JOptionPane.showMessageDialog(this,"Bienvenido "+this.conn.rs.getString(1)+" al sistema.");
                new Menu().setVisible(true);
                sonido.stop();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this,"Error en la contraseña."); 
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"No existe la cuenta");
        }
        
    }//GEN-LAST:event_jButtonIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCuenta;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabeltitulo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelFondoPrincipal;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldCuenta;
    // End of variables declaration//GEN-END:variables
class PanelIm extends JPanel {

        private Image fondo;
        private String ruta;
        
        public PanelIm(String ruta){
            this.fondo = null;
            this.ruta = ruta;
        }
        @Override
        public void paint(Graphics g) {
            fondo = new ImageIcon(ruta).getImage();
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);

            setOpaque(false);
            super.paint(g);
        }
    }
}
