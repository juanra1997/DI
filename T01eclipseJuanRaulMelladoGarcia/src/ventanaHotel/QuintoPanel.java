package ventanaHotel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class QuintoPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	JLabel comodidad, grado, agradecimiento, agradecimiento2;
	JSlider deslizador;
	JRadioButton c1, c2;
	ButtonGroup grupo;

	public QuintoPanel() {
		
		setLayout(null);
		
		setBackground(Color.GREEN);
		
		comodidad=new JLabel("¿Le ha resultado comoda esta interfaz?");
		comodidad.setFont(new Font("Algerian", Font.PLAIN, 20));
		comodidad.setBounds(10, 50, 450, 20);
		add(comodidad);
		
		grado=new JLabel("¿Cómo de comoda le ha resultado?");
		grado.setFont(new Font("Algerian", Font.PLAIN, 20));
		grado.setBounds(500, 50, 400, 20);
		add(grado);
		
		agradecimiento=new JLabel("Le agradecemos que haya confiado en nosotros");
		agradecimiento.setFont(new Font("Algerian", Font.PLAIN, 20));
		agradecimiento.setBounds(950, 50, 550, 50);
		add(agradecimiento);
		
		agradecimiento2=new JLabel("Disfrute de su estancia");
		agradecimiento2.setFont(new Font("Algerian", Font.PLAIN, 20));
		agradecimiento2.setBounds(1060, 150, 550, 20);
		add(agradecimiento2);

		c1=new JRadioButton("SI");
		c1.setFont(new Font("Algerian", Font.PLAIN, 20));
		c1.setBounds(200, 130, 100, 30);
		c1.setBackground(Color.GREEN);
		add(c1);
		c2=new JRadioButton("NO");
		c2.setFont(new Font("Algerian", Font.PLAIN, 20));
		c2.setBackground(Color.GREEN);
		c2.setBounds(200, 160, 100, 30);
		add(c2);
		
		grupo=new ButtonGroup();
		grupo.add(c1);
		grupo.add(c2);
		
		deslizador=new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		deslizador.setBounds(540, 140, 300, 50);
		deslizador.setBackground(Color.GREEN);
		deslizador.setPaintTicks(true);
		deslizador.setMajorTickSpacing(50);
		deslizador.setMinorTickSpacing(5);
		deslizador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		deslizador.setPaintLabels(true);
		deslizador.setPaintTrack(true);
		add(deslizador);
	}
}
