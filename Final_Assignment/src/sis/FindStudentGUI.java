package sis;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FindStudentGUI {
	public static void main(String[] args) {
		final JFrame frm = new JFrame("Find Student");

		frm.setSize(500, 400);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.setLayout(new FlowLayout());

		JButton Quit = new JButton("Exit");
		final JTextArea studentfound = new JTextArea();
		JButton Find = new JButton("Find");
		JLabel studentid = new JLabel("Enter the ID:");
		final JTextField idtxt = new JTextField();
		Quit.setPreferredSize(new Dimension(175, 25));
		Find.setPreferredSize(new Dimension(200, 25));
		studentfound.setPreferredSize(new Dimension(300, 250));
		idtxt.setPreferredSize(new Dimension(125,25));
		Quit.setPreferredSize(new Dimension(400,25));
		
		frm.add(Find);
		frm.add(studentid);
		frm.add(idtxt);
		frm.add(studentfound);
		frm.add(Quit);

		frm.setVisible(true);

		Find.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String a =idtxt.getText();
				
				Scanner x;
					String id = ""; String name=""; String avg="";
					
					try {
						x = new Scanner(new File("UniStudents.txt"));
						x.useDelimiter("[,\n]");

						boolean found = false;
						while (x.hasNext() && !found ) {
							id = x.next();
							name = x.next();
							avg = x.next();
							
							if (id.equals(a)) {
								found = true;
							}
						}

						if (found) {
							studentfound.append(id +","+name+","+ avg);
							x.close();
						}
						else {
							frm.setVisible(false);
						}
						
					} catch (Exception e1) {
						e1.printStackTrace();
					}
			
			}
		});
		
		Quit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				studentfound.append("");
				frm.setVisible(false);
				Welcome.main(null);
			}
		});
	}

}
