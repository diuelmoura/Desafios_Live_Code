# 03 — Valid Anagram

Verificar se duas strings contêm os mesmos caracteres nas mesmas quantidades, independentemente da ordem.

Código: [ValidAnagram.java](ValidAnagram.java).

## Exemplos

| Primeira string | Segunda string | Retorno de `isAnagram` |
| --- | --- | --- |
| `"listen"` | `"silent"` | `true` |
| `"hello"` | `"world"` | `false` |
| `"java"` | `"javascript"` | `false` |

## Como funciona

1. Retorna `false` se os tamanhos forem diferentes.
2. Incrementa a frequência de cada caractere da primeira string.
3. Decrementa a frequência de cada caractere da segunda string.
4. Retorna `true` se todos os contadores terminarem em zero.

O array funciona como um saldo: qualquer valor diferente de zero indica uma diferença na quantidade de algum caractere.

## Complexidade e limites

- Tempo: `O(n)` para strings de mesmo tamanho `n`; tamanhos diferentes são rejeitados em `O(1)`.
- Espaço auxiliar: `O(1)`, com 256 posições fixas.

A comparação diferencia maiúsculas e minúsculas e conta espaços e pontuação. A implementação aceita caracteres com valor numérico entre 0 e 255; não cobre todo o Unicode.

## Como executar

No terminal, dentro desta pasta, com JDK 17 ou superior:

```powershell
java ValidAnagram.java
```

O `main` compara `"listen"` com `"silent"` e exibe `As palavras são anagramas.`. Essa mensagem é impressa com `System.err.println`.

[Voltar ao índice](../README.md)
