package me.dio.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private double valorDaBonificacao;

    @Override
    public void calcularBonificacao(double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", ValorDaBonificacao=" +
                this.valorDaBonificacao +
                '}';
    }

}



