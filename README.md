# Desafio_Live_Code
=======
# 💻 DESAFIOS DE LIVE CODING COM JAVA

Repositório dedicado ao estudo e à resolução de **desafios de programação frequentemente utilizados em entrevistas técnicas e sessões de Live Coding**.

O objetivo deste projeto é praticar **lógica de programação, estruturas de dados, algoritmos, análise de complexidade e resolução de problemas utilizando Java**.

Cada desafio busca não apenas apresentar uma solução, mas também compreender o raciocínio utilizado, possíveis otimizações e a complexidade do algoritmo.

---

## 🎯 Objetivo

A prática de desafios de Live Coding ajuda a desenvolver habilidades importantes para entrevistas técnicas, como:

- 🧠 Raciocínio lógico
- ☕ Programação em Java
- 📦 Estruturas de Dados
- 🔄 Algoritmos
- ⚡ Otimização de código
- 📊 Análise de complexidade Big-O
- 🧩 Resolução de problemas
- 💬 Explicação do raciocínio durante o Live Coding

---

## 📋 Pré-requisitos

Para executar os exemplos deste repositório é recomendado possuir:

- ☑ Java JDK 11 ou superior
- ☑ IDE para desenvolvimento Java
- ☑ Conhecimentos básicos de Java
- ☑ Conhecimentos de Arrays e Strings
- ☑ Estruturas de repetição (`for`, `while`)
- ☑ Estruturas condicionais (`if`, `else`)
- ☑ Git e GitHub

IDE recomendada:

- IntelliJ IDEA
- Visual Studio Code
- Eclipse

---

# 📚 Ementa

Os desafios estão organizados de forma que um problema introduza conceitos que aparecem em outros desafios.

🧩 DESAFIO                     🧠 PRINCIPAL CONCEITO

First Unique Character   ───►  Frequency Array
Valid Anagram            ───►  Frequency Array / HashMap
Two Sum                  ───►  HashMap

Longest Substring        ───►  Sliding Window

Valid Parentheses        ───►  Stack

Overlapping Ranges       ───►  Intervals
Merge Intervals          ───►  Sorting + Intervals

Longest Increasing
Subsequence              ───►  Dynamic Programming```

---

# 🧠 CONCEITOS E ESTRUTURAS DE DADOS

Durante os desafios serão utilizados diferentes conceitos e estruturas.

### 🔢 Arrays

Estrutura utilizada para armazenar vários valores do mesmo tipo.

```java
int[] numeros = {1, 2, 3, 4, 5};
```

---

### 🗺️ HashMap

Permite armazenar informações utilizando pares de **chave e valor**.

```java
Map<Character, Integer> frequencia = new HashMap<>();
```

Muito útil para:

- Contagem de caracteres
- Busca rápida
- Frequência de elementos
- Problemas como Two Sum

---

### 📚 Stack

Estrutura baseada no princípio:

```text
LIFO
Last In, First Out
```

Ou seja:

```text
Último que entra → Primeiro que sai
```

Muito utilizada em problemas envolvendo:

- Parênteses
- Expressões
- Histórico
- Navegação

---

### 🪟 Sliding Window

Técnica utilizada para analisar uma parte de um array ou string sem precisar recalcular todos os elementos.

Exemplo:

```text
[a b c a b c]

 └───┘
 janela
```

Muito utilizada para problemas envolvendo:

- Substrings
- Subarrays
- Sequências
- Busca de maior/menor intervalo

---

### 📈 Dynamic Programming

Técnica utilizada para resolver problemas maiores reutilizando resultados de problemas menores.

Exemplo:

```text
Problema
   ↓
Subproblemas
   ↓
Armazenar resultados
   ↓
Reutilizar resultados
```

Utilizada neste repositório principalmente no desafio:

**Longest Increasing Sequence**

---

# 🧩 DESAFIOS

## 01 — First Unique Character

### 🎯 Objetivo

Encontrar o **primeiro caractere que aparece apenas uma vez** em uma String.

### Exemplo

```text
Input:
"axaaababawaax"

Output:
'w'
```

### Conceitos utilizados

- String
- Array
- Contagem de frequência
- Estruturas de repetição

### Complexidade esperada

```text
Tempo:  O(n)
Espaço: O(1) ou O(k)
```

---

## 02 — Frequency Array

### 🎯 Objetivo

Utilizar um array para armazenar a quantidade de vezes que cada elemento aparece.

Exemplo:

```text
Input:
"aabbbc"

Frequência:

a → 2
b → 3
c → 1
```

### Conceitos utilizados

- Arrays
- Índices
- Contagem
- Caracteres

---

## 03 — Valid Anagram

### 🎯 Objetivo

Verificar se duas Strings possuem exatamente os mesmos caracteres e quantidades.

### Exemplo

```text
Input:

"listen"
"silent"

Output:

true
```

### Conceitos utilizados

- Strings
- Frequency Array
- HashMap
- Contagem de caracteres

---

## 04 — HashMap

### 🎯 Objetivo

Compreender como utilizar uma estrutura de chave e valor para armazenar e localizar informações rapidamente.

### Exemplo

```java
Map<Character, Integer> mapa = new HashMap<>();

mapa.put('a', 3);
mapa.put('b', 2);
```

Resultado:

```text
a → 3
b → 2
```

---

## 05 — Two Sum

### 🎯 Objetivo

Encontrar dois números de um array cuja soma seja igual a um valor alvo.

### Exemplo

```text
Input:

nums = [2, 7, 11, 15]
target = 9

Output:

[0, 1]
```

Porque:

```text
2 + 7 = 9
```

### Conceitos utilizados

- Arrays
- HashMap
- Busca
- Otimização

### Complexidade otimizada

```text
Tempo:  O(n)
Espaço: O(n)
```

---

# 🪟 SLIDING WINDOW

## 06 — Longest Substring

### 🎯 Objetivo

Encontrar a maior substring que não possui caracteres repetidos.

### Exemplo

```text
Input:

"abcabcbb"

Output:

3
```

Uma possível substring é:

```text
abc
```

### Conceitos utilizados

- Strings
- HashSet / HashMap
- Dois ponteiros
- Sliding Window

### Complexidade

```text
Tempo: O(n)
```

---

# 📚 STACK

## 07 — Valid Parentheses

### 🎯 Objetivo

Verificar se uma sequência de parênteses, colchetes e chaves está corretamente balanceada.

### Exemplo

```text
Input:

"{[()]}"

Output:

true
```

Exemplo inválido:

```text
"{[(])}"

false
```

### Conceitos utilizados

- Stack
- LIFO
- Caracteres
- Condicionais

---

# 📏 INTERVALOS

## 08 — Overlapping Ranges

### 🎯 Objetivo

Determinar se dois intervalos possuem uma quantidade mínima de valores em comum.

### Conceitos utilizados

- Arrays
- Intervalos
- `Math.max()`
- `Math.min()`
- Comparação de limites

Representação:

```text
Intervalo A
1 -------- 6

Intervalo B
    4 -------- 8

Sobreposição
    4 ---- 6
```

---

## 09 — Merge Intervals

### 🎯 Objetivo

Combinar intervalos que possuem sobreposição.

### Exemplo

```text
Input:

[1,3]
[2,6]
[8,10]

Output:

[1,6]
[8,10]
```

Porque:

```text
[1 ---- 3]
    [2 -------- 6]

↓ merge

[1 ------------ 6]
```

### Conceitos utilizados

- Arrays
- Ordenação
- Intervalos
- Comparação

---

# 📈 DYNAMIC PROGRAMMING

## 10 — Longest Increasing Sequence

### 🎯 Objetivo

Encontrar o tamanho da maior subsequência crescente de um array.

### Exemplo

```text
Input:

[4, 3, 5, 1, 6]

Uma possível sequência:

3 → 5 → 6

Output:

3
```

### Conceitos utilizados

- Arrays
- Loops aninhados
- Dynamic Programming
- Subproblemas
- `Math.max()`

Exemplo da estrutura utilizada:

```text
Array:

[4, 3, 5, 1, 6]

DP inicial:

[1, 1, 1, 1, 1]

        ↓ comparações

DP final:

[1, 1, 2, 1, 3]
```

---

# ⏱️ COMPLEXIDADE DE ALGORITMOS

Durante os desafios também será analisada a complexidade utilizando a notação **Big-O**.

Algumas complexidades encontradas:

| Complexidade | Descrição |
|---|---|
| `O(1)` | Tempo constante |
| `O(log n)` | Logarítmica |
| `O(n)` | Linear |
| `O(n log n)` | Linearítmica |
| `O(n²)` | Quadrática |

Exemplo:

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

Complexidade:

```text
O(n)
```

Dois loops aninhados:

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

Complexidade:

```text
O(n²)
```

---

# 📂 Organização do Projeto

Uma possível organização dos arquivos:

```text
Desafios_Live_Code/
│
├── README.md
│
├── 01-first-unique-character/
│   └── FirstUniqueCharacter.java
│
├── 02-frequency-array/
│   └── FrequencyArray.java
│
├── 03-valid-anagram/
│   └── ValidAnagram.java
│
├── 04-hashmap/
│   └── HashMapExample.java
│
├── 05-two-sum/
│   └── TwoSum.java
│
├── 06-longest-substring/
│   └── LongestSubstring.java
│
├── 07-valid-parentheses/
│   └── ValidParentheses.java
│
├── 08-overlapping-ranges/
│   └── OverlappingRanges.java
│
├── 09-merge-intervals/
│   └── MergeIntervals.java
│
└── 10-longest-increasing-sequence/
    └── LongestIncreasingSequence.java
```

---

# 🚀 Como executar

Clone o repositório:

```bash
git clone git@github.com:diuelmoura/Desafios_Live_Code.git
```

Entre no diretório:

```bash
cd Desafios_Live_Code
```

Compile um desafio:

```bash
javac FirstUniqueCharacter.java
```

Execute:

```bash
java FirstUniqueCharacter
```

---

# 🎯 Objetivo de estudo

Este repositório está sendo construído como material de preparação para:

- Entrevistas técnicas
- Live Coding
- Testes de programação
- Resolução de algoritmos
- Estruturas de dados
- Análise de complexidade
- Boas práticas em Java

A ideia é evoluir gradualmente de problemas mais simples para técnicas mais avançadas.

```text
Arrays / Strings
       ↓
Frequency Array
       ↓
HashMap
       ↓
Stack
       ↓
Sliding Window
       ↓
Intervals
       ↓
Dynamic Programming
```

---

## 📌 Status

🚧 **Projeto em desenvolvimento**

Novos desafios e soluções serão adicionados conforme os estudos avançarem.
>>>>>>> a7d13d7 (Initial commit: add Java live coding challenges)
