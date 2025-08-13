import java.util.Random;

public class Loteria {
	public int[] bilhetes = new int[10];
    public Loteria() {
    for(int i = 0; i < 10; i++) {
        bilhetes[i] = i + 1;
    }
}
    public int[] vendido = new int[10];

    public void vende_bilhete(int num, Pessoa a){
        if(bilhetes[num-1] == vendido[num-1]){
            for(int i=0;i<10;i++){
                if(bilhetes[i+num] == vendido[i+num]){
                    return;
                }else{
                vende_bilhete(i+num,a);
                }
            }
        }else{
        a.compra_bilhete(bilhetes[num-1]);
    }
    }
    void sorteia(Pessoa[] pessoa){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10);
        int num_pessoa = -1;
		System.out.println(numeroAleatorio + 1);
        for(int i =0; i<5;i++){
			num_pessoa = pessoa[i].acha_bilhete(numeroAleatorio + 1);
            if (num_pessoa != -1) {
            break;
        }
		}
        if(num_pessoa == -1){
            System.out.println("Não houve vencedores");
        }else{
            System.out.println("O vencedor é:pessoa" + num_pessoa);
        }
    }

}
