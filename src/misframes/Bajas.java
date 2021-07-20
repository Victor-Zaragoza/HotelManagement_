
package misframes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import portadas.Menu;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bajas extends javax.swing.JInternalFrame {
   
    static String [] recibo= new String[10]; 
    static String servicioExtra = "";
    static String texto = "", ingreso="";
    private Map <String,Integer> servicios = new HashMap();
    public static int ingresoTotal=0;
    String hab;
    Scanner sc = new Scanner(System.in);
  
    
    public Bajas() {
        initComponents();
        servicios.put("Servicio al cuarto",300 );
        servicios.put("Servicio de bar", 500);
        servicios.put("Servicio de tintoreria", 400);
        servicios.put("Servicio de SPA", 600);
        servicios.put("Servicio de niñera", 200);
        servicios.put("Servicio de comida", 300);
        servicios.put("Servicio de GYM", 100);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRegistroSalida = new javax.swing.JTextField();
        jButtonSalida = new javax.swing.JButton();
        jButtonPDF = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Salida");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel1.setText("Numero de habitación: ");

        jTextFieldRegistroSalida.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N

        jButtonSalida.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonSalida.setText("Registrar Salida");
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });

        jButtonPDF.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonPDF.setText("Generar PDF");
        jButtonPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPDFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setText("Registro De Salida");

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel3.setText("¿Deseas guardar un recibo en un PDF?");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkout.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)
                        .addComponent(jButtonPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSalida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(179, 179, 179)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalida)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPDF)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed

        int contCargos=0;
        int aleatorio=0;
        
        hab = this.jTextFieldRegistroSalida.getText().trim(); 
        servicioExtra = "";
        for( Iterator it = servicios.keySet().iterator(); it.hasNext();) {
            aleatorio = (int)(Math.random()*(3-1+1)+1);
            String clave = (String)it.next();
            if(aleatorio == 1){
                int valor= (Integer)servicios.get(clave);
                contCargos+=valor; 
                servicioExtra+= clave+ " : "+valor+" , ";    
            } 
        }
        
        String query= "select * from habitaciones where HABITACION = "+"'"+hab+"'";
        Menu.conn.Consult(query);
        
        try {
                int ocuapado= Menu.conn.rs.getInt(4);
                if(ocuapado==1){
                    String tipHab= Integer.toString(Menu.conn.rs.getInt(1));
                    String costHab= Integer.toString(Menu.conn.rs.getInt(3));
               
                    query= "select * from clientes where HABITACION= "+"'"+hab+"'";
                    Menu.conn.Consult(query);
                    
                   
                   int costosExtra= Menu.conn.rs.getInt(6);
                    
                    recibo[0]= Menu.conn.rs.getString(1);
                    recibo[1]= Menu.conn.rs.getString(2);
                    recibo[2]= Menu.conn.rs.getString(7);
                    recibo[3]= Menu.conn.rs.getString(8);
                    recibo[4]= tipHab;
                    recibo[5]= costHab;
                    recibo[6]= Integer.toString(Menu.conn.rs.getInt(4));
                    recibo[7]= Integer.toString((Integer.parseInt(costHab)+costosExtra)*Menu.conn.rs.getInt(4));
                    recibo[8]= Integer.toString(Integer.parseInt(recibo[7])+contCargos);
                    recibo[9]= servicioExtra; 
                    
                    
                    query="delete from clientes where HABITACION ="+"'"+ hab+"'";
                    Menu.conn.Update(query); 
                    
                    query="Update habitaciones set DISPONIBLE= '0' where HABITACION = "+hab;
                    Menu.conn.Update(query);      
   
                    JOptionPane.showMessageDialog(this, "Salida registrada exitosamente, puede guardar"
                          + " su recibo haciendo click en el boton de abajo");
                }
                
                else{
                    JOptionPane.showMessageDialog(this, "La habitacion seleccionada es incorrecta\n Intentelo de nuevo");  
                }
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "La habitacion seleccionada es incorrecta\n Intentelo de nuevo");
            }
        
        try {
            archivoIngresos();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo.");
        }
        
        this.jTextFieldRegistroSalida.setText("");
        
    }//GEN-LAST:event_jButtonSalidaActionPerformed

    
    
    private void jButtonPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDFActionPerformed
   
        String query= "select * from clientes where HABITACION = "+"'"+hab+"'";
        Menu.conn.Consult(query);

        try {
            crearPDF();
            JOptionPane.showMessageDialog(this, "PDF generado");
        } catch (DocumentException ex) {
            Logger.getLogger(Bajas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bajas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonPDFActionPerformed

    public static void archivoIngresos() throws IOException{
        float ingresoTotal=0;
        
        FileInputStream entrada = null;
        DataInputStream ent = null;
        try {
            entrada=new FileInputStream("src/recibos/ingresos.dat");
            ent = new DataInputStream(entrada);
            ingresoTotal = ent.readFloat();

        } catch (IOException e) {
        } finally{
            if (entrada != null) {
                entrada.close();
            }
            if (ent != null) {
                ent.close();
            }
        }
    
        ingresoTotal+= Float.parseFloat(recibo[8]); 
        FileOutputStream salida = null;
        DataOutputStream sal= null;
        try {
            salida = new FileOutputStream("src/recibos/ingresos.dat", false);
            sal = new DataOutputStream(salida);            
            
            sal.writeFloat(ingresoTotal);
            
        } catch (IOException e) {
        }finally{
            if (salida != null) {
                salida.close();
            }
            if (sal != null) {
                sal.close();
            }
        }
   }
    
   public static void crearPDF( ) throws FileNotFoundException, DocumentException, BadElementException, IOException {
 
        com.itextpdf.text.Document documento = new com.itextpdf.text.Document();
        
        FileOutputStream ficheroPDF = new FileOutputStream("src/recibos/Recibo"+recibo[0]+".pdf");
        PdfWriter.getInstance(documento, ficheroPDF);
        documento.open();
        
        Image imag= Image.getInstance("src/imagenes/logo.jpg");
        
        imag.setAlignment(Element.ALIGN_LEFT);
        documento.add(imag);
        
         Paragraph ubicacion   = new Paragraph("Direccion:\nValle de los sapos #129 Boullevard Martinaisse, Revachol\n Telefono:\n 44566451 \n Clave de facturación:\n 2023465893194746 ",
                FontFactory.getFont("arial",
                9, Font.BOLD, BaseColor.BLACK)
        );
        
         
        ubicacion.setAlignment(Element.ALIGN_CENTER);
        documento.add(ubicacion);
        
        Paragraph titulo = new Paragraph("Froog Resort Hotel ",
                FontFactory.getFont("arial",
                28, Font.BOLD, BaseColor.GREEN)
        );
        
        titulo.setAlignment(Element.ALIGN_CENTER);
        documento.add(titulo);
        
       
        
        Paragraph fechaHoy   = new Paragraph("\n A:"+recibo[3]+ " \n ",
                FontFactory.getFont("arial",
                12, Font.BOLD, BaseColor.BLACK)
        );
        
        fechaHoy.setAlignment(Element.ALIGN_RIGHT);
        documento.add(fechaHoy);
        
        Paragraph DatosCliente   = new Paragraph("_______________________________________________                      "
                + "                               Datos Cliente        _______________________________________________",
                FontFactory.getFont("arial",
                14, Font.BOLD, BaseColor.BLACK)
        );
        
        DatosCliente.setAlignment(Element.ALIGN_CENTER);
        documento.add(DatosCliente);
        
        Paragraph nomHuesp   = new Paragraph("\n\n                  Razón social:              "+recibo[0]+
                "                                        Cuidad de origen:                "+ recibo[1]+
                "\n                  Fecha de ingreso:              "+recibo[2]+
                "                                        Fecha de salida:                 "+recibo[3],
                FontFactory.getFont("arial",
                9, Font.BOLD, BaseColor.BLACK)
        );
        
        nomHuesp.setAlignment(Element.ALIGN_LEFT);
        documento.add(nomHuesp);
        
        Paragraph DatosEstancia   = new Paragraph("_______________________________________________                                      "
                + "           Datos De La Estancia          _______________________________________________",
                FontFactory.getFont("arial",
                14, Font.BOLD, BaseColor.BLACK)
        );
        
        DatosEstancia.setAlignment(Element.ALIGN_CENTER);
        documento.add(DatosEstancia);
        
         Paragraph estHuesp   = new Paragraph("\n\n             Tipo de habitacion:              "+recibo[4]+
                "                                        Costo de la habitacion por noche:                "+ recibo[5]+
                "\n             Dias de estancia en Frogg Resort:              "+recibo[6]+
                "                                        Sub total:                 "+recibo[7]+
                "\n                         Total a pagar:    "+recibo[8],
                FontFactory.getFont("arial",
                9, Font.BOLD, BaseColor.BLACK)
        );
        
        estHuesp.setAlignment(Element.ALIGN_LEFT);
        documento.add(estHuesp);
        
        Paragraph DatosExtra   = new Paragraph("_______________________________________________                "
                + "                  Información de Cargos Extra _______________________________________________",
                FontFactory.getFont("arial",
                14, Font.BOLD, BaseColor.BLACK)
        );
        
        DatosExtra.setAlignment(Element.ALIGN_CENTER);
        documento.add(DatosExtra);
        
         Paragraph extHuesp   = new Paragraph("\n             Lista de cargos extra:\n                "
                 + servicioExtra, FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.BLACK));
        
        extHuesp.setAlignment(Element.ALIGN_LEFT);
        documento.add(extHuesp);
        
        Image firma= Image.getInstance("src/imagenes/firma.jpg");
        firma.setAlignment(Element.ALIGN_CENTER);
        documento.add(firma);
        
         Paragraph gerente   = new Paragraph("\n\n\n\n\n\nVictor Zaragoza\nGerente de Froog Resort\n Gracias por su visita vuelva pronto",
                FontFactory.getFont("arial",
                10, Font.BOLD, BaseColor.BLACK)
        );
        
        gerente.setAlignment(Element.ALIGN_CENTER);
        documento.add(gerente);
        
        documento.close();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPDF;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldRegistroSalida;
    // End of variables declaration//GEN-END:variables
}
