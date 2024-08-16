# Lista de Exercícios 1

**1. Para as matrizes $A$ e $B$ abaixo:**

$$A=\begin{bmatrix}1 & 2 & 3 \\ 4 & 5 & 6 \\ 7 & 8 & 9\end{bmatrix}$$

$$B=\begin{bmatrix}1 & 2 \\ 0 & -1 \\ 1 & 2\end{bmatrix}$$

**Encontre:**

**a) $-A$**

$$-A=-1\cdot A=\begin{bmatrix}-1 & -2 & -3 \\ -4 & -5 & -6 \\ -7 & -8 & -9\end{bmatrix}$$

**b) $3A$**

$$3A=\begin{bmatrix}3\cdot1 & 3\cdot2 & 3\cdot3 \\ 3\cdot4 & 3\cdot5 & 3\cdot6 \\ 3\cdot7 & 3\cdot8 & 3\cdot9\end{bmatrix}=\begin{bmatrix}3 & 6 & 9 \\ 12 & 15 & 18 \\ 21 & 24 & 27\end{bmatrix}$$

**c) $A+2B$**

Operação impossível

**d) $A^T**

$$A^T=\begin{bmatrix}1 & 4 & 7 \\ 2 & 5 & 8 \\ 3 & 6 & 9\end{bmatrix}$$

**e) $B^T**

$$B^T=\begin{bmatrix}1 & 0 & 1 \\ 2 & -1 & 2\end{bmatrix}$$

**f) $AB$**

$$AB=\begin{bmatrix}1 & 2 & 3 \\ 4 & 5 & 6 \\ 7 & 8 & 9\end{bmatrix}\cdot\begin{bmatrix}1 & 2 \\ 0 & -1 \\ 1 & 2\end{bmatrix}$$

$$AB=\begin{bmatrix}1\cdot1+2\cdot0+3\cdot1 & 1\cdot2+2\cdot(-1)+3\cdot2 \\ 4\cdot1+5\cdot0+6\cdot1 & 4\cdot2+5\cdot(-1)+6\cdot2 \\ 7\cdot1+8\cdot0+9\cdot1 & 7\cdot2+8\cdot(-1)+9\cdot2\end{bmatrix}$$

$$AB=\begin{bmatrix}1+3 & 2-2+6 \\ 4+6 & 8-5+12 \\ 7+9 & 14-8+18\end{bmatrix}$$

$$AB=\begin{bmatrix}4 & 6 \\ 10 & 15 \\ 12 & 24\end{bmatrix}$$

**g) $BA$**

Operação impossível

**h) $\det(A)$**

$$\det(A)=\sum_{i=1}^n(-1)^{1+i}\cdot a_{1i}\cdot A_{1i}$$

$$\det(A)=(-1)^{1+1}\cdot1\cdot\begin{vmatrix}5 & 6\\ 8 & 9\end{vmatrix}+(-1)^{1+2}\cdot2\cdot\begin{vmatrix}4 & 6\\ 7 & 9\end{vmatrix}+(-1)^{1+3}\cdot3\cdot\begin{vmatrix}4 & 5\\ 7 & 8\end{vmatrix}$$

$$\det(A)=(-1)^2\cdot(-3)+(-1)^3\cdot2\cdot(-6)+(-1)^4\cdot3\cdot(-3)$$

$$\det(A)=-3+(-1)\cdot(-12)-9$$

$$\det(A)=-3+(-1)\cdot(-12)-9$$

$$\det(A)=-3+12-9=0$$

**i) A^-1**

Operação impossível, pois $\det(A)=0$

**2. $(AB)^T=B^TA^T$? Justifique a sua resposta.**

Utilizando como exemplo as matrizes $A$ e $B$ do exercício anterior:

$$(AB)^T=B^TA^T$$

$$\begin{bmatrix}4 & 6 \\ 10 & 15 \\ 12 & 24\end{bmatrix}^T=\begin{bmatrix}1 & 2 \\ 0 & -1 \\ 1 & 2\end{bmatrix}^T\cdot\begin{bmatrix}1 & 2 & 3 \\ 4 & 5 & 6 \\ 7 & 8 & 9\end{bmatrix}^T$$

$$\begin{bmatrix}4 & 10 & 12 \\ 6 & 15 & 24\end{bmatrix}=\begin{bmatrix}1 & 0 & 1 \\ 2 & -1 & 2\end{bmatrix}\cdot\begin{bmatrix}1 & 4 & 7 \\ 2 & 5 & 8 \\ 3 & 6 & 9\end{bmatrix}$$

$$\begin{bmatrix}4 & 10 & 12 \\ 6 & 15 & 24\end{bmatrix}=\begin{bmatrix}1\cdot1+0\cdot2+1\cdot3 & 1\cdot4+0\cdot5+1\cdot6 & 1\cdot7+0\cdot8+1\cdot9 \\ 2\cdot1+(-1)\cdot2+2\cdot3 & 2\cdot4+(-1)\cdot5+2\cdot6 & 2\cdot7+(-1)\cdot8+2\cdot9\end{bmatrix}$$

$$\begin{bmatrix}4 & 10 & 12 \\ 6 & 15 & 24\end{bmatrix}=\begin{bmatrix}1+3 & 4+6 & 7+9 \\ 2-2+6 & 8-5+12 & 14-8+18\end{bmatrix}$$

$$\begin{bmatrix}4 & 10 & 12 \\ 6 & 15 & 24\end{bmatrix}=\begin{bmatrix}4 & 10 & 16 \\ 6 & 15 & 24\end{bmatrix}$$

Portanto, a afirmação $(AB)^T=B^TA^T$? é verdadeira.
