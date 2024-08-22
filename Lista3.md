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

$$\begin{cases}2x_1+2x_2+4x_3=10 \\\\ x_1+x_2+3x_3=9 \\\\ x_1+3x_2+4x_3=17\end{cases}$$

$$\begin{bmatrix}
2 & 2 & 4 & \mid & 10 \\\\ 
1 & 1 & 3 & \mid & 9 \\\\ 
1 & 3 & 4 & \mid & 17\\\\
\end{bmatrix}$$

- Dividindo $L_1$ por $a_{11}=2$:

$$\begin{bmatrix}
1 & 1 & 2 & \mid & 5 \\\\ 
1 & 1 & 3 & \mid & 9 \\\\ 
1 & 3 & 4 & \mid & 17\\\\
\end{bmatrix}$$

- Subtraindo $L_2$ por $a_{21}L_1=L_1$:

$$\begin{bmatrix}
1 & 1 & 2 & \mid & 5 \\\\ 
0 & 0 & 1 & \mid & 4 \\\\ 
1 & 3 & 4 & \mid & 17\\\\
\end{bmatrix}$$

- Subtraindo $L_3$ por $a_{31}L_1=L_1$:

$$\begin{bmatrix}
1 & 1 & 2 & \mid & 5 \\\\ 
0 & 0 & 1 & \mid & 4 \\\\ 
0 & 2 & 2 & \mid & 12\\\\
\end{bmatrix}$$

- Trocando $L_2$ e $L_3$:

$$\begin{bmatrix}
1 & 1 & 2 & \mid & 5 \\\\ 
0 & 2 & 2 & \mid & 12\\\\
0 & 0 & 1 & \mid & 4 \\\\ 
\end{bmatrix}$$

- Dividindo a nova $L_2$ por $a_{22}=2$:

$$\begin{bmatrix}
1 & 1 & 2 & \mid & 5 \\\\ 
0 & 1 & 1 & \mid & 6\\\\
0 & 0 & 1 & \mid & 4 \\\\ 
\end{bmatrix}$$

- Subtraindo $L_1$ por $a_{12}L_2=L_2$

$$\begin{bmatrix}
1 & 0 & 1 & \mid & -1\\\\ 
0 & 1 & 1 & \mid & 6\\\\
0 & 0 & 1 & \mid & 4 \\\\ 
\end{bmatrix}$$

- Subtraindo $L_1$ por $a_{13}L_3=L_3$

$$\begin{bmatrix}
1 & 0 & 0 & \mid & -5 \\\\ 
0 & 1 & 1 & \mid & 6\\\\
0 & 0 & 1 & \mid & 4 \\\\ 
\end{bmatrix}$$

- Subtraindo $L_2$ por $a_{23}L_3=L_3$

$$\begin{bmatrix}
1 & 0 & 0 & \mid & -5 \\\\ 
0 & 1 & 0 & \mid & 2\\\\
0 & 0 & 1 & \mid & 4 \\\\ 
\end{bmatrix}$$

$$x=\begin{bmatrix}-5 \\\\ 2 \\\\ 4\end{bmatrix}$$

c.




d.

$$\begin{cases}5x_1+7x_2+6x_3+5x_4=11 \\\\ 7x_1+10x_2+8x_3+7x_4=15 \\\\ 6x_1+8x_2+10x_3+9x_4=17 \\\\ 5x_1+7x_2+9x_3+10x_4=14\end{cases}$$

$$\begin{bmatrix}5 & 7 & 6 & 5 & \mid & 11 \\\\ 7 & 10 & 8 & 7 & \mid & 15 \\\\ 6 & 8 & 10 & 9 & \mid & 17\\\\ 5 & 7 & 9 & 10 & \mid & 14 \end{bmatrix}$$

- Dividindo $L_1$ por $a_{11}=5$

$$\begin{bmatrix}
1 & \frac75 & \frac65 & 1 & \mid & \frac{11}5 \\\\ 
7 & 10 & 8 & 7 & \mid & 15 \\\\ 
6 & 8 & 10 & 9 & \mid & 17\\\\
5 & 7 & 9 & 10 & \mid & 14 \end{bmatrix}$$

- Subtraindo $L_2$ por $a_{21}L_1=7L_1$

$$\begin{bmatrix}
1 & \frac75 & \frac65 & 1 & \mid & \frac{11}5 \\\\ 
0 & \frac15 & -\frac25 & 0 & \mid & -\frac25 \\\\ 
6 & 8 & 10 & 9 & \mid & 17\\\\ 
5 & 7 & 9 & 10 & \mid & 14 
\end{bmatrix}$$

- Subtraindo $L_3$ por $a_{31}L_1=6L_1$

$$\begin{bmatrix}
1 & \frac75 & \frac65 & 1 & \mid & \frac{11}5 \\\\ 
0 & \frac15 & -\frac25 & 0 & \mid & -\frac25 \\\\  
0 & -\frac25 & 2\frac45 & 3 & \mid & 2\frac45\\\\ 
5 & 7 & 9 & 10 & \mid & 14 
\end{bmatrix}$$

- Subtraindo $L_4$ por $a_{41}L_1=5L_1$

$$\begin{bmatrix}
1 & \frac75 & \frac65 & 1 & \mid & \frac{11}5 \\\\ 
0 & \frac15 & -\frac25 & 0 & \mid & -\frac25 \\\\ 
0 & -\frac25 & 2\frac45 & 3 & \mid & 2\frac45\\\\
0 & 0 & 3 & 5 & \mid & 3 
\end{bmatrix}$$

- Dividindo $L_2$ por $a_{22}=\frac15$

$$\begin{bmatrix}
1 & \frac75 & \frac65 & 1 & \mid & \frac{11}5 \\\\ 
0 & 1 & -2 & 0 & \mid & -2 \\\\ 
0 & -\frac25 & 2\frac45 & 3 & \mid & 2\frac45\\\\
0 & 0 & 3 & 5 & \mid & 3 
\end{bmatrix}$$

- Subtraindo $L_3$ por $a_{32}L_2=-\frac{2L_2}5$

$$\begin{bmatrix}
1 & \frac75 & \frac65 & 1 & \mid & \frac{11}5 \\\\ 
0 & 1 & -2 & 0 & \mid & -2 \\\\ 
0 & 0 & 2 & 3 & \mid & 2\\\\
0 & 0 & 3 & 5 & \mid & 3 
\end{bmatrix}$$

- Subtraindo $L_1$ por $a_{12}L_1=\frac{7L_2}5$

$$\begin{bmatrix}
1 & 0 & 4 & 1 & \mid & 5 \\\\ 
0 & 1 & -2 & 0 & \mid & -2 \\\\ 
0 & 0 & 2 & 3 & \mid & 2\\\\
0 & 0 & 3 & 5 & \mid & 3 
\end{bmatrix}$$

- Dividindo $L_3$ por $a_{33}=2$

$$\begin{bmatrix}
1 & 0 & 4 & 1 & \mid & 5 \\\\ 
0 & 1 & -2 & 0 & \mid & -2 \\\\ 
0 & 0 & 1 & \frac32 & \mid & 1\\\\
0 & 0 & 3 & 5 & \mid & 3 
\end{bmatrix}$$

- Subtraindo $L_4$ por $a_{43}L_3=3L_3$

$$\begin{bmatrix}
1 & 0 & 4 & 1 & \mid & 5 \\\\ 
0 & 1 & -2 & 0 & \mid & -2 \\\\ 
0 & 0 & 1 & \frac32 & \mid & 1\\\\
0 & 0 & 0 & \frac12 & \mid & 0 
\end{bmatrix}$$

- Subtraindo $L_1$ por $a_{13}L_3=4L_3$

$$\begin{bmatrix}
1 & 0 & 0 & -3 & \mid & 1 \\\\ 
0 & 1 & -2 & 0 & \mid & -2 \\\\ 
0 & 0 & 1 & \frac32 & \mid & 1\\\\
0 & 0 & 0 & \frac12 & \mid & 0 
\end{bmatrix}$$

- Subtraindo $L_2$ por $a_{23}L_3=-2L_3$

$$\begin{bmatrix}
1 & 0 & 0 & -3 & \mid & 1 \\\\ 
0 & 1 & 0 & 3 & \mid & 0 \\\\ 
0 & 0 & 1 & \frac32 & \mid & 1\\\\
0 & 0 & 0 & \frac12 & \mid & 0 
\end{bmatrix}$$

- Dividindo $L_4$ por $a_{44}=\frac12$

$$\begin{bmatrix}
1 & 0 & 0 & -3 & \mid & 1 \\\\ 
0 & 1 & 0 & 3 & \mid & 0 \\\\ 
0 & 0 & 1 & \frac32 & \mid & 1\\\\
0 & 0 & 0 & 1 & \mid & 0 
\end{bmatrix}$$

- Subtraindo $L_1$ por $a_{14}L_4=-3L_4$

$$\begin{bmatrix}
1 & 0 & 0 & 0 & \mid & 1 \\\\ 
0 & 1 & 0 & 3 & \mid & 0 \\\\ 
0 & 0 & 1 & \frac32 & \mid & 1\\\\
0 & 0 & 0 & 1 & \mid & 0 
\end{bmatrix}$$

- Subtraindo $L_2$ por $a_{24}L_4=3L_4$

$$\begin{bmatrix}
1 & 0 & 0 & 0 & \mid & 1 \\\\ 
0 & 1 & 0 & 0 & \mid & 0 \\\\ 
0 & 0 & 1 & \frac32 & \mid & 1\\\\
0 & 0 & 0 & 1 & \mid & 0 
\end{bmatrix}$$

- Subtraindo $L_3$ por $a_{34}L_3=\frac{3L_3}2$

$$\begin{bmatrix}
1 & 0 & 0 & 0 & \mid & 1 \\\\ 
0 & 1 & 0 & 0 & \mid & 0 \\\\ 
0 & 0 & 1 & 0 & \mid & 1\\\\
0 & 0 & 0 & 1 & \mid & 0 
\end{bmatrix}$$

$$x=\begin{bmatrix}1 \\\\ 0 \\\\ 1 \\\\ 0\end{bmatrix}$$

e.

f.

**3. Resolva o sistema linear abaixo por inversão de matriz:**

$$\begin{cases}3x_1+x_2=23 \\\\ x_1-x_2=-3\end{cases}$$

$$A\mid b=\begin{bmatrix} 3 & 1 & \mid & 23 \\\\ 1 & -1 & \mid & -3\end{bmatrix}$$

$$A=\begin{bmatrix} 3 & 1 \\\\ 1 & -1\end{bmatrix}$$

$$\det(A)=3\cdot(-1)-1\cdot1=-3-1=-4$$

$$A^{-1}=\begin{bmatrix} \frac{-1}{-4} & \frac{-1}{-4} \\\\ \frac{-1}{-4} & \frac3{-4}\end{bmatrix}$$

$$A^{-1}=\begin{bmatrix} \frac14 & \frac14 \\\\ \frac14 & -\frac34\end{bmatrix}$$

$$x=A^{-1}\cdot b$$

$$x=\begin{bmatrix} \frac14 & \frac14 \\\\ \frac14 & -\frac34\end{bmatrix}\cdot\begin{bmatrix} 23 \\\\ -3\end{bmatrix}$$

$$x=\begin{bmatrix} \frac{23}4-\frac34 \\\\ \frac{23}4+\frac94\end{bmatrix}=\begin{bmatrix}\frac{20}4 \\\\ \frac{32}4\end{bmatrix}=\begin{bmatrix}5\\\\8\end{bmatrix}$$
