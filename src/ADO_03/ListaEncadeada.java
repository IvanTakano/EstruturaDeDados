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
public class ListaEncadeada {

    private No ini;

    // Criar um lista vazia
    public ListaEncadeada() {
        this.ini = null;
    }

    // Verifica se a lista está vazia
    public boolean vazia() {
        return this.ini == null;
    }

    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;

        while (temp != null) {
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;
    }

    public void unirListas(ListaEncadeada lista, ListaEncadeada lista2) {
       
        if (lista != null && lista2 != null) {

            No temp = lista.ini;

            while (temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(lista2.ini);
            lista2.ini = null;
        }
    }

    public void intercalar(ListaEncadeada lista, ListaEncadeada lista2, ListaEncadeada lista3) {
       
        if (lista != null && lista2 != null) {

            No temp = lista.ini;
            No temp2 = lista2.ini;

            while (temp != null || temp2 != null) {
                lista3.insereInicio(temp.getElemento());
                lista3.insereInicio(temp2.getElemento());
                temp = temp.getProx();
                temp2 = temp2.getProx();
            }

            while (temp != null) {
                lista3.insereInicio(temp.getElemento());
                temp.getProx();
            }

            while (temp2 != null) {
                lista3.insereInicio(temp2.getElemento());
                temp2.getProx();
            }
        }
    }

    public void intersecção(ListaEncadeada lista, ListaEncadeada lista2, ListaEncadeada lista4) {
        
        if (lista != null && lista2 != null) {

            No temp = lista.ini;
            
            while (temp != null) {
                No temp2 = lista2.ini;
                while (temp2 != null) {
                    if (temp.getElemento() == temp2.getElemento()) {
                        lista4.insereInicio(temp.getElemento());                       
                    }
                        temp2 = temp2.getProx();                               
                }
                temp = temp.getProx();                
            }
        }
    }
}
