                    
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
_____________________________________________________________________________________________________________________________
Na branch Tabuleiro_Melhorado, foram implementadas melhoras ao jogo:

O jogo deve permitir até 6 participantes ao mesmo tempo. Cada jogador possui uma
cor que o identifica, uma pontuação em moedas que ele recebe quando cai em uma casa
Normal do tabuleiro. Cada movimento de um competidor é determinado por dois dados:
o competidor andará o número de casas igual à soma dos valores dos dois dados. Existem
3 tipos de jogador: jogador com sorte, cuja soma dos valores dos dados é sempre maior
ou igual à 7; jogador azarado, cuja soma dos valores dos dados é sempre menor ou igual
a 6; jogador normal, que pode obter tanto valores altos como baixos para a soma dos
dados.
- O tabuleiro deve ser uma classe que contém um ArrayList de jogadores e outro de casas
e os métodos que você achar necessários. As casas devem seguir uma hierarquia, sendo a
classe mãe abstrata possuindo o atributo número e declarando o método aplicarRegra().
Classes filhas podem ser do tipo
* Simples: acrescenta 1 moeda à pontuação do jogador;
* Surpresa: o jogador deve tirar uma carta aleatória que o fará mudar de tipo de
jogador de acordo com a carta.
* Prisão: se o jogador parar em uma dessas casa, ele fica preso e não joga a
próxima rodada, estando liberado em duas rodadas ou se na rodada seguinte pagar taxa
de 2 moedas.
* Sorte: o jogador anda 3 casas para frente desde que ele não seja um jogador
azarado.
* Azar: o jogador perde 3 moedas, desde que não seja jogador sortudo;
* Reversa: se o jogador parar em uma delas, ele troca de lugar com o jogador que
está mais atrás no jogo. Caso ele seja o último, ele não sai do lugar.
* JogaDeNovo: o jogador irá jogar os dados mais uma vez.
* Troca: o jogador poderá trocar seus pontos incrementando seu avatar
escolhendo os seguintes elementos (1 de cada apenas por vez) e recebendo os respectivos
benefícios:
- boné: da a ele 1 moeda a mais sempre que ele cai em casa simples (então passa a ganhar
2 moedas);
- moleton: ele tem que usar boné e ganha duas moedas a mais sempre que cai em uma
casa simples (então passa a ganhar 4 moedas);
- óculos escuro: ele tem que usar boné e moleton e ganha três moedas a mais sempre que
cai em casa simples (então passa a ganhar 7 moedas);

------------------------------------------------------------------------------------------------------------------------------------

Explicacoes sobre a utilizacao dos padroes de projeto:
Factory: cria-se objetos sem expor a lógica de programação, e os objetos recém criados visualizam uma interface em comum.

-Usado muitas vezes para evitar o uso de muitos "News" no código e encapsular as instancias.

No código foram criados os objetos e classe das casas e jogadores nos pacotes pastaCasa, pastaJogador que possui seus respectivos métodos. No qual na classe Factory.java, foi implementado a logica de visualização dos objetos. No caso, a regra de negocio referente a essas classes e objetos.

Singleton: garante a existência de apenas uma instancia de uma classe, mantendo um ponto global de acesso ao seu objeto. 

No código, o singleton é encapsulado por meio da classe Main.java no paco te singleton e implementado na classe Jogo.java no pacote facade. No qual tabuleiro é chamado no construtor de Jogo com o getInstancia ( método global), que possui a verificação de instancia de tabuleiro: 

 public static Tabuleiro getInstancia() {
        if (instancia == null) {
            instancia = new Tabuleiro();
        }
        return instancia;
    }

Decorator: Evita fazer varias extensoes permitindo uma relação de herança e composição das classes de Bone.java, Moletom.java, Oculos.java e JogadorDecorator.java. No qual o Jogadordecorator vai herdar Jogador e não as classes que podem ou não compor um jogador. No caso o jogador em tempo de execução pode ou não possuir um bone, moletom ou oculos.
Explicações complementares:
Factory
Explicação Complementar: O padrão Factory é utilizado aqui para a criação de objetos relacionados às casas e jogadores no jogo sem expor a lógica de instância diretamente no código principal. Isso segue o princípio de encapsular a criação de objetos em métodos dedicados, permitindo flexibilidade na escolha de subclasses com base em parâmetros como o tipo de jogador ou casa. Isso evita a proliferação de "news" no código e facilita a manutenção.

Como foi implementado:

Na classe Factory.java, há métodos como criarCasa e criarJogador, que retornam instâncias específicas das classes Casa (ex.: CasaSimples, CasaPrisao) e Jogador (ex.: Normal, Sortudo). Assim, o código principal do jogo (Jogo.java) não precisa saber qual tipo específico de casa ou jogador está sendo criado, apenas passa parâmetros e a fábrica lida com o resto.
Exemplo de uso no código:
	tabuleiro.adicionarCasa(Factory.criarCasa("sorte", i));
	tabuleiro.adicionarJogador(Factory.criarJogador(tipo, cor));
Singleton
Explicação Complementar: O padrão Singleton assegura que uma classe tenha apenas uma instância global e fornece um ponto de acesso único a essa instância. É útil para garantir que componentes essenciais do sistema, como um tabuleiro de jogo, tenham uma única representação consistente.

Como foi implementado:

A classe Tabuleiro.java utiliza o método estático getInstancia() para criar e acessar a única instância do tabuleiro. Se a instância ainda não foi criada, ela é inicializada; caso contrário, a instância existente é retornada. Isso garante que todas as partes do código utilizem a mesma instância do tabuleiro durante o jogo.
Exemplo de uso no código:
	this.tabuleiro = Tabuleiro.getInstancia();
Decorator
Explicação Complementar: O padrão Decorator permite adicionar responsabilidades a um objeto dinamicamente, sem alterar suas classes originais. Isso é particularmente útil quando se deseja adicionar comportamento extra a objetos de forma flexível, como equipar jogadores com itens que modificam seu comportamento durante o jogo.

Como foi implementado:

No código, classes como Bone, Moleton e Oculos decoram o jogador base, permitindo que ele ganhe moedas extras dependendo dos itens equipados. A classe JogadorDecorator.java age como a classe abstrata para os itens, permitindo a composição dos comportamentos do jogador em tempo de execução.

O decorador modifica métodos existentes do jogador, como adicionarMoedas, para refletir as vantagens dos itens.

Exemplo de uso no código:
	jogador = new Bone(jogador); // Aplica o boné ao jogador
Facade
Explicação Complementar: O padrão Facade fornece uma interface simplificada para um subsistema complexo, facilitando a interação com várias classes de forma mais coesa e intuitiva. A classe Jogo.java atua como uma fachada, encapsulando a lógica principal do jogo (configuração, tabuleiro, jogadores, etc.) e fornecendo uma interface simples para o funcionamento do jogo.

Como foi implementado:

A classe Jogo centraliza a configuração do tabuleiro, a criação dos jogadores e a execução do jogo, escondendo a complexidade da lógica de negócio e da interação com outras classes, como Tabuleiro e Factory.
Exemplo de uso no código:
	jogo.configTabuleiro(numCasas);
	jogo.config(numJogadores);
