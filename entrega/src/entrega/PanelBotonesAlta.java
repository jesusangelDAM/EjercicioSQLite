package entrega;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotonesAlta extends JPanel{
//sur de agregar alumnos
	private JButton agregar,cancelar;
	public PanelBotonesAlta() {
		agregar=new JButton("AGREGAR");
		cancelar=new JButton("CANCELAR");
	
		this.add(agregar);
		this.add(cancelar);
		
		
	}
}
