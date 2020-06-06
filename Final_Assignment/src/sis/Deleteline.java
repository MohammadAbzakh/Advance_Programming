package sis;

import java.io.*;

public class Deleteline {

	public void filedelete(String filepath, String a, int positionOfTerm, String delimiter) {
		int position = positionOfTerm -1;
		String tempFile= "temp.txt";
		File oldFile = new File(filepath);
		File newFile = new File(tempFile);
		
		String currentLine;
		String data[];
		
		try {
			
			FileWriter fw= new FileWriter(tempFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw= new PrintWriter(bw);
			
			FileReader fr= new FileReader(filepath);
			BufferedReader br = new BufferedReader(fr);
			
			
			
			while ((currentLine = br.readLine()) !=null) {
				data = currentLine.split(",");
				if (!(data[position].equalsIgnoreCase(a)))
				{
					
					pw.println(currentLine);
				}
				
				
			}
			pw.flush();
			pw.close();
			fr.close();
			br.close();
			bw.close();
			fw.close();
			
			oldFile.delete();
			File hot= new File(filepath);
			newFile.renameTo(hot);
			
		} catch (Exception e) {
			System.out.println("Talk to Jalal");
		}
	}
}