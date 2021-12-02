package entrega;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelPrincipalAlta extends JPanel{
	private PanelIzquierdaAlta panelIzquierda;
	private PanelDerechaAlta panelDerecha;
	
	//center del agrgar alumnos
	public PanelPrincipalAlta() {
		this.setLayout(new GridLayout(1,2));
		panelIzquierda=new PanelIzquierdaAlta();
		panelDerecha=new PanelDerechaAlta();
		
		this.add(panelIzquierda);
		this.add(panelDerecha);
	
	}

}
