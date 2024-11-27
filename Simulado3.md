# Simulado 3

**1. Resolva os seguintes modelos de PLI usando o método Branch & Bound. Demonstre a solução graficamente:**

a. 

$$max\ Z = 5x_1 + 4x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x1 + 4x2 ≤ 10$$

$$x_1, x_2 ≥ 0\ e\ inteiros$$

b. 

$$min\ Z = 3x_1 + 6x_2$$

$$sujeito\ a\ (s.t.)$$

$$7x_1 + 3x_2 ≥ 40$$

$$x_1, x_2 ≥ 0\ e\ inteiros$$

**2. Considere a seguinte matriz de custos:**

| | A | B | C | D |
|---|---|---|---|---|
| A | 0 | 4 | 6 | 7 |
| B | 4 | 0 | 2 | 10 |
| C | 6 | 2 | 0 | 8 |
| D | 7 | 10 | 8 | 0 |

**a. Desenhe o grafo correspondente.** 

![image](https://github.com/user-attachments/assets/b0256a46-2612-4ea8-9008-ca275305c3d5)

**b. Aplique a heurística do vizinho mais próximo para descobrir a menor distância para percorrer todos os pontos uma única vez.** 

- Começando pela matriz A, o caminho com os menores valores inicialmente é A - B - C - D - A
**3. Aplique a heurística reversão de percursos na melhor solução alcançada no exercício 2.**

