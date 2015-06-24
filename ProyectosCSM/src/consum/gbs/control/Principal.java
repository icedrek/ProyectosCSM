package consum.gbs.control;

import consum.gbs.modelo.Logica;
import consum.gbs.visual.VentanaPrincipal;

public class Principal {
	Logica l;
	Coordinador c;
	VentanaPrincipal vPrincipal;

	public static void main(String[] args)
	{
		Principal p=new Principal();
		p.iniciar();
		
	}
	
	private void iniciar()
	{
		/* Instancia de Clases */
		l = new Logica();
		c = new Coordinador();
		vPrincipal=new VentanaPrincipal();	
		vPrincipal.setVisible(true);
		
		/* Relación entre clases */
		l.setCoordinador(c);
		vPrincipal.setCoordinador(c);
				
		/* Relación con el Coordinador */
		c.setVentanaPrincipal(vPrincipal);
		c.setLogica(l);				
	}
}