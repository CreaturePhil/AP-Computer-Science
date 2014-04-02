import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PushCounterPanel extends JPanel{
	
	private JButton push;
	private JButton reset;
	private JButton color;
	private int count;
	private JLabel label;
	
	public PushCounterPanel() {
		count = 0;
		label = new JLabel("Clicks: " + count);
		push = new JButton("Click me");
		reset = new JButton("Reset");
		color = new JButton("Change Background Color");
		
		push.addActionListener(new ButtonListener());
		reset.addActionListener(new ButtonListener());
		color.addActionListener(new ButtonListener());
		
		add(push);
		add(label);
		add(reset);
		add(color);
		
		setPreferredSize(new Dimension(350, 100));
		setBackground(Color.WHITE);
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == push) {
				count++;
				label.setText("Clicks: " + count);
			}
			if(e.getSource() == reset) {
				count = 0;
				label.setText("Clicks: " + count);
			}
			if(e.getSource() == color) {
				Random rng = new Random();
				switch(rng.nextInt(12)) {
					case 0: setBackground(Color.WHITE);
							break;
					case 1: setBackground(Color.BLACK);
							break;
					case 2: setBackground(Color.RED);
							break;
					case 3: setBackground(Color.BLUE);
							break;
					case 4: setBackground(Color.GREEN);
							break;
					case 5: setBackground(Color.YELLOW);
							break;
					case 6: setBackground(Color.PINK);
							break;
					case 7: setBackground(Color.CYAN);
							break;
					case 8: setBackground(Color.DARK_GRAY);
							break;
					case 9: setBackground(Color.GRAY);
							break;
					case 10: setBackground(Color.MAGENTA);
							break;
					case 11: setBackground(Color.ORANGE);
							break;
					default: setBackground(Color.WHITE);
							break;
				}
			}
		}
	}
}

