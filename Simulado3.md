# Simulado 3

**1. Resolva os seguintes modelos de PLI usando o método Branch & Bound. Demonstre a solução graficamente:**

a. 

$$max\ Z = 5x_1 + 4x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x1 + 4x2 ≤ 10$$

$$x_1, x_2 ≥ 0\ e\ inteiros$$

Resolvendo o problema $P0$ inicialmente, tem-se que $Z=16,667$ com $x_1=3,333$ e $x_2=0$. Como $x_1$ é a variável com maior valor, ramifica-se a equação pelas restrições $x_1\leq3$, que constará $P1$, e $x_1\geq4$, que constará em $P2$. 

Resolvendo $P2$ inicialmente, já que contém o maior valor, descobre-se que este ramo da equação não tem solução viável. 

Assim, pode-se descartar este ramo e resolver $P1$. Ele resulta em $Z=16

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

Começando pela matriz A, o caminho com os menores valores inicialmente é A - B - C - D - A ($4+2+8+7=21$).

**3. Aplique a heurística reversão de percursos na melhor solução alcançada no exercício 2.**

Fazendo as devidas trocas para analisar se há caminhos melhores:

- **A - C - B - D - A:** $6+2+10+7=25$
- **A - B - D - C - A:** $4+10+8+6=28$
- **A - D - C - B - A:** $6+2+10+7=25$

Como nenhum dos valores é menor que $21$, então o caminho inicial é o ótimo.
