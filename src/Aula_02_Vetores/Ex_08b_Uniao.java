/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_vetor.Ex_01_BuscaLinear.buscaLinear;
import static Aula_01_vetor.Ex_04_inverter.exibeVetor;
import static Aula_01_vetor.Ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.Ex_04_inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_02_Maior.maiorVetor;
import static Aula_02_Vetores.Ex_05_Insercao.exibeVetorTam;

/**
 *
 * @author ivanyuratakano
 */
public class Ex_08b_Uniao {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);

        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n2);
        exibeVetor(v2);

        int uniao[] = new int[n1 + n2];

        int n3 = uniao2Vertores(v1, v2, uniao);
        
        exibeVetorTam(uniao, n3);

    }
    
    public static int uniao2Vertores(int[] v1, int[] v2, int[] uniao) {
        int k = 0;
        
        //Copia os elementos de v1 para o vetor uniao
        for (int i = 0; i < v1.length; i++) {   
            uniao[k] = v1[i];
            k++;
        }
        
        //Percorre o v2 e verifica se um elemento nao esta no v1
        for (int i = 0; i < v2.length; i++) {
            if (buscaLinear(v1, v2[i])) {
                uniao[k] = v2[i];
                k++;
            }
        }
        return k;
    }
}
