/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste2;

/**
 *
 * @author kaiky
 */
public class Distribuidora {

    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double faturamentoTotal = sp + rj + mg + es + outros;

        double percentualSP = (sp / faturamentoTotal) * 100;
        double percentualRJ = (rj / faturamentoTotal) * 100;
        double percentualMG = (mg / faturamentoTotal) * 100;
        double percentualES = (es / faturamentoTotal) * 100;
        double percentualOutros = (outros / faturamentoTotal) * 100;

        System.out.println("Percentual de representação por estado:");
        System.out.println("SP: " + percentualSP + "%");
        System.out.println("RJ: " + percentualRJ + "%");
        System.out.println("MG: " + percentualMG + "%");
        System.out.println("ES: " + percentualES + "%");
        System.out.println("Outros: " + percentualOutros + "%");
    }
}
