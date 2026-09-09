# 02 — Frequency Array

Contar quantas vezes cada caractere aparece em uma string utilizando um array de frequências.

Código: [FrequencyArray.java](FrequencyArray.java).

## Exemplo

Entrada: `"banana"`.

```text
a = 3
b = 1
n = 2
```

## Como funciona

O método `countFrequency` cria um array com 256 posições. Para cada caractere, usa seu valor numérico como índice e incrementa o contador correspondente:

```java
freq[word.charAt(i)]++;
```

O método retorna o array completo. O `main` percorre esse resultado e imprime apenas os contadores positivos, na ordem dos índices dos caracteres. Assim, a exibição não segue a ordem de aparição na string.

## Complexidade e limites

- Tempo: `O(n)` para contar os caracteres; a exibição percorre 256 posições fixas.
- Espaço auxiliar: `O(1)`, pelo tamanho fixo do array.

`n` é o tamanho da string. A implementação aceita caracteres com valor numérico entre 0 e 255; não cobre todo o Unicode.

## Como executar

No terminal, dentro desta pasta, com JDK 17 ou superior:

```powershell
java FrequencyArray.java
```

O `main` usa a entrada `"banana"`. A impressão é feita com `System.err.println`, portanto aparece na saída de erro do processo, mesmo sem haver uma falha.

[Voltar ao índice](../README.md)
