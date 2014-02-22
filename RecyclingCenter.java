import java.awt.BasicStroke; 
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.Polygon; 
import java.awt.Rectangle; 
import java.awt.Stroke; 
import java.awt.geom.Arc2D; 
 
import javax.swing.JComponent; 
 
public class RecyclingCenter{ 
 
	private int x, y; 
	public RecyclingCenter(int xValue, int yValue){ 
		x = xValue; 
		y = yValue; 
	} 
	 
	public void draw(Graphics2D g2){ 
	 
		Rectangle recycleCenter = new Rectangle(x, y, 160, 160); 
		g2.setColor(Color.GRAY); 
		g2.fill(recycleCenter); 
		 
		Rectangle door = new Rectangle(x+65, x+130, 30, 30); 
		g2.setColor(Color.BLACK); 
		g2.fill(door); 
		 
		g2.drawString("Recycling Center", x+25, y+125); 
		 
		g2.setStroke(new BasicStroke(10)); 
		 
		Arc2D.Double arc = new Arc2D.Double(x+30,y+30, 55, 55, 120, 140, Arc2D.OPEN); 
		g2.setColor(Color.GREEN); 
		g2.draw(arc); 
		 
		Arc2D.Double arc2 = new Arc2D.Double(x+60,y+10, 55, 55, 360, 120, Arc2D.OPEN); 
		g2.setColor(Color.GREEN); 
		g2.draw(arc2); 
		 
		Arc2D.Double arc3 = new Arc2D.Double(x+70,y+40, 55, 55, 0,-120, Arc2D.OPEN); 
		g2.setColor(Color.GREEN); 
		g2.draw(arc3); 
		 
		 
    Polygon arrow1 = new Polygon(); 
    arrow1.addPoint(x+60, y+18); 
    arrow1.addPoint(x+40, y+20); 
    arrow1.addPoint(x+50, y+45); 
    g2.fillPolygon(arrow1); 
         
    Polygon arrow2 = new Polygon(); 
    arrow2.addPoint(x+120, y+55); 
    arrow2.addPoint(x+125, y+35); 
    arrow2.addPoint(x+105, y+35); 
    g2.fillPolygon(arrow2); 
     
    Polygon arrow3 = new Polygon(); 
    arrow3.addPoint(x+65, y+85); 
    arrow3.addPoint(x+85, y+80); 
    arrow3.addPoint(x+80, y+100); 
    g2.fillPolygon(arrow3); 
	 
	} 
 
} 
 
