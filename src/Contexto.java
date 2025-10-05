public class Contexto {
    private Operacao operacao;

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public double calcular(double a, double b) {
        return operacao.calcular(a, b);
    }
}
