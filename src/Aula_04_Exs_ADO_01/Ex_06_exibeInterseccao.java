/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Exs_ADO_01;

import static Aula_01_vetor.Ex_01_BuscaLinear.buscaLinear;
import static Aula_01_vetor.Ex_04_inverter.exibeVetor;
import static Aula_01_vetor.Ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.Ex_04_inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_05_Insercao.exibeVetorTam;
import static Aula_03_Desempenho.Ex_03_TrocaMaiorMenor.troca;
/**
 *
 * @author ivanyuratakano
 */
public class Ex_06_exibeInterseccao {
     public static void main(String[] args) {
       
         int n = leInteiroPositivo();
        int A[] = leVetorAleatorio(n);
        
        bubbleSort(A);
        exibeVetor(A);
        
        int B[] = leVetorAleatorio(n);
        bubbleSort(B);
        exibeVetor(B);
         
        System.out.println("Os elementos da intersecção de A e B são: ");
        exibeInters2Vetores(A, B);
    }
    
     //Intersecção de 2 vetores ordenados com desempenho 0(nˆ2)
    public static void exibeInters2Vetores(int[] A, int[]B){
        int i = 0;
        int j = 0;
        
        while (i < A.length && j < B.length){
           
            if (A[i] == A[j]) {
                System.out.print(A[i] + " ");
                i++;
                j++;
            } else 
                if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

      
    
    
    public static void bubbleSort (int[] A){
        for (int i = 0; i < A.length; i++) { //n-1 vezes
            for (int j = 0; j < A.length-1; j++) { // Comparar 2 a 2 e trocar, se necessário
                if(A[j] > A[j+1]){
                    troca(A, j,j+1);
                }
            }
        }
    }
}
