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

**6. Encontre a solução ótima pelo método gráfico para o modelo de PL da questão 3.**

- Identificando as restrições, e os zeros das funções "não óbvias":

$$x_1\leq60$$

$$x_2\leq80$$

$$x_1+x_2\leq100$$

- Se $x_1=0$, $x_2=100-0=100$

- Se $x_2=0$, $x_1=100-0=100$

$$3x_1+2x_2\leq240$$

- Se $x_1=0$, $x_2=\dfrac{240}2=120$

- Se $x_2=0$, $x_1=\dfrac{240}3=80$

- Chutando um valor ($100000$) para a função objetivo, e descobrindo a reta:

- Se $x_1=0$, $x_2=\dfrac{100000}{800}=125$

- Se $x_2=0$, $x_1=\dfrac{100000}{600}=166,667$

- Plotando o gráfico:
