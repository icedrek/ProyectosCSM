package consum.gbs.control;

import consum.gbs.modelo.Logica;
import consum.gbs.modelo.Proyecto;
import consum.gbs.visual.VentanaPrincipal;

public class Coordinador 
{
	private Logica l;
	private VentanaPrincipal vPrincipal;
	
	public Logica getLogica() {
		return l;
	}
	public void setLogica(Logica l) {
		this.l = l;
	}
	
	public VentanaPrincipal getVentanaPrincipal() {
		return vPrincipal;
	}
	public void setVentanaPrincipal(VentanaPrincipal vPrincipal) {
		this.vPrincipal = vPrincipal;
	}
	
		
	public void insertarUsuario(Proyecto p) 
	{
		l.validarIU(p);
	}
	
	public Proyecto buscarUsuario(String nombre) 
	{
		return l.validarCU(nombre);
	}
	
	public void modificarUsuario(Proyecto p) 
	{
		l.validarMU(p);
	}
	
	public void eliminarPersona(Proyecto p) 
	{
		l.validarEU(p);
	}
}
