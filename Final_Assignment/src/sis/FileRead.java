package sis;

import java.io.*;


public class FileRead {
	
	private static FileRead instance = new FileRead();

	  public static FileRead getInstance(){
	      return instance;
	   }
	  
	  
	 
	  private FileRead(){
		   
	  }
	
	
	public void readfile(){	

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"UniStudents.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			System.out.println("====================");
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
