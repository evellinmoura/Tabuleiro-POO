                    
Tabuleiro-POO

Crie um jogo de computador que simule um jogo de tabuleiro. Seu jogo deve permitir
até 6 participantes ao mesmo tempo. O tabuleiro tem 40 casas. Cada jogador possui uma
cor que o identifica e sabe qual sua posição no tabuleiro. Cada movimento de um
competidor é determinado por dois dados: o competidor andará o número de casas igual
à soma dos valores dos dois dados.
Existem 3 tipos de jogador: jogador com sorte, cuja soma dos valores dos dados é
sempre maior ou igual à 7; jogador azarado, cuja soma dos valores dos dados é sempre
menor ou igual a 6; jogador normal, que pode obter tanto valores altos como baixos
para a soma dos dados.

O tabuleiro tem algumas casas especiais:
- casas 10, 25, 38: se o competidor parar em uma dessas casa, ele não joga a próxima
rodada;
- casa 13: casa surpresa, o jogador deve tirar uma carta aleatória que o fará mudar de
tipo de jogador de acordo com a carta.
- casas 5, 15 e 30: casas da sorte: ande 3 casas para frente desde que ele não seja um
jogador azarado;
- casas 17 e 27: se o competidor parar em uma dessas casas, ele escolhe um competidor
para voltar para o início do jogo.
- casas 20 e 35: casas mágicas: se o competidor parar em uma delas, ele troca de lugar
com o jogador que está mais atrás no jogo. Caso ele seja o último, ele não sai do lugar.
- caso o competidor tire dois resultados iguais nos dados, ele anda a quantidade de
casas correspondentes e ganha o direito de jogar novamente (respeitando as regras
acima).

Requisitos:
- Cada competidor começa da casa 0
- O jogo tem que ter pelo menos dois jogadores de tipos diferentes, mas pode haver dois
ou mais jogadores do mesmo tipo
- Permita que o usuário escolha os jogadores da rodada
- Ganha o competidor que chegar primeiro na casa 40 (ou passar dela)
- A cada rodada você deve mostrar a posição de cada jogador no tabuleiro (ex: Azul na
casa 2, verde na casa 6, amarelo na casa 15, branco na casa 18) e de quem é a vez para
jogar
- Após jogar os dados, você deve mostrar o valor da soma dos dados
- Se um jogador cair em uma das casas ou condições acima, mostrar uma mensagem
indicando
- Você tem que mostrar o vencedor
- Você deve mostrar a quantidade de jogadas de cada jogador ao final do jogo e a
posição de cada um.
- Você deve usar herança e polimorfismo no seu jogo

Observação: Na branch Tabuleiro_Melhorias, consta a atualizações como personalizacao de jogadores, diferentes tipos de casa, maior quantidade de jogadores...
