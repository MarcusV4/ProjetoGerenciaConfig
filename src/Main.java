public class Main {
    public static void main(String[] args) {

        Contexto contexto = new Contexto();
        contexto.setOperacao(new Soma());
        System.out.println("Resultado da conta é: " + contexto.calcular(2, 5));
    }
}
