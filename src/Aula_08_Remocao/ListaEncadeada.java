/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Remocao;

import Aula_07_Insercao_Busca.*;
import Aula_06_Lista_Encadeada.*;

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

    public void insereFinal(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;

        //lista vazia
        if (temp == null) {
            ini = novo;
        } else {
            while (temp.getProx() != null) {
                temp = temp.getProx();
            }

            temp.setProx(novo);
        }
    }

    public void insereFinalR(int elemeno) {
        insereFinalR(ini, elemeno);

    }

    public void insereFinalR(No temp, int elemento) {
        //lista vazia
        if (temp == null) {
            No novo = new No(elemento, null);
            ini = novo;
        } else //já estar no último nó
         if (temp.getProx() == null) {
                No novo = new No(elemento, null);
                temp.setProx(novo);
            } else {
                insereFinalR(temp, elemento);
            }
    }

    public void insereOrdenado(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;
        No anterior = null;

        while (temp != null && temp.getElemento() < novo.getElemento()) {
            anterior = temp;
            temp = temp.getProx();
        }

        // Lista vazia
        if (anterior == null) {
            ini = novo;
        } else {
            //inserir entre 2 nós
            novo.setProx(temp);
            anterior.setProx(novo);
        }
    }

    public void insereOrdenadoR(int elemento) {
        insereOrdenadoR(null, ini, elemento);
    }

    public void insereOrdenadoR(No anterior, No temp, int elemento) {
        //lista vazia
        if (temp == null) {
            insereInicio(elemento);
        } else {
            No novo = new No(elemento, ini);
            // Inserção no final
            if (temp == null && anterior.getProx() == null) {
                anterior.setProx(novo);
                novo.setProx(null);
            } else //Insere entre dois nós
            if (anterior != null && temp.getElemento() > novo.getElemento()) {
                novo.setProx(temp);
                anterior.setProx(novo);
            } else //Insere no início, com temp no primeiro nó
            if (anterior == null && temp.getElemento() > novo.getElemento()) {
                novo.setProx(ini);
                ini = novo;
            } else {
                insereOrdenadoR(temp, temp.getProx(), elemento);
            }

        }
    }

    public No buscaLinearIT(int x) {
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {
                return temp; // achou
            }
            temp = temp.getProx();
        }
        return null;//não achou
    }

    public void removeInicio() {
        if (vazia()) {
            System.out.println("Lista Vazia!");
            return;
        }
        // A lista possui ao menos um Nó, remover esse primeiro Nó
        ini = ini.getProx();
    }

    public void removeFinal() {
        if (vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        No temp = ini;
        No anterior = null;

        while (temp.getProx() != null) {
            anterior = temp;
            anterior = temp.getProx();
        }
        //Apenas um Nó
        if (anterior == null) {
            ini = null; //Lista vazia
            return;
        }
        //Lista com dois ou mais Nós
        anterior.setProx(null);
    }

    public void removeFinalR() {
        removeFinalR(null, ini);
    }

    public void removeFinalR(No anterior, No temp) {
        if (vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        //Apenas um Nó
        if (anterior == null) {
            ini = null; //Lista vazia
            return;
        }
        //Lista com dois ou mais Nós
        if (temp.getProx() == null) {
            anterior.setProx(null);
            return;
        }
        removeFinalR(temp, temp.getProx());
    }

    public void removeFinal2() {
        if (vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        No temp = ini;
        No anterior = null;

        //Parar no penultimo Nó
        while (temp.getProx().getProx() != null) {
            temp = temp.getProx();
        }
        //Apenas um Nó
        if (temp.getProx() == null) {
            ini = null; //Lista vazia
            return;
        }
        //Lista com dois ou mais Nós
        temp.setProx(null);
    }

    public void removeFinalR2() {
        removeFinalR2(ini);
    }

    public void removeFinalR2(No temp) {
        if (vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        //Apenas um Nó
        if (temp.getProx() == null) {
            ini = null; //Lista vazia
            return;
        }
        //Lista com dois ou mais Nós
        if (temp.getProx().getProx() == null) {
            temp.setProx(null);
            return;
        }
        removeFinalR2(temp.getProx());
    }

    public void removeOrdenado(int elemento) {
        if (vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        No temp = ini;
        No anterior = null;

        while (temp != null && temp.getElemento() != elemento) {
            anterior = temp;
            temp = temp.getProx();
        }

        //Remover o primeiro
        if (anterior == null) {
            ini = ini.getProx();
            return;
        }

        //Remover um Nó entre dois Nós e também remoção no final
        if (temp != null && temp.getElemento() == elemento) {
            anterior.setProx(temp.getProx());
            return;
        }
        System.out.println(elemento + "Não está na lista");
    }

    public int contaNos() {
        int cont = 0;
        No temp = ini;
        while (temp != null) {
            temp = temp.getProx();
            cont++;
        }
        return cont;
    }

    public int contaNos2() {
        int cont = 0;

        for (No temp = ini; temp != null; temp = temp.getProx()) {
            cont++;
        }
        return cont;
    }

    public No menorNo() {
        No temp = ini;
        No menor = ini;
                
        while (temp != null) {
            if (menor.getElemento() > temp.getElemento()) {
                menor = temp;
            }
        }
        return menor;
    }
}

