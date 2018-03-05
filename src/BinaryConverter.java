import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	public static void main(String[] args) {
		new BinaryConverter().createUI();
	}

	Dimension buttonSize = new Dimension(100, 50);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField answer = new JTextField(20);
	JTextField conversion = new JTextField(20);
	JButton button = new JButton();
	String input;
	public void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setPreferredSize(buttonSize);
		button.setText("convert");
		button.addActionListener(this);
		panel.add(answer);
		panel.add(button);
		panel.add(conversion);
		frame.setTitle("Converting 8 bits of binary to ASCII");
		frame.pack();
		
	}

	public String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		input = answer.getText();
		if (arg0.getSource() == button) {
		conversion.setText(convert(input));
		}
	}

}
