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
public class Ex_04_Produto {
    public static void main(String[] args) {
        int a = Ex_04_inverter.leInteiroPositivo();
        int b = Ex_04_inverter.leInteiroPositivo();
        
        System.out.println(produto(a, b));
    }
    private static int produto(int a, int b){
        if (b == 1)
            return a;
        
        return produto(a, b-1) + a;
    }
}
