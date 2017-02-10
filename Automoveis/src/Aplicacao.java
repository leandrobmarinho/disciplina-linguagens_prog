
public class Aplicacao {
	public static void main(String[] args) {
		Carro prototipo = new Carro();
		prototipo.setMarca("Golf");
				
		Carro civic = new Carro("oia-1302","New Civic");		
		
		System.out.println(prototipo.getMarca());
		System.out.println(civic.getMarca());
		
		System.out.println(Carro.contador);
				
	}
}