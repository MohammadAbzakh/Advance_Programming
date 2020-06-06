package singleton;

import java.io.FileWriter;
import java.io.IOException;

public class Singleton {
		
		

		  private static Singleton instance = new Singleton();

		  public static Singleton getInstance(){
		      return instance;
		   }
		  
		  
		 
		  private Singleton(){
			   
		  }
		  
		  public void writingToTheFile(String msg) 
		  {
				try (FileWriter fw = new FileWriter("Singleton.txt",true)) {
					fw.write(msg+"\n");
					System.out.println("your message is:\n" + msg);
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Please Talk to Jalal ");
				}
			}
		  
		  

			
		}