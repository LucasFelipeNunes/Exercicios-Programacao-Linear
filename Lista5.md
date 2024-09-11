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

$$0 \ -2 & -3 \ \mid \ 0 \\\\
- 0 \ -2 \ \dfrac32 \ \mid \ 0 \\\\
0 \ 0 \ -\dfrac92 \ \mid \ 0$$

$$\begin{bmatrix}
1 & 6 & 6 & \mid & 1 \\\\
0 & 1 & -\dfrac34 & \mid & 0 \\\\
0 & 0 & -\dfrac92 & \mid & 0
\end{bmatrix}$$

$$\begin{cases}
x_1 + 6x_2 + 6x_3 = 1
x_2 - \dfrac34 x_3 = 0
-\dfrac92 x_3 = 0
\end{cases}$$

$$x_3=0$$

$$x_2 - \dfrac34 \cdot0 = 0$$

$$x_2=0$$

$$x_1 + 6\cdot0 + 6\cdot0 = 1$$

$$x_1 = 1$$

**4. Uma empresa fabrica dois tipos de produto: P1 e P2. Para a fabricação, esses produtos consomem tempo nos departamentos A e B. P1 gasta 1 hora no departamento A e 3 horas no departamento B. P2 gasta de 1 hora no departamento A e 2 horas no departamento B. A capacidade do departamento A é de 100 horas e a capacidade do departamento B é de 240 horas. A demanda por P1 é de 60 unidades e a demanda por P2 é de 80 unidades. Além disso, o preço de P1 é de $600 por unidade e o preço de P2 é de $800 por unidade. Elabore o modelo de PL para auxiliar a empresa a maximizar a receita. Resolva pelo método gráfico.**

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
