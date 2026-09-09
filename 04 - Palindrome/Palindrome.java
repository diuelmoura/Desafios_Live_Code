/*CHALLENGE STATEMENT 4 - Palindrome
Write a function solution that, given a string S of length N, returns any palindrome which can be obtained by replacing all of the question marks in S by lowercas letters ('a'- 'z').
If a palindrome is a string thet reads the same both fowards and backwards. Some exaples of palindorme are: "kayak", "radar" and "mom".

Examples: 
1.Given S = "?ab??a", the function should return "aabbaa".
2.Given S = "bab??a", the function should return "NO".
3.Given S = "?a?", the function may return "aaa". It may also return "zaz", among other possible answers.

Assume that:
    * N is integer eithin the range [1..1,000];
    * string S consists only of lowercases letters('a'-'z' or '?'.)
    
In your solution, focus on correctness. The perfomance of your solution will not be the focus of the assessment*/

public class Palindrome {

    public static String palindrome(String S) {
        //Converte a String para um array de caracteres
        char[] result = S.toCharArray();
        
        //Ponteiro da esquerda
        int left = 0;
        
        //Ponteiro da direita
        int right = result.length - 1;

        //Enquanto os ponteiros não se cruzarem
        while (left <= right) {
            //Caso 1: os dois lados são '?'
            if(result[left] == '?' && result[right] == '?'){
             
                result[left] = 'a';
                result[right] = 'a';
            }
            //Caso 2: apenas o lado esquerdo é '?' (? e letra)
            else if(result[left] == '?') {
                result[left] =  result[right];
            }
            
            //Caso 2: apenas o lado direito é '?' (letra e ?)
            else if (result[right] == '?') {
                result[right] = result[left];
            }

            //Caso 3: os dois lados são letras diferentes
            else if (result[left] != result[right]) {
                return "Não é um Palidromo";
            }

            //Move os ponteiros
            left ++;
            right --;
        }
        // Converte novamente para String
        return new String(result);
    }
    public static void main(String[] args) {
        System.out.println(palindrome("?ab??a"));
        System.out.println(palindrome("bab??a"));
        System.out.println(palindrome("?a?"));
    }
}

/*
 * The **solution** method takes a String **S** as input and aims to create
 * a valid palindrome by replacing all question marks ('?') with lowercase
 * letters.
 *
 * First, I convert the String into a character array named **result**,
 * because Strings in Java are immutable and cannot be modified directly.
 *
 * Next, I create two pointers:
 * **left**, which starts at the beginning of the array,
 * and **right**, which starts at the end of the array.
 *
 * Then, I compare the characters at the **left** and **right** positions
 * while the two pointers move toward the center.
 *
 * If both characters are question marks ('?'), I replace both with the
 * same letter, for example 'a', because any equal lowercase letter would
 * keep the palindrome valid.
 *
 * If only the character at **left** is '?', I replace it with the character
 * at **right**.
 *
 * If only the character at **right** is '?', I replace it with the character
 * at **left**.
 *
 * If both characters are already letters and they are different, I
 * immediately return **"NO"**, because it is impossible to create a palindrome
 * without changing the original letters.
 *
 * After each comparison, I increment **left** and decrement **right** so that
 * both pointers continue moving toward the center of the String.
 *
 * If all mirrored positions are valid, I convert the character array back
 * into a String and return the resulting palindrome.
 *
 * Thus, the String is traversed only once from both ends, resulting in
 * **O(n)** time complexity.
 *
 * Since I create a character array with the same size as the input String,
 * the auxiliary space complexity is **O(n)**.
 */