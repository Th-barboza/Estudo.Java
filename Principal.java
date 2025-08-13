public class Principal{
public static void main(String[] args) {
		
		Loteria l1 = new Loteria(); // números de 1 a 10
		
		int qtde_pessoas = 5;
		
		Pessoa[] c_pessoas = new Pessoa[ qtde_pessoas ];
		
		for( int i = 0; i < qtde_pessoas; i++ ) {
			Pessoa p1 = new Pessoa( i+1 );
			c_pessoas[i] = p1;
		}
		
		// pessoa1 compra bilhete 2
		l1.vende_bilhete(2,c_pessoas[0]);
		// pessoa2 compra bilhete 3 
		l1.vende_bilhete(3,c_pessoas[1]);
		// pessoa3 compra bilhete 7
		l1.vende_bilhete(7,c_pessoas[2]);
		// pessoa4 compra bilhete 2
		l1.vende_bilhete(2,c_pessoas[3]);
		// loteria1 sorteia e imprime resultado
		l1.sorteia(c_pessoas);
	}	
}