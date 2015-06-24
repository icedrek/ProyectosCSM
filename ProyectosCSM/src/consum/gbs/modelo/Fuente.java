package consum.gbs.modelo;

import java.util.ArrayList;

public class Fuente {
	private String idFuente, tipoFuente, bibliotecaFuente, archivoFuente, MiembroFuente, bibliotecaObjeto, descripcionFuente;
	private ArrayList<String> claveFuente, filtroFuente, idObjetos = new ArrayList<>();
	
	public Fuente(){}
	
	public Fuente(String idFuente, String tipoFuente, String bibliotecaFuente, String archivoFuente, String MiembroFuente, String bibliotecaObjeto, String descripcionFuente, ArrayList<String> claveFuente, ArrayList<String> filtroFuente, ArrayList<String> idObjetos)
	{
		this.idFuente          = idFuente;
		this.tipoFuente        = tipoFuente;
		this.bibliotecaFuente  = bibliotecaFuente;
		this.idObjetos         = idObjetos;	
		this.archivoFuente     = archivoFuente;
		this.MiembroFuente     = MiembroFuente;
		this.bibliotecaObjeto  = bibliotecaObjeto;
		this.descripcionFuente = descripcionFuente;
		this.claveFuente       = claveFuente;
		this.filtroFuente      = filtroFuente;
		this.idObjetos         = idObjetos;
	}

	public String getIdFuente() {
		return idFuente;
	}

	public void setIdFuente(String idFuente) {
		this.idFuente = idFuente;
	}

	public String getTipoFuente() {
		return tipoFuente;
	}

	public void setTipoFuente(String tipoFuente) {
		this.tipoFuente = tipoFuente;
	}

	public String getBibliotecaFuente() {
		return bibliotecaFuente;
	}

	public void setBibliotecaFuente(String bibliotecaFuente) {
		this.bibliotecaFuente = bibliotecaFuente;
	}

	public String getArchivoFuente() {
		return archivoFuente;
	}

	public void setArchivoFuente(String archivoFuente) {
		this.archivoFuente = archivoFuente;
	}

	public String getMiembroFuente() {
		return MiembroFuente;
	}

	public void setMiembroFuente(String miembroFuente) {
		MiembroFuente = miembroFuente;
	}

	public String getBibliotecaObjeto() {
		return bibliotecaObjeto;
	}

	public void setBibliotecaObjeto(String bibliotecaObjeto) {
		this.bibliotecaObjeto = bibliotecaObjeto;
	}

	public String getDescripcionFuente() {
		return descripcionFuente;
	}

	public void setDescripcionFuente(String descripcionFuente) {
		this.descripcionFuente = descripcionFuente;
	}

	public ArrayList<String> getClaveFuente() {
		return claveFuente;
	}

	public void setClaveFuente(ArrayList<String> claveFuente) {
		this.claveFuente = claveFuente;
	}

	public ArrayList<String> getFiltroFuente() {
		return filtroFuente;
	}

	public void setFiltroFuente(ArrayList<String> filtroFuente) {
		this.filtroFuente = filtroFuente;
	}

	public ArrayList<String> getIdObjetos() {
		return idObjetos;
	}

	public void setIdObjetos(ArrayList<String> idObjetos) {
		this.idObjetos = idObjetos;
	}	
}
