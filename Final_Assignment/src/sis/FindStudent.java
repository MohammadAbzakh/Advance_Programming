package sis;

import java.io.*;
import java.util.Scanner;

public class FindStudent {

	private static Scanner x;

	public void studentfind(String searchTerm, String filepath) {
		boolean found = false;
		String id = ""; String name=""; String avg="";

		try {
			x = new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");

			while (x.hasNext() && !found) {
				id = x.next();
				name = x.next();
				avg = x.next();

				if (id.equals(searchTerm)) {
					found = true;
				}
			}

			if (found) {
				System.out.println(id + "," + name + "," + avg);
				System.out.println("======================");
				x.close();
			}
			else {
				System.out.println("Record not found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
