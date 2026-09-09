# 08 — Overlapping Ranges

Determinar se dois intervalos de inteiros têm pelo menos `x` valores em comum, incluindo seus limites.

O método recebe um array com cinco inteiros positivos no formato `[inícioA, fimA, inícioB, fimB, x]`, com os limites de cada intervalo em ordem. Retorna a string `"true"` ou `"false"`.

Código: [OverlappingRanges.java](OverlappingRanges.java).

## Exemplos

| Entrada | Valores em comum | Retorno |
| --- | --- | --- |
| `[4, 10, 2, 6, 3]` | 4, 5 e 6 | `"true"` |
| `[1, 6, 5, 8, 3]` | 5 e 6 | `"false"` |
| `[1, 3, 3, 5, 1]` | 3 | `"true"` |

## Como funciona

O início da sobreposição é o maior dos dois inícios; o fim é o menor dos dois finais:

```java
int overlapStart = Math.max(range1Start, range2Start);
int overlapEnd = Math.min(range1End, range2End);
```

Se `overlapEnd < overlapStart`, a quantidade em comum é zero. Caso contrário, ela é `overlapEnd - overlapStart + 1`. O `+ 1` inclui os dois extremos na contagem.

Por fim, o método compara essa quantidade com `targetOverlap`.

## Complexidade

- Tempo: `O(1)`.
- Espaço auxiliar: `O(1)`.

O cálculo usa apenas os cinco valores de entrada, sem percorrer todos os números dos intervalos.

## Como executar

No terminal, dentro desta pasta, com JDK 17 ou superior:

```powershell
java OverlappingRanges.java
```

O `main` usa `[1, 6, 5, 8, 3]` e imprime `false`, pois há apenas dois valores em comum.

[Voltar ao índice](../README.md)
