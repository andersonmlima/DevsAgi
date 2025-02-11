package com.agibank.vetores.e2;

public class Main {
    public static void main(String[] args) {
        // Declaração e inicialização do vetor "ativos" com os valores das ações durante 5 dias.
        double[] ativos = {100, 101, 104, 105, 111};
        // Inicialização da variável "aumentoPerc" para armazenar o crescimento percentual acumulado.
        double aumentoPerc = 0;
        // Laço "for" para percorrer o vetor "ativos" começando do segundo elemento (índice 1)
        for (int i = 1; i < ativos.length; i++) {
            // Cálculo do crescimento diário percentual
            // (valor atual - valor anterior) / valor anterior * 100
            double aumentoDia = ((ativos[i] - ativos[i - 1]) / ativos[i - 1] * 100);
            // Acumula o crescimento diário percentual no crescimento acumulado
            aumentoPerc = aumentoPerc + aumentoDia;
        }
        // Imprime o crescimento percentual acumulado dos ativos durante os 5 dias
        // %.2f%% formata o número com 2 casas decimais seguido do símbolo de percentual
        System.out.printf("O percentual de aumento dos ativos durante os 5 dias são: %.2f%%\n", aumentoPerc);
    }
}
