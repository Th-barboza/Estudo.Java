import java.util.*;

public class Fabrica extends Veiculo{
    private double saldo;
    private List<Carro> num_carros;
    private List<Moto> num_moto;

    Fabrica(double saldo){
        this.saldo = saldo;
    }

    void debitar(double custo){
        if(saldo < custo){
            System.out.println("Tá devendo hein");
        }
        saldo = saldo - custo;
    }
    void inclui_lista_carro(Carro novo){
        num_carros.add(novo);

    }
    void inclui_lista_moto(Moto novo){
        num_moto.add(novo);

    }
}