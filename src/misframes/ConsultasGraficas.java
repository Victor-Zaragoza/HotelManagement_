
package misframes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;
import org.jfree.util.TableOrder;
import portadas.Menu;

public class ConsultasGraficas extends javax.swing.JInternalFrame {

    int consulta;
    public ConsultasGraficas() {
        initComponents();
    }
    
    public ConsultasGraficas(int consulta) {
        initComponents();
        this.consulta = consulta;
        seleccionarGrafica();
    }
    
    void seleccionarGrafica(){
        if(consulta == 1){//Obtener porcentajes de ocupación por tipo de habitación
            consultaTipoO(); 
        }
        if(consulta == 2){//Obtener total de habitaciones de cada tipo
           consultaHab(); 
        }
        if(consulta == 3){//Obtener ocupación total del hotel
            consultaTotalO();
        }
    }
    
    void consultaTipoO() {
        int hab_Ocupadas [] = new int [3];
        //Almacenar número de habitaciones ocupadas por tipo de habitación
        for (int i = 0; i <= 2; i++) {
            String query = "select * from habitaciones where tipo = " + "'" + (i+1) + "' and disponible = " + "'" + 1 + "'";
            Menu.conn.Consult(query);
            try {
                Menu.conn.rs.last();
                hab_Ocupadas[i] = Menu.conn.rs.getRow();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Error base de datos");
            }
        }
        //Llenar datos para gráfico
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.addValue(hab_Ocupadas[0],"Ocupadas", "Habitación sencilla");
            dataset.addValue(hab_Ocupadas[1],"Ocupadas", "Habitación doble");
            dataset.addValue(hab_Ocupadas[2],"Ocupadas", "Habitación triple");
            dataset.addValue(12-hab_Ocupadas[0],"Disponibles", "Habitación sencilla");
            dataset.addValue(11-hab_Ocupadas[1],"Disponibles", "Habitación doble");
            dataset.addValue(7-hab_Ocupadas[2],"Disponibles", "Habitación triple");
            
        //Crear multi gráfico, establecer el título y fondo del multi gráfico
        JFreeChart grafica = ChartFactory.createMultiplePieChart3D("", dataset, TableOrder.BY_COLUMN, true, true, false); 
        grafica.setTitle(new TextTitle("Porcentaje de Ocupación por Tipo de Habitación",new Font("Dubai Bold", Font.PLAIN, 30)));
        grafica.setBackgroundPaint(new Color(204,255,204));
        
        //Obtener los tres subgráficos y cambiar fondo y letra
        JFreeChart subgrafico = ((MultiplePiePlot) grafica.getPlot()).getPieChart();
        subgrafico.setBackgroundPaint(new Color(204,255,204));
        subgrafico.getTitle().setFont(new Font("Dubai Bold", Font.PLAIN, 22));
        
        //Obtener el área de gráficos y modificar fondo, transparencia de secciones; formato y tipo de letra de etiquetas
        PiePlot p = (PiePlot) subgrafico.getPlot();
        p.setLabelFont(new Font("Dubai", Font.PLAIN, 14));
        p.setBackgroundPaint(Color.white);
        p.setForegroundAlpha(0.5f);
        p.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} {1} = ({2})", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance()));
        
        //Color de secciones
        List <Comparable> keys = dataset.getRowKeys();
        p.setSectionPaint(keys.get(0), new Color(51, 255, 51));
        p.setSectionPaint(keys.get(1), new Color(0, 102, 51));
        
        //Agregar al Panel del internaframe de consultasGraficas
        ChartPanel panel = new ChartPanel(grafica);
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panel);
    }
    void consultaHab(){
        //Almacenar número de habitaciones por tipo de habitación en los datos del gráfico
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String tipoHab[] = {"Sencilla", "Doble", "Triple"};
        for (int i = 0; i <= 2; i++) {
            String query = "select * from habitaciones where tipo = " + "'" + (i+1) + "'";
            Menu.conn.Consult(query);
            try {
                Menu.conn.rs.last();
                dataset.setValue(Menu.conn.rs.getRow(),tipoHab[i],tipoHab[i]);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Error base de datos");
            }
        }
        
        //Crear gráfica de barras y definir el color de fondo y tipo de letra
        JFreeChart grafica= ChartFactory.createBarChart3D("","Habitación", "Total",dataset, PlotOrientation.VERTICAL, true, true, false);
        grafica.setTitle(new TextTitle("Total de Habitaciones del Hotel",new Font("Dubai Bold", Font.PLAIN, 30)));
        grafica.setBackgroundPaint(new Color(204,255,204));
        
        //Cambiar fuente y color de los textos de los ejes x,y
        CategoryPlot p = (CategoryPlot)grafica.getCategoryPlot();
        p.getDomainAxis().setTickLabelFont(new Font("Dubai", Font.PLAIN, 18));
        p.getDomainAxis().setLabelFont(new Font("Dubai", Font.BOLD, 22));
        p.getDomainAxis().setLabelPaint(Color.black);
        p.getRangeAxis().setTickLabelFont(new Font("Dubai", Font.PLAIN, 18));
        p.getRangeAxis().setLabelFont(new Font("Dubai", Font.BOLD, 22));
        p.getRangeAxis().setLabelPaint(Color.black);
        
        //Indicar fondo de el gráfico y transparencia de las barras
        p.setBackgroundPaint(Color.white);
        p.setRangeGridlinePaint(Color.black);
        p.setOutlineVisible(true);
        p.setForegroundAlpha(0.8f);
        
        //Asignar colores a las barras y fuente a la leyenda
        BarRenderer renderer =  (BarRenderer) p.getRenderer();
        renderer.setSeriesPaint(0, new Color(102, 204, 0));
        renderer.setSeriesPaint(1, new Color(51, 255, 51));
        renderer.setSeriesPaint(2, new Color(0, 102, 51));
        renderer.setBaseLegendTextFont(new Font("Dubai", Font.PLAIN, 14));
        renderer.setItemMargin(0.002);
        
        //Agregar al Panel del internaframe de consultasGraficas
        ChartPanel panel=new ChartPanel(grafica);
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panel);   
    }
    
    void consultaTotalO() {
        //Almacenar número de habitaciones ocupadas 
        int totalO = 0;
        String query = "select * from habitaciones where disponible = " + "'" + 1 + "'";
        Menu.conn.Consult(query);
        try {
            Menu.conn.rs.last();
            totalO = Menu.conn.rs.getRow();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error base de datos");
        }
        
        //Llenar datos para la gráfica
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Ocupado", totalO);
        dataset.setValue("Disponible", 30 - totalO);
        
        //Crear gráfica de pastel y asignar fuente para el título y fondo general
        JFreeChart grafica = ChartFactory.createPieChart3D("", dataset, true, true, false); 
        grafica.setTitle(new TextTitle("Porcentaje de Ocupación del Hotel",new Font("Dubai Bold", Font.PLAIN, 30)));
        grafica.setBackgroundPaint(new Color(204,255,204));
        
        //Asiganr color de fondo y transparencia a las secciones
        grafica.getPlot().setBackgroundPaint(Color.white);
        grafica.getPlot().setForegroundAlpha(0.5f);
        
        //Asinar formato y fuente a las etiquetas
        PiePlot p = (PiePlot) grafica.getPlot();
        p.setLabelFont(new Font("Dubai", Font.PLAIN, 18));
        p.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} {1} = ({2})", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance()));   
       
        //Color de secciones
        List <Comparable> keys = dataset.getKeys();
        p.setSectionPaint(keys.get(0), new Color(51, 255, 51));
        p.setSectionPaint(keys.get(1), new Color(0, 102, 51));
        
        //Agregar al Panel del internaframe de consultasGraficas
        ChartPanel panel=new ChartPanel(grafica);
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panel); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Consultas");
        setMinimumSize(new java.awt.Dimension(67, 40));
        setNormalBounds(new java.awt.Rectangle(0, 0, 67, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
