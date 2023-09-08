package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {

        //Endereco endereco = new Endereco();
        //endereco.setRua("Endereço para essa rua");
        //System.out.println(endereco.getRua());

        Endereco endereco = new Endereco("rua funcionário",
                "complemento endereço funcionário", "bairro funcionário");
        System.out.println("-----");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Arthur Felipe");
        vendedor.setDocumento("208.464.520-49");
        vendedor.setValorSalario(3000d);
        vendedor.setEndereco(endereco);
        vendedor.calcularBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("------");

        OperadorDeCaixa operadorCaixa = new OperadorDeCaixa("Arthur OP Caixa", "208.464.520-49", 1000d, endereco);
        System.out.println(operadorCaixa);
        System.out.println("------");

        Gerente gerente = new Gerente();
        gerente.setNome("Arthur");
        gerente.setDocumento("208.464.520-49");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calcularBonificacao(3d);

        System.out.println(gerente);
    }
}
