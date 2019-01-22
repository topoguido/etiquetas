/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author ge0022
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.microsoft.sqlserver.jdbc.*;
public class F5660005 {

	/*String host="SBRSQL31251";
	String user="GE0022";
	String password="topoguido001";*/

	

 public ArrayList<Object> getEtiqueta(String etiqueta)
   {
        ArrayList<Object>  resultado = new ArrayList<>();
        Statement st;
        ResultSet res;
        try{

               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               /*Connection co = DriverManager.getConnection(host, user, password);*/
               String connectionUrl = "jdbc:sqlserver://SBRSQL31251;database=JDE_CRP;integratedSecurity=true";
               /*String connectionUrl = "jdbc:sqlserver://;servername=SBRSQL31251;integratedSecurity=true;authenticationScheme=JavaKerberos";*/
               Connection conect = DriverManager.getConnection(connectionUrl);
               
              /* SQLServerDataSource ds = new SQLServerDataSource();  
               ds.setUser("soam\\ge0022");  
               ds.setPassword("topoguido001");  
               ds.setServerName("SBRSQL31251");  
               ds.setPortNumber(1433);
               ds.setDatabaseName("JDE_CRP");  
               Connection conect = ds.getConnection(); */
               
               st = conect.createStatement();

               String sentencia="SELECT * FROM CRPDTA.F5660005 WHERE ETAA12 = ('"+etiqueta+"')";
               res = st.executeQuery(sentencia);

               while( res.next())
               {
                   resultado.add(res.getString("ETAA12"));
                   resultado.add(res.getString("ETLITM"));
                   resultado.add(res.getString("ETUSER"));
                   resultado.add(res.getString("ETADDJ"));
                   
               }
            }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        return resultado;
   }

}
