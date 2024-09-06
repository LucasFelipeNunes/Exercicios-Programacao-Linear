# Lista de Exercícios 3

**1. Uma fábrica produz três produtos: A, B e C. O produto A utiliza 100g de aço e 100g de plástico. O produto B utiliza 150g de aço e 200g de plástico. O produto C utiliza 200g de aço e 300g de plástico. A quantidade total de aço disponível é 20kg e a quantidade de plástico disponível é 30kg. O objetivo é produzir a maior quantidade de produtos.**

- Variáveis de decisão:

$$x_1$$: Produto A

$$x_2$$: Produto B

$$x_3$$: Produto C

- Função Objetivo:

$$Z=x_1+x_2+x_3$$

- Restrições:

$100x_1+150x_2+200x_3\leq20.000$: "O produto A utiliza 100g de aço [...] O produto B utiliza 150g de aço [...] O produto C utiliza 200g de aço [...] A quantidade total de aço disponível é 20kg [...]"

$100x_1+200x_2+300x_3\leq30.000$: "O produto A utiliza [...] 100g de plástico. [...] O produto B utiliza [...] 200g de plástico. [...] O produto C utiliza [...] 300g de plástico. [...] a quantidade de plástico disponível é 30kg."

$x_1,x_2,x_3\geq0$: restrições de não negatividade

- Modelo de Programação Linear:

$$Z=x_1+x_2+x_3$$

Sujeito a:

$$100x_1+150x_2+200x_3\leq20.000$$

$$100x_1+200x_2+300x_3\leq30.000$$

$$x_1,x_2,x_3\geq0$$

**6. Encontre a solução ótima pelo método gráfico para o modelo de PL da questão 3, mas considerando que $x_1\leq60$ e $x_2\leq80$ em vez de $x_1\geq60$ e $x_2\geq80$.**

- Identificando as restrições, e os zeros das funções "não óbvias":

$$x_1\leq60$$

$$x_2\leq80$$

$$x_1+x_2\leq100$$

- Se $x_1=0$, $x_2=100-0=100$

- Se $x_2=0$, $x_1=100-0=100$

$$3x_1+2x_2\leq240$$

- Se $x_1=0$, $x_2=\dfrac{240}2=120$

- Se $x_2=0$, $x_1=\dfrac{240}3=80$

- Chutando um valor ($48000$, pra facilitar a conta) para a função objetivo, e descobrindo a reta:

- Se $x_1=0$, $x_2=\dfrac{48000}{800}=60$

- Se $x_2=0$, $x_1=\dfrac{48000}{600}=80$

- Plotando o gráfico (restrições em azul e função objetivo em vermelho):

![image](https://github.com/user-attachments/assets/1ab47c00-9b6b-42c8-9b7f-7cb094492b65)

- Pelo gráfico, percebe-se que o ponto da solução ótima é na intersecção entre as restrições $x_1+x_2\leq100$ e $x_2=80$. Portanto, pode-se fazer o sistema de equações com elas:

$$\begin{cases}
x_1+x_2=100 \\
x_2=80
\end{cases}$$

- Se $x_2=80$, portanto:

$$x_1+x_2=100$$

$$x_1+80=100$$

$$x_1=100-80=20$$

- Portanto, a solução ótima é $Z=600\cdot20+800\cdot80=12000+64000=76000$.

**7. Encontre a solução ótima pelo método gráfico para o seguinte modelo de PL:**

$$max\ Z = 10x_1 + 8x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x_1 + 3x_2 ≤ 30$$

$$6x_1 + 3x_2 ≤ 48$$

$$x1, x2 ≥ 0$$

- Identificando os zeros das funções "não óbvias":

**Para $3x_1 + 3x_2 ≤ 30$:**

- Se $x_1=0$, $x_2=\dfrac{30}3=10$
- Se $x_2=0$, $x_1=\dfrac{30}3=10$

**Para $6x_1 + 3x_2 ≤ 48$:**

- Se $x_1=0$, $x_2=\dfrac{48}3=16$
- Se $x_2=0$, $x_1=\dfrac{48}6=8$

- Chutando um valor ($80$, pra facilitar a conta) para a função objetivo, e descobrindo a reta:
