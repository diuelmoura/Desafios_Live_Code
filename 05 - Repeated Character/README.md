# 05 — Repeated Character

Verificar se uma string contém pelo menos um caractere repetido. O resultado é um booleano; o método não retorna qual caractere se repetiu.

Código: [CharacterRepeated.java](CharacterRepeated.java).

## Exemplos

| Entrada | Retorno de `solution` |
| --- | --- |
| `"banana"` | `true` |
| `"casa"` | `true` |
| `"java"` | `true` |
| `"code"` | `false` |
| `"abcde"` | `false` |

## Como funciona

Um array de 26 posições registra a frequência das letras de `a` a `z`. A expressão `c - 'a'` transforma cada letra em um índice: `a` corresponde a 0, `b` a 1, e assim por diante.

Para cada letra, o contador é incrementado. Se ele ultrapassar `1`, o método retorna `true` imediatamente. Se o percurso terminar sem repetição, retorna `false`.

## Complexidade e limites

- Tempo: limite superior `O(n)`, sendo `n` o tamanho da string, com retorno antecipado ao encontrar repetição.
- Espaço auxiliar: `O(1)`, com 26 posições fixas.

Como o alfabeto é restrito a 26 letras, uma entrada válida com mais de 26 caracteres necessariamente apresenta repetição até o 27º caractere. Sob essa restrição, a quantidade de caracteres examinados é limitada por uma constante.

A entrada deve conter apenas letras minúsculas de `a` a `z`. Outros caracteres produzem índices fora do array.

## Como executar

No terminal, dentro desta pasta, com JDK 17 ou superior:

```powershell
java CharacterRepeated.java
```

O `main` executa os cinco exemplos da tabela, na mesma ordem.

[Voltar ao índice](../README.md)
