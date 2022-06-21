package n1excercici1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Directorio {
	
	public void obtenerDirectorio (String direccion) {
		
		Path path = Paths.get(direccion);
		try (Stream<Path> subPath = Files.walk(path,1)){
			subPath.sorted().forEach(System.out::println);
			//subPath.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
