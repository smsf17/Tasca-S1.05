package N1exercici4SamayoaS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Directorio {
	
	
	public void obtenerDirectorio (String direccion) {
		String filePath = direccion;
		BufferedReader br = null;

		try {
			File file = new File(filePath);
			br = new BufferedReader(new FileReader(file));

			String line = null;

			while ((line = br.readLine()) !=null) {
				System.out.println(line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				}catch (Exception e) {};
			}
		}

	}

}
