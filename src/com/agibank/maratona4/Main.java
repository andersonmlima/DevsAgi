// Nota: 100 - 10 = 90
// Nome Dev: Anderson Moura
// Tester: Mateus Campos de Santis

package com.agibank.maratona4;

public class Main {
    public static void main(String[] args) {
        //validação de indice maior que a matriz
        try {
            System.out.println("O ativo PETR4 teve uma média de preço de: " + calcularMedia(0));
            System.out.println("O ativo que teve uma maior valorização foi: " + maiorValorizacaoAtivo());
            System.out.println("O lucro/perda de cada ativo foi: ");
            calculoLucroPerda();
            System.out.println("O preço do ativo VALE3 no dia 3 é: " + consultarPreco(1, 2));
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no programa: ");
        }
    }

    public static double[][] valores = {
            {22.5, 23.0, 22.0, 24.5, 25.0}, // Ativo = PETR4
            {85.0, 86.5, 84.0, 83.5, 87.0}, // Ativo = VALE3
            {30.0, 29.5, 30.5, 31.0, 32.5}  // Ativo = ITUB4
    };

    public static double calcularMedia(int ativoPrincipal) {
        double soma = 0;
        for (double preco : valores[ativoPrincipal]) {
            soma += preco;
        }
        return soma / valores[ativoPrincipal].length;
    }

    public static double maiorValorizacaoAtivo() {
        double valorizacaoAtivo = 0;
        double ativoMaiorValorizacao = 0;
        for (int i = 1; i < valores.length; i++) {
            double valorizacao = (valores[i][valores[i].length - 1] - valores[i][0]) / valores[i][0] * 100;
            if (valorizacao > valorizacaoAtivo) {
                valorizacaoAtivo = valorizacao;
                ativoMaiorValorizacao = i; //Faltou percorrer o j e fazer a comparação do resultado de cada linha(- 10)
            }
        }
       //System.out.println("Ativo " + ativoMaiorValorizacao + "valorizou de " + String.format("%.2f", ativoMaiorValorizacao) + "%");
        return ativoMaiorValorizacao;
    }

    public static void calculoLucroPerda() {
        for (int i = 0; i < valores.length; i++) {
            double novaValorizacao = (valores[i][valores[i].length - 1] - valores[i][0]) / valores[i][0] * 100;
            if (novaValorizacao >= 0) {
                System.out.println(i + ": Lucro (" + String.format("%.2f", novaValorizacao) + "%)");
            } else {
                System.out.println(i + ": Prejuízo (" + String.format("%.2f", novaValorizacao) + "%)");
            }
        }
    }

    // Consulta do preço com para validação de várias variáveis com OU para chegar a um resultado.
    public static double consultarPreco(int principalAtivo, int diaIndex){
        if (principalAtivo < 0 || principalAtivo >= valores.length || diaIndex < 0 || diaIndex >= valores[principalAtivo].length) {
        }
        return valores[principalAtivo][diaIndex];
    }
}


