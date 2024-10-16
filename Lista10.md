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

**2. Encontre a solução inicial para o problema de transportes pela regra do canto**

