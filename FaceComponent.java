import javax.swing.JComponent; 
 
import java.awt.Graphics; 
 
import java.awt.Graphics2D; 
 
import java.awt.geom.Ellipse2D; 
 
import java.awt.geom.Line2D; 
 
import java.awt.Rectangle; 
 
public class FaceComponent extends JComponent { 
 
	public void paintComponent(Graphics g){ 
	 
		Graphics2D g2 = (Graphics2D) g; 
		 
		Ellipse2D.Double ell = new Ellipse2D.Double(50, 50, 150, 200); 
		 
		g2.draw(ell); 
		 
		Ellipse2D.Double eye1 = new Ellipse2D.Double(80, 100, 15, 15); 
		 
		g2.fill(eye1); 
		 
		Ellipse2D.Double eye2 = new Ellipse2D.Double(150, 100, 15, 15); 
		 
		g2.fill(eye2); 
		 
		Line2D.Double lip1 = new Line2D.Double(100, 200, 150, 200); 
		 
		g2.draw(lip1); 
		 
		Rectangle rec = new Rectangle(120, 130, 10, 40); 
		g2.draw(rec); 
	 
	} 
 
} 
 
