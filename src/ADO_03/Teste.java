/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_03;

/**
 *
 * @author ivanyuratakano
 */
public class Teste {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        ListaEncadeada lista2 = new ListaEncadeada();
        System.out.println(lista);
        System.out.println(lista.vazia());
        lista.insereInicio(7);
        lista.insereInicio(5);
        lista.insereInicio(3);
        lista.insereInicio(1);
        System.out.println(lista);
        lista2.insereInicio(8);
        lista2.insereInicio(6);
        lista2.insereInicio(4);
        lista2.insereInicio(2);
        System.out.println(lista2);
    }
}
