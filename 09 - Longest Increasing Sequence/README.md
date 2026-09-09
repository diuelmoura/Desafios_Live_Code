# 09 — Longest Increasing Sequence

Encontrar o tamanho da maior subsequência estritamente crescente de um array de inteiros positivos. Esse problema também é conhecido como **Longest Increasing Subsequence (LIS)**.

Uma subsequência preserva a ordem dos elementos da entrada, mas não exige posições consecutivas. O método retorna seu tamanho, sem reconstruir os elementos que a compõem.

Código: [LongestIncreasingSequence.java](LongestIncreasingSequence.java).

## Exemplos

| Entrada | Uma maior subsequência crescente | Retorno |
| --- | --- | --- |
| `[4, 3, 5, 1, 6]` | `[3, 5, 6]` | `3` |
| `[9, 9, 4, 2]` | `[9]` | `1` |
| `[10, 22, 9, 33, 21, 50, 41, 60, 22, 68, 90]` | `[10, 22, 33, 50, 60, 68, 90]` | `7` |

## Como funciona

A solução utiliza programação dinâmica. Cada posição `dp[i]` guarda o tamanho da maior subsequência crescente que termina em `arr[i]`.

1. Inicializa todas as posições de `dp` com `1`, pois cada elemento sozinho forma uma subsequência.
2. Para cada posição `i`, examina as posições anteriores `j`.
3. Quando `arr[i] > arr[j]`, atualiza `dp[i]` com o maior valor entre o atual e `dp[j] + 1`.
4. Guarda e retorna o maior tamanho encontrado.

Para `[4, 3, 5, 1, 6]`, o array final é `dp = [1, 1, 2, 1, 3]`, e a resposta é `3`.

## Complexidade e limites

- Tempo: `O(n²)`, pelas comparações com os elementos anteriores.
- Espaço auxiliar: `O(n)`, pelo array `dp`.

`n` é a quantidade de elementos. A comparação estrita `>` impede que valores iguais prolonguem a subsequência. A implementação pressupõe uma entrada não vazia; para um array vazio, atualmente retorna `1` devido à inicialização de `maiorSequencia`.

## Como executar

No terminal, dentro desta pasta, com JDK 17 ou superior:

```powershell
java LongestIncreasingSequence.java
```

O `main` usa `[4, 3, 5, 1, 6]` e imprime `3`.

[Voltar ao índice](../README.md)
