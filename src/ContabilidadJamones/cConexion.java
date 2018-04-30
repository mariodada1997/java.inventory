package ContabilidadJamones;
import java.sql.*;
import javax.swing.JOptionPane;

public class cConexion {
    private String db="sql3235424";
    private String usr="sql3235424";
    private String pwd= "E1nTtsmm8W"; 
    private String url="jdbc:mysql://sql3.freemysqlhosting.net/" + db;
    private Connection conexion;
   
    public cConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            conexion= DriverManager.getConnection(url, usr, pwd);
        }
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()); 
        }
    }
    
    public ResultSet getRegistros(String sql) {
        Statement sentencia;
        ResultSet res;
        try {
            sentencia=conexion.createStatement();
            res = sentencia.executeQuery(sql);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            res= null;
        }
        return res;
    }
    
    public int Guardar (String sql, String [] Valores)
    {
        try {
            int nValores = (Valores.length)-1; 
            PreparedStatement ps = conexion.prepareCall(sql);
            for (int x= 0; x<= nValores; x++) 
                ps.setString (x+1, Valores [x]); 
            int nRegistros = ps. executeUpdate();
            return nRegistros;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()); 
        return 0;
        }
    }
    
    public int ejecutarConsulta(String sql)
    {
        Statement sentencia;
        try
        {
            sentencia=conexion.createStatement();
            int nRegistros = sentencia.executeUpdate(sql);
            return nRegistros;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return 0;
        }
    }

    public void cerrarConexion()
    {
        try
        {
            conexion.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}