# 00 — Number Guessing Game

## 🎯 Objetivo

Jogo de adivinhação em Java executado pelo terminal. O programa sorteia um número entre **1 e 100**, inclusive, e o jogador tem **7 tentativas válidas** para acertá-lo.

Código: [NumberGuessingGame.java](NumberGuessingGame.java).

## 🎮 Como jogar

1. Digite um número inteiro entre 1 e 100.
2. Use a dica para ajustar o próximo palpite:
   - `Too high!`: o palpite é maior que o número secreto.
   - `Too low!`: o palpite é menor que o número secreto.
3. Ao acertar, o programa exibe `Congratulations! You guessed the number!` e encerra a partida.
4. Se as 7 tentativas forem usadas sem acerto, o programa exibe `Game Over!` e revela o número secreto.

Entradas que não sejam números inteiros ou estejam fora do intervalo permitido **não consomem tentativas**. Após cada palpite válido incorreto, o programa informa quantas tentativas restam. As mensagens do jogo são exibidas em inglês.

## 🚀 Como executar

É necessário ter um JDK instalado, com os comandos `javac` e `java` disponíveis no terminal. A partir da raiz deste repositório, execute:

```powershell
cd "00 - Number Guessing Game"
javac NumberGuessingGame.java
java NumberGuessingGame
```

Com JDK 11 ou superior, também é possível executar diretamente o arquivo, dentro da pasta do jogo:

```powershell
java NumberGuessingGame.java
```

O projeto utiliza apenas classes da biblioteca padrão do Java e não precisa de dependências externas.

## 📋 Exemplo de partida

Exemplo considerando que o número sorteado foi `42`. O número secreto muda a cada execução e só é revelado pelo programa em caso de derrota.

```text
=== NUMBER GUESSING GAME ===
Guess a number between 1 and 100.
You have 7 attempts.

Attempt 1: 70
Too high!
Remaining attempts: 6

Attempt 2: 20
Too low!
Remaining attempts: 5

Attempt 3: 42
Congratulations! You guessed the number!
```

## ⚙️ Como funciona

- `Scanner` lê os palpites pelo terminal; `hasNextInt()` verifica se a entrada pode ser lida como um inteiro.
- `Random` sorteia o número secreto com `random.nextInt(100) + 1`.
- O laço `for` controla as 7 tentativas. Entradas inválidas usam `attempt--` e `continue` para repetir a tentativa sem descontá-la.
- As condições `if` e `else if` comparam o palpite com o número secreto e exibem a dica correspondente.
- A variável `guessedCorrectly` registra a vitória, e `break` encerra o laço quando o jogador acerta.
- Ao final, o programa verifica se houve derrota e fecha o `Scanner`.

## 🧠 Conceitos utilizados

- Entrada de dados com `Scanner`
- Geração de números aleatórios com `Random`
- Variáveis e tipos primitivos (`int` e `boolean`)
- Estruturas de repetição (`for`)
- Estruturas condicionais (`if`, `else if` e `else`)
- Operadores de comparação e operadores lógicos
- Validação de entradas
- Controle de fluxo com `break` e `continue`
- Incremento e decremento de contadores

[Voltar ao índice](../README.md)
