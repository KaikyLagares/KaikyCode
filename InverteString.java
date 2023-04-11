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
public class InverteString {

    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

   System.out.println("Digite uma string:");
   String str = input.nextLine();

   // Inicializa uma string vazia que irá receber os caracteres invertidos
   String strInvertida = "";

   // Itera sobre a string informada, começando do final e concatenando os caracteres na string invertida
   for (int i = str.length() - 1; i >= 0; i--) {
       strInvertida += str.charAt(i);
   }

   System.out.println("A string invertida é:\n" + strInvertida);
}}
