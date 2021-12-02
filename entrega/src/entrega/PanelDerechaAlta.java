package entrega;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PanelDerechaAlta extends JPanel{
//derecha de panelprincipalalta
	//amobo con grid 4 1
	
	private PanelTexto panelTexto;
	private String[] labelTexto;
	public PanelDerechaAlta() {
		this.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		this.setLayout(new GridLayout(4,1));
		
		labelTexto=new String[] {"apellido","telefono","fecha"};
		for(int i=0;i<labelTexto.length;i++) {
			panelTexto=new PanelTexto(labelTexto[i]);
			this.add(panelTexto);
		}
		
		
	}
	
}
