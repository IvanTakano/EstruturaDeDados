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

/**
 *
 * @author ivanyuratakano
 */
public class Ex_08a_Interseccao {

    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);

        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n2);
        exibeVetor(v2);

        int inter[] = new int[n1];

        int n3 = inters2Vertores(v1, v2, inter);

    }

    public static int inters2Vertores(int[] v1, int[] v2, int[] inter) {
        int k = 0;
        
        // percorre o v1 e verifica se tem no v2
        for (int i = 0; i < v1.length; i++) {
            if (buscaLinear(v2, v1[i])) {
                inter[k] = v1[i];
                k++;
            }
        }
        return k;
    }
}