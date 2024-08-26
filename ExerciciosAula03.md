# Exercícios da Aula 03

**1. Uma empresa produz cinco tipos de calçados (A, B, C, D e E), que poderá vender, respectivamente, por $10, $12, $15, $13 e $14. O quadro abaixo mostra as quantidades de couro, tempo de máquina e couraça necessárias para produzir um par de calçado, assim como os custos por unidade e as demandas máximas pelos diferentes tipos. Sabendo que a empresa dispõe todo mês de 390m2 de couro, 96m2 de couraça e 3200 min. de tempo de máquina, formule um modelo de PL para descobrir quantos pares de cada tipo de calçado devem ser produzidos mensalmente para maximizar o lucro da empresa.**

| Calçado | Demanda | Tempo (min.) | Couro (m2) | Couraça (m2) | Custo ($) |
|---|---|---|---|---|---|
| A | 390 | 7,5 | 0,13 | 0,0320 | 5,53 |
| B | 33 | 15 | 0,14 | 0,0377 | 6,64 |
| C | 20 | 15 | 0,19 | 0,0489 | 8,30 |
| D | 46 | 15 | 0,17 | 0,0413 | 7,19 |
| E | 11 | 15 | 0,18 | 0,0443 | 7,74 |

$$max \ Z=(10-5,53)x_1+(12-6,64)x_2+(15-8,3)x_3+(13-7,19)x_4+(14-7,74)x_5$$

$$max \ Z=4,47x_1+5,36x_2+6,7x_3+5,81x_4+6,26x_5$$

$$Sujeito \ a$$

$$x_1\leq390$$

$$x_2\leq33$$

$$x_3\leq20$$

$$x_4\leq46$$

$$x_5\leq11$$

$$7,5x_1+15x_2+15x_3+15x_4+15x_5\leq3200$$

$$0,13x_1+0,14x_2+0,19x_3+0,17x_4+0,18x_5\leq320$$

$$0,0320x_1+0,0377x_2+0,0489x_3+0,0413x_4+0,0443x_5\leq96$$

$$x_1,x_2,x_3,x_4,x_5\geq0$$

**2. Uma metalúrgica compra ferro velho de três fornecedores: A, B e C. A carga do fornecedor A contém 2 ton. de ferro, 2 ton. de alumínio e 1,3 ton. de cobre ao custo de $400. A carga do fornecedor B contém 1,3 ton. de ferro, 2,4 ton. de alumínio e 1,9 ton. de cobre ao custo de $580. A carga do fornecedor C contém 0,6 ton. de ferro, 3,5 ton. de alumínio e 0,9 ton. de cobre ao custo de $390. A metalúrgica precisa adquirir, para a próxima semana, pelo menos 25 ton. de cada metal citado (ferro, alumínio e cobre). Quantas cargas devem ser adquiridas de cada fornecedor para minimizar o custo de aquisição dos metais?**

$$min\ Z = 400x_1+580x_2+390x_3$$

$$Sujeito\ a$$

$$2x_1+1,3x_2+0,6x_3\geq25$$

$$2x_1+2,4x_2+3,5x_3\geq25$$

$$1,3x_1+1,9x_2+0,9x_3\geq25$$

$$x_1,x_2,x_3\geq0$$
