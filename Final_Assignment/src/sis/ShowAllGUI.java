package sis;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ShowAllGUI {

	public static void main(String[] args) {
		final JFrame frm = new JFrame("Show Students");

		frm.setSize(500, 400);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.setLayout(new FlowLayout());

		JButton Quit = new JButton("Exit");
		final JTextArea allstudents = new JTextArea();
		JButton ShowAll = new JButton("Show All Students");
		Quit.setPreferredSize(new Dimension(400, 25));
		ShowAll.setPreferredSize(new Dimension(400, 25));
		allstudents.setPreferredSize(new Dimension(300, 250));
		
		frm.add(ShowAll);
		frm.add(allstudents);
		frm.add(Quit);

		frm.setVisible(true);

		ShowAll.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					FileReader reader = new FileReader("UniStudents.txt");
					BufferedReader br = new BufferedReader(reader);
					allstudents.read(br, null);
					br.close();
					allstudents.requestFocus();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		Quit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frm.setVisible(false);
				Welcome.main(null);
			}
		});

	}

}
