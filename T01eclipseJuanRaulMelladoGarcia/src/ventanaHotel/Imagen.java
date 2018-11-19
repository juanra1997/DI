package ventanaHotel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Imagen extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		File fichero = new File("hotel.jpg");
		try {
			Image miImagen = ImageIO.read(fichero);
			g.drawImage(miImagen, 0, 0, null);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "La imagen no se encuentra");
		}
	}
}
