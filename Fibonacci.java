/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste2;

import java.util.Scanner;

/**
 *
 * @author kaiky
 */
public class Fibonacci {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int num = sc.nextInt();
    sc.close();

    int a = 0;
    int b = 1;
    int c = a + b;

    boolean pertence = false;

    while (c <= num) {
        if (c == num) {
            pertence = true;
            break;
        }
        a = b;
        b = c;
        c = a + b;
    }

    System.out.println("A sequência de Fibonacci até o número " + num + " é: ");

    if (num >= 0) {
        System.out.print("0");
    }
    if (num >= 1) {
        System.out.print(", 1");
    }
    while (c <= num) {
        System.out.print(", " + c);
        a = b;
        b = c;
        c = a + b;
    }

    if (pertence) {
        System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
    } else {
        System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
    }
}
   
    
}
