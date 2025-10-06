public class Main {
    public static void main(String[] args) {

        Contexto contexto = new Contexto();
        contexto.setOperacao(new Soma());
        System.out.println("Operação realizada com sucesso"+contexto.calcular(2, 5));
    }
}
