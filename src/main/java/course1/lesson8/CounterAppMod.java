package course1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterAppMod extends JFrame {
	private int value;
	private JLabel infoLabel;
	
	public CounterAppMod() {
		//ОКНО x,y(положение на экране) w,h(Ширина и высота окна)
		setBounds(500, 300, 400, 200);
		setTitle("Counter App");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//шрифт
		Font font = new Font("Arial", Font.BOLD, 32);
		//Добавляем панель
		JPanel panel1 = new JPanel();
		//текстовое поле счётчик(не редактируемое)
		JLabel label = new JLabel(String.valueOf(value));
		label.setFont(font);
		label.setHorizontalAlignment(SwingConstants.CENTER);
//		add(label, BorderLayout.CENTER);
		panel1.add(label, BorderLayout.CENTER);
		
		//Добавление инфо панели
		//Будем показывать ошибку, если значение счетчика по модулю больше 10
		infoLabel = new JLabel();
		add(infoLabel, BorderLayout.NORTH);
		
		//Кнопки увеличения и уменьшения
		JButton decrementButton = new JButton("<");
		decrementButton.setFont(font);
		JButton multiMinus = new JButton("<<");
		multiMinus.setFont(font);
		JButton incrementButton = new JButton(">");
		incrementButton.setFont(font);
		JButton multiPlus = new JButton(">>");
		multiPlus.setFont(font);
		
		//Левая часть панели
		panel1.add(multiMinus, BorderLayout.WEST);
		panel1.add(decrementButton, BorderLayout.WEST);
		//центральная часть панели
		panel1.add(label, BorderLayout.CENTER);
		//Правая часть панели
		panel1.add(incrementButton, BorderLayout.EAST);
		panel1.add(multiPlus, BorderLayout.EAST);
		//логика кнопок
		decrementButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value--;
				label.setText(String.valueOf(value));
				validateRange();
			}
		});
		incrementButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value++;
				label.setText(String.valueOf(value));
				validateRange();
			}
		});
		multiMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value -= 10;
				label.setText(String.valueOf(value));
				validateRange();
			}
		});
		multiPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value += 10;
				label.setText(String.valueOf(value));
				validateRange();
			}
		});
		//вывод содержимого панели на экран
		getContentPane().add(panel1);
		setVisible(true);
	}
	
	private void validateRange() {
		if (Math.abs(value) > 10) {
			infoLabel.setText("Value out of range");
		} else {
			infoLabel.setText("");
		}
	}
	
	public static void main(String[] args) {
		new CounterAppMod();
	}
}
