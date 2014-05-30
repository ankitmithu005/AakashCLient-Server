  /*
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoImageTest {

  public static void main(String[] args) {
	  Dimension dim=new Dimension(300,300);
    ImagePanel2 panel = new ImagePanel2(new ImageIcon("Images/img.png").getImage(),dim);

    JFrame frame = new JFrame();
    JPanel jfrm=new JPanel(new BorderLayout());
    jfrm.add(panel,BorderLayout.CENTER);
    jfrm.setPreferredSize(new Dimension(300,300));
    frame.getContentPane().add(jfrm);
    frame.pack();
    frame.setVisible(true);
  }
}

class ImagePanel2 extends JPanel {

  private Image img;

  public ImagePanel2(String img,Dimension dim) {
    this(new ImageIcon(img).getImage(),dim);
  }

  public ImagePanel2(Image img,Dimension dim) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(dim);
    setMinimumSize(dim);
    setMaximumSize(dim);
    setSize(dim);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}

   */