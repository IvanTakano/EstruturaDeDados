/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Exs_ADO_01;

import static Aula_01_vetor.Ex_04_inverter.exibeVetor;
import static Aula_01_vetor.Ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.Ex_04_inverter.leVetorAleatorio;
import static Aula_03_Desempenho.Ex_03_TrocaMaiorMenor.troca;
import static Aula_04_Exs_ADO_01.Ex_06_exibeInterseccao.bubbleSort;

/**
 *
 * @author ivanyuratakano
 */
public class Ex_09_Rearranjar_ADO_01 {
    public static void main(String[] args) {
       
        int n = leInteiroPositivo();
        //int A [] = leVetorAleatorio(n);
        int A[] = {5,6,2,7,9,1};
        //int A[] = {5,6,2,7,9,1, 8,3,7};
        exibeVetor(A);
        
        
         
        System.out.println("O vetor C com os elementos particionados: ");
        rearranjar(A);
        exibeVetor(A);
    }
    
    // A função rearranjar tem desmpenho O(n)
    private static void rearranjar(int[] A) {
       int pivo = A[0];
       int i = 1;
       int j = A.length - 1;
       
       while (i <= j){
           if (A[i] <= pivo){
               i++;
           }else if (A[j] > pivo){
               j--;
           } else {
               troca(A,i,j);
               i++;
               j--;
           }
       }
       troca(A, 0, j);
    }

    
    
}
