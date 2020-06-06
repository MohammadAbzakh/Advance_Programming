package sis;


import java.util.Scanner;
import java.util.*;
import java.lang.*;

@SuppressWarnings("unused")
public class MainSisSystem {
	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		OperationStudents studentop = new OperationStudents();

		int j = 0;
		while (j == 0) {
			System.out.println("Main menu.");
			System.out.println("====================");
			System.out.println("1. Add student.");
			System.out.println("2. Find student.");
			System.out.println("3. Delete student.");
			System.out.println("4. Show all student.");
			System.out.println("5. Quit.");
			System.out.println("====================");
			System.out.println("please enter your choice: ");
			int choice = scan.nextInt();

			System.out.println("====================");
			Student student = new Student();

			switch (choice) {

			case (1): {
				studentop.studentadd();
				break;

			}
			case (2): {
				studentop.studentfind();
				break;

			}

			case (3): {

				studentop.studentdelete();
				break;
			}
			case (4): {
				studentop.showstudent();
				break;
			}
			case (5): {
				System.out.println("Done.");
				j++;
				break;
			}

			}

		}

	}
}