public class Principal {
    public static void main(String[] args) {
        Amigo Henzel = new Amigo("Gabriel Henzel", 37, 999+); // usa o construtor
        Amigo Pedro = new Amigo("Pedro Zborowskivazkazinsk", 19, 135);
        Amigo Felix = new Amigo("Gabriel Felix Hillshein", 19, 120);
        Amigo Thiago = new Amigo("Thiago Barbosa da Silva", 19, 115);
        Amigo LuizVitor = new Amigo("Luiz Vitor", 19, 130);

        System.out.println("Henzel! Rapidão, quanto pesa a Via Láctea em toneladas?")
        Henzel.calcular();
        System.out.println("Thiago! Se eu comer metade de um pão, quantos pães eu comi?");
        Thiago.filosofar();
        System.out.println("Felix, bó fazer uma fogueira?");
        Felix.fazer_fogueira();
        System.out.println("Luiz, vai atrás de lenha!");
        LuizVitor.reação();
    }
}