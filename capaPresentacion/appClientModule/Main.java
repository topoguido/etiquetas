import java.util.ArrayList;
import java.util.Iterator;

import negocio.Administradora;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administradora admin = new Administradora();
		ArrayList<Object> ls = new ArrayList<>(); 
		
		ls = admin.getEtiqueta("H205000");
		/*
		if (!ls.isEmpty())
		{
			
			//System.out.println(ls);
			Iterator<Object> iter = ls.iterator();
		    while (iter.hasNext()) 
		    {
		         System.out.println(iter.next());
		         
		    }
		}*/
		/*for (Object str:ls)
		{
			System.out.println(ls);
			
		}*/
		int i =0;
		Iterator<Object> it = ls.iterator();
		while(it.hasNext())
		{
			it.next();
			System.out.println(it.getClass());
			i++;
			
		}
		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}