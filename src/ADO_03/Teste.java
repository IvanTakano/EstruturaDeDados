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
        ListaEncadeada lista3 = new ListaEncadeada();
        ListaEncadeada lista4 = new ListaEncadeada();
        System.out.println(lista);
        System.out.println(lista.vazia());
        lista.insereInicio(7);
        lista.insereInicio(5);
        lista.insereInicio(3);
        lista.insereInicio(1);
        System.out.println(lista);
        lista2.insereInicio(8);
        lista2.insereInicio(5);
        lista2.insereInicio(3);
        lista2.insereInicio(2);
        System.out.println(lista2);            
        lista3.intercalar(lista, lista2, lista3);
        System.out.println("Intercalação: " + lista3);
        lista4.intersecção(lista, lista2, lista4);
        System.out.println("Intersecção: " + lista4);
        lista.unirListas(lista, lista2);
        System.out.println("União: " + lista);  
    }
}
