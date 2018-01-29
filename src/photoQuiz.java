
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class photoQuiz {
	public static void main(String[] args) throws Exception {
		int score = 0;
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image URL”)
		String puppy = "http://www.easypetmd.com/sites/default/files/Miniature%20Dachshund%20Smooth%20haired%20(1).jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(puppy);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What type of dog is this?");
		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong
		if (answer.equals("dachshund")) {
			JOptionPane.showMessageDialog(null, "Correct, Plus One");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, Minus One");
			score--;
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
		String puppy2 = "http://4.bp.blogspot.com/-BJEJMpfvKBI/Ti1Tda5OC4I/AAAAAAAAAUQ/AZqWe_hYRRA/s1600/Animals_Dogs_Two_little_dogs_005507_.jpg";
		Component image2;
		image2 = createImage(puppy2);
		// 11. add the second image to the quiz window
		quizWindow.add(image2);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What type of dog is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equals("corgi")) {
			JOptionPane.showMessageDialog(null, "Correct, Plus One");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, Minus One");
			score--;
			
		}
		quizWindow.remove(image2);
		String puppy3 = "http://s1.bwallpapers.com/thumbs2/2013/12/26/cute-yorkie-puppies_104546.jpg";
		Component image3;
		image3 = createImage(puppy3);
		quizWindow.add(image3);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.pack();
		String answer3 = JOptionPane.showInputDialog("What type of dog is this?");
		if (answer3.equals("yorkie")) {
			JOptionPane.showMessageDialog(null, "Correct, Plus One");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, Minus One");
			score--;
		}
		quizWindow.remove(image3);
		String puppy4 = "https://www.hdwallpapers.in/walls/golden_retriever_puppy-wide.jpg";
		Component image4;
		image4 = createImage(puppy4);
		quizWindow.add(image4);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.pack();
		String answer4 = JOptionPane.showInputDialog("What type of dog is this?");
		if (answer4.equals("golden retriever")) {
			JOptionPane.showMessageDialog(null, "Correct, Plus One");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, Minus One");
			score--;
		}
		quizWindow.remove(image4);
		String puppy5 = "http://www.border-collie-fun.com/Border_Collie.jpg";
		Component image5;
		image5 = createImage(puppy5);
		quizWindow.add(image5);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.pack();
		String answer5 = JOptionPane.showInputDialog("What type of dog is this?");
		if (answer5.equals("border collie")) {
			JOptionPane.showMessageDialog(null, "Correct, You score is" + score+ ".");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, Your score is " + score+ ".");
			score--;
		}
		quizWindow.remove(image5);
		quizWindow.pack();
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
