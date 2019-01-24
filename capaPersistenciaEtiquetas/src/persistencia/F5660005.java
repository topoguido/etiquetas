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

import datos.clsF5660005;

//import com.microsoft.sqlserver.jdbc.*;
public class F5660005 {


	

 public ArrayList<clsF5660005> getEtiqueta(String etiqueta)
   {
        ArrayList<clsF5660005>  resultado = new ArrayList<>();
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
            	   clsF5660005 fila = new clsF5660005();
            	   fila.setETAA12(res.getString("ETAA12"));
            	   fila.setETLITM(res.getString("ETLITM"));
            	   fila.setETUSER(res.getString("ETUSER"));
            	   fila.setETADDJ(res.getLong("ETADDJ"));
            	   
                   resultado.add(fila);
                   
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
