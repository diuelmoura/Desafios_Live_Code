/*ENUNCIADO DESAFIO 2 - Overlapping Ranges*/

/*Have the function OverlappingRanges(arr) take the array of numbers stored in (arr) which will contain 5 positive integers,
the first two representing a range of numbers (a to b), the next 2 also representing another range of integers (c to d),
and a final 5th element(x) which will also be positive integer, and return the string if both sets of rangers overlap by at least
x numbers.
For example: if (arr) is [4, 10, 2, 6, 3] theyour programshould return string true.
The first range of numbers are 4,5,6,7,8,9,10 and second range 2,3,4,5,6.
The last element in the array is 3, and there are 3 numbers that overlap between both ranges: 4,5, and 6.
If both rangess do not overlap by at least x numbers, then your program should return the string false.*/

import java.util.*;
import java.io.*;

/*CODIGO*/
public class OverlappingRanges {
    public static String OverlappingRanges(int[] arr) {
        int range1Start = arr[0];
        int range1End = arr[1];
        int range2Start = arr[2];
        int range2End = arr[3];
        int targetOverlap = arr[4];
        int overlapStart = Math.max(range1Start, range2Start); //maiorInicio
        int overlapEnd = Math.min(range1End, range2End); //menorFinal
        int overlapCount = 0;

        if(overlapEnd >= overlapStart){
            overlapCount = overlapEnd - overlapStart + 1;
        }
        return overlapCount >= targetOverlap ? "true" : "false";
    }
    public static void main(String[] args) {
        System.out.println(OverlappingRanges(new int[]{1,6,5,8,3}));
    }
}

/*EXPLICAÇÂO DESAFIO:
O método OverlappingRanges recebe um array de inteiros como parâmetro e retorna uma String. 
Inicialmente, ele separa os valores do array em variáveis que representam o início e o fim de dois intervalos, 
além da quantidade mínima de números em comum desejada (targetOverlap). 
Em seguida, calcula onde uma possível sobreposição começa (overlapStart) e termina (overlapEnd). 
Depois verifica se essa sobreposição realmente existe através da condição overlapEnd >= overlapStart. 
Caso exista, calcula quantos números fazem parte dessa região utilizando overlapEnd - overlapStart + 1. 
Por fim, compara essa quantidade com targetOverlap e retorna "true" se a quantidade for suficiente ou "false" caso contrário. */