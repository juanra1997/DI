package practicasPropuestasLayouts;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaLayouts2 {

	public static void main(String[] args) {

		VentanaPL2 obj=new VentanaPL2();
		obj.setVisible(true);
	}

}

class VentanaPL2 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	PanelPL2 panel=new PanelPL2();
	//JTextField texto=new JTextField();
	
	public VentanaPL2() {
		
		//setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		
		
		add(panel);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Calculadora Juan Raul Mellado Garcia");
		//setVisible(true);
	}
}

class PanelPL2 extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bs, br, bd, bm, bp, bi;
	JTextField t;
	
	PanelPL2Bt botones=new PanelPL2Bt();
	PanelPL2T texto=new PanelPL2T();
	
	public PanelPL2() {
		
		t=texto.texto;
		
		b1=botones.b1;
		b1.addActionListener(this);
		
		bs=botones.bs;
		bs.addActionListener(this);
		
		bi=botones.bi;
		bi.addActionListener(this);
		
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		add(texto);
		
		add(botones);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		double op=0, x=0;
		String z="0";
		boolean sumar=false, restar=false, multiplicar=false, dividir=false, operado=false;
		
		if(e.getSource()==b1) {
			
			/*if(sumar) {*/
				/*System.out.println("texto: "+t.getText());
				//z=t.getText();
				op=op+x;
				x=Double.parseDouble(t.getText());
				System.out.println("x: "+x);
				System.out.println("op: "+op);*/
				/*op=op+Double.parseDouble(t.getText());
				sumar=false;
			}
			if(restar) {
				op=op+Double.parseDouble(t.getText());
				restar=false;
			}
			if(multiplicar) {
				op=op+Double.parseDouble(t.getText());
				multiplicar=false;
			}
			if(dividir) {
				op=op+Double.parseDouble(t.getText());
				dividir=false;
			}
			
			if(operado) {
				t.setText("0");
			}
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("1");
			}else {
				t.setText(t.getText()+1);
			}
			System.out.println(op);*/
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("1");
			}else {
				t.setText(t.getText()+1);
			}
		}
		
		if(e.getSource()==bs) {
			
			//op=Double.parseDouble(t.getText());
			/*if(sumar) {
				System.out.println("texto: "+t.getText());
				//z=t.getText();
				op=op+x;
				x=Double.parseDouble(t.getText());
				System.out.println("x: "+x);
				System.out.println("op: "+op);
				sumar=false;
			}
			if(restar) {
				op=op+Double.parseDouble(t.getText());
				restar=false;
			}
			if(multiplicar) {
				op=op+Double.parseDouble(t.getText());
				multiplicar=false;
			}
			if(dividir) {
				op=op+Double.parseDouble(t.getText());
				dividir=false;
			}*/
			/*x=Double.parseDouble(t.getText());
			sumar=true;
			t.setText("+");
			System.out.println("Al finalizar el evento: "+op);*/
			op=Double.parseDouble(t.getText());
			t.setText("+");
			sumar=true;
			
		}
		
		if(e.getSource()==bi) {
			
			/*if(sumar) {
				op=op+x;
				sumar=false;
			}
			if(restar) {
				op=op+Double.parseDouble(t.getText());
				sumar=false;
			}
			if(multiplicar) {
				op=op+Double.parseDouble(t.getText());
				sumar=false;
			}
			if(dividir) {
				op=op+Double.parseDouble(t.getText());
				sumar=false;
			}*/
			/*System.out.println(op);
			t.setText(String.valueOf(op));
			op=0;
			operado=true;*/
			if(sumar) {
				op=op+Double.parseDouble(t.getText());
				
			}
			t.setText(String.valueOf(op));
		}
	}
	
}

class PanelPL2Bt extends JPanel {

	private static final long serialVersionUID = 1L;
	
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bs, br, bd, bm, bp, bi;
	
	public PanelPL2Bt() {
		
		setLayout(new GridLayout(4, 4));
		
		b7=new JButton("7");
		add(b7);
		
		b8=new JButton("8");
		add(b8);
		
		b9=new JButton("9");
		add(b9);
		
		bd=new JButton("/");
		add(bd);
		
		//----------------------------------------------------------------------------------------
		
		b4=new JButton("4");
		add(b4);
		
		b5=new JButton("5");
		add(b5);
		
		b6=new JButton("6");
		add(b6);
		
		bm=new JButton("*");
		add(bm);
		
		//----------------------------------------------------------------------------------------
		
		b1=new JButton("1");
		add(b1);
		
		b2=new JButton("2");
		add(b2);
		
		b3=new JButton("3");
		add(b3);
		
		br=new JButton("-");
		add(br);
		
		//----------------------------------------------------------------------------------------
		
		b0=new JButton("0");
		add(b0);
		
		bp=new JButton(".");
		add(bp);
		
		bi=new JButton("=");
		add(bi);
		
		bs=new JButton("+");
		add(bs);
	}
	
}

class PanelPL2T extends JPanel{

	private static final long serialVersionUID = 1L;
	
	JTextField texto=new JTextField();
	/*GridBagLayout layout=new GridBagLayout();
	GridBagConstraints tamannos=new GridBagConstraints();*/
	
	public PanelPL2T() {
		
		setLayout(new GridLayout(1, 1));
		
		/*tamannos.gridheight=1;
		tamannos.gridwidth=3;*/
		
		texto.setEditable(false);
		texto.setText("0");
		texto.setHorizontalAlignment(JTextField.CENTER);
		add(texto);
		
		/*tamannos.gridheight=2;
		tamannos.gridwidth=3;*/
	}
	
}