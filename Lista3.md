# Lista de Exercícios 3

**1. Uma fábrica produz três produtos: A, B e C. O produto A utiliza 100g de aço e 100g de plástico. O produto B utiliza 150g de aço e 200g de plástico. O produto C utiliza 200g de aço e 300g de plástico. A quantidade total de aço disponível é 20kg e a quantidade de plástico disponível é 30kg. O objetivo é produzir a maior quantidade de produtos.**

**Variáveis de decisão:**

$$x_1$$: Produto A

$$x_2$$: Produto B

$$x_3$$: Produto C

**Função Objetivo:**

$$Z=x_1+x_2+x_3$$

**Restrições:**

$100x_1+150x_2+200x_3\leq20.000$: "O produto A utiliza 100g de aço [...] O produto B utiliza 150g de aço [...] O produto C utiliza 200g de aço [...] A quantidade total de aço disponível é 20kg [...]"

$100x_1+200x_2+300x_3\leq30.000$: "O produto A utiliza [...] 100g de plástico. [...] O produto B utiliza [...] 200g de plástico. [...] O produto C utiliza [...] 300g de plástico. [...] a quantidade de plástico disponível é 30kg."

$x_1,x_2,x_3\geq0$: restrições de não negatividade

**Modelo de Programação Linear:**

$$max \ Z=x_1+x_2+x_3$$

$$sujeito\ a\ (s.t.)$$

$$100x_1+150x_2+200x_3\leq20.000$$

$$100x_1+200x_2+300x_3\leq30.000$$

$$x_1,x_2,x_3\geq0$$

**2. Uma escola pública procura uma dieta especial que forneça as quantidades mínimas diárias das vitaminas A, B e C (45 ml de vitamina A, 64 ml de vitamina B e 45 ml de vitamina C) a seus alunos ao menor custo possível. A escola conclui que poderia alcançar seu objetivo incluindo no lanche das crianças laranjas e maçãs. Em uma pesquisa nos atacadistas, a escola consegue comprar 1 kg de laranja por $0,45. Esse quilo de laranja fornece 3 ml de vitamina A, 8 ml de vitamina B e 15 ml de vitamina C, segundo a nutricionista da escola. Cada quilo de maçã custa $0,55 e fornece 15 ml de vitamina A, 8 ml de vitamina B e 9 ml de vitamina C. A meta da escola é determinar quantos quilos de cada fruta devem ser utilizados diariamente de modo a minimizar o custo total.**

**Variáveis de decisão:**

$$x_1$$: Massa, em quilos, de laranja comprada

$$x_2$$: Massa, em quilos, de maçã comprada

**Função Objetivo:** $min\ Z=0,45x_1+0,55x_2$

**Restrições:**

- $3x_1+15x_2\geq45$

- $8x_1+8x_2\geq64$

- $15x_1+9x_2\geq45$

- $x_1,x_2\geq0$

**Modelo de Programação Linear:**

$$min \ Z=0,45x_1+0,55x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x_1+15x_2\geq45$$

$$8x_1+8x_2\geq64$$

$$15x_1+9x_2\geq45$$

$$x_1,x_2\geq0$$

**3. Uma empresa fabrica dois produtos: P1 e P2. Para a fabricação, esses produtos consomem tempo nos departamentos A e B. P1 gasta 1 hora no departamento A e 3 horas no departamento B. P2 gasta de 1 hora no departamento A e 2 horas no departamento B. A capacidade do departamento A é de 100 horas e a capacidade do departamento B é de 240 horas. A demanda por P1 é de 60 unidades e a demanda por P2 é de 80 unidades. Além disso, o preço de P1 é de $600 por unidade e o preço de P2 é de $800 por unidade. O objetivo é maximizar a receita.**

**Variáveis de decisão:**

$$x_1$$: Unidades de P1 produzidas

$$x_2$$: Unidades de P2 produzidas

**Função Objetivo:** $max\ Z=600x_1+800x_2$

**Restrições:**

- $x_1\geq60$

- $x_2\geq80$

- $x_1+x_2\leq100$

- $3x_1+2x_2\leq240$

- $x_1,x_2\geq0$

**Modelo de Programação Linear:**

$$max\ Z=600x_1+800x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1\geq60$$

$$x_2\geq80$$

$$x_1+x_2\leq100$$

$$3x_1+2x_2\leq240$$

$$x_1,x_2\geq0$$

**4. Uma escola pretende comprar doces (balas e pirulitos) para distribuir aos alunos. Cada bala custa $0,05 e cada pirulito custa $0,15. A verba disponível para a compra de doces é $1500. Além disso, o fornecedor disse que pode fornecer no máximo 24000 balas. Quantas balas e quantos pirulitos devem ser adquiridos? O objetivo é maximizar a quantidade de doces.**

**Variáveis de decisão:**

$$x_1$$: Quantidade de balas

$$x_2$$: Quantidade de pirulitos

**Função Objetivo:** $max\ Z=x_1+x_2$

**Restrições:**

- $0,05x_1+0,45x_2\leq1500$

- $x_1\leq24000$

- $x_1,x_2\geq0$

**Modelo de Programação Linear:**

$$max\ Z=x_1+x_2$$

$$sujeito\ a\ (s.t.)$$

$$0,05x_1+0,45x_2\leq150$$

$$x_1\leq24000$$

$$x_1,x_2\geq0$$

**5. Uma locadora aluga dois tipos de carros: econômico e luxo. O lucro mensal de um carro econômico é $5000 e de um carro de luxo é $8000. Tem apenas 10 vagas na garagem da locadora e é necessário ter, ao menos, três carros de cada tipo na garagem. O objetivo é maximizar o lucro mensal.**

**Variáveis de decisão:**

$$x_1$$: Unidades de carro econômico

$$x_2$$: Unidades de carro de luxo

**Função Objetivo:** $max\ Z=5000x_1+8000x_2$

**Restrições:**

- $x_1\geq3$

- $x_2\geq3$

- $x_1+x_2\leq10$

- $x_1,x_2\geq0$

**Modelo de Programação Linear:**

$$max\ Z=5000x_1+8000x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1\geq3$$

$$x_2\geq3$$

$$x_1+x_2\leq10$$

$$x_1,x_2\geq0$$

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

- Se $x_1=0$, $x_2=\dfrac{80}8=10$
- Se $x_2=0$, $x_1=\dfrac{80}{10}=8$

- Plotando o gráfico (restrições em azul e função objetivo em vermelho):

![image](https://github.com/user-attachments/assets/d779fdb2-4509-48f1-b1a6-aabeb470fcd9)

Pelo gráfico, infere-se que a solução ótima será a da intersecção entre as restrições $6x_1 + 3x_2 \leq 48$ e $3x_1+3x_2\leq30$. Fazendo um sistema com essas equações:

$$\begin{cases}
6x_1 + 3x_2 = 48\\
3x_1+3x_2=30
\end{cases}$$

$$3(x_1+x_2)=30$$

$$x_1+x_2=\dfrac{30}3$$

$$x_2=10-x_1$$

$$6x_1 + 3(10-x_1) = 48$$

$$6x_1 + 30-3x_1 = 48$$

$$3x_1 = 48-30$$

$$x_1 =\dfrac{18}3=6$$

$$x_2=10-x_1=10-6=4$$

- Portanto, $Z=10\cdot6+8\cdot4=60+32=92$
