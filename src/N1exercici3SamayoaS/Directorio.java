package N1exercici3SamayoaS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Directorio {
	
	
	final static String outputFilePath = "C:\\Users\\Pau\\Downloads\\Clasificacio.txt";
	
	public void obtenerDirectorio (String direccion) {
		File path = new File(direccion);
		String[] list = path.list();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		
		File file = new File(outputFilePath);
        BufferedWriter bf = null;
		
		for (int i=0; i<list.length; i++) {
		
			System.out.println(list[i] +"                " 
				+sdf.format(path.lastModified()));
			try {
				bf = new BufferedWriter(new FileWriter(file));
				bf.write(list[i] + "       "+ sdf.format(path.lastModified()));
				bf.newLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			File f = new File(path.getAbsolutePath(), list[i]);
			if(f.isDirectory()) {
				String[] archivosCarpetas = f.list();
				
				for(int id=0; id<archivosCarpetas.length; id++) {
					System.out.println("     " +archivosCarpetas[id] 
						+"    " +sdf.format(path.lastModified()));
					try {
						bf.write("     " +archivosCarpetas[id] 
								+"    " +sdf.format(path.lastModified()));
						bf.newLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
	
	

