# Lista de Exercícios 3

**Aluno:** Lucas Felipe da Silva Nunes
**Turma:** 6º Semestre de Análise e Desenvolvimento de Sistemas
**Data:** 16/09/2024

**1. Sejam A2×3, B3×2, C2×2 e D3×3 matrizes m x n, em que m é o número de linhas e n o número de colunas. Quais dos seguintes produtos podem existir?**

**a. AB** Pode existir 

**b. AC** Não pode existir

**c. AD** Pode existir 

**d. BD** Não pode existir

**e. BC** Pode existir

**f. CD** Não pode existir

**2. Use a notação matricial A|b para representar o seguinte sistema linear:**

$$\begin{cases}
x_1 – 2x_2 + x_3 = 0 \\\\
2x_1 + x_2 – 3x_3 = 5 \\\\
4x_1 – 7x_2 + x_3 = –1
\end{cases}$$

$$\begin{bmatrix}
1 & -2 & 1 & \mid & 0 \\\\
2 & 1 & -3 & \mid & 5 \\\\
4 & -7 & 1 & \mid & -1
\end{bmatrix}$$

**3. Encontre a solução ótima do sistema linear abaixo:**

$$\begin{cases}
x_1 + 4x_2 + 3x_3 = 1 \\\\
x_1 + 2x_2 + 9x_3 = 1 \\\\
x_1 + 6x_2 + 6x_3 = 1
\end{cases}$$

$$\begin{bmatrix}
1 & 4 & 3 & \mid & 1 \\\\
1 & 2 & 9 & \mid & 1 \\\\
1 & 6 & 6 & \mid & 1
\end{bmatrix}$$

$$\begin{bmatrix}
1 & 6 & 6 & \mid & 1 \\\\
1 & 2 & 9 & \mid & 1 \\\\
1 & 4 & 3 & \mid & 1
\end{bmatrix}$$

$$L_2-L_1$$

$$\begin{bmatrix}
1 & 6 & 6 & \mid & 1 \\\\
0 & -4 & 3 & \mid & 0 \\\\
1 & 4 & 3 & \mid & 1
\end{bmatrix}$$

$$L_3-L_1$$

$$\begin{bmatrix}
1 & 6 & 6 & \mid & 1 \\\\
0 & -4 & 3 & \mid & 0 \\\\
0 & -2 & -3 & \mid & 0
\end{bmatrix}$$

$$\dfrac{L_2}{-4}$$

$$\begin{bmatrix}
1 & 6 & 6 & \mid & 1 \\\\
0 & 1 & -\dfrac34 & \mid & 0 \\\\
0 & -2 & -3 & \mid & 0
\end{bmatrix}$$

$$L_3-(-2)L_2$$

$$\begin{bmatrix}
1 & 6 & 6 & \mid & 1 \\\\
0 & 1 & -\dfrac34 & \mid & 0 \\\\
0 & 0 & -\dfrac92 & \mid & 0
\end{bmatrix}$$

$$\begin{cases}
x_1 + 6x_2 + 6x_3 = 1 \\\\
x_2 - \dfrac34 x_3 = 0 \\\\
-\dfrac92 x_3 = 0
\end{cases}$$

$$x_3=0$$

$$x_2 - \dfrac34 \cdot0 = 0$$

$$x_2=0$$

$$x_1 + 6\cdot0 + 6\cdot0 = 1$$

$$x_1 = 1$$

$$x=\begin{bmatrix}1 \\\\
0 \\\\
0
\end{bmatrix}$$

**4. Uma empresa fabrica dois tipos de produto: P1 e P2. Para a fabricação, esses produtos consomem tempo nos departamentos A e B. P1 gasta 1 hora no departamento A e 3 horas no departamento B. P2 gasta de 1 hora no departamento A e 2 horas no departamento B. A capacidade do departamento A é de 100 horas e a capacidade do departamento B é de 240 horas. A demanda por P1 é de 60 unidades e a demanda por P2 é de 80 unidades. Além disso, o preço de P1 é de $600 por unidade e o preço de P2 é de $800 por unidade. Elabore o modelo de PL para auxiliar a empresa a maximizar a receita. Resolva pelo método gráfico.**

**Variáveis de decisão:**

$$x_1$$: Unidades de P1 produzidas

$$x_2$$: Unidades de P2 produzidas

**Função Objetivo:** $max\ Z=600x_1+800x_2$

**Restrições:**

- $x_1\leq60$

- $x_2\leq80$

- $x_1+x_2\leq100$

- $3x_1+2x_2\leq240$

- $x_1,x_2\geq0$

**Modelo de Programação Linear:**

$$max\ Z=600x_1+800x_2$$

$$sujeito\ a\ (s.t.)$$

$$x_1\leq60$$

$$x_2\leq80$$

$$x_1+x_2\leq100$$

$$3x_1+2x_2\leq240$$

$$x_1,x_2\geq0$$

- Descobrindo os zeros das funções "não óbvias":

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

**5. Escreva o seguinte modelo de PL na forma padrão:**

$$min\ Z = 3x_1 – 5x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x_1 + 2x_2 \leq 18$$

$$x_1\leq4$$

$$x_2\leq6$$

$$x_1,x_2\geq0$$

**Resposta:**

$$max\ -Z = -3x_1 + 5x_2$$

$$sujeito\ a\ (s.t.)$$

$$3x_1 + 2x_2 + x_3 = 18$$

$$x_1+x_4=4$$

$$x_2+x_5=6$$

$$x_1,x_2,x_3,x_4,x_5\geq0$$
