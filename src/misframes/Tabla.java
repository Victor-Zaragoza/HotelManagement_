
package misframes;

import basededatos.MySqlConn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tabla {
    MySqlConn cc=new MySqlConn();
    Connection cn=cc.conn;
    Statement st;
    ResultSet rs;
    DefaultTableModel colum = new DefaultTableModel();
    String[] datos = new String[2];
     public DefaultTableModel ourder(){
         JTable jTabla=new JTable();
         jTabla.setModel(colum);        
            colum.addColumn("Nombre");
            colum.addColumn("Numero de Habitacion");       

        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT NAME,HABITACION FROM clientes ORDER BY NAME ASC;");
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                colum.addRow(datos);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
                 
         return colum;
     }
}
