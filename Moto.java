public class Moto extends Veiculo{
	private int cilindradas;
	private String chassi;

	public Moto(String modelo, int ano, int cilindradas){
		this.cilindradas = cilindradas;
		super(modelo, ano);
		System.out.println("Fabricar moto");
	}	
}
