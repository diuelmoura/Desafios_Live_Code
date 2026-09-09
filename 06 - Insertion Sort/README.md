# 06 — Insertion Sort

Ordenar um array de inteiros em ordem crescente utilizando Insertion Sort, sem criar outro array para a ordenação.

Código: [InsertionSort.java](InsertionSort.java).

## Exemplo

```text
Before: [8, 3, 5, 9, 1]
After: [1, 3, 5, 8, 9]
```

## Como funciona

O primeiro elemento já é considerado uma parte ordenada. A partir do segundo elemento:

1. Guarda o valor atual em `key`.
2. Percorre a parte ordenada de trás para frente, deslocando os valores maiores que `key` uma posição para a direita.
3. Insere `key` na posição encontrada.

Esse processo aumenta a parte ordenada até abranger todo o array. O método `insertionSort` modifica o próprio array recebido e não retorna um novo array.

## Complexidade

| Caso | Tempo |
| --- | --- |
| Melhor caso: array já ordenado | `O(n)` |
| Caso médio | `O(n²)` |
| Pior caso: array em ordem inversa | `O(n²)` |

O espaço auxiliar é `O(1)`. `n` é a quantidade de elementos. Como a comparação desloca apenas valores estritamente maiores, elementos iguais mantêm sua ordem relativa: a ordenação é estável.

## Como executar

No terminal, dentro desta pasta, com JDK 17 ou superior:

```powershell
java InsertionSort.java
```

O `main` imprime o array antes e depois da ordenação, conforme o exemplo.

[Voltar ao índice](../README.md)
