/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_vetor.Ex_04_inverter.exibeVetor;
import static Aula_01_vetor.Ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.Ex_04_inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_02_Maior.maiorVetor;
import java.util.Scanner;
/**
 *
 * @author ivanyuratakano
 */
public class Ex_06_Remocao {

    public static void main(String[] args) {
        int v[] = new int[30];
        int n = leInteiroPositivo(); // n <= 30
        leVetorAleatorioTam(v, n);
        exibeVetor(v);
        exibeVetorTam(v, n);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que deseja remover: ");
        int x = sc.nextInt();

        int pos = buscaLinearTam(v, n, x);
        
        if (pos != -1) { // Achou x no vetor
            int novoN = remocao(v, n, pos); 
            exibeVetorTam(v, novoN);
        }
        else {
            System.out.printf("\n%d Não está no vetor", x);
        }

    }

    public static void leVetorAleatorioTam(int v[], int n) {
        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * 50);
        }
    }

    public static void exibeVetorTam(int v[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static int remocao(int[] v, int n, int pos) {
        for (int i = pos; i > n; i--) {
            v[i] = v[i + 1];
        }

        return n - 1;
    }

    public static int buscaLinearTam(int[] v, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (v[i] == x) {
                return i; // achou
            }
        }
        return - 1; // não achou
    }
}
