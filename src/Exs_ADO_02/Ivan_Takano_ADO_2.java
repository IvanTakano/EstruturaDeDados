/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 12) Dada uma sequência de números inteiros positivos, descreva uma função recursiva para encontrar:
 * a) Busca linear de um elemento da sequência;
 * b) Menor elemento da sequência;
 * c) A soma dos elementos da sequência
 * c) A média aritmética dos elementos da sequência
 * Considere que as sequência informada para as funções não é vazia, ou seja, se n >= 1.
 */
package Exs_ADO_02;


import java.util.Scanner;

/**
 *
 * @author ivanyuratakano
 */
public class Ivan_Takano_ADO_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("Digite um número que deseja buscar: ");
        int x = sc.nextInt();
        
        if (buscaLinear(v,x,n) > 0){
            System.out.println("O número esta no vetor");
        } else{
            System.out.println("O número não está no vetor");
        }
        
        int menor = v[1];        
        int menorEle = menorVetor(v, n, menor);
        
        System.out.printf("\nO menor elemento = %d", menorEle);
        
        int soma = 0;
        int somaSeq = somaVetor(v, n, soma);
        
        System.out.printf("\nA soma dos elementos  = %d", somaSeq);
        
        int soma1 = 0;
        double media = 0;
        double mediaEle = mediaVetor(v, n, media, soma1, n);
        
        System.out.println("\nA média aritimética = " + mediaEle);
        System.out.println("");
    }
    
    public static int leInteiroPositivo() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número inteiro e positivo: ");
            n = sc.nextInt();
        } while (n < 0 || n > 1000000);
        return n;
    }
    
    public static int[] leVetorAleatorio(int n) {
        int v[] = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 50);
        }
        return v;
    }

    public static void exibeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static int buscaLinear(int[] v, int x, int n) {
            if (n <= 0){
                return 0;
            }
            if(v[n-1]==x){
                return x; //achou
            }
        
        return buscaLinear( v, x, n-1);
    }

    private static int menorVetor(int[] v, int n,int menor) {
            
            if (n <= 0){
                return menor;
            }
            if (v[n-1] < menor){
                menor = v[n-1];
                
            }
           return menorVetor(v, n-1, menor); 
    }   

    private static int somaVetor(int[] v, int n, int soma) {
        if (n <=0 ){
            return soma;
        }
        if (n >= 0){
            soma = soma + v[n-1];
        }
        return somaVetor(v, n-1, soma);
    }

    private static double mediaVetor(int[] v, int n, double media, int soma1, int m) {
        
        
        if (n <=0 ){
            return media;
        }
        if (n >= 0){
            soma1 = soma1 + v[n-1];
            media  = (soma1 / m);
        }
        return mediaVetor(v, n-1, media, soma1, m);
    }
    
}
