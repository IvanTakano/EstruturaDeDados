/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Exs_ADO_01;

import static Aula_01_vetor.Ex_04_inverter.exibeVetor;
import static Aula_01_vetor.Ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.Ex_04_inverter.leVetorAleatorio;
import static Aula_04_Exs_ADO_01.Ex_06_exibeInterseccao.bubbleSort;
import static Aula_04_Exs_ADO_01.Ex_06_exibeInterseccao.exibeInters2Vetores;

/**
 *
 * @author ivanyuratakano
 */
public class Ex_08_Intercalar_ADO_01 {
     public static void main(String[] args) {
       
        int n = leInteiroPositivo();
        int A[] = leVetorAleatorio(n);
        
        bubbleSort(A);
        exibeVetor(A);
        
        int m = leInteiroPositivo();
        int B[] = leVetorAleatorio(m);
        bubbleSort(B);
        exibeVetor(B);
         
        System.out.println("Os elementos da intersecção de A e B são: ");
        int C[] = intercalar2Vetores(A, B);
         exibeVetor(C);
    }

    private static int[] intercalar2Vetores(int[] A, int[] B) {
        
        int C[] = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(k < C.length){
            if (i == A.length){ // Cai do vetor A e as sobras estão em B
                C[k] = B[j];
                j++;
                k++;
                
            }else if ( j == B.length){ // Cai do vetor B e as sobras estão em A
                C[k] = A[j];
                i++;
                k++;
            }else if (A[i] < B[j]){
                C[k] = A[i];
                i++;
                j++;
                
            }else {
                C[k] = B[j];
                j++;
                k++;
            }
        }
        return C;
    }
}
