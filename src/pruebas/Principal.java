package pruebas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Principal {

	public static void main(String[] args) throws IOException 
	{
	
		
		//obtiene el archivo de texto y lo leee
		String ruta="C:\\Users\\Brayan Duque Cadavid\\Desktop\\Eclipse-Workspace\\pruebas\\src\\pruebas\\prueba.txt";
	    File archivo=new File(ruta);
		FileReader fr= new FileReader(archivo);
		BufferedReader br=new BufferedReader(fr);
		
        String nodos;
        String n ="";
        //Aregglo que contiene los nodos
        String [] partes = null;
	
        
        //Lectura del archivo en cada una de sus lineas.
		 while((nodos=br.readLine())!=null) 
		 {
	         n +=nodos;
		   	
		
		 }
		 
          partes=n.split(",");
		 
		 
          
          //imprimir por consola lo guardado en el arreglo,dado un archivo de texto.
		for (int i = 0; i < partes.length; i++) 
		{
			System.out.println(partes[i]);
			
		}    
	
	
		// variable booleana que guarda si hay un ciclo o no dentro de la red de nodos
		Boolean respuesta=true;
			
		
		//ciclo que recoore cada elemento del arreglo y compara si hay una ruta entre los nodos.
		for (int i = 0; i < partes.length; i++)
		{
			if (i !=0 && i !=partes.length-1) 
			{
				
				if(partes[i].charAt(0)==partes[i].charAt(1)) 
				{
					respuesta=true;
				}
				else
				{
					respuesta=false;
					break;
				}
				
				
			}
		}
		
		
	
		//imprime respuest por consola
		System.out.println(respuesta);
		
		
		
		
	}
		
}
