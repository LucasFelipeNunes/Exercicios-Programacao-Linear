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

**3.Escreva o quadro inicial do método Simplex para o seguinte modelo de PL:**

$$min\ Z=20x_1+21x_2$$

$$sujeito\ a\ (s.t.)$$

$$4x_1+3x_2\geq2$$

$$5x_1+7x_2\geq9$$

$$x_1,x_2\geq0$$

- Modificando a função para forma padrão:

$$max\ -Z=-20x_1-21x_2$$

$$sujeito\ a\ (s.t.)$$

$$4x_1+3x_2-x_3+a_1=2$$

$$5x_1+7x_2-x_4+a_2=9$$

$$x_1,x_2,a_1,a_2\geq0$$

