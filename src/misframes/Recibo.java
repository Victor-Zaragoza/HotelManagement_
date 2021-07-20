
package misframes;

public class Recibo extends javax.swing.JInternalFrame {

    public Recibo() {
        initComponents();
    }
    
    public Recibo(String [] datos ){
        initComponents(); 
        
        llenarRecibo(datos);
    }
    
          
           

    public void llenarRecibo(String datos[]){
        
        int  hab = Integer.parseInt(datos[4]);
        int  tip = Integer.parseInt(datos[2]);
        int pers= Integer.parseInt(datos[3]);
        hab/=100;
        
        this.jLabelNombre.setText(datos[0]);
        this.jLabelCuidad.setText(datos[1]);
        this.jLabelTipo.setText(datos[2]);
        this.jLabelTotal.setText(datos[3]);
        this.jLabelNumHab.setText(datos[4]);
        this.jLabelIngreso.setText(datos[7]);
        this.jLabelSalida.setText(datos[8]);
        this.jLabelPiso.setText(""+hab);
        this.jLabelLimite.setText(""+(tip+2));
             
        if(!((pers - (tip)<=0))){
            
            int extra= pers-tip;
            
            switch(extra){
               
                case 1: {
                    this.jLabelExtra.setText("1 Persona");
                    this.jLabelCostoExtra.setText("$ "+datos[6]);
                    break;
                }
                    
                case 2:{
                    this.jLabelExtra.setText("2 Personas");
                    this.jLabelCostoExtra.setText("$ "+datos[6]);
                    break;
                }
                
            }
            
        }
        else{
            this.jLabelExtra.setText("0 Personas");
            this.jLabelCostoExtra.setText("0");
            
        }
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCuidad = new javax.swing.JLabel();
        jLabelSalida = new javax.swing.JLabel();
        jLabelIngreso = new javax.swing.JLabel();
        jLabelNumHab = new javax.swing.JLabel();
        jLabelPiso = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelLimite = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelExtra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCostoExtra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1051, 665));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 677, 1104, 0));

        jLabelNombre.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 300, 20));

        jLabelCuidad.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelCuidad.setText("jLabel2");
        getContentPane().add(jLabelCuidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 290, -1));

        jLabelSalida.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelSalida.setText("jLabel3");
        getContentPane().add(jLabelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 280, -1));

        jLabelIngreso.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelIngreso.setText("jLabel2");
        getContentPane().add(jLabelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 300, 20));

        jLabelNumHab.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelNumHab.setText("jLabel2");
        getContentPane().add(jLabelNumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 140, -1));

        jLabelPiso.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelPiso.setText("jLabel2");
        getContentPane().add(jLabelPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 140, -1));

        jLabelTotal.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelTotal.setText("jLabel3");
        getContentPane().add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 150, -1));

        jLabelLimite.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelLimite.setText("jLabel4");
        getContentPane().add(jLabelLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 150, -1));

        jLabelTipo.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelTipo.setText("jLabel5");
        getContentPane().add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 110, -1));

        jLabelExtra.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelExtra.setText("jLabel3");
        getContentPane().add(jLabelExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel3.setText("Costo Extra: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel2.setText("Personas Extra: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, -1, -1));

        jLabelCostoExtra.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabelCostoExtra.setText("jLabel4");
        getContentPane().add(jLabelCostoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 100, -1));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recibo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1080, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCostoExtra;
    private javax.swing.JLabel jLabelCuidad;
    private javax.swing.JLabel jLabelExtra;
    private javax.swing.JLabel jLabelIngreso;
    private javax.swing.JLabel jLabelLimite;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumHab;
    private javax.swing.JLabel jLabelPiso;
    private javax.swing.JLabel jLabelSalida;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
