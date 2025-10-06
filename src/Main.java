public class Main {
    public static void main(String[] args) {

        Contexto contexto = new Contexto();
        contexto.setOperacao(new Multiplicacao());
        System.out.println("Resultado da operação é = "+contexto.calcular(2, 5));
    }
}
