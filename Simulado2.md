# Simulado 2

**1. Uma empresa fabrica dois tipos de produto: P1 e P2. Para a fabricação, esses produtos consomem tempo nos departamentos A e B. P1 gasta 1 hora no departamento A e 3 horas no departamento B. P2 gasta de 1 hora no departamento A e 2 horas no departamento B. A capacidade do departamento A é de 100 horas e a capacidade do departamento B é de 240 horas. A demanda por P1 é de 60 unidades e a demanda por P2 é de 80 unidades. Além disso, o preço de P1 é de $600 por unidade e o preço de P2 é de $800 por unidade. Elabore o modelo de PL para auxiliar a empresa a maximizar a receita. 2. Escreva o modelo de PL correspondente ao quadro inicial do método Simplex:**

- Identificando as variáveis de decisão

- $x_1$: Produtos P1 vendidos

- $x_2$: Produtos P2 vendidos

$$max\ Z=600x_1+800x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1+x_2\leq100$$

$$3x_1+2x_2\leq240$$

$$x_1\geq60$$

$$x_2\geq80$$

$$x_1,x_2\geq0$$

**2. Escreva o modelo de PL correspondente ao quadro inicial do método Simplex:**

| Base | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $x_5$ | $b$ |
|---|---|---|---|---|---|---|
| $x_3$ | 1 | -1 | 1 | 0 | 0 | 10 |
| $x_4$ | 1 | 1 | 0 | -1 | 0 | 7 |
| $x_5$ | 6 | 2 | 0 | 0 | -1 | 12 |
| $Z$ | -12 | 2 | 0 | 0 | 0 | 0 |

$$max\ Z=12x_1-2x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1-x_2\leq10$$

$$x_1+x_2\geq7$$

$$6x_1+2x_2\geq12$$

$$x_1,x_2\geq0$$

**3.Escreva o quadro inicial do método Simplex para o seguinte modelo de PL:**

$$min\ Z=20x_1+21x_2$$

$$sujeito\ a\ (s.t.)$$

$$4x_1+3x_2\geq2$$

$$5x_1+7x_2\geq9$$

$$x_1,x_2\geq0$$

- Modificando a função para a forma padrão:

$$max\ -Z=-20x_1-21x_2$$

$$sujeito\ a\ (s.t.)$$

$$4x_1+3x_2-x_3+a_1=2$$

$$5x_1+7x_2-x_4+a_2=9$$

$$x_1,x_2,x_3,x_4,a_1,a_2\geq0$$

- Encontrando a função auxiliar $W$:

$$min\ W=a_1+a_2=0$$

$$min\ W=(2-4x_1-3x_2+x_3)+(9-5x_1-7x_2+x_4)=0$$

$$min\ W=-9x_1-10x_2+x_3+x_4=-11$$

$$max\ W=9x_1+10x_2-x_3-x_4=11$$

| | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $a_1$ | $a_2$ | $b$ |
|---|---|---|---|---|---|---|---|
| $a_1$ | 4 | 3 | -1 | 0 | 1 | 0 | 2 |
| $a_2$ | 5 | 7 | 0 | -1 | 0 | 1 | 9 |
| $-Z$ | 20 | 21 | 0 | 0 | 0 | 0 | 0 |
| $-W$ | -9 | -10 | 1 | 1 | 0 | 0 | -11 |

**4. Resolva o seguinte modelo de PL usando o método Simplex:**

$$max\ Z=4x_1+3x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x_1+4x_2\leq12$$

$$7x_1+2x_2\leq14$$

$$x_1,x_2\geq0$$

- Colocando o modelo na forma padrão:

$$max\ Z=4x_1+3x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x_1+4x_2+x_3=12$$

$$7x_1+2x_2+x_4=14$$

$$x_1,x_2,x_3,x_4\geq0$$

- Montando o tableau:

| | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $b$ |
|---|---|---|---|---|---|
| $x_3$ | 3 | 4 | 1 | 0 | 12 |
| $x_4$ | 7 | 2 | 0 | 1 | 14 |
| $-Z$ | -4 | -3 | 0 | 0 | 0 |

- A solução inicial é $Z^*=0$, com $x=(0,0,12,14)$. Ainda há coeficientes negativos em $-Z$. Calculando os coeficientes $\theta$, identificando o menor e substituindo por $x_1$:

| | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $b$ | $\theta$ |
|---|---|---|---|---|---|---|
| $x_3$ | 3 | 4 | 1 | 0 | 12 | $\dfrac{12}3=4$ |
| $x_1$ | 7 | 2 | 0 | 1 | 14 | $\dfrac{14}7=2$ |
| $-Z$ | -4 | -3 | 0 | 0 | 0 | $-$ |

- Igualando o pivô a $1$ e os outros membros da coluna a $0$, por Gauss-Jordan:

| | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $b$ |
|---|---|---|---|---|---|
| $x_3$ | 0 | $\dfrac{22}7$ | 1 | $-\dfrac37$ | 6 |
| $x_1$ | 1 | $\dfrac27$ | 0 | $\dfrac17$ | 2 |
| $-Z$ | 0 | $-\dfrac{13}7$ | 0 | $\dfrac47$ | 8 |

- A solução viável agora é $Z^*=8$, com $x=(2,0,6,0)$. Ainda há coeficientes negativos em $-Z$. Substituindo $x_3$ por $x_2$, já que é a única com coeficiente $\theta$, e fazendo Gauss-Jordan na coluna $x_2$:

| | $x_1$ | $x_2$ | $x_3$ | $x_4$ | $b$ |
|---|---|---|---|---|---|
| $x_2$ | 0 | 1 | $\dfrac7{22}$ | $-\dfrac3{22}$ | $\dfrac{21}{11}$ |
| $x_1$ | 1 | 0 | $-\dfrac1{11}$ | $\dfrac2{11}$ | $\dfrac{16}{11}$ |
| $-Z$ | 0 | 0 | $\dfrac{13}{22}$ | $\dfrac{7}{22}$ | $\dfrac{127}{11}$ |

- Portanto, a solução ótima é $Z^*=\dfrac{127}{11}$, com $x=\left(\dfrac{16}{11},\dfrac{21}{11},0,0\right)$.
