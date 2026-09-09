/*ENUNCIADO DESAFIO - Longest Increasing Sequence*/

/*Have the function LongestIncreasingSequence(arr) take the array of positive integers stored (LIS). 
A LIS is subset of the original list where the numbers are in sorted order, from lowest to highest, and are in increasing order. The sequence does not need to be contiguous or unique, and there can be several different subsequences. For example: if arr is   [4,3,5,1,6] the a possible LIS is [3,5,6], and another is [1,6]. For this input, your program should return 3 because that is the length of the longest increasing subsequence. 
Examples: 
Input: new int[] {9,9,4,2} Output: 1 
Input: new int[] {10,22,9,33,21,50,41,60,22,68,90} Output: 7 
Input: new int[] { 4, 3, 5, 1, 6 } ? */

import java.util.*;
import java.io.*;

public class LongestIncreasingSequence {
    public static int LongestIncreasingSequence(int[] arr) {
        int[] dp = new int[arr.length];

        Arrays.fill(dp, 1);

        int maiorSequencia = 1;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maiorSequencia = Math.max(maiorSequencia, dp[i]);
        }
        return maiorSequencia;
    }

    public static void main(String[] args) {
        System.out.println(LongestIncreasingSequence(new int[] {4,3,5,1,6}));
    }
}

/*EXPLICAÇÂO DO DESAFIO 2: Longest Increasing Sequence

O método LongestIncreasingSequence recebe um array de inteiros. 
Em seguida, crio um array auxiliar chamado dp com o mesmo tamanho do array original. 
Esse array é usado para armazenar, em cada posição, o tamanho da maior subsequência crescente que termina naquele elemento. 
Inicializo todas as posições com 1, porque qualquer elemento sozinho já forma uma subsequência crescente de tamanho 1. 
Depois percorro o array comparando o elemento atual com todos os elementos anteriores. 
Sempre que encontro um número menor que o atual, verifico se consigo formar uma sequência maior. 
Por fim, mantenho uma variável chamada maiorSequencia, que guarda o maior valor encontrado no dp, e esse será o resultado final. */