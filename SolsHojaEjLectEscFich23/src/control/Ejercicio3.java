package control;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio3 {

	public static void main(String[] args) {
		Path fichEntrada = Paths.get("Files/carita.jpg");
		Path fichSalida = Paths.get("Files/NuevaCarita.jpg");
		InputStream iStream = null;
		OutputStream oStream = null;
		
		try 
        {
			iStream = Files.newInputStream(fichEntrada);
			oStream= Files.newOutputStream(fichSalida);
			byte[] bytes = new byte[10];
		
			
			while ((iStream.read(bytes)) != -1) {
				oStream.write(bytes);
				bytes=new byte[10];
			}					
			

        }catch (IOException e) {

			e.printStackTrace();
		}finally {			
			try {
				iStream.close();
				oStream.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
	

	}

	}


