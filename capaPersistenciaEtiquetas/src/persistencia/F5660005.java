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

//import com.microsoft.sqlserver.jdbc.*;
public class F5660005 {


	

 public ArrayList<Object> getEtiqueta(String etiqueta)
   {
        ArrayList<Object>  resultado = new ArrayList<>();
        Statement st;
        ResultSet res;
        try{

               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               String connectionUrl = "jdbc:sqlserver://SBRSQL31251;database=JDE_CRP;integratedSecurity=true";
               Connection conect = DriverManager.getConnection(connectionUrl);
               
               st = conect.createStatement();
               
               String sentencia="SELECT * FROM CRPDTA.F5660005 WHERE ETAA12 LIKE ('"+etiqueta+"%')";
               res = st.executeQuery(sentencia);

               while( res.next())
               {
                   
            	   /*resultado.add(0,res.getString("ETAA12"));
                   resultado.add(1,res.getString("ETLITM"));
                   resultado.add(2,res.getString("ETUSER"));
                   resultado.add(3,res.getString("ETADDJ"));*/
            	   resultado.add(res);
                   
               }
               
               st.close();
               res.close();
            }
        catch(ClassNotFoundException ex)
        {
                  ex.printStackTrace();
           }
        	catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
       
        
        return resultado;
   }

}
