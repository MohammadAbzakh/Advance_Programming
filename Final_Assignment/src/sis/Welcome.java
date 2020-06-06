package sis;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Welcome {

	public static void main(String[] args) {
		final JFrame frm = new JFrame("Welcome");

		frm.setSize(500, 400);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.setLayout(new FlowLayout());

		JButton btnAddStudent = new JButton("Add Student");
		JButton btnDeleteStudent = new JButton("Delete Student");
		JButton btnFindStudent = new JButton("Find Student");
		JButton btnShowAll = new JButton("Show All Students");
		JButton Quit = new JButton("Exit");
		btnAddStudent.setPreferredSize(new Dimension(400, 50));
		btnDeleteStudent.setPreferredSize(new Dimension(400, 50));
		btnFindStudent.setPreferredSize(new Dimension(400, 50));
		btnShowAll.setPreferredSize(new Dimension(400, 50));
		Quit.setPreferredSize(new Dimension(400, 50));
		
		frm.add(btnAddStudent);
		frm.add(btnDeleteStudent);
		frm.add(btnFindStudent);
		frm.add(btnShowAll);
		frm.add(Quit);

		btnAddStudent.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AddStudentGUI.main(null);
				frm.setVisible(false);
			}
		});
		btnDeleteStudent.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DeleteStudentGUI.main(null);
				frm.setVisible(false);
			}
		});
		btnShowAll.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ShowAllGUI.main(null);
				frm.setVisible(false);
			}
		});
		btnFindStudent.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				FindStudentGUI.main(null);
				frm.setVisible(false);
			}
		});
		Quit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frm.setVisible(false);
			}
		});

		frm.setVisible(true);
	}

}
