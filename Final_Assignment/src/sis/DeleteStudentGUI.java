package sis;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteStudentGUI {

	public static void main(String[] args) {
		final JFrame frm = new JFrame("Delete Student");

		frm.setSize(500, 400);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.setLayout(new FlowLayout());

		JButton Quit = new JButton("Exit");
		JButton btnDeleteStudent = new JButton("Delete Student");
		JLabel id = new JLabel("Please enter the ID you want to delete:");
		final JTextField idtxt = new JTextField(10);
		idtxt.setPreferredSize(new Dimension(400, 25));
		Quit.setPreferredSize(new Dimension(400,25));
		btnDeleteStudent.setPreferredSize(new Dimension(400,25));

		frm.add(id);
		frm.add(idtxt);
		frm.add(btnDeleteStudent);
		frm.add(Quit);

		frm.setVisible(true);

		btnDeleteStudent.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String a = idtxt.getText();
				int position = 1 -1;
				String tempFile= "temp.txt";
				File oldFile = new File("UniStudents.txt");
				File newFile = new File(tempFile);
				
				String currentLine;
				String data[];
				
				try {
					
					FileWriter fw= new FileWriter(tempFile,true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw= new PrintWriter(bw);
					
					FileReader fr= new FileReader("UniStudents.txt");
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
					File hot= new File("UniStudents.txt");
					newFile.renameTo(hot);
					
					JOptionPane.showMessageDialog(null, "Done");
					frm.setVisible(false);
					Welcome.main(null);
				} catch (Exception e1) {
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
