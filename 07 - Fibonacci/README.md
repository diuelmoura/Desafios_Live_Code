# 07 — Fibonacci

Encontrar o número de Fibonacci na posição `N`. A sequência começa com `0` e `1`; cada número seguinte é a soma dos dois anteriores.

Código: [Fibonacci.java](Fibonacci.java).

## Status

**Implementação pendente.** O arquivo contém o enunciado e a classe vazia, sem método de cálculo ou `main`.

## Exemplos esperados

Adotando a contagem a partir de zero, com `F(0) = 0` e `F(1) = 1`:

| N | F(N) |
| --- | --- |
| 0 | 0 |
| 1 | 1 |
| 2 | 1 |
| 6 | 8 |
| 9 | 34 |

Esses exemplos descrevem o comportamento esperado para a futura implementação.

## Abordagem sugerida

Tratar os casos `0` e `1` diretamente. Para as demais posições, usar duas variáveis para guardar os valores anteriores e atualizar a soma até chegar a `N`.

Essa abordagem iterativa permite tempo `O(N)` e espaço auxiliar `O(1)` usando tipos numéricos de tamanho fixo. Ao implementar, será necessário definir o intervalo de entradas e o tipo numérico para evitar estouro de capacidade.

## Execução

A classe ainda não pode ser executada como um programa, pois não possui `main`. Após implementar o cálculo e adicionar os exemplos ao `main`, o comando dentro desta pasta, com JDK 17 ou superior, será:

```powershell
java Fibonacci.java
```

[Voltar ao índice](../README.md)
