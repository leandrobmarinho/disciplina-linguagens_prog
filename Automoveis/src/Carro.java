public class Carro{
	private String marca;
	private String cor;
	private String placa;
	private int marcha;
	private double velocidade;
	
	public static int contador = 0; // Variável de classe
	
	public void acelerar(){
		velocidade = velocidade + marcha * 10;
	}
	public void frear(){
		velocidade = velocidade - marcha * 10;
	}

	public Carro(String placa, String marca){
		this.placa = placa;
		this.marca = marca;
		contador++;
	}
	
	public Carro(){
		contador++;
	};
	
	/* gets e sets */
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
}
