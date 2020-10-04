/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Remocao;

import Aula_08_Remocao.ListaEncadeada;

/**
 *
 * @author ivanyuratakano
 */
public class testaListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        System.out.println(lista);
        System.out.println(lista.vazia());
        
        lista.insereInicio(7);
        lista.insereInicio(5);
        lista.insereInicio(3);
        lista.insereInicio(1);
        System.out.println(lista);
        lista.insereOrdenado(0);
        lista.insereOrdenado(8);
        lista.insereOrdenado(15);
        /*
        lista.insereFinal(9);
        lista.insereFinal(12);
        System.out.println(lista);
        lista.insereOrdenado(0);
        System.out.println(lista);
        lista.insereOrdenadoR(8);
        System.out.println(lista);
        lista.insereOrdenadoR(15);
        System.out.println(lista);
        System.out.println(lista.buscaLinearIT(9));
        System.out.println(lista.buscaLinearIT(666));
        
        System.out.println(lista);
        lista.removeInicio();
        System.out.println(lista);
        lista.removeInicio();
        System.out.println(lista);
        lista.removeFinal2();
        System.out.println(lista);
        lista.removeFinalR2();
        System.out.println(lista);
        */
        lista.removeOrdenado(0);
        System.out.println(lista);
        lista.removeOrdenado(8);
        System.out.println(lista);
        lista.removeOrdenado(15);
        System.out.println(lista);
    }
}
