# Lista de Exercícios 10

**Considere o seguinte quadro de custos para responder as questões 1, 2 e 3:**

| | $D_1$ | $D_2$ | $D_3$ | $D_4$ | Disponibilidade |
|---|---|---|---|---|---|
| $O_1$ | 1 | 2,5 | 3 | 2 | 10 |
| $O_2$ | 1 | 4,5 | 2 | 3 | 10 |
| $O_3$ | 2 | 3 | 4 | 5 | 10 |
| Demanda | 5 | 5 | 10 | 10 | |

**1. Responda:**

**a. Quantas origens possui o problema de transportes?**

**Resposta:** 3 origens.

**b. Quantos destinos possui o problema de transportes?**

**Resposta:** 4 destinos.

**c. Qual o custo unitário entre a origem 2 e o destino 4 (c24)?**

**Resposta:** 3.

**d. Formule o modelo matemático associado a esse problema.**

$$min\ Z=x_{11}+2,5x_{12}+3x_{33}+2x_{44}+x_{21}+4,5x_{22}+2x_{23}+3x_{24}+2x_{31}+3x_{32}+4x_{33}+5x_{34}$$

$$sujeito\ a\ (s.t.)$$

$$x_{11} + x_{12} + x_{13} + x_{14} \leq10$$

$$x_{21} + x_{22} + x_{23} + x_{24} \leq10$$

$$x_{31} + x_{32} + x_{33} + x_{34} \leq10$$

$$x_{11}+x_{21}+x_{31}\geq5$$

$$x_{12}+x_{22}+x_{32}\geq5$$

$$x_{13}+x_{23}+x_{33}\geq10$$

$$x_{14}+x_{24}+x_{34}\geq10$$

$$x_{ij}\geq0,\ para\ i = 1, 2, 3\ e\ j = 1, 2, 3, 4$$

**2. Encontre a solução inicial para o problema de transportes pela regra do canto noroeste. Há algum problema com a solução encontrada?**

| | $D_1$ | $D_2$ | $D_3$ | $D_4$ | Disponibilidade |
|---|---|---|---|---|---|
| $O_1$ | 5 | 5 |  |  | 10 |
| $O_2$ |  |  | 10 |  | 10 |
| $O_3$ |  |  |  | 10 | 10 |
| Demanda | 5 | 5 | 10 | 10 | |

$$Z^*=5\cdot1+5\cdot2,5+10\cdot2+10\cdot3=87,5$$

**Resposta:** A solução inicial por canto noroeste é 87,5. Ela é degenerada, pois o número de células ocupadas é menor que $m+n–1=6$.

**3. Encontre a solução inicial para o problema de transportes pela regra do custo mínimo. Há algum problema com a solução encontrada?**

| | $D_1$ | $D_2$ | $D_3$ | $D_4$ | Disponibilidade |
|---|---|---|---|---|---|
| $O_1$ | 5 |  |  | 5 | 0 |
| $O_2$ |  |  | 10 |  | 0 |
| $O_3$ |  | 5 |  | 5 | 0 |
| Demanda | 0 | 0 | 0 | 0 | |

$$Z^*=5\cdot1+5\cdot2+10\cdot2+5\cdot3+5\cdot5=75$$

**Resposta:** A solução inicial por canto noroeste é 75. Ela é degenerada, pois o número de células ocupadas é menor que $m+n–1=6$.

**4. O quadro de custos abaixo ilustra as demandas de cinco armazéns e o custo de transporte entre as fábricas e armazéns. Encontre a solução inicial pela regra de aproximação de Vogel.**

| | $A_1$ | $A_2$ | $A_3$ | $A_4$ | $A_5$ | Disponibilidade |
|---|---|---|---|---|---|---|
| $F_1$ | 1 | 2 | 2 | 2 | 4 | 60 |
| $F_2$ | 2 | 4 | 2 | 3 | 3 | 45 |
| $F_3$ | 3 | 4 | 4 | 5 | 3 | 40 |
| **Demanda** | 15 | 30 | 25 | 50 | 25 | |

| | $A_1$ | $A_2$ | $A_3$ | $A_4$ | $A_5$ | Disponibilidade | Penalidade |
|---|---|---|---|---|---|---|---|
| $F_1$ |  |  |  |  |  | 60 | 1 |
| $F_2$ |  |  |  |  |  | 45 | 1 |
| $F_3$ |  |  |  |  |  | 40 | 0 |
| **Demanda** | 15 | 30 | 25 | 50 | 25 | | |
| **Penalidade** | 1 | 2 | 2 | 1 | 1 | | |

| | $A_1$ | $A_2$ | $A_3$ | $A_4$ | $A_5$ | Disponibilidade | Penalidade |
|---|---|---|---|---|---|---|---|
| $F_1$ |  | 30 |  |  |  | 60-30 | 1 |
| $F_2$ |  |  |  |  |  | 45 | 1 |
| $F_3$ |  |  |  |  |  | 40 | 0 |
| **Demanda** | 15 | 30-30=0 | 25 | 50 | 25 | | |
| **Penalidade** | 1 | 2 | 2 | 1 | 1 | | |

| | $A_1$ | $A_2$ | $A_3$ | $A_4$ | $A_5$ | Disponibilidade | Penalidade |
|---|---|---|---|---|---|---|---|
| $F_1$ |  | 30 |  |  |  | 60-30 | 1 |
| $F_2$ |  |  |  |  |  | 45 | 1 |
| $F_3$ |  |  |  |  |  | 40 | 0 |
| **Demanda** | 15 | 30-30=0 | 25 | 50 | 25 | | |
| **Penalidade** | 1 | 0 | 2 | 1 | 1 | | |

| | $A_1$ | $A_2$ | $A_3$ | $A_4$ | $A_5$ | Disponibilidade | Penalidade |
|---|---|---|---|---|---|---|---|
| $F_1$ |  | 30 |  |  |  | 60-30 | 1 |
| $F_2$ |  |  | 25 |  |  | 45-25 | 1 |
| $F_3$ |  |  |  |  |  | 40 | 0 |
| **Demanda** | 15 | 30-30=0 | 25-25=0 | 50 | 25 | | |
| **Penalidade** | 1 | 0 | 2 | 1 | 1 | | |

| | $A_1$ | $A_2$ | $A_3$ | $A_4$ | $A_5$ | Disponibilidade | Penalidade |
|---|---|---|---|---|---|---|---|
| $F_1$ |  | 30 |  |  |  | 60-30 | 1 |
| $F_2$ |  |  | 25 |  |  | 45-25 | 1 |
| $F_3$ |  |  |  |  |  | 40 | 0 |
| **Demanda** | 15 | 30-30=0 | 25-25=0 | 50 | 25 | | |
| **Penalidade** | 1 | 0 | 2 | 1 | 1 | | |
