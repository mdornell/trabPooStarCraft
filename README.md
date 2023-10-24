# trabPooStarCraft

## Contextualização
Fomos encarregados da criação do jogo intitulado "Starcraft - The Final
Queue". Neste jogo, guerreiros de distintas raças confrontam-se de maneira
sequencial, organizando-se em filas. A cada turno, realiza-se um sorteio aleatório para
determinar qual guerreiro atacará primeiro; cada combatente ataca uma vez por
padrão. Uma vez que ambos os guerreiros tenham efetuado seus ataques, são
reposicionados no final de suas respectivas filas. Se um guerreiro for
derrotado/morto, é removido de sua fila, resultando em sua exclusão do jogo. A
vitória é alcançada por um dos lados quando sua fila de guerreiros fica
completamente vazia.

Neste jogo, quatro raças estão presentes: os terranos, os protons, os zergs e os
naga. Os zergs, representados por unidades biológicas com uma estética alienígena,
procuram invadir o planeta habitado pelos terranos, contando com o apoio dos naga,
uma raça de "homens cobra" que se uniram à batalha principalmente com o propósito
de se alimentarem dos terranos. Os protons, uma raça nobre dotada de avançada
tecnologia, manifestam descontentamento com essa situação e decidem aliar-se aos
terranos, uma vez que acreditam ser os próximos alvos dessa investida. Dessa forma,
formam-se dois lados distintos, cada um com sua fila de guerreiros:

**Lado 1: Terranos e Protons**

**Lado 2: Zergs e Nagas**

## Desenvolvimento:
Primeiramente é necessário definir o que é um Guerreiro. Um Guerreiro é alguém que luta e
possui obrigatoriamente:
* Nome
* Idade
* Peso
* Energia: que deve ser inicializada em 100 no momento da criação do Guerreiro (por padrão
os guerreiros possuem energia em 100 unidades)

Guerreiros morrem quando sua energia fica menor ou igual a 0 (nesse caso, por padrão são
retirados da sua respectiva fila).

A seguir apresentaremos os Guerreiros possíveis de cada Raça:

### Terranos:

1. Soldado: unidade básica dos Terranos. Seu ataque retira 20 pontos de energia.
2. Endiabrado: unidade mecânica que dispara um feixe de fogo que afeta os três
primeiros inimigos da fila adversária. Seu ataque afeta o primeio inimigo da fila
adversária em 15 pontos, o segundo da fila em 10 pontos e o terceiro da fila em 5
pontos.
3. Ambunave: não possui ataque, ou seja, não consegue ferir unidades adversárias.
Na sua vez de atacar passa pela fila aliada recuperando até 50 pontos de energia
das unidades não mecânicas (Soldado, Fanaticus e Tormento).
4. Cruzador de Batalha: unidade Terrana mais poderosa e “nasce” com 1000 pontos
de energia (é a única unidade Terrana que não “nasce” com 100 pontos de
energia). Possui um feixe de energia concentrada que automaticamente elimina o
adversário, independente se sua energia. Como precisa concentrar energia utiliza
esse feixe depois de fazer dois ataques comuns (que retiram 50 pontos de
energia). Após um ataque de feixe precisa fazer novamente dois ataques comuns
para fazer um novo ataque de feixe.

### Protons:

5. Fanaticus: unidade básica dos Protons. Seu ataque retira 30 pontos de energia.
Apesar de começarem com 100 pontos de energia podem chegar a 200 pontos de
energia (seu limite) se curados por Ambunaves.
6. Tormento: Seu ataque retira 30 pontos de energia. Se atacar primeiro, promove
seu ataque, gera um Clone Tormento (cujo ataque não promove dano) no inicio
da fila e vai para o final da fila, assim quem recebe o ataque é o Clone Tormento
e não o Tormento. O Clone Tormento possui energia inicial de 50 (não 100 como
a maioria dos Guerreiros). Se for o segundo a atacar, o Tormento apenas ataca e
vai para o final da fila.
7. Colosso: Seu ataque retira 20 pontos de energia de todos os inimigos da fila
adversária. É importante notar que todo inimigo que morrer deve sair da fila
imediatamente.
8. Transportadora: Produz interceptadores que possuem ataque de 25 pontos de
energia. A cada vez que a Transportadora ataca cria um novo interceptador, ou
seja, no primeiro ataque possui um interceptador, no segundo dois
interceptadores, no terceiro três e assim sucessivamente até o limite de oito
interceptadores. As Transportadoras começam com 500 pontos de energia.
Quando a Transportadora é eliminada seus interceptadores também o são. Os
interceptadores não são atacados a Transportadora que é.

**Protons possuem a “recuperação gelada”. Toda vez que atacam e estão com menos
de 50% da energia inicial recuperam 5% da sua energia.**

### Zergs:

1. Zergnideo: unidade básica dos Zerg. Seu ataque retira apenas 5 pontos de
energia. Nasce com apenas 50 pontos de energia.
2. Tatu-bomba: unidade suicida dos Zerg. Quando ataca morre, mas retira 100
pontos de energia do adversário atacado.
3. Infestador: não possui ataque. Se for o primeiro a atacar, controla o adversário e
o faz atacar seus aliados (na sua própria fila), nesse caso o Infestador não sofre
ataque (no caso especifico da Ambunave ser o adversário, isso irá fazer com que
essa unidade recupere a energia de Zergs e Nagas - todas as unidades pois todas
são organicas, ou seja, não mecânicas). Se for o segundo a atacar, gera um
Zergnideo com seu nome (nome do Infestador), peso e idade, na sequencia vai
para o final da fila.
4. Lord das Castas: possui energia inicial de 200 e não possui ataque direto. Quando
ataca produz, aleatoriamente e com a mesma chance de seleção; ou três
Zergnideos, ou dois Tatus-bomba ou um Infestador. Os Zerg criados pelo Lord
das Castas recebem seu nome e o peso e altura ficam com valor 0 (zero).

### Nagas:

5. Servo: unidade básica dos Naga. Não possuem ataque mas colocam um “broto de
veneno” em seus adversários. Esse “broto de veneno” retira 1 ponto de energia
toda vez que é ativado. Os “brotos de veneno” não afetam unidades mecânicas
(Endiabrado, Ambunave, Cruzador de Batalha, Colosso e Transportadora). A
ativação de “brotos de veneno” ocorre toda vez que o adversário ataca. Não há
limite para a quantidade de “brotos de veneno”.
6. Devoradora: devora o aliado que está na sequencia na fila (o segundo da fila,
Naga ou Zerg, não importa). Seu ataque então é exatamente a quantidade de
energia do aliado devorado multiplicado por dois. Ou seja, se devora um aliado
que, no momento que foi comido, estava com 80 pontos de energia, seu ataque
terá 160 pontos de energia. Devoradoras só não conseguem comer Empaladores,
quando elas tentam, elas morrem e geram quatro servos. Se não houver ninguém
para a Devoradora devorar (última Guerreiro da sua fila) seu ataque é de zero.
7. Empalador: unidade poderosa dos Naga. Possui 400 pontos de energia e ataque
de 50 pontos. Imediatamente após atacarem, se estiverem com 100 ou menos
pontos de energia, se alimentam do aliado imediatamente na sequencia em sua
fila (Naga ou Zerg, não importa) e se regeneram (voltando aos 400 pontos de
energia).

## Entrada de dados:

O programa deverá ler 2 arquivos (lado1.txt e lado2.txt) e montar as filas
(listas) de cada lado.

A entrada de dados de um arquivo de cada lado deverá ter o seguinte formato:  
<tipo 1> <nome 1> <idade 1> <peso 1>  
<tipo 2> <nome 2> <idade 2> <peso 2>  
...  

**Tipo (arquivo lado1.txt) Objeto a ser criado**  
1 Soldado  
2 Endiabrado  
3 Ambunave  
4 Cruzador de Batalha  
5 Fanaticus  
6 Tormento  
7 Colosso  
8 Transportadora  

**Tipo (arquivo lado2.txt) Objeto a ser criado**  
1 Zergnideo  
2 Tatu-bomba  
3 Infestador  
4 Lord das Castas  
5 Servo  
6 Devoradora  
7 Empalador  