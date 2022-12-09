# Módulo 3 - Semana 3

Parabéns, a Lab School adorou o sistema de gestão escolar que você desenvolveu! Agora você foi chamado para desenvolver o sistema que fará a gestão dos empréstimos de livros da biblioteca.

O modelo das entidades de domínio segue abaixo:
<img src="imagens/UML.png">

Deve conter as seguintes regras:

Client:
- Deve fazer a validação do CPF (quantidade de caractéres, se é válido);
- Só pode ser adicionado um cliente para o mesmo CPF.

Loan:
- O pagamento do empréstimo só pode ser efetuado se o cartão selecionado possuir crédito.

