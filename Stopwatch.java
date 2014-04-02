import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Stopwatch extends JPanel{

	private JLabel time, display;
	private JButton start, stop, reset;
	private long startTime = 0;
	private long endTime = 0;
	private boolean timerStarted = false; //prevent from spam clicking stop cause it will cause errors
	private boolean stopped = false; //prevent from startTime from keep getting reset
	private int alreadyStarted = 0; //prevent from spam clicking start cause it will cause errors

	public Stopwatch() {
		setLayout(new BorderLayout());
		
		display = new JLabel("Stopwatch Timer");
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setFont(new Font("Arial", Font.ITALIC, 12));
		
		time = new JLabel("Time: 0:0:0"); //format - hour:minute:second
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setFont(new Font("Arial", Font.BOLD, 24));
		
		start = new JButton("Start");
		stop = new JButton("Stop");
		reset = new JButton("Reset");
		
		start.addActionListener(new ButtonListener());
		stop.addActionListener(new ButtonListener());
		reset.addActionListener(new ButtonListener());
		
		add(display, BorderLayout.NORTH);
		add(time, BorderLayout.CENTER);
		add(start, BorderLayout.WEST);
		add(stop, BorderLayout.EAST);
		add(reset, BorderLayout.SOUTH);
		
		setPreferredSize(new Dimension(350, 100));
		setBackground(Color.WHITE);
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == start) {
				if(alreadyStarted == 0) { 
					if(stopped) {
						timerStarted = true;
						endTime = System.currentTimeMillis() - endTime;
						startTime += endTime;
						time.setFont(new Font("Arial", Font.ITALIC, 24));
						display.setText("Timer started");
						alreadyStarted = 1;
					} else {
						startTime = System.currentTimeMillis();
						timerStarted = true;
						time.setFont(new Font("Arial", Font.ITALIC, 24));
						display.setText("Timer started");
						alreadyStarted = 1;
					}
				} else {
					display.setText("The timer already started");
				}
			}
			if(e.getSource() == stop) {
				if(timerStarted) {
					alreadyStarted = 0;
					endTime = System.currentTimeMillis();
					display.setText("Timer stopped");
					timerStarted = false;
					stopped = true;
					
					long hour = (endTime-startTime)/(1000 * 60 * 60);
					long minute = (endTime-startTime)/(1000 * 60);
					long second = (endTime-startTime)/1000;
					
					long[] hms = {hour, minute, second};
					System.out.println("Time: "+hms[0]+":"+hms[1]+":"+hms[2]);
					for(long element : hms) {
						if(element >= 60) {
							for(int i = 0; i < hms.length; i++) {
								if(hms[i] == element){
									if(i == 0) {
										hms[0] = (long) Math.floor(hms[0]%60);
									}
									if(i == 1) {
										hms[1] = (long) Math.floor(hms[1]%60);
									}
									if(i == 2) {
										hms[2] = (long) Math.floor(hms[2]%60);
									}
								}
							}
							time.setText("Time: "+hms[0]+":"+hms[1]+":"+hms[2]);
							time.setFont(new Font("Arial", Font.ITALIC, 24));
						} else {
							time.setText("Time: "+hms[0]+":"+hms[1]+":"+hms[2]);
							time.setFont(new Font("Arial", Font.ITALIC, 24));
						}
					}
				} else {
					display.setText("Please start the timer");
					System.out.println("Time: "+ (endTime-startTime)/3600000+":"+(endTime-startTime)/60000+":"+(endTime-startTime)/1000);
				}
			}
			if(e.getSource() == reset) {
				startTime = 0;
				endTime = 0;
				alreadyStarted = 0;
				timerStarted = false;
				stopped = false;
				time.setText("Time: 0:0:0");
				time.setFont(new Font("Arial", Font.BOLD, 24));
				display.setText("Timer reseted");
			}
		}
	}
		
}

