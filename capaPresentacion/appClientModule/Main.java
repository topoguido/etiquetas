import java.util.ArrayList;
import java.util.Iterator;

import datos.clsF5660005;
import negocio.Administradora;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administradora admin = new Administradora();
		ArrayList<clsF5660005> ls = new ArrayList<>(); 
		
		ls = admin.getEtiqueta("H205000");
		
		if (!ls.isEmpty())
		{
			
			//System.out.println(ls);
			Iterator<clsF5660005> iter = ls.iterator();
		    while (iter.hasNext()) 
		    {
		        clsF5660005 var =  iter.next(); 
		    	System.out.println(var.getETAA12() + "|" + var.getETLITM() + "|" + var.getETUSER() + "|" + var.getETADDJ() );		        
		         
		    }
		}
	
		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}