package consum.gbs.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Proyecto {
	private String idProyecto, bibliotecaProyecto, archivoProyecto, descripcionProyecto, estadoProyecto, Notas;
	private Date fecIni, fecFin; 
	private ArrayList<String> idObjetos = new ArrayList<>();
	
	public Proyecto(){}
	
	public Proyecto(String idProyecto, String bibliotecaProyecto, String archivoProyecto, String descripcionProyecto, String estadoProyecto, ArrayList<String> idObjetos, String Notas, Date fecIni, Date fecFin)
	{
		this.idProyecto          = idProyecto;
		this.bibliotecaProyecto  = bibliotecaProyecto;
		this.archivoProyecto     = archivoProyecto;
		this.descripcionProyecto = descripcionProyecto;
		this.estadoProyecto      = estadoProyecto;
		this.idObjetos           = idObjetos;	
		this.Notas               = Notas;
		this.fecIni              = fecIni;
		this.fecFin              = fecFin;		
	}

	public String getIdProyecto() 
	{

		return idProyecto;
	}

	public void setIdProyecto(String idProyecto) 
	{
		this.idProyecto = idProyecto;
	}	

	public String getBibliotecaProyecto() {
		return bibliotecaProyecto;
	}

	public void setBibliotecaProyecto(String bibliotecaProyecto) {
		this.bibliotecaProyecto = bibliotecaProyecto;
	}

	public String getArchivoProyecto() {
		return archivoProyecto;
	}

	public void setArchivoProyecto(String archivoProyecto) {
		this.archivoProyecto = archivoProyecto;
	}

	public String getDescripcionProyecto() 
	{
		return descripcionProyecto;
	}

	public void setDescripcionProyecto(String descripcionProyecto) 
	{
		this.descripcionProyecto = descripcionProyecto;
	}

	public String getEstadoProyecto() 
	{
		return estadoProyecto;
	}

	public void setEstadoProyecto(String estadoProyecto) 
	{
		this.estadoProyecto = estadoProyecto;
	}

	public String getNotas() 
	{
		return Notas;
	}

	public void setNotas(String notas) 
	{
		Notas = notas;
	}

	public Date getFecIni() 
	{
		return fecIni;
	}

	public void setFecIni(Date fecIni) 
	{
		this.fecIni = fecIni;
	}

	public Date getFecFin() 
	{
		return fecFin;
	}

	public void setFecFin(Date fecFin) 
	{
		this.fecFin = fecFin;
	}

	public ArrayList<String> getIdObjetos() {
		return idObjetos;
	}

	public void setIdObjetos(ArrayList<String> idObjetos) {
		this.idObjetos = idObjetos;
	}	
}
