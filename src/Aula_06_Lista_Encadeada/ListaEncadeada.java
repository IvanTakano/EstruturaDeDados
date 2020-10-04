/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Lista_Encadeada;

/**
 *
 * @author ivanyuratakano
 */
public class ListaEncadeada {
    private No ini;
    
    // Criar um lista vazia
    public ListaEncadeada(){
        this.ini = null;
    }
    
    // Verifica se a lista está vazia
    public boolean vazia(){
        return this.ini == null;
    }
    
    public void insereInicio(int elemento){
        No novo = new No(elemento, ini);
        ini = novo;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;
        
        while( temp != null){
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;
    }

    public void insereOrdenado(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insereOrdenadoR(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
