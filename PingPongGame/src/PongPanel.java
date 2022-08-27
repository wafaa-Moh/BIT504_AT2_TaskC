import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import javax.swing.JPanel;


public class PongPanel extends JPanel implements ActionListener,KeyListener{
	 private final static Color BACKGROUND_COLOUR = Color.BLACK;
     private final static int TIMER_DELAY = 5;

	public PongPanel() {
		// TODO Auto-generated constructor stub
		setBackground(BACKGROUND_COLOUR); //setting background color
        Timer timer = new Timer(TIMER_DELAY,this);
        timer.start();
	}
	
	 private void paintDottedLine(Graphics g) {
         Graphics2D g2d = (Graphics2D) g.create();
             Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
             g2d.setStroke(dashed);
             g2d.setPaint(Color.WHITE);
             g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
             g2d.dispose();
      }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	 public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      paintDottedLine(g);
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
