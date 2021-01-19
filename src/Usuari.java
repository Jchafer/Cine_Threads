import java.util.ArrayList;

public class Usuari extends Thread{
	private int nPelicula;
	private int nSessio;
	private int nEntrades;
	private ArrayList<Seient> llistaSeient;
	
	public Usuari() {
	}

	public Usuari(int nPelicula, int nSessio, int nEntrades, ArrayList<Seient> llistaSeient) {
		super();
		this.nPelicula = nPelicula;
		this.nSessio = nSessio;
		this.nEntrades = nEntrades;
		this.llistaSeient = llistaSeient;
	}

	@Override
	public void run() {
		try {
			Cine.compraEntradaPelicula(this.nSessio, this.nPelicula, this.nEntrades, this.llistaSeient);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getnPelicula() {
		return nPelicula;
	}

	public void setnPelicula(int nPelicula) {
		this.nPelicula = nPelicula;
	}

	public int getnSessio() {
		return nSessio;
	}

	public void setnSessio(int nSessio) {
		this.nSessio = nSessio;
	}

	public int getnEntrades() {
		return nEntrades;
	}

	public void setnEntrades(int nEntrades) {
		this.nEntrades = nEntrades;
	}

	public ArrayList<Seient> getLlistaSeient() {
		return llistaSeient;
	}

	public void setLlistaSeient(ArrayList<Seient> llistaSeient) {
		this.llistaSeient = llistaSeient;
	}

	@Override
	public String toString() {
		return "Usuari [nPelicula=" + nPelicula + ", nSessio=" + nSessio + ", nEntrades=" + nEntrades
				+ ", llistaSeient=" + llistaSeient + "]";
	}
	
	
}
