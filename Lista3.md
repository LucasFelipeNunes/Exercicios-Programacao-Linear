**1. Use a notação matricial abreviada (A|b) para representar os seguintes sistemas de equações lineares:**

a.

$$\begin{cases}x_1+x_2=4 \\\\ 2x_1+x_2=6 \\\\ x_1+3x_2=8\end{cases}$$

$$\begin{bmatrix}1 & 1 & \mid & 4 \\\\ 2 & 1 & \mid & 6 \\\\ 1 & 3 & \mid & 8\end{bmatrix}$$

b.

$$\begin{cases}2x_1+x_2+x_3=10 \\\\ -x_1+2x_2+x_3=8 \\\\ x_1-x_2+2x_3=2\end{cases}$$

$$\begin{bmatrix}2 & 1 & 1 & \mid & 10 \\\\ -1 & 2 & 1 & \mid & 8 \\\\ 1 & -1 & 2 & \mid & 2\end{bmatrix}$$

**2. Use o método Gauss-Jordan para determinar se cada um dos sistemas lineares abaixo tem solução
única, tem um número infinito de soluções ou não tem solução:**

a.

$$\begin{cases}6x_1+2x_2-x_3=7 \\\\ 2x_1+4x_2+x_3=7 \\\\ 3x_1+2x_2+8x_3=13\end{cases}$$

$$\begin{bmatrix}6 & 2 & -1 & \mid & 7 \\\\ 2 & 4 & 1 & \mid & 7 \\\\ 3 & 2 & 8 & \mid & 13\end{bmatrix}$$

- Dividindo $L_1$ por $a_{11}=6$:

$$\begin{bmatrix}1 & \frac13 & \frac{-1}6 & \mid & \frac76 \\\\ 2 & 4 & 1 & \mid & 7 \\\\ 3 & 2 & 8 & \mid & 13\end{bmatrix}$$

- Subtraindo $L_2$ por $a_{21}L_1=2L_1$

$$\begin{bmatrix}1 & \frac13 & \frac{-1}6 & \mid & \frac76 \\\\ 0 & \frac{10}3 & \frac43 & \mid & \frac{14}3 \\\\ 3 & 2 & 8 & \mid & 13\end{bmatrix}$$

- Subtraindo $L_3$ por $a_{31}L_1=3L_1$

$$\begin{bmatrix}1 & \frac13 & \frac{-1}6 & \mid & \frac76 \\\\ 0 & \frac{10}3 & \frac43 & \mid & \frac{14}3 \\\\ 0 & 1 & \frac{17}2 & \mid & \frac{19}2\end{bmatrix}$$

- Dividindo $L_2$ por $a_{22}=\frac{10}3$

$$\begin{bmatrix}1 & \frac13 & \frac{-1}6 & \mid & \frac76 \\\\ 0 & 1 & \frac25 & \mid & \frac75 \\\\ 0 & 1 & \frac{17}2 & \mid & \frac{19}2\end{bmatrix}$$

- Subtraindo $L_3$ por $a_{32}L_2=L_2$

$$\begin{bmatrix}1 & \frac13 & \frac{-1}6 & \mid & \frac76 \\\\ 0 & 1 & \frac25 & \mid & \frac75 \\\\ 0 & 0 & 8\frac{1}{10} & \mid & 8\frac1{10}\end{bmatrix}$$

- Subtraindo $L_1$ por $a_{12}L_2=\frac{L_2}3$

$$\begin{bmatrix}1 & 0 & -\frac3{10} & \mid & \frac7{10} \\\\ 0 & 1 & \frac25 & \mid & \frac75 \\\\ 0 & 0 & 8\frac{1}{10} & \mid & 8\frac1{10}\end{bmatrix}$$

- Dividindo $L_3$ por $a_{33}=8\frac1{10}$

$$\begin{bmatrix}1 & 0 & -\frac3{10} & \mid & \frac7{10} \\\\ 0 & 1 & \frac25 & \mid & \frac75 \\\\ 0 & 0 & 1 & \mid & 1\end{bmatrix}$$

- Subtraindo $L_1$ por $a_{13}L_3=-\frac{3L_3}{10}$

$$\begin{bmatrix}1 & 0 & 0 & \mid & 1 \\\\ 0 & 1 & \frac25 & \mid & \frac75 \\\\ 0 & 0 & 1 & \mid & 1\end{bmatrix}$$

- Subtraindo $L_2$ por $a_{13}L_3=-\frac{2L_3}5$

$$\begin{bmatrix}1 & 0 & 0 & \mid & 1 \\\\ 0 & 1 & 0 & \mid & 1 \\\\ 0 & 0 & 1 & \mid & 1\end{bmatrix}$$

$$x=\begin{bmatrix}1 \\\\ 1 \\\\ 1\end{bmatrix}$$

b.

c.

d.

$$\begin{cases}5x_1+7x_2+6x_3+5x_4=11 \\\\ 7x_1+10x_2+8x_3+7x_4=15 \\\\ 6x_1+8x_2+10x_3+9x_4=16 \\\\ 5x_1+7x_2+9x_3+10x_4=14\end{cases}$$

$$\begin{bmatrix}5 & 7 & 6 & 5 & \mid & 11 \\\\ 7 & 10 & 8 & 7 & \mid & 15 \\\\ 6 & 8 & 10 & 9 & \mid & 16\\\\ 5 & 7 & 9 & 10 & \mid & 14 \end{bmatrix}$$

- Dividindo $L_1$ por $a_{11}=5$
