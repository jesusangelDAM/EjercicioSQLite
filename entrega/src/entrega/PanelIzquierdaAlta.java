package entrega;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelIzquierdaAlta extends JPanel{
//izquierda del panelprincipalalta
	//4 panel texto usar lista de paneltexto
	//lista con el texto de los label
	private PanelTexto panelTexto;
	private String[] labelTexto;
	public PanelIzquierdaAlta() {
		//para lograr redimensionar el grid
		this.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		this.setLayout(new GridLayout(4,1));
		
		labelTexto=new String[] {"dni","nombre","direccion","email"};
		for(int i=0;i<labelTexto.length;i++) {
			panelTexto=new PanelTexto(labelTexto[i]);
			this.add(panelTexto);
		}
		
		
	}
	
}
