/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursao;

import Aula_01_vetor.Ex_04_inverter;

/**
 *
 * @author ivanyuratakano
 */
public class Ex_05_Potencia {
    public static void main(String[] args) {
        int a = Ex_04_inverter.leInteiroPositivo();
        int n = Ex_04_inverter.leInteiroPositivo();
        
        System.out.println(potencia(a, n));
    }
    private static int potencia(int a, int n){
        
        if (n == 0)
            return 1;
        
        if (n == 1)
            return a;
        
        return a * potencia(a, n-1);
    }
}
