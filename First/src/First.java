import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class First {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("기본값");
		label.setText("잘가");
		
		JLabel label2 = new JLabel();
		label2.setText("가지마");
		
		panel.add(label);
		panel.add(label2);
		
		frame.add(panel);
		
		frame.pack();			//안에 있는 요소만큼 화면이 늘어남.
		frame.setVisible(true);				//창이 화면에 보임.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
