# Introdução

Projeto fictício de cálculos de salários e impostos a serem pagos a funcionários Unisoma.

## Projeto

Criar um projeto Spring Boot para demonstração dos exercícios.
A API deverá prover uma URL base e utilizar os verbos HTTP que indicará qual ação está sendo requisitada pelo consumidor
do serviço.
A URL base do seu serviço deverá ser /api/nomeservico.
As seguintes tecnologias deverão ser utilizadas são:

- Java 8
- Maven (Build)
- Hibernate (Implementação JPA)
- Postgres (Data Base)
- Utilizar o Padrão de Projetos DTO (Data transfer object).
- JUnit e Mockito (Testes Unitários)

## Exercícios

1. A UniSoma resolveu conceder aumento salarial a seus funcionários e para facilitar o cálculo dos novos salários
resolvemos criar uma API RESTFULL que cadastre e liste funcionários, calcule e retorne os novos salários dos
funcionários.

<b>i) Cadastro de Funcionários</b><br>

- (1) No cadastro deverá conter as seguintes informações: Nome, CPF, Data de Nascimento, Telefone, Endereço
e o Salario.
- (2) Armazenar essas informações no banco de dados

<b>ii) O cálculo do novo salario</b><br>

- (1) Leia o CPF do funcionário, calcule, atualize e mostre o novo salário, bem como o valor de reajuste ganho e
o índice reajustado, em percentual.
- (2) Calcule o novo salario e atualize o valor na base de dados.
- (3) O cálculo deve respeitar as regras da tabela abaixo:

| Salário | Percentual |
| --- | --- |
| 0 - 400.00 | 15% |
| 400.01 - 800.00 | 12% |
| 800.01 - 1200.00 | 10% |
| 1200.01 - 2000.00 | 7% |
| Acima de 2000.00 | 4% |
 
<br><b>iii) Entrada e Saída dos dados:</b><br>

<b>Entrada</b><br>
A entrada contém apenas o CPF do funcionário

<b>Saída</b><br>
Devolva um objeto com as 4 informações: CPF do funcionário, o novo salário, o valor ganho de reajuste e o
percentual de reajuste ganho, conforme exemplo abaixo.

| Exemplo de Entrada | Exemplo de Saída |
| --- | --- |
| CPF: 000.000.000-00 | CPF: 000.000.000-00 | 
|  | Novo salario: 460.00 |
|  | Reajuste ganho: 60.00 |
|  | Em percentual: 15 % |
|  |  |
| CPF: 000.000.000-00 | CPF: 000.000.000-00 |
|  | Novo salario: 880.00 |
|  | Reajuste ganho: 80.00 |
|  | Em percentual: 10 % |
|  |  |
| CPF: 000.000.000-00 | CPF: 000.000.000-00 |
|  | Novo salario: 2140.00 |
|  | Reajuste ganho: 140.00 |
|  | Em percentual: 7 % |
|  |  |

<br>2. Com o aumento salarial dos funcionários, alguns gostariam de saber qual o valor que irão pagar de Imposto de
Renda e para facilitar o cálculo resolvemos criar uma API RESTFULL para retornar o valor a ser pago por cada
funcionário.

- a.
A API deve receber o CPF do funcionário, calcular e retornar o valor que a pessoa deverá pagar de Imposto
de Renda, segundo a tabela abaixo.

| Renda | Imposto de Renda |
| --- | --- |
| De 0.00 a R$ 2000.00 | Isento | 
| De R$ 2000.01 até 3000.00 | 8% |
| De R$ 3000.01 até R$ 4500.00 | 18% |
| acima de R$ 4500.00 | 28% |

- b. Lembre-se que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa
de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo),
a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser
impresso com duas casas decimais.
- c. Entrada e Saída dos dados:

<b>Entrada</b><br>
A entrada contém apenas o CPF do funcionário.

<br><b>Saída</b><br>
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com
duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a
mensagem "Isento".

| Exemplo de Entrada | Exemplo de Saída |
| --- | --- |
| CPF: 000.000.000-00 | CPF: 000.000.000-00 | 
|  | Isento |
|  |  |
| CPF: 000.000.000-00 | CPF: 000.000.000-00 |
|  | Imposto: R$ 80.00 |
