
package misframes;

import basededatos.MySqlConn;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import portadas.Menu;

public class EsquemaPisos extends javax.swing.JInternalFrame {

    int tipo;
    HashMap <Integer,JRadioButton> habitaciones;
    
    public EsquemaPisos() {
        initComponents();  
    }
    
    public EsquemaPisos(int tipo) {
        initComponents();
        this.tipo = tipo;
        habitaciones = new HashMap();
    }
    
    class ManejadorDeEventos implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent ie) {
            JRadioButton aux = (JRadioButton)ie.getSource();
            int num = Integer.parseInt(aux.getText().trim());
            if(aux.isSelected()){
                Altas.seleccionada = num;
                habitaciones.get(num).setBackground(Color.green);
            }else
                habitaciones.get(num).setBackground(Color.white);
        }
        };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHabitaciones = new javax.swing.ButtonGroup();
        JPanelFondo = new javax.swing.JPanel();
        jPanelPiso1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton118 = new javax.swing.JRadioButton();
        jRadioButton119 = new javax.swing.JRadioButton();
        jRadioButton120 = new javax.swing.JRadioButton();
        jRadioButton121 = new javax.swing.JRadioButton();
        jRadioButton122 = new javax.swing.JRadioButton();
        jRadioButton123 = new javax.swing.JRadioButton();
        jRadioButton124 = new javax.swing.JRadioButton();
        jRadioButton125 = new javax.swing.JRadioButton();
        jRadioButton111 = new javax.swing.JRadioButton();
        jRadioButton112 = new javax.swing.JRadioButton();
        jRadioButton113 = new javax.swing.JRadioButton();
        jRadioButton114 = new javax.swing.JRadioButton();
        jRadioButton115 = new javax.swing.JRadioButton();
        jRadioButton116 = new javax.swing.JRadioButton();
        jRadioButton117 = new javax.swing.JRadioButton();
        jButtonConfirmar = new javax.swing.JButton();
        jPanelPiso3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton219 = new javax.swing.JRadioButton();
        jRadioButton220 = new javax.swing.JRadioButton();
        jRadioButton221 = new javax.swing.JRadioButton();
        jRadioButton222 = new javax.swing.JRadioButton();
        jRadioButton223 = new javax.swing.JRadioButton();
        jRadioButton224 = new javax.swing.JRadioButton();
        jRadioButton225 = new javax.swing.JRadioButton();
        jRadioButton211 = new javax.swing.JRadioButton();
        jRadioButton212 = new javax.swing.JRadioButton();
        jRadioButton213 = new javax.swing.JRadioButton();
        jRadioButton215 = new javax.swing.JRadioButton();
        jRadioButton216 = new javax.swing.JRadioButton();
        jRadioButton217 = new javax.swing.JRadioButton();
        jRadioButton218 = new javax.swing.JRadioButton();
        jRadioButton214 = new javax.swing.JRadioButton();

        setTitle("Selección de Habitación");
        setMaximumSize(new java.awt.Dimension(1051, 665));
        setPreferredSize(new java.awt.Dimension(1051, 665));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
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

        JPanelFondo.setBackground(new java.awt.Color(204, 255, 204));
        JPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPiso1.setBackground(new java.awt.Color(102, 255, 153));

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel4.setText("Piso 1");

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel1.setText("Jardin");

        buttonGroupHabitaciones.add(jRadioButton118);
        jRadioButton118.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton118.setText("118");
        jRadioButton118.setEnabled(false);
        jRadioButton118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton118.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton119);
        jRadioButton119.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton119.setText("119");
        jRadioButton119.setEnabled(false);
        jRadioButton119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton119.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton120);
        jRadioButton120.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton120.setText("120");
        jRadioButton120.setEnabled(false);
        jRadioButton120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton120.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton121);
        jRadioButton121.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton121.setText("121");
        jRadioButton121.setEnabled(false);
        jRadioButton121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton121.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton122);
        jRadioButton122.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton122.setText("122");
        jRadioButton122.setEnabled(false);
        jRadioButton122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton122.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton123);
        jRadioButton123.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton123.setText("123");
        jRadioButton123.setEnabled(false);
        jRadioButton123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton123.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton124);
        jRadioButton124.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton124.setText("124");
        jRadioButton124.setEnabled(false);
        jRadioButton124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton124.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton125);
        jRadioButton125.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton125.setText("125");
        jRadioButton125.setEnabled(false);
        jRadioButton125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton125.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton111);
        jRadioButton111.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton111.setText("111");
        jRadioButton111.setEnabled(false);
        jRadioButton111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton111.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton112);
        jRadioButton112.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton112.setText("112");
        jRadioButton112.setEnabled(false);
        jRadioButton112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton112.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton113);
        jRadioButton113.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton113.setText("113");
        jRadioButton113.setEnabled(false);
        jRadioButton113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton113.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton114);
        jRadioButton114.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton114.setText("114");
        jRadioButton114.setEnabled(false);
        jRadioButton114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton114.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton115);
        jRadioButton115.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton115.setText("115");
        jRadioButton115.setEnabled(false);
        jRadioButton115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton115.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton116);
        jRadioButton116.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton116.setText("116");
        jRadioButton116.setEnabled(false);
        jRadioButton116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton116.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton117);
        jRadioButton117.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton117.setText("117");
        jRadioButton117.setEnabled(false);
        jRadioButton117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton117.setOpaque(true);

        jButtonConfirmar.setText("Confirmar Habitación");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiso1Layout = new javax.swing.GroupLayout(jPanelPiso1);
        jPanelPiso1.setLayout(jPanelPiso1Layout);
        jPanelPiso1Layout.setHorizontalGroup(
            jPanelPiso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiso1Layout.createSequentialGroup()
                .addGroup(jPanelPiso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPiso1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(323, 323, 323)
                        .addComponent(jButtonConfirmar))
                    .addGroup(jPanelPiso1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPiso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPiso1Layout.createSequentialGroup()
                                .addComponent(jRadioButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPiso1Layout.createSequentialGroup()
                                .addComponent(jRadioButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanelPiso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPiso1Layout.createSequentialGroup()
                                .addComponent(jRadioButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPiso1Layout.createSequentialGroup()
                                .addComponent(jRadioButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelPiso1Layout.setVerticalGroup(
            jPanelPiso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiso1Layout.createSequentialGroup()
                .addGroup(jPanelPiso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanelPiso1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonConfirmar)))
                .addGroup(jPanelPiso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPiso1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(119, 119, 119))
                    .addGroup(jPanelPiso1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPiso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPiso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        JPanelFondo.add(jPanelPiso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 13, -1, -1));

        jPanelPiso3.setBackground(new java.awt.Color(102, 255, 153));

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel6.setText("Piso 2");

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setText("Jardin");

        buttonGroupHabitaciones.add(jRadioButton219);
        jRadioButton219.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton219.setText("219");
        jRadioButton219.setEnabled(false);
        jRadioButton219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton219.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton220);
        jRadioButton220.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton220.setText("220");
        jRadioButton220.setEnabled(false);
        jRadioButton220.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton220.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton221);
        jRadioButton221.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton221.setText("221");
        jRadioButton221.setEnabled(false);
        jRadioButton221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton221.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton222);
        jRadioButton222.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton222.setText("222");
        jRadioButton222.setEnabled(false);
        jRadioButton222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton222.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton223);
        jRadioButton223.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton223.setText("223");
        jRadioButton223.setEnabled(false);
        jRadioButton223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton223.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton224);
        jRadioButton224.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton224.setText("224");
        jRadioButton224.setEnabled(false);
        jRadioButton224.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton224.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton225);
        jRadioButton225.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton225.setText("225");
        jRadioButton225.setEnabled(false);
        jRadioButton225.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton225.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton211);
        jRadioButton211.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton211.setText("211");
        jRadioButton211.setEnabled(false);
        jRadioButton211.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton211.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton212);
        jRadioButton212.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton212.setText("212");
        jRadioButton212.setEnabled(false);
        jRadioButton212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton212.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton213);
        jRadioButton213.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton213.setText("213");
        jRadioButton213.setEnabled(false);
        jRadioButton213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton213.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton215);
        jRadioButton215.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton215.setText("215");
        jRadioButton215.setEnabled(false);
        jRadioButton215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton215.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton216);
        jRadioButton216.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton216.setText("216");
        jRadioButton216.setEnabled(false);
        jRadioButton216.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton216.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton217);
        jRadioButton217.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton217.setText("217");
        jRadioButton217.setEnabled(false);
        jRadioButton217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton217.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton218);
        jRadioButton218.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton218.setText("218");
        jRadioButton218.setEnabled(false);
        jRadioButton218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton218.setOpaque(true);

        buttonGroupHabitaciones.add(jRadioButton214);
        jRadioButton214.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButton214.setText("214");
        jRadioButton214.setEnabled(false);
        jRadioButton214.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton214.setOpaque(true);

        javax.swing.GroupLayout jPanelPiso3Layout = new javax.swing.GroupLayout(jPanelPiso3);
        jPanelPiso3.setLayout(jPanelPiso3Layout);
        jPanelPiso3Layout.setHorizontalGroup(
            jPanelPiso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiso3Layout.createSequentialGroup()
                .addGroup(jPanelPiso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanelPiso3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPiso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPiso3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jRadioButton219, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton220, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton221, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton222, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jRadioButton223, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton224, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton225, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPiso3Layout.createSequentialGroup()
                                .addComponent(jRadioButton211, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton212, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton213, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton214, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton215, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jRadioButton216, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton217, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton218, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPiso3Layout.setVerticalGroup(
            jPanelPiso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiso3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGroup(jPanelPiso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPiso3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPiso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton219, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton220, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton221, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton222, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton223, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton224, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton225, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPiso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton211, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton212, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton213, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton215, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton216, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton217, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton218, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton214, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPiso3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRadioButton224.getAccessibleContext().setAccessibleName("");

        JPanelFondo.add(jPanelPiso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 314, 950, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        //Llenar HahMap con habitaciones
        if(tipo == 1){
            habitaciones.put(Integer.parseInt(this.jRadioButton114.getText().trim()), jRadioButton114);
            habitaciones.put(Integer.parseInt(this.jRadioButton119.getText().trim()), jRadioButton119);
            habitaciones.put(Integer.parseInt(this.jRadioButton120.getText().trim()), jRadioButton120);
            habitaciones.put(Integer.parseInt(this.jRadioButton121.getText().trim()), jRadioButton121);
            habitaciones.put(Integer.parseInt(this.jRadioButton124.getText().trim()), jRadioButton124);
            habitaciones.put(Integer.parseInt(this.jRadioButton211.getText().trim()), jRadioButton211);
            habitaciones.put(Integer.parseInt(this.jRadioButton212.getText().trim()), jRadioButton212);
            habitaciones.put(Integer.parseInt(this.jRadioButton214.getText().trim()), jRadioButton214);
            habitaciones.put(Integer.parseInt(this.jRadioButton215.getText().trim()), jRadioButton215); 
            habitaciones.put(Integer.parseInt(this.jRadioButton220.getText().trim()), jRadioButton220);
            habitaciones.put(Integer.parseInt(this.jRadioButton221.getText().trim()), jRadioButton221);
            habitaciones.put(Integer.parseInt(this.jRadioButton222.getText().trim()), jRadioButton222); 
        } else if(tipo == 2){
            habitaciones.put(Integer.parseInt(this.jRadioButton112.getText().trim()), jRadioButton112);
            habitaciones.put(Integer.parseInt(this.jRadioButton113.getText().trim()), jRadioButton113);
            habitaciones.put(Integer.parseInt(this.jRadioButton115.getText().trim()), jRadioButton115);
            habitaciones.put(Integer.parseInt(this.jRadioButton116.getText().trim()), jRadioButton116);
            habitaciones.put(Integer.parseInt(this.jRadioButton117.getText().trim()), jRadioButton117);
            habitaciones.put(Integer.parseInt(this.jRadioButton122.getText().trim()), jRadioButton122);
            habitaciones.put(Integer.parseInt(this.jRadioButton123.getText().trim()), jRadioButton123);
            habitaciones.put(Integer.parseInt(this.jRadioButton213.getText().trim()), jRadioButton213);
            habitaciones.put(Integer.parseInt(this.jRadioButton217.getText().trim()), jRadioButton217);
            habitaciones.put(Integer.parseInt(this.jRadioButton218.getText().trim()), jRadioButton218); 
            habitaciones.put(Integer.parseInt(this.jRadioButton223.getText().trim()), jRadioButton223);
        } else{
            habitaciones.put(Integer.parseInt(this.jRadioButton111.getText().trim()), jRadioButton111);
            habitaciones.put(Integer.parseInt(this.jRadioButton118.getText().trim()), jRadioButton118);
            habitaciones.put(Integer.parseInt(this.jRadioButton125.getText().trim()), jRadioButton125);
            habitaciones.put(Integer.parseInt(this.jRadioButton216.getText().trim()), jRadioButton216);
            habitaciones.put(Integer.parseInt(this.jRadioButton219.getText().trim()), jRadioButton219);
            habitaciones.put(Integer.parseInt(this.jRadioButton224.getText().trim()), jRadioButton224);
            habitaciones.put(Integer.parseInt(this.jRadioButton225.getText().trim()), jRadioButton225);
        }
        //Evento
        ManejadorDeEventos escucha = new ManejadorDeEventos();
        //Habilitar habitaciones no ocupadas
        String query = "select * from habitaciones where tipo = " + "'" + tipo + "' and disponible = " + "'" + 0 + "'";
        Menu.conn.Consult(query);
        int n = 0;
        try {
            Menu.conn.rs.last();
            n = Menu.conn.rs.getRow();
            Menu.conn.rs.first();
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,"Error base de datos");
        }
        if (n != 0){//hay datos
            int num;
            for (int i = 0; i < n; i++) {
                try{
                    num = Menu.conn.rs.getInt(2);
                    habitaciones.get(num).setBackground(Color.white);
                    habitaciones.get(num).setEnabled(true);
                    habitaciones.get(num).addItemListener(escucha);
                    Menu.conn.rs.next();
                } catch (Exception e){
                    JOptionPane.showMessageDialog(this,"Error base de datos");
                }
            }
        }//fin if
     
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        Altas.jTextFieldHabitacion.setText(Integer.toString(Altas.seleccionada));
        this.dispose();
    }//GEN-LAST:event_jButtonConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelFondo;
    private javax.swing.ButtonGroup buttonGroupHabitaciones;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelPiso1;
    private javax.swing.JPanel jPanelPiso3;
    private javax.swing.JRadioButton jRadioButton111;
    private javax.swing.JRadioButton jRadioButton112;
    private javax.swing.JRadioButton jRadioButton113;
    private javax.swing.JRadioButton jRadioButton114;
    private javax.swing.JRadioButton jRadioButton115;
    private javax.swing.JRadioButton jRadioButton116;
    private javax.swing.JRadioButton jRadioButton117;
    private javax.swing.JRadioButton jRadioButton118;
    private javax.swing.JRadioButton jRadioButton119;
    private javax.swing.JRadioButton jRadioButton120;
    private javax.swing.JRadioButton jRadioButton121;
    private javax.swing.JRadioButton jRadioButton122;
    private javax.swing.JRadioButton jRadioButton123;
    private javax.swing.JRadioButton jRadioButton124;
    private javax.swing.JRadioButton jRadioButton125;
    private javax.swing.JRadioButton jRadioButton211;
    private javax.swing.JRadioButton jRadioButton212;
    private javax.swing.JRadioButton jRadioButton213;
    private javax.swing.JRadioButton jRadioButton214;
    private javax.swing.JRadioButton jRadioButton215;
    private javax.swing.JRadioButton jRadioButton216;
    private javax.swing.JRadioButton jRadioButton217;
    private javax.swing.JRadioButton jRadioButton218;
    private javax.swing.JRadioButton jRadioButton219;
    private javax.swing.JRadioButton jRadioButton220;
    private javax.swing.JRadioButton jRadioButton221;
    private javax.swing.JRadioButton jRadioButton222;
    private javax.swing.JRadioButton jRadioButton223;
    private javax.swing.JRadioButton jRadioButton224;
    private javax.swing.JRadioButton jRadioButton225;
    // End of variables declaration//GEN-END:variables
}
