package practicasPropuestas;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class MiIcon implements Icon {
	
	

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		try {
			Image img=ImageIO.read(new File("f1y0bb.png"));
			g.drawImage(img, x, y, c);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOR", "CULPA DE TU IMAGEN", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	

}
