
package portadas;

import basededatos.MySqlConn;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import javax.swing.JPanel;
import misframes.Altas;
import misframes.Bajas;
import misframes.Cambios;
import misframes.ConsultasGraficas;
import misframes.EmpleadoDelMes;
import misframes.Ordenamiento;
import misframes.Recibo;
import misframes.galeria;


public class Menu extends javax.swing.JFrame {

    public static MySqlConn conn;
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(this);
        conn= new MySqlConn(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new PanelIm("src/imagenes/menu.jpg");
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuSalida = new javax.swing.JMenu();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemConsulta1 = new javax.swing.JMenuItem();
        jMenuConsulta2 = new javax.swing.JMenuItem();
        jMenuConsulta3 = new javax.swing.JMenuItem();
        jMenuConsulta4 = new javax.swing.JMenuItem();
        jMenuConsulta5 = new javax.swing.JMenuItem();
        jMenuConsulta6 = new javax.swing.JMenuItem();
        jMenuConsulta7 = new javax.swing.JMenuItem();
        jMenuConsulta8 = new javax.swing.JMenuItem();
        jMenuConsulta9 = new javax.swing.JMenuItem();
        jMenuConsulta10 = new javax.swing.JMenuItem();
        jMenuConsulta11 = new javax.swing.JMenuItem();
        jMenuCambios = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTEL");
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuRegistro.setText("Registro");
        jMenuRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRegistroMouseClicked(evt);
            }
        });
        jMenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistroActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuRegistro);

        jMenuSalida.setText("Salida");
        jMenuSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalidaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalida);

        jMenuConsultas.setText("Consultas");

        jMenuItemConsulta1.setText("Galería");
        jMenuItemConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsulta1ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsulta1);

        jMenuConsulta2.setText("Ingresos");
        jMenuConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta2ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta2);

        jMenuConsulta3.setText("(%) Ocupación por tipo de Habitación");
        jMenuConsulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta3ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta3);

        jMenuConsulta4.setText("Gráfica sobre tipo de Habitaciones");
        jMenuConsulta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta4ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta4);

        jMenuConsulta5.setText("(%) Ocupación del Hotel");
        jMenuConsulta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta5ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta5);

        jMenuConsulta6.setText("Costos de Habitaciones");
        jMenuConsulta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta6ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta6);

        jMenuConsulta7.setText("Consulta por Nombre");
        jMenuConsulta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta7ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta7);

        jMenuConsulta8.setText("Consultar Habitación");
        jMenuConsulta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta8ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta8);

        jMenuConsulta9.setText("Consulta por Piso");
        jMenuConsulta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta9ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta9);

        jMenuConsulta10.setText("Información sobre Huespedes");
        jMenuConsulta10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta10ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta10);

        jMenuConsulta11.setText("Consultar Empleados");
        jMenuConsulta11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta11ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsulta11);

        jMenuBar1.add(jMenuConsultas);

        jMenuCambios.setText("Cambios");
        jMenuCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCambiosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCambios);

        jMenuSalir.setText("Salir del Programa");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked

        dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRegistroMouseClicked
        // TODO add your handling code here:
        //this.removeAll();
        //this.jPanel1.repaint();
        String query ="select * from clientes ";
        Menu.conn.Consult(query);
        int n = 0;
        try{
            Menu.conn.rs.last();
            n = Menu.conn.rs.getRow();
            
        }catch (Exception e){
                JOptionPane.showMessageDialog(this, "Error inesperado.");
        }
        if (n != 30){
            this.repaint();
            //this.jPanel1.repaint();
            Altas altas = new Altas();
            this.jDesktopPane1.add(altas);
            try {
                altas.setMaximum(true);
            } catch (PropertyVetoException ex) {
                java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            altas.show();
        }else{
            JOptionPane.showMessageDialog(this, "No hay habitaciones disponibles.");
        }
        
        
        
        
    }//GEN-LAST:event_jMenuRegistroMouseClicked

    private void jMenuSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalidaMouseClicked
        // TODO add your handling code here:
        
        this.repaint();
        Bajas salida = new Bajas();
        this.jDesktopPane1.add(salida);
        try {
            salida.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        salida.show();
        
    }//GEN-LAST:event_jMenuSalidaMouseClicked

    private void jMenuConsulta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta7ActionPerformed
        // TODO add your handling code here:
        
        String nombre = JOptionPane.showInputDialog(this, "Por favor, inserte el nombre del huesped que desea consultar: ");
        
        if(nombre == null){
            return;
        }
        
        String query= "select * from clientes where NAME= "+"'"+nombre+"'";
        Menu.conn.Consult(query);
        try {
            String nom = Menu.conn.rs.getString(1);
            int hab = Menu.conn.rs.getInt(3);
            int piso = hab/100;
            JOptionPane.showMessageDialog(this,"Huesped: "+nom+"\nHabitación: "+hab+"\nPiso: "+piso,"Cliente encontrado.",PLAIN_MESSAGE);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog( null, "El cliente insertado no existe.", "Inserta otro nombre.", ERROR_MESSAGE); 
        }
        
    }//GEN-LAST:event_jMenuConsulta7ActionPerformed

    private void jMenuConsulta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta8ActionPerformed
        // TODO add your handling code here:
        int hab = 0;
        try{
            hab = Integer.parseInt(JOptionPane.showInputDialog(this, "Por favor, inserte número de habitación a consultar: "));
            if(hab > 110 && hab < 226){
                if (hab > 125 && hab < 200){
                    JOptionPane.showMessageDialog(this, "Número de habitación no existe");
                    return;
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Número de habitación no existe");
                return;
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog( null, "El formato de ingreso no es correcto (Debe de ser un número).", "Inserta otro número.", ERROR_MESSAGE); 
            return;
        }
        String query= "select * from clientes where HABITACION= "+"'"+hab+"'";
        Menu.conn.Consult(query);
        try {
            String nom = Menu.conn.rs.getString(1);
            JOptionPane.showMessageDialog(this,"Huesped que reside en la habitación: "+nom,"Cliente encontrado.",PLAIN_MESSAGE);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog( null, "La habitación que insertaste se encuentra desocupada.", "Inserta otro número.", ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jMenuConsulta8ActionPerformed

    private void jMenuConsulta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Sencilla: $3000\nDoble: $5000\nTriple: $9000 ","Costos de Habitaciones.",PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuConsulta6ActionPerformed

    private void jMenuConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta2ActionPerformed
        
        float ingresoTotal = 0;
        
        FileInputStream entrada = null;
        DataInputStream ent = null;
        try {
            entrada=new FileInputStream("src/recibos/ingresos.dat");
            ent = new DataInputStream(entrada);
            ingresoTotal = ent.readFloat();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,"No se ha encontrado el archivo");
        } finally{
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,"Error");
                }
            }
            if (ent != null) {
                try {
                    ent.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,"Error");
                }
            }
        }      
        
        JOptionPane.showMessageDialog(null, "El total de ingresos generados \n hasta el momento por el hotel es de: $"+ ingresoTotal);
    }//GEN-LAST:event_jMenuConsulta2ActionPerformed

    private void jMenuConsulta9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta9ActionPerformed
        
        String piso="";
        String sencilla= "", doble= "", triple= "";
        String query="";
        int n = 0;
        
        while(!piso.equals("1") && !piso.equals("2")){
            piso= JOptionPane.showInputDialog(null,"¿Sobre cuál piso deseas consultar la disponibilidad  de habitaciones? ");
            try{           
                if(!piso.equals("1") && !piso.equals("2"))
                    JOptionPane.showMessageDialog(this, "Dato incorrecto");
            }catch(NullPointerException e){
                return;
            }
            
            
        }   
            
        if (piso.equals("1"))
            query = "select * from habitaciones where Habitacion <" + "'" + 200 + "' and disponible = " + "'" + 0 + "'";
            
         else    
             query = "select * from habitaciones where Habitacion >" + "'" + 200 + "' and disponible = " + "'" + 0 + "'";
         
        Menu.conn.Consult(query);
        
        try {
            Menu.conn.rs.last();
            n = Menu.conn.rs.getRow();
            Menu.conn.rs.first();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error base de datos");
        }
        
        if (n != 0) {

            int tipohab;
            for (int i = 0; i < n; i++) {
      
                try{
                    tipohab = Menu.conn.rs.getInt(1);
                
                    if(tipohab==1)
                       sencilla+="  "+ Menu.conn.rs.getInt(2)+"  ,";
                    
                    if(tipohab==2)
                        doble+="  "+Menu.conn.rs.getInt(2)+"  ,";
                    
                    if(tipohab==3)
                        triple+="  "+Menu.conn.rs.getInt(2)+"  ,";
                    
                    Menu.conn.rs.next();
                } catch (Exception e){
                    JOptionPane.showMessageDialog(this,"Error base de datos");
                }
            }
        }
        
        JOptionPane.showMessageDialog(this, "En el piso "+piso+ " están disponibles:\n"+
                "Sencillas: "+sencilla+"\n"+"Dobles: "+doble+"\n"+"Triples: "+triple);
                
        
    }//GEN-LAST:event_jMenuConsulta9ActionPerformed

    private void jMenuConsulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta3ActionPerformed
        // TODO add your handling code here:
        this.repaint();
        //this.jPanel1.repaint();
        ConsultasGraficas consultas= new ConsultasGraficas(1);
        this.jDesktopPane1.add(consultas);
        try{
            consultas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        consultas.show();
    }//GEN-LAST:event_jMenuConsulta3ActionPerformed

    private void jMenuConsulta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta4ActionPerformed
        // TODO add your handling code here:
        this.repaint();
        //this.jPanel1.repaint();
        ConsultasGraficas consultas= new ConsultasGraficas(2);
        this.jDesktopPane1.add(consultas);
        try{
            consultas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        consultas.show();
    }//GEN-LAST:event_jMenuConsulta4ActionPerformed

    private void jMenuConsulta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta5ActionPerformed
        // TODO add your handling code here:
        this.repaint();
        //this.jPanel1.repaint();
        ConsultasGraficas consultas= new ConsultasGraficas(3);
        this.jDesktopPane1.add(consultas);
        try{
            consultas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        consultas.show();
    }//GEN-LAST:event_jMenuConsulta5ActionPerformed

    private void jMenuCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCambiosMouseClicked
        // TODO add your handling code here:
        this.repaint();
        //this.jPanel1.repaint();
        Cambios cambios= new Cambios();
        this.jDesktopPane1.add(cambios);
        try{
            cambios.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        cambios.show();
    }//GEN-LAST:event_jMenuCambiosMouseClicked

    private void jMenuItemConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsulta1ActionPerformed
        // TODO add your handling code here:
        this.repaint();
//this.jPanel1.repaint();
       galeria gal = new galeria();
        this.jDesktopPane1.add(gal);
        try {
            gal.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        gal.show();
    }//GEN-LAST:event_jMenuItemConsulta1ActionPerformed

    private void jMenuConsulta11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta11ActionPerformed
        // TODO add your handling code here:
        this.repaint();
//this.jPanel1.repaint();
        EmpleadoDelMes empleadoMes = new EmpleadoDelMes();
        this.jDesktopPane1.add(empleadoMes);
        try {
            empleadoMes.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        empleadoMes.show();
    }//GEN-LAST:event_jMenuConsulta11ActionPerformed

    private void jMenuConsulta10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta10ActionPerformed
        // TODO add your handling code here:
        this.repaint();
        Ordenamiento order = new Ordenamiento();
        this.jDesktopPane1.add(order);
        try {
            order.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        order.show();
    }//GEN-LAST:event_jMenuConsulta10ActionPerformed

    private void jMenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuRegistroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCambios;
    private javax.swing.JMenuItem jMenuConsulta10;
    private javax.swing.JMenuItem jMenuConsulta11;
    private javax.swing.JMenuItem jMenuConsulta2;
    private javax.swing.JMenuItem jMenuConsulta3;
    private javax.swing.JMenuItem jMenuConsulta4;
    private javax.swing.JMenuItem jMenuConsulta5;
    private javax.swing.JMenuItem jMenuConsulta6;
    private javax.swing.JMenuItem jMenuConsulta7;
    private javax.swing.JMenuItem jMenuConsulta8;
    private javax.swing.JMenuItem jMenuConsulta9;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemConsulta1;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JMenu jMenuSalida;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
