
public class Atleta extends Pessoa implements Corredor {
	
	private int nivel;

	@Override
	public void correr() {
		System.out.println("Correndo como atleta...");
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
