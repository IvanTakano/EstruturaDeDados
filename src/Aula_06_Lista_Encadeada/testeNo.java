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
public class testeNo {
    public static void main(String[] args) {
        No a = new No(3, null);
        System.out.println(a);
        System.out.println(a.getElemento());
        System.out.println(a.getProx());
        
        No b =new No(5, a);
        System.out.println(b);
        System.out.println(b.getElemento());
        System.out.println(b.getProx());
        
        No c = new No(8, b);
        System.out.println(c);
    }
}
