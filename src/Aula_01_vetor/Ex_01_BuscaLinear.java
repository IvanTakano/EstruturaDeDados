/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_vetor;

import static Aula_01_vetor.Ex_04_inverter.exibeVetor;
import static Aula_01_vetor.Ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.Ex_04_inverter.leVetorAleatorio;
import java.util.Scanner;
/**
 *
 * @author ivanyuratakano
 */
public class Ex_01_BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("Digite um número que deseja buscar: ");
        int x = sc.nextInt();
        
        if(buscaLinear(v,x)){
            System.out.printf("\n%d esta no vetor", x);
        } else {
            System.out.printf("\n%d NAO esta no vetor",x);
        }
        
    }

    public static boolean buscaLinear(int[] v, int x) {
        for (int i=0; i<v.length; i++){
            if(v[i]==x){
                return true; //achou
            }
        }
        return false; //não achou
    }

}
