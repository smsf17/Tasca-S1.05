package n1exercici5SamayoaS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class N1exercici5SamayoaS {

	public static void main(String[] args) {
		ArrayList<Ordenador> ordenador = new ArrayList<Ordenador>();
	
		Ordenador ordenador1 = new Ordenador("Dell", "Aspire", "core I7", 32);
		ordenador.add(ordenador1);
		Ordenador ordenador2 = new Ordenador("Apple", "MacPro", "Core I5", 64); 
		ordenador.add(ordenador2);
		Ordenador ordenador3 = new Ordenador("Asus", "ZenBook", "Core I7", 128);
		ordenador.add(ordenador3);
		Ordenador ordenador4 = new Ordenador("Lenovo", "ThinkPad", "Core I5", 32);
		ordenador.add(ordenador4);
		
		for(Ordenador e: ordenador) {
			System.out.println(e);
		}
		
		try {
			ObjectOutputStream escribeFichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Pau\\Downloads\\S10505.ser"));
			escribeFichero.writeObject(ordenador);
			escribeFichero.close();
			
			ObjectInputStream recuperarFichero = new ObjectInputStream (new FileInputStream("C:\\Users\\Pau\\Downloads\\S10505.ser"));
			Ordenador[] ordenadorRecuperado = (Ordenador[]) recuperarFichero.readObject();
			recuperarFichero.close();
			
			for(Ordenador e: ordenadorRecuperado) {
				System.out.println(e);
			}
		
		}catch(Exception e) {
			
		}

	}

}
