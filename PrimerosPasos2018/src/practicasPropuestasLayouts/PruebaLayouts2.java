package practicasPropuestasLayouts;

import java.awt.Font;
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
	
	String op="0";
	
	double op1='0', op2='0';
	String opr=null;
	
	public PanelPL2() {
		
		t=texto.texto;
		t.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		b1=botones.b1;
		b1.addActionListener(this);
		
		b2=botones.b2;
		b2.addActionListener(this);
		
		b3=botones.b3;
		b3.addActionListener(this);
		
		b4=botones.b4;
		b4.addActionListener(this);
		
		b5=botones.b5;
		b5.addActionListener(this);
		
		b6=botones.b6;
		b6.addActionListener(this);
		
		b7=botones.b7;
		b7.addActionListener(this);
		
		b8=botones.b8;
		b8.addActionListener(this);
		
		b9=botones.b9;
		b9.addActionListener(this);
		
		b0=botones.b0;
		b0.addActionListener(this);
		
		br=botones.br;
		br.addActionListener(this);
		
		bd=botones.bd;
		bd.addActionListener(this);
		
		bm=botones.bm;
		bm.addActionListener(this);
		
		bp=botones.bp;
		bp.addActionListener(this);
		
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
		
		
		
		if(e.getSource()==b1) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("1");
				op=op+"1";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+1);
				op=op+"1";
				//System.out.println(op);
			}
		}
		
		//----------------------------------------------------------------
		
		if(e.getSource()==bp) {
			
			if(t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("0.");
				op=op+".";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+'.');
				op=op+".";
				//System.out.println(op);
			}
		}
		
		if(e.getSource()==b2) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("2");
				op=op+"2";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+2);
				op=op+"2";
				//System.out.println(op);
			}
		}
		
		if(e.getSource()==b3) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("3");
				op=op+"3";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+3);
				op=op+"3";
				//System.out.println(op);
			}
		}
		
		if(e.getSource()==b4) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("4");
				op=op+"4";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+4);
				op=op+"4";
				//System.out.println(op);
			}
		}
		
		if(e.getSource()==b5) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("5");
				op=op+"5";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+5);
				op=op+"5";
				//System.out.println(op);
			}
		}
		
		if(e.getSource()==b6) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("6");
				op=op+"6";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+6);
				op=op+"6";
				//System.out.println(op);
			}
		}
		
		if(e.getSource()==b7) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("7");
				op=op+"7";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+7);
				op=op+"7";
				//System.out.println(op);
			}
		}
		
		if(e.getSource()==b8) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("8");
				op=op+"8";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+8);
				op=op+"8";
				//System.out.println(op);
			}
		}
		
		if(e.getSource()==b9) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("9");
				op=op+"9";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+9);
				op=op+"9";
				//System.out.println(op);
			}
		}
		
		if(e.getSource()==b0) {
			
			if(t.getText().equals("0")||t.getText().equals("+")||t.getText().equals("-")||t.getText().equals("*")||t.getText().equals("/")) {
				t.setText("0");
				op=op+"0";
				//System.out.println(op);
			}else {
				t.setText(t.getText()+0);
				op=op+"0";
				//System.out.println(op);
			}
		}
		
		
		//----------------------------------------------------------------
		
		if(e.getSource()==bs) {
			if(op.charAt(op.length()-1)!='+'&&op.charAt(op.length()-1)!='-'&&op.charAt(op.length()-1)!='*'&&op.charAt(op.length()-1)!='/') {
				if(op.length()!=1) {
					op=op+"+";
					
					if(opr==null) {
						op1=Double.parseDouble(t.getText());
						opr="sumar";
					} else {
						op2=Double.parseDouble(t.getText());
					}
					t.setText("+");
					//System.out.println(op);
				}
			//System.out.println(op);
			}
		}
		
		if(e.getSource()==br) {
			if(op.charAt(op.length()-1)!='+'&&op.charAt(op.length()-1)!='-'&&op.charAt(op.length()-1)!='*'&&op.charAt(op.length()-1)!='/') {
				//if(op.length()!=1) {
					op=op+"-";
					
					if(opr==null) {
						op1=Double.parseDouble(t.getText());
						opr="restar";
					} else {
						op2=Double.parseDouble(t.getText());
					}
					t.setText("-");
					//System.out.println(op);
				//}
			//System.out.println(op);
			}
		}
		
		if(e.getSource()==bm) {
			if(op.charAt(op.length()-1)!='+'&&op.charAt(op.length()-1)!='-'&&op.charAt(op.length()-1)!='*'&&op.charAt(op.length()-1)!='/') {
				if(op.length()!=1) {
					op=op+"*";
					
					if(opr==null) {
						op1=Double.parseDouble(t.getText());
						opr="multiplicar";
					} else {
						op2=Double.parseDouble(t.getText());
					}
					t.setText("*");
					//System.out.println(op);
				}
			//System.out.println(op);
			}
		}
		
		if(e.getSource()==bd) {
			if(op.charAt(op.length()-1)!='+'&&op.charAt(op.length()-1)!='-'&&op.charAt(op.length()-1)!='*'&&op.charAt(op.length()-1)!='/') {
				if(op.length()!=1) {
					op=op+"/";
					
					if(opr==null) {
						op1=Double.parseDouble(t.getText());
						opr="dividir";
					} else {
						op2=Double.parseDouble(t.getText());
					}
					t.setText("/");
					//System.out.println(op);
				}
			//System.out.println(op);
			}
		}
		
		if(e.getSource()==bi) {

			op2=Double.parseDouble(t.getText());
			if(opr.equals("sumar")) {
				t.setText(String.valueOf((op1+op2)));
			} else if(opr.equals("restar")) {
				t.setText(String.valueOf((op1-op2)));
			} else if(opr.equals("multiplicar")) {
				t.setText(String.valueOf((op1*op2)));
			} else if(opr.equals("dividir")) {
				t.setText(String.valueOf((op1/op2)));
			}
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
	
	public PanelPL2T() {
		
		setLayout(new GridLayout(1, 1));
		
		texto.setEditable(false);
		texto.setText("0");
		texto.setHorizontalAlignment(JTextField.CENTER);
		add(texto);
		
	}
	
}

//He probado a hacerla con GridBagLayout pero no me aclaraba.
//Solo realiza operaciones de dos operandos, y el primer numero no puede ser negativo