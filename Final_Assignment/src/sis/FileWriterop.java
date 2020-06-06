package sis;

import java.io.*;

public class FileWriterop {
	
	private static FileWriterop instance = new FileWriterop();

	  public static FileWriterop getInstance(){
	      return instance;
	   }
	  
	  
	 
	  private FileWriterop(){
		   
	  }

	public void writefile(int id, String name, double avg) {
		try {
			FileWriter student = new FileWriter("UniStudents.txt",true);
			BufferedWriter out = new BufferedWriter(student);
			out.write( id+","+ name+","+ avg+ "\n");
			out.close();
		}catch (Exception e) {
			System.out.println("You have an error talk to Jalal");
		
	}
}
}
