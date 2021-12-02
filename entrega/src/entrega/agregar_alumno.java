package entrega;

import javax.swing.*;

import java.awt.BorderLayout;
import java.util.*;

public class agregar_alumno extends JFrame{
	private PanelPrincipalAlta panelPrincipal;
	private PanelBotonesAlta panelBotones;
 agregar_alumno() {
	 super("Agregar alumno");
	 this.setLayout(new BorderLayout());
	 this.setBounds(100,100,800,500);
	 panelPrincipal=new PanelPrincipalAlta();
	 panelBotones=new PanelBotonesAlta();
	
	 this.add(BorderLayout.CENTER,panelPrincipal);
	 this.add(BorderLayout.SOUTH,panelBotones);
	
	this.setVisible(true);
	
}


}
