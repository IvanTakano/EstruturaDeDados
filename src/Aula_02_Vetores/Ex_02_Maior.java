/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_vetor.Ex_04_inverter.exibeVetor;
import static Aula_01_vetor.Ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.Ex_04_inverter.leVetorAleatorio;
/**
 *
 * @author ivanyuratakano
 */
public class Ex_02_Maior {

    public static void main(String[] args) {
        
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        int posMaior = maiorVetor(v);
        System.out.printf("\nO maior elemento está na posição = %d", posMaior);
        System.out.printf("\nO maior elemento = %d", v[posMaior]);
    }

    public static int maiorVetor(int[] v) {
        int posMaior = 0;
        
        for (int i = 1; i < v.length; i++) {
            if (v[i] > v[posMaior]) {  //Comparando elementos do vetor
                posMaior = i;  //atualizando indice
            }           
        }
        return posMaior;
    }
}
