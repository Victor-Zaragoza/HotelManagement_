/*Open the data base*/

package clases;

import basededatos.MySqlConn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tabla {
    ArrayList<Huesped> lista = new ArrayList();
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
                lista.add(new Huesped(rs.getString(1), rs.getString(2)));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error base de datos");
        }
         for (int i = 0; i < lista.size(); i++) {
             colum.addRow(new String[]{lista.get(i).getNombre(),lista.get(i).getNumHab()});
         }
        
         return colum;
     }
}
