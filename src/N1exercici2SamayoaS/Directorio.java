package N1exercici2SamayoaS;

import java.io.File;
import java.io.IOException;

public class Directorio {
	
	public void obtenerDirectorio (String direccion) {
		{
	}
			File currentDirectory = new File(direccion); // current directory
			displayDirectoryContents(currentDirectory);
		}

		public static void displayDirectoryContents(File dir) {
			try {
				File[] files = dir.listFiles();
				for (File file : files) {
					if (file.isDirectory()) {
						System.out.println("directory:" + file.getCanonicalPath());
						displayDirectoryContents(file);
					} else {
						System.out.println("     file:" + file.getCanonicalPath());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
