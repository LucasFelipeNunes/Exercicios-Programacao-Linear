# Exercícios da Aula 2 - Matrizes

**1. Use a notação matricial abreviada (A|b) para representar os seguintes sistemas de equações lineares:**

a.

$$A\mid b=\begin{bmatrix}3 & 1 & \mid & 23 \\\\ 1 & -1 & \mid & -3\end{bmatrix}$$

b.

$$A\mid b=\begin{bmatrix}5 & 1 & 2 \mid & 15 \\\\ 1 & 1 & 1 \mid & 5 \\\\ 1 & -2 & 1 \mid & 2\end{bmatrix}$$

c.

$$A\mid b=\begin{bmatrix}2 & 3 & -1 & \mid & 10 \\\\ 1 & -1 & 2 & \mid & 0 \\\\ 4 & 1 & -1 & \mid & 6\end{bmatrix}$$

**2. Resolva os sistemas lineares do Ex. 1 pelo método:**

**a. Eliminação gaussiana.**

a.

$$A\mid b=\begin{bmatrix}3 & 1 & \mid & 23 \\\\ 1 & -1 & \mid & -3\end{bmatrix}$$

- Subtraindo $L_2$ por $\dfrac{a_{21}}{a_{11}}L_1=\frac13L_1$

$$A\mid b=\begin{bmatrix}3 & 1 & \mid & 23 \\\\ 0 & -\frac43 & \mid & -\frac{32}3\end{bmatrix}$$

- Calculando as variáveis

$$-\frac43x_2=-\frac{32}3$$

$$-4x_2=-32$$

$$x_2=\frac{32}4=8$$

$$3x_1+x_2=23$$

$$3x_1+8=23$$

$$3x_1+=23-8$$

$$x_1+=\dfrac{15}3=5$$

b.

$$A\mid b=\begin{bmatrix}5 & 1 & 2 \mid & 15 \\\\ 1 & 1 & 1 \mid & 5 \\\\ 1 & -2 & 1 \mid & 2\end{bmatrix}$$

- Subtraindo $L_2$ por $\dfrac{a_{21}}{a_{11}}L_1=\frac{L_1}5$

$$A\mid b=\begin{bmatrix}5 & 1 & 2 \mid & 15 \\\\ 0 & \frac45 & \frac35 \mid & 2 \\\\ 1 & -2 & 1 \mid & 2\end{bmatrix}$$

- Subtraindo $L_3$ por $\dfrac{a_{31}}{a_{11}}L_1=\frac{L_1}5$

$$A\mid b=\begin{bmatrix}5 & 1 & 2 \mid & 15 \\\\ 0 & \frac45 & \frac35 \mid & 2 \\\\ 0 & -\frac{11}5 & \frac35 \mid & -3\end{bmatrix}$$

- Subtraindo $L_3$ por $\dfrac{a_{32}}{a_{22}}L_1=\frac{-\frac{11}5L_1}{}$
