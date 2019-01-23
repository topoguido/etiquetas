/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.ArrayList;
import persistencia.*;

/**
 *
 * @author ge0022
 */
public class Administradora {
    
    private ArrayList<Object> etiquetas = new ArrayList<>();
    
     public ArrayList<Object> getEtiqueta(String etiqueta) {
         
     F5660005 etiquetaDAO = new F5660005();
     etiquetas =  etiquetaDAO.getEtiqueta(etiqueta);
    
     return etiquetas;
    }
     

    public Administradora() {

    }
    
     
    
}
