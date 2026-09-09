# 04 — Palindrome

Substituir todos os `?` de uma string por letras minúsculas para formar um palíndromo: uma palavra que pode ser lida igualmente nos dois sentidos. As letras já presentes devem ser preservadas.

O enunciado considera strings de 1 a 1.000 caracteres, contendo apenas letras de `a` a `z` e `?`.

Código: [Palindrome.java](Palindrome.java).

## Exemplos

| Entrada | Retorno atual de `palindrome` |
| --- | --- |
| `"?ab??a"` | `"aabbaa"` |
| `"bab??a"` | `"Não é um Palidromo"` |
| `"?a?"` | `"aaa"` |

O enunciado pede `"NO"` quando não há solução. O código atual retorna `"Não é um Palidromo"`, com essa grafia.

## Como funciona

A string é convertida em `char[]`. Dois índices, `left` e `right`, começam nas extremidades e avançam em direção ao centro, comparando posições simétricas:

- Se os dois caracteres forem `?`, ambos recebem `a`.
- Se apenas um for `?`, ele recebe a letra do outro lado.
- Se forem letras diferentes, não é possível formar um palíndromo.
- Se forem letras iguais, a comparação continua.

Ao final, o array é convertido novamente em string. O uso de `left <= right` também permite substituir um `?` no centro de strings com tamanho ímpar.

## Complexidade

- Tempo: `O(n)`.
- Espaço auxiliar: `O(n)` para o array de caracteres.

`n` é o tamanho da string.

## Como executar

No terminal, dentro desta pasta, com JDK 17 ou superior:

```powershell
java Palindrome.java
```

O `main` executa os três exemplos da tabela, na mesma ordem.

[Voltar ao índice](../README.md)
