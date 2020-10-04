/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_Insercao_Busca;

import Aula_06_Lista_Encadeada.*;

/**
 *
 * @author ivanyuratakano
 */
public class ListaEncadeada1 {

    private No ini;

    // Criar um lista vazia
    public ListaEncadeada1() {
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
        {
            if (temp.getProx() == null) {
                No novo = new No(elemento, null);
                temp.setProx(novo);
            } else {
                insereFinalR(temp, elemento);
            }
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
        if (anterior == null){
            ini = novo;
        }else {
        //inserir entre 2 nós
        novo.setProx(temp);
        anterior.setProx(novo);
        }
    }
    public void insereOrdenadoR(int elemento){
        insereOrdenadoR(null, ini, elemento);
    }
    
    public void insereOrdenadoR(No anterior, No temp, int elemento){
        //lista vazia
        if (temp == null){
            insereInicio(elemento);
        } else {
            No novo = new No (elemento, ini);
             // Inserção no final
                if (temp == null && anterior.getProx() == null){
                    anterior.setProx(novo);
                    novo.setProx(null);
                } else {
            //Insere entre dois nós
            
            if (anterior != null && temp.getElemento() > novo.getElemento()){
                novo.setProx(temp);
                anterior.setProx(novo);
            } else {
                //Insere no início, com temp no primeiro nó
                if (anterior == null && temp.getElemento() > novo.getElemento()){
                    novo.setProx(ini);
                    ini = novo;
                }else
               
                    insereOrdenadoR(temp, temp.getProx(), elemento);
                }
            }
                
            
        }
    }
    
    public No buscaLinearIT(int x){
        No temp = ini;
        
        while (temp != null){
            if(temp.getElemento() == x)
                return temp; // achou
            temp = temp.getProx();
        }
        return null;//não achou
    }
    
 
}
