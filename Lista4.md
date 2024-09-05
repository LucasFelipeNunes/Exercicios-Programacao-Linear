# Lista de Exercícios 4

**1. Uma indústria farmacêutica produz dois medicamentos: analgésico e antibiótico. Os medicamentos dependem de duas matérias-primas A e B, disponíveis em estoque nas seguintes quantidades 8 e 5 ton., respectivamente. Para produzir 1 ton. de analgésico são usadas 1 ton. de A e 1 ton. de B. Na produção de 1 ton. de antibiótico são usadas 4 ton. de A e 1 ton. de B. Cada tonelada de antibiótico é vendida a $8 e de analgésico a $5. Formule o modelo de PL para a indústria saber quantidade (ton.) de medicamento que deve ser produzida para maximizar a receita.**

- Descubrindo as variáveis de decisão:

- $x_1$: quantidade de analgésico

- $x_2$: quantidade de antibiótico

- Formulando a função objetivo: $max Z=5x_1+8x_2$

- Identificando as restrições:

$$x_1+4x_2\leq8$$

$$x_1+x_2\leq5$$

$$x_1,x_2\geq0$$

- Portanto, o modelo de PL fica:

$$max\ Z=5x_1+8x_2$$

$$sujeito\ a\ (s.t.):$$

$$x_1+4x_2\leq8$$

$$x_1+x_2\leq5$$

$$x_1,x_2\geq0$$

**2. Um jovem universitário está saindo com duas meninas Ana Paula e Sheila. Ele sabe, por experiência, que:**

- **Ana Paula, elegante, gosta de frequentar lugares sofisticados, mais caros, de modo que uma saída de três horas, custa $240;**

- **Sheila, mais simples, prefere divertimento mais popular, de modo que uma saída de três horas lhe custará $160;**

- **Seu orçamento mensal é $960;**

- **Ele tem, no máximo, 18 horas e 40000 calorias por mês para as atividades sociais;**

- **Cada saída com Sheila consome 5000 cal., mas com Ana Paula, ele gasta o dobro;**

- **Ele gosta das duas com a mesma intensidade.**

**Formule o modelo de PL para ajudar o jovem a planejar sua vida social com o objetivo de obter o máximo de saídas.**

- Descubrindo as variáveis de decisão:

- $x_1$: Quantidade de saídas com Ana Paula

- $x_2$: Quantidade de saídas com Sheila

- Montando a função objetivo: $max\ Z=x_1+x_2$

- Identificando as restrições:

- $R_1$: $3x_1+3x_2\leq18$

- $R_2$: $5000x_1+10000x_2\leq40000$

- $R_3$: $240x_1+160x_2\leq960$

- $R_4$: $x_1\geq0$

- $R_5$: $x_2\geq0$

- Portanto, o modelo de PL fica:

$$max\ Z=x_1+x_2$$

$$sujeito\ a\ (s.t.):$$

$$3x_1+3x_2\leq1$$

$$5000x_1+10000x_2\leq40000$$

$$240x_1+160x_2\leq960$$

$$x_1,x_2\geq0$$

**3. Encontre a solução ótima pelo método gráfico para o seguinte modelo de PL:**

a. 

$$max\ Z = 5x_1 + 3x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x_1 + 5x_2 ≤ 15$$

$$5x_1 + 2x_2 ≥ 10$$

$$x_1, x_2 ≥ 0$$

- Descubrindo os zeros das funções "não óbvias" das restrições:

**Para R1:**

- Se $x_1=0$, $x_2=\dfrac{15}5=3$
- Se $x_2=0$, $x_1=\dfrac{15}3=5$

**Para R2:**

- Se $x_1=0$, $x_2=\dfrac{10}2=5$
- Se $x_2=0$, $x_1=\dfrac{10}5=2$

- Atribuindo um valor aleatório ($15$) a Z e descubrindo os zeros da função objetivo:

- Se $x_1=0$, $x_2=\dfrac{15}3=5$
- Se $x_2=0$, $x_1=\dfrac{15}5=3$

- Plotando o gráfico:

![image](https://github.com/user-attachments/assets/44aca8c2-ae33-41ed-8870-81fee42c2c38)

Pode-se perceber que o ponto da solução ótima está na intersecção entre as equações $3x_1 + 5x_2 ≤ 15$ e $x_1\geq0$. Resolvendo o sistema entre elas:

$$\begin{cases}
3x_1 + 5x_2 = 15 \\
x_2 = 0
\end{cases}$$

$$3x_1 + 5\cdot0 = 15$$

$$3x_1 = 15$$

$$x_2 = \dfrac{15}3=5$$

- Portanto, $Z=5\cdot5 + 3\cdot0=25$

b. 

$$max\ Z = 6x_1 + 10x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x_1 + 5x_2 ≤ 15$$

$$5x_1 + 2x_2 \leq 10$$

$$x_1, x_2 ≥ 0$$

- Descubrindo os zeros das funções "não óbvias" das restrições:

**Para R1:**

- Se $x_1=0$, $x_2=\dfrac{15}5=3$
- Se $x_2=0$, $x_1=\dfrac{15}3=5$

**Para R2:**

- Se $x_1=0$, $x_2=\dfrac{10}2=5$
- Se $x_2=0$, $x_1=\dfrac{10}5=2$

- Atribuindo um valor aleatório ($30$) a Z e descubrindo os zeros da função objetivo:

- Se $x_1=0$, $x_2=\dfrac{30}10=3$
- Se $x_2=0$, $x_1=\dfrac{30}6=5$

- Plotando o gráfico:

![image](https://github.com/user-attachments/assets/65631baa-7e5c-40c7-bc3a-ce8824ee8b44)

Percebe-se que existem infinitas soluções ótimas, já que todos os pontos da reta da restrição $3x_1 + 5x_2 ≤ 15$ que estejam entre as restrições $x_1\geq0$ e $5x_1 + 2x_2 \leq 10$ são soluções ótimas válidas.

c. 

$$max Z = 2x_1 + 2x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1 – x_2 ≥ 1$$

$$-\dfrac12x_1 + x_2 ≤ 2$$

$$x_1, x_2 ≥ 0$$

- Descubrindo os zeros das funções "não óbvias" das restrições:

**Para R1:**

- Se $x_1=0$, $x_2=\dfrac1{-1}=-1$
- Se $x_2=0$, $x_1=1$

**Para R2:**

- Se $x_1=0$, $x_2=2$
- Se $x_2=0$, $x_1=2\cdot2=4$

- Atribuindo um valor aleatório ($2$) a Z e descubrindo os zeros da função objetivo:

- Se $x_1=0$, $x_2=\dfrac22=1$
- Se $x_2=0$, $x_1=\dfrac22=1$

- Plotando o gráfico: **TERMINAR**

d.

$$min\ Z = x_1 + 2x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1 + x_2 ≥ 3$$

$$2x_1 + x_2 ≤ 2$$

$$x_1, x_2 ≥ 0$$

- Descubrindo os zeros das funções "não óbvias" das restrições:

**Para R1:**

- Se $x_1=0$, $x_2=3$
- Se $x_2=0$, $x_1=1$

**Para R2:**

- Se $x_1=0$, $x_2=2$
- Se $x_2=0$, $x_1=\dfrac22=1$

- Atribuindo um valor aleatório ($2$) a Z e descubrindo os zeros da função objetivo:

- Se $x_1=0$, $x_2=\dfrac22=1$
- Se $x_2=0$, $x_1=2$

- Plotando o gráfico: **TERMINAR**

e.

$$min\ Z = 2x_1 + 3x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1 + x_2 ≥ 5$$

$$5x_1 + x_2 ≥ 10$$

$$x_1 ≤ 8$$

$$x_1, x_2 ≥ 0$$

- Descubrindo os zeros das funções "não óbvias" das restrições:

**Para R1:**

- Se $x_1=0$, $x_2=5$
- Se $x_2=0$, $x_1=5$

**Para R2:**

- Se $x_1=0$, $x_2=10$
- Se $x_2=0$, $x_1=\dfrac{10}5=2$

- Atribuindo um valor aleatório ($6$) a Z e descubrindo os zeros da função objetivo:

- Se $x_1=0$, $x_2=\dfrac63=2$
- Se $x_2=0$, $x_1=\dfrac62=3$

- Plotando o gráfico: **TERMINAR**
