/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_Insercao_Busca;

/**
 *
 * @author ivanyuratakano
 */
public class testaListaEncadeada1 {
    public static void main(String[] args) {
        ListaEncadeada1 lista = new ListaEncadeada1();
        System.out.println(lista);
        System.out.println(lista.vazia());
        
        lista.insereInicio(7);
        lista.insereInicio(5);
        lista.insereInicio(3);
        lista.insereInicio(1);
        System.out.println(lista);
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
        System.out.println("");
        
        
    }
}
