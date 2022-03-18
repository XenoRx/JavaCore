package course1.lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends JFrame {
	
	public MyWindow() {
		setTitle("My Window");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(300,300,400,400);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Window is closing");
			}
		});
		/*JButton button1 = new JButton("Button-1");
		JButton button2 = new JButton("Button-2");
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
		setLayout(new FlowLayout());
		for (int i = 0; i <= 10; i++) {
			JButton button = new JButton("@"+i);
			add(button);
		}
		setLayout(new GridLayout(3,3));
		for (int i = 0; i <= 11; i++) {
			JButton button = new JButton("@"+i);
			add(button);
		}*/
		setLayout(null);
		JTextField textField = new JTextField();
		textField.setBounds(20,20,120,32);
		textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("Enter pressed");
			}
		});
		add(textField);
		JButton button = new JButton("Press Here");
		button.setBounds(20,60,120,32);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("Button pressed");
			}
		});
		add(button);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWindow();
	}
}
