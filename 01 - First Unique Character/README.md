# 01 — First Unique Character

Encontrar o primeiro caractere que aparece apenas uma vez em uma string, respeitando a ordem original.

Código: [FirstUniqueCharacter.java](FirstUniqueCharacter.java).

## Exemplos

| Entrada | Retorno de `firstUnique` |
| --- | --- |
| `"axaaababawaax"` | `'w'` |
| `"kaxaaababawaax"` | `'k'` |
| `"aabb"` | `'\0'` (nenhum caractere único) |

No primeiro exemplo, `x` aparece duas vezes; por isso, a resposta é `w`.

## Como funciona

1. Percorre a string e conta as ocorrências de cada caractere em `freq`.
2. Percorre novamente a string, do início ao fim.
3. Retorna o primeiro caractere cuja frequência seja `1`, ou `'\0'` se nenhum for encontrado.

O segundo percurso preserva a ordem da entrada: a contagem sozinha não determina qual caractere único veio primeiro.

## Complexidade e limites

- Tempo: `O(n)`, sendo `n` o tamanho da string.
- Espaço auxiliar: `O(1)`, pois o array tem tamanho fixo de 256 posições.

A implementação aceita caracteres com valor numérico entre 0 e 255; não cobre todo o Unicode. O valor `'\0'` é reservado para indicar ausência de resultado.

## Como executar

No terminal, dentro desta pasta, com JDK 17 ou superior:

```powershell
java FirstUniqueCharacter.java
```

O exemplo do `main` usa `"axaaababawaax"` e exibe `Primeiro caracter único: w`.

[Voltar ao índice](../README.md)
