# MyGameMachine Orientado a Objeto

## Continuição do projeto:
[MyGameMachine]('https://github.com/leandroCodeDev/MyGameMachine')


### Requisitos Funcionais Revisados:

1. **Objetos e Classes:**
    - **Jogador:** Armazena informações como nome, histórico de jogadas (vitórias, derrotas), e pontuação total.
    - **Jogo:** Controla a lógica do jogo, incluindo receber entradas do jogador, gerar jogadas do computador, calcular resultados, e atualizar o histórico e pontuação do jogador.
    - **Histórico:** Representa o registro de todas as jogadas, incluindo escolhas do jogador e do computador, e o resultado de cada partida.
    - **Ranking:** Mantém uma lista dos jogadores e suas pontuações, ordenada da mais alta para a mais baixa.

2. **Gerenciamento de Histórico de Jogadas:**
    - Após cada jogo, a jogada é registrada no histórico do jogador, incluindo tanto a escolha do jogador quanto a do computador, e o resultado.
    - O jogador pode solicitar para ver seu histórico de jogadas, que será exibido no terminal.

3. **Visualização do Ranking:**
    - O jogador pode visualizar seu ranking atual, que é determinado pelo número de vitórias ou pela pontuação total acumulada.
    - O ranking é atualizado após cada jogo.

4. **Persistência de Dados (Opcional):**
    - Para um avanço futuro, pode-se considerar a persistência dos dados do jogador (histórico e ranking) em um arquivo ou banco de dados, permitindo que os dados sejam mantidos entre as sessões de jogo.

### Requisitos Não Funcionais Revisados:

1. **Modularidade:**
    - O código deve ser bem organizado, com clara separação de responsabilidades entre as classes, facilitando manutenção e futuras expansões.

2. **Desempenho:**
    - O sistema deve manter um bom desempenho, mesmo com o armazenamento e processamento crescentes do histórico de jogadas e atualizações de ranking.

### Requisitos de Interface Revisados:

1. **Menu de Opções:**
    - Além das opções de iniciar um novo jogo ou sair, deve haver opções no menu para o jogador visualizar seu histórico de jogadas e seu ranking.

### Requisitos de Desenvolvimento Revisados:

1. **Testes:**
    - Implementar testes unitários para as principais funcionalidades do jogo, garantindo que a lógica do jogo e o gerenciamento de dados do jogador funcionem corretamente sob várias condições.

### Exemplo de Funcionamento no Terminal (Revisado):

```plaintext
Bem-vindo ao Jogo Par ou Ímpar!

Menu:
1. Jogar
2. Ver Histórico de Jogadas
3. Ver Ranking
4. Sair

Escolha uma opção: 1

[Inicia o processo de jogo...]

Escolha uma opção: 2

Histórico de Jogadas:
Jogada 1: Par, Jogador: 5, Computador: 3, Resultado: Vitória
Jogada 2: Ímpar, Jogador: 2, Computador: 2, Resultado: Derrota
...

Escolha uma opção: 3

Ranking:
1. Jogador1 - 10 Vitórias
2. Você - 5 Vitórias
...

Escolha uma opção: 4

Obrigado por jogar. Até a próxima!
```

A adição de orientação a objetos e funcionalidades de histórico e ranking torna o jogo mais interativo e interessante, promovendo uma experiência de usuário enriquecida.