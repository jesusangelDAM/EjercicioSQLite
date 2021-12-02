package entrega;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTexto extends JPanel{
//tiene el label y el field contructor recoge el contenido del label
	private JLabel label;
	private JTextField caja;
	
	public PanelTexto(String cadena) {
		this.setLayout(new GridLayout(2,1));
		label=new JLabel(cadena);
		caja=new JTextField();
		label.setPreferredSize(new Dimension(50,30));
		caja.setPreferredSize(new Dimension(100,30));
		this.add(label);
		this.add(caja);
		
	}
}
