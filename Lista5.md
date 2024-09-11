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

$$L_3-(-2)L_2$$
