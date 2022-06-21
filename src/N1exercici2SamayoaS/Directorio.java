package N1exercici2SamayoaS;

import java.io.File;
import java.text.SimpleDateFormat;

public class Directorio {
	
	public void obtenerDirectorio (String direccion) {
		
		File path = new File(direccion);
		String[] list = path.list();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		for (int i=0; i<list.length; i++) {
			
			System.out.println(list[i] +"                " 
					+sdf.format(path.lastModified()));
			File f = new File(path.getAbsolutePath(), list[i]);
				recurse (f);
				/*String[] archivosCarpetas  = f.list();
				for(int id=0; id<archivosCarpetas.length; id++) {
					System.out.println("     " +archivosCarpetas[id] 
							+"    " +sdf.format(path.lastModified()));
				}*/
			}		
		}
	
	
	static void recurse (File f) {
		if(f.isDirectory()) {
			String[] archivosCarpetas  = f.list();
			for(int id=0; id<archivosCarpetas.length; id++) {
				System.out.println("     " +archivosCarpetas[id]);
			}
		}
	}
}
