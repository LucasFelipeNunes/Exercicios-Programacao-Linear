# Simulado 3

**1. Resolva os seguintes modelos de PLI usando o método Branch & Bound. Demonstre a solução graficamente:**

a. 

$$max\ Z = 5x_1 + 4x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x1 + 4x2 ≤ 10$$

$$x_1, x_2 ≥ 0\ e\ inteiros$$

Resolvendo o problema $P0$ inicialmente, tem-se que $Z=16,667$ com $x_1=3,333$ e $x_2=0$. Como $x_1$ é a variável com maior valor não inteiro, ramifica-se a equação pelas restrições $x_1\leq3$, que constará $P1$, e $x_1\geq4$, que constará em $P2$. 

Resolvendo $P2$ inicialmente, descobre-se que este ramo da equação não tem solução viável. 

Assim, pode-se descartar este ramo e resolver $P1$. Ele resulta em $Z=16$, com $x_2=3$ e $x_2=0,25$. Como $x_2$ é a variável com maior valor não inteiro, ramifica-se a equação pelas restrições $x_2\leq0$, que constará em $P3$, e $x_2\geq1$, que constará em $P4$.

Resolvendo $P4$ inicialmente, tem-se $Z=14$ com $x_1=2$ e $x_2=1$. Como todos os valores são inteiros, é o fim deste ramo.

Já em $P3$, tem-se que $Z=15$, com $x_1=3$ e $x_2=0$. Como todos os valores são inteiros, é o fim deste ramo.

Como não sobraram mais ramos, e como a equação é de maximização, a solução ótima é a equação inteira em que $Z$ é maior; ou seja, a equação $P3$ com $Z=15$, $x_1=3$ e $x_2=0$.

![image](https://github.com/user-attachments/assets/a0bf08f8-7ae8-4be0-96bc-387df4c3fb4a)

b. 

$$min\ Z = 3x_1 + 6x_2$$

$$sujeito\ a\ (s.t.)$$

$$7x_1 + 3x_2 ≥ 40$$

$$x_1, x_2 ≥ 0\ e\ inteiros$$

Resolvendo o problema $P0$ inicialmente, tem-se que $Z=17,143$ com $x_1=5,714$ e $x_2=0$. Como $x_1$ é a variável com maior valor não inteiro, ramifica-se a equação pelas restrições $x_1\leq5$, que constará em $P1$, e $x_1\geq6$, que constará em $P2$. 

Resolvendo $P1$ inicialmente, tem-se que $Z=25$, com $x_1=5$ e $x_2=1,667$. Como $x_2$ é a variável com maior valor não inteiro, ramifica-se a equação pelas restrições $x_2\leq1$, que constará em $P3$, e $x_2\geq2$, que constará em $P4$.

Resolvendo $P3$ inicialmente, descobre-se que este ramo da equação não tem solução viável. 

Assim, pode-se descartar este ramo e resolver $P4$. Obtém-se que $Z=26$, com $x_1=4,857$ e $x_2=2$. Como $x_1$ é a variável com maior valor não inteiro, ramifica-se a equação pelas restrições $x_1\leq4$, que constará em $P5$, e $x_1\geq5$, que constará em $P6$.

Resolvendo $P5$ inicialmente, obtém-se $Z=36$ com $x_1=4$ e $x_2=4$. Como todas as variáveis são inteiras, é o fim deste ramo.

Resolvendo $P6$ após isso, tem-se que $Z=27$, com $x_1=5$ e $x_2=2$. Como todas as variáveis também são inteiras aqui, é o fim deste ramo.

Por fim, volta-se para resolver $P2$, obtendo $Z=18$, com $x_1=6$ e $x_2=0$. Como todas as variáveis são inteiras, já é também o fim deste ramo.

Como não sobraram mais ramos, e como a equação é de minimização, a solução ótima é a equação inteira em que $Z$ é menor; ou seja, a equação $P2$ com $Z=18$, $x_1=6$ e $x_2=0$.

![image](https://github.com/user-attachments/assets/99adf1e3-2879-4188-80df-d0fe4717d563)

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
