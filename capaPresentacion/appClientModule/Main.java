import java.util.ArrayList;

import negocio.Administradora;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administradora admin = new Administradora();
		ArrayList<Object> ls = new ArrayList<>(); 
		
		ls.add(admin.getEtiqueta("H20500006"));
		
		if (!ls.isEmpty())
		{
			
			System.out.println(ls);
			
		}
		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}