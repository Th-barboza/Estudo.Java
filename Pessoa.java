public class Pessoa {
	
	private int id;
	private int bilhete;
	private int saldo;
	public void compra_bilhete(int bill){
		if(saldo >= 10){
		bilhete = bill;
		saldo = saldo - 10;
		vendido[num-1] = bilhetes[num-1];
		}else{
			System.out.println("Saldo insuficiente");
		}
	}
	public int acha_bilhete(int bile){
		
		if(bile == this.bilhete){
			return this.id;
		}else{
			return -1;
		}
	}
	public Pessoa( int i ) {
		this.id = i;
	}
}