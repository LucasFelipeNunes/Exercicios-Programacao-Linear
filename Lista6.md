# Exercícios de Simplex

**1.**

$$max\ Z=300x_1+400x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1+x_2\leq50$$

$$3x_1+2x_2\leq120$$

$$x_1\leq30$$

$$x_2\leq40$$

$$x_1,x_2\geq0$$

- Transformando na forma padrão:

$$max\ Z=300x_1+400x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1+x_2+x_3=50$$

$$3x_1+2x_2+x_4=120$$

$$x_1+x_5=30$$

$$x_2+x_6=40$$

$$x_1,x_2,x_3,x_4,x_5,x_6\geq0$$

- Colocando no tableau:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_3$ | 1 | 1 | 1 | 0 | 0 | 0 | 50 |
| $x_4$ | 3 | 2 | 0 | 1 | 0 | 0 | 120 |
| $x_5$ | 1 | 0 | 0 | 0 | 1 | 0 | 30 |
| $x_6$ | 0 | 1 | 0 | 0 | 0 | 1 | 40 |
| $Z$ | -300 | -400 | 0 | 0 | 0 | 0 | 0 |

- A solução viável neste caso é $Z^*=0$, com $x=(0;0;50;120;30;40)$. Ainda há coeficientes negativos. Encontrando o valor mais negativo, calculando o $\theta$ e colocando $x_2$ na devida posição:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ | $\theta$ |
|---|---|---|---|---|---|---|---|---|
| $x_3$ | 1 | 1 | 1 | 0 | 0 | 0 | 50 | $\dfrac{50}{1}=50$ |
| $x_4$ | 3 | 2 | 0 | 1 | 0 | 0 | 120 | $\dfrac{120}{2}=60$ |
| $x_5$ | 1 | 0 | 0 | 0 | 1 | 0 | 30 | $\dfrac{30}{0}=-$ |
| $x_2$ | 0 | 1 | 0 | 0 | 0 | 1 | 40 | $\dfrac{40}1=40$ |
| $Z$ | -300 | -400 | 0 | 0 | 0 | 0 | 0 | $-$ |

- Transformando o pivô em 1 e os valores abaixo dele em 0:

- Subtraindo $L_{x_3}$ por $L_{x_2}$

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_3$ | 1 | 0 | 1 | 0 | 0 | -1 | 10 |
| $x_4$ | 3 | 2 | 0 | 1 | 0 | 0 | 120 |
| $x_5$ | 1 | 0 | 0 | 0 | 1 | 0 | 30 |
| $x_2$ | 0 | 1 | 0 | 0 | 0 | 1 | 40 |
| $Z$ | -300 | -400 | 0 | 0 | 0 | 0 | 0 |

- Subtraindo $L_{x_4}$ por $2L_{x_2}$

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_3$ | 1 | 0 | 1 | 0 | 0 | -1 | 10 |
| $x_4$ | 3 | 0 | 0 | 1 | 0 | -2 | 40 |
| $x_5$ | 1 | 0 | 0 | 0 | 1 | 0 | 30 |
| $x_2$ | 0 | 1 | 0 | 0 | 0 | 1 | 40 |
| $Z$ | -300 | -400 | 0 | 0 | 0 | 0 | 0 |

- Subtraindo $L_{Z}$ por $-400L_{x_2}$

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_3$ | 1 | 0 | 1 | 0 | 0 | -1 | 10 |
| $x_4$ | 3 | 0 | 0 | 1 | 0 | -2 | 40 |
| $x_5$ | 1 | 0 | 0 | 0 | 1 | 0 | 30 |
| $x_2$ | 0 | 1 | 0 | 0 | 0 | 1 | 40 |
| $Z$ | -300 | 0 | 0 | 0 | 0 | 0 | 16000 |

- A solução viável neste caso é $Z^*=16000$, com $x=(0;40;10;40;30;0)$. Ainda há coeficientes negativos. Encontrando o valor mais negativo, calculando o $\theta$ e colocando $x_1$ na devida posição:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ | $\theta$ |
|---|---|---|---|---|---|---|---|---|
| $x_1$ | 1 | 0 | 1 | 0 | 0 | -1 | 10 | $\dfrac{10}1=10$ |
| $x_4$ | 3 | 0 | 0 | 1 | 0 | -2 | 40 | $\dfrac{40}3=13,333...$ |
| $x_5$ | 1 | 0 | 0 | 0 | 1 | 0 | 30 | $\dfrac{30}1=30$ |
| $x_2$ | 0 | 1 | 0 | 0 | 0 | 1 | 40 | $\dfrac{40}0=-$ |
| $Z$ | -300 | 0 | 0 | 0 | 0 | 0 | 16000 | - |

- Transformando o pivô em 1 e os valores abaixo dele em 0:

- Subtraindo $L_{x_4}$ por $3L_{x_1}$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_1$ | 1 | 0 | 1 | 0 | 0 | -1 | 10 |
| $x_4$ | 0 | 0 | -3 | 1 | 0 | 1 | 10 |
| $x_5$ | 1 | 0 | 0 | 0 | 1 | 0 | 30 |
| $x_2$ | 0 | 1 | 0 | 0 | 0 | 1 | 40 |
| $Z$ | -300 | 0 | 0 | 0 | 0 | 0 | 16000 |

- Subtraindo $L_{x_5}$ por $L_{x_1}$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_1$ | 1 | 0 | 1 | 0 | 0 | -1 | 10 |
| $x_4$ | 0 | 0 | -3 | 1 | 0 | 1 | 10 |
| $x_5$ | 0 | 0 | -1 | 0 | 1 | 1 | 20 |
| $x_2$ | 0 | 1 | 0 | 0 | 0 | 1 | 40 |
| $Z$ | -300 | 0 | 0 | 0 | 0 | 0 | 16000 |

- Subtraindo $L_{Z}$ por $-300L_{x_1}$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_1$ | 1 | 0 | 1 | 0 | 0 | -1 | 10 |
| $x_4$ | 0 | 0 | -3 | 1 | 0 | 1 | 10 |
| $x_5$ | 0 | 0 | -1 | 0 | 1 | 1 | 20 |
| $x_2$ | 0 | 1 | 0 | 0 | 0 | 1 | 40 |
| $Z$ | 0 | 0 | 300 | 0 | 0 | 0 | 19000 |

Portanto, a solução ótima é $Z=19000$, para $x=(10;40;0;10;20;0)$.

**2.**

$$max\ Z=x_1+2x_2+3x_3$$

$$sujeito\ a\ (s.t.)$$

$$x_1+x_2+x_3\leq60$$

$$x_1+2x_2+2x_3\leq110$$

$$x_1+x_2+2x_3\leq90$$

$$x_1,x_2,x_3\geq0$$

- Transformando na forma padrão:

$$max\ Z=x_1+2x_2+3x_3$$

$$sujeito\ a\ (s.t.)$$

$$x_1+x_2+x_3+x_4=60$$

$$x_1+2x_2+2x_3+x_5=110$$

$$x_1+x_2+2x_3+x_6=90$$

$$x_1,x_2,x_3,x_4,x_5,x_6\geq0$$

- Montando o tableau:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_4$ | 1 | 1 | 1 | 1 | 0 | 0 | 60 |
| $x_5$ | 1 | 2 | 2 | 0 | 1 | 0 | 110 |
| $x_6$ | 1 | 1 | 2 | 0 | 0 | 1 | 90 |
| $Z$ | -1 | -2 | -3 | 0 | 0 | 0 | 0 |

- A primeira solução viável é $Z^*=0$, com $x=(0;0;0;60;110;90)$. Ainda há coeficientes negativos. Encontrando o valor mais negativo, calculando o $\theta$ e colocando $x_3$ na devida posição:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ | $\theta$ |
|---|---|---|---|---|---|---|---|---|
| $x_4$ | 1 | 1 | 1 | 1 | 0 | 0 | 60 | $\dfrac{60}1=60$ |
| $x_5$ | 1 | 2 | 2 | 0 | 1 | 0 | 110 | $\dfrac{110}2=55$ |
| $x_3$ | 1 | 1 | 2 | 0 | 0 | 1 | 90 | $\dfrac{90}2=45$ |
| $Z$ | -1 | -2 | -3 | 0 | 0 | 0 | 0 | $-$ |

- Transformando o pivô em 1 e os valores abaixo dele em 0:

- Dividindo $L_{x_3}$ por $2$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_4$ | 1 | 1 | 1 | 1 | 0 | 0 | 60 |
| $x_5$ | 1 | 2 | 2 | 0 | 1 | 0 | 110 |
| $x_3$ | $\dfrac12$ | $\dfrac12$ | 1 | 0 | 0 | $\dfrac12$ | 45 |
| $Z$ | -1 | -2 | -3 | 0 | 0 | 0 | 0 |

- Subtraindo $L_{x_4}$ por $L_{x_3}$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_4$ | $\dfrac12$ | $\dfrac12$ | 0 | 1 | 0 | $-\dfrac12$ | 15 |
| $x_5$ | 1 | 2 | 2 | 0 | 1 | 0 | 110 |
| $x_3$ | $\dfrac12$ | $\dfrac12$ | 1 | 0 | 0 | $\dfrac12$ | 45 |
| $Z$ | -1 | -2 | -3 | 0 | 0 | 0 | 0 |

- Subtraindo $L_{x_5}$ por $2L_{x_3}$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_4$ | $\dfrac12$ | $\dfrac12$ | 0 | 1 | 0 | $-\dfrac12$ | 15 |
| $x_5$ | 0 | 1 | 0 | 0 | 1 | -1 | 20 |
| $x_3$ | $\dfrac12$ | $\dfrac12$ | 1 | 0 | 0 | $\dfrac12$ | 45 |
| $Z$ | -1 | -2 | -3 | 0 | 0 | 0 | 0 |

- Subtraindo $L_{Z}$ por $-3L_{x_3}$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_4$ | $\dfrac12$ | $\dfrac12$ | 0 | 1 | 0 | $-\dfrac12$ | 15 |
| $x_5$ | 0 | 1 | 0 | 0 | 1 | -1 | 20 |
| $x_3$ | $\dfrac12$ | $\dfrac12$ | 1 | 0 | 0 | $\dfrac12$ | 45 |
| $Z$ | $\dfrac12$ | $-\dfrac12$ | 0 | 0 | 0 | $\dfrac32$ | 135 |

- A segunda solução viável é $Z^*=135$, com $x=(0;0;45;15;25;0)$. Ainda há coeficientes negativos. Encontrando o valor mais negativo, calculando o $\theta$ e colocando $x_2$ na devida posição:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ | $\theta$ |
|---|---|---|---|---|---|---|---|---|
| $x_4$ | $\dfrac12$ | $\dfrac12$ | 0 | 1 | 0 | $-\dfrac12$ | 15 | $\dfrac{15}{\dfrac12}=15\cdot2=30$ |
| $x_2$ | 0 | 1 | 0 | 0 | 1 | -1 | 20 | $\dfrac{20}1=20$ |
| $x_3$ | $\dfrac12$ | $\dfrac12$ | 1 | 0 | 0 | $\dfrac12$ | 45 | $\dfrac{45}{\dfrac12}=45\cdot2=90$ |
| $Z$ | $\dfrac12$ | $-\dfrac12$ | 0 | 0 | 0 | $\dfrac32$ | 135 | $-$ |

- Transformando o pivô em 1 e os valores abaixo dele em 0:

- Subtraindo $L_{x_4}$ por $\dfrac{L_{x_2}}2$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_4$ | $\dfrac12$ | 0 | 0 | 1 | $-\dfrac12$ | 0 | 5 |
| $x_2$ | 0 | 1 | 0 | 0 | 1 | -1 | 20 |
| $x_3$ | $\dfrac12$ | $\dfrac12$ | 1 | 0 | 0 | $\dfrac12$ | 45 |
| $Z$ | $\dfrac12$ | $-\dfrac12$ | 0 | 0 | 0 | $\dfrac32$ | 135 |

- Subtraindo $L_{x_3}$ por $\dfrac{L_{x_2}}2$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_4$ | $\dfrac12$ | 0 | 0 | 1 | $-\dfrac12$ | 0 | 5 |
| $x_2$ | 0 | 1 | 0 | 0 | 1 | -1 | 20 |
| $x_3$ | $\dfrac12$ | 0 | 1 | 0 | $-\dfrac12$ | 1 | 35 |
| $Z$ | $\dfrac12$ | $-\dfrac12$ | 0 | 0 | 0 | $\dfrac32$ | 135 |

- Subtraindo $L_{Z}$ por $-\dfrac{L_{x_2}}2$:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $x_6$ | $b$ |
|---|---|---|---|---|---|---|---|
| $x_4$ | $\dfrac12$ | 0 | 0 | 1 | $-\dfrac12$ | 0 | 5 |
| $x_2$ | 0 | 1 | 0 | 0 | 1 | -1 | 20 |
| $x_3$ | $\dfrac12$ | 0 | 1 | 0 | $-\dfrac12$ | 1 | 35 |
| $Z$ | $\dfrac12$ | 0 | 0 | 0 | $\dfrac12$ | 1 | 145 |

- A terceira solução viável é $Z^*=145$, com $x=(0;20;35;5;0;0)$. Não há mais coeficientes negativos em $L_{Z}$; portanto, esta solução é ótima.

**3.**

$$min\ Z=3x_1-5x_2$$

$$(s.t.)$$

$$3x_1+2x_2\leq18$$

$$x_1\leq4$$

$$x_2\leq6$$

$$x_i\geq0,para\ i=1,...,5$$

- Transformando na forma padrão:

$$max\ -Z=-3x_1+5x_2$$

$$(s.t.)$$

$$3x_1+2x_2+x_3=18$$

$$x_1+x_4=4$$

$$x_2+x_5=6$$

$$x_i\geq0,para\ i=1,...,5$$

- Montando o tableau:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $b$ |
|---|---|---|---|---|---|---|
| $x_3$ | 3 | 2 | 1 | 0 | 0 | 18 |
| $x_4$ | 1 | 0 | 0 | 1 | 0 | 4 |
| $x_5$ | 0 | 1 | 0 | 0 | 1 | 6 |
| $Z$ | 3 | -5 | 0 | 0 | 0 | 0 |

- A primeira solução viável é $Z^*=0$, com $x=(0;0;18;4;6;0)$. Ainda há coeficientes negativos. Encontrando o valor mais negativo, calculando o $\theta$ e colocando $x_2$ na devida posição:

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $b$ | $\theta$ |
|---|---|---|---|---|---|---|---|
| $x_3$ | 3 | 2 | 1 | 0 | 0 | 18 | $\dfrac{18}2=9$ |
| $x_4$ | 1 | 0 | 0 | 1 | 0 | 4 | $\dfrac40=-$ |
| $x_2$ | 0 | 1 | 0 | 0 | 1 | 6 | $\dfrac61=6$ |
| $Z$ | 3 | -5 | 0 | 0 | 0 | 0 | $-$ |

