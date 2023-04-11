/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste2;

/**
 *
 * @author kaiky
 */
public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        double[] faturamentoDiario = {1300.0, 1200.0, 1800.0, 1500.0, 2000.0, 1700.0, 1400.0, 1900.0, 1600.0, 2100.0, 2200.0, 2300.0, 2000.0, 2100.0, 2200.0, 2300.0, 2400.0, 2500.0, 2600.0, 2700.0, 2000.0, 1900.0, 1800.0, 1700.0, 1600.0, 1500.0, 1400.0, 1300.0, 1200.0, 1100.0, 1000.0};
        
        // menor valor de faturamento
        double menor = faturamentoDiario[0];
        for (int i = 1; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] < menor) {
                menor = faturamentoDiario[i];
            }
        }
        System.out.println("Menor valor de faturamento diário: R$" + menor);
        
        // maior valor de faturamento
        double maior = faturamentoDiario[0];
        for (int i = 1; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > maior) {
                maior = faturamentoDiario[i];
            }
        }
        System.out.println("Maior valor de faturamento diário: R$" + maior);
        
        // média mensal de faturamento
        double media = 0.0;
        for (int i = 0; i < faturamentoDiario.length; i++) {
            media += faturamentoDiario[i];
        }
        media /= faturamentoDiario.length;
        
        // quantidade de dias com faturamento acima da média mensal
        int qtdDiasAcimaMedia = 0;
        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > media) {
                qtdDiasAcimaMedia++;
            }
        }
        System.out.println("Quantidade de dias com faturamento acima da média mensal: " + qtdDiasAcimaMedia);
    }
}