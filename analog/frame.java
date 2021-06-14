package analog;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

public class frame {
	
	
	public static void main (String[] args) {
		
		Color oren = new Color(225 , 100, 50);
		JFrame frame = new JFrame("layer");
		Container tempat = frame.getContentPane();
		tempat.setBackground(oren);
	}

}
