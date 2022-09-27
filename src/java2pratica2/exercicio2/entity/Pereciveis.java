package java2pratica2.exercicio2.entity;

public class Pereciveis extends Produto{

    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if (getDiasParaVencer() == 1){
            return super.calcular(quantidadeDeProdutos) / 4;
        } else if (getDiasParaVencer() == 2){
            return super.calcular(quantidadeDeProdutos) / 3;
        } else if (getDiasParaVencer() == 3){
            return super.calcular(quantidadeDeProdutos) / 2;
        } else {
            return super.calcular(quantidadeDeProdutos);
        }
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }
}
