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

public class F5660005 {
    
Connection co;    
Statement st;

String host="SBRSQL31251";
String user="GE0022";
String password="topoguido001";

 public ArrayList getEtiqueta(String etiqueta)
   {
        ArrayList resultado = new ArrayList();
        ResultSet res;
        try{

               Class.forName("com.microsoft.sqlserver.jdbc.Driver");
               Connection co = DriverManager.getConnection(host, user, password);
               st=co.createStatement();

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
