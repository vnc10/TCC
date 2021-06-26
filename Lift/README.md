Class Lift, ela representa um elevador em código;

Para instanciar a classe utiliza-se lift(highestFloor) ou 
lift(highestFloor, maxRiders) onde highestFloor é um numero inteiro para o valor do andar mais alto e maxRiders
é um numero inteiro para o total de pessoas que o elevador pode carregar.


A classe possui os seguintes métodos:

- getTopFloor(): retorna o numero do ultimo andar;
- getCurrentFloor(): retorna o numero do andar atual;
- getCapacity(): retorna o numero da capacidade do elevador;
- getNumRiders(): retorna o numero total de pessoas que cabem nele;
- isFull(): retorna um booleano se está cheio ou não;
- addRiders(): aumenta a capacidade total do elevador;
- goUp(): sobe um andar;
- goDown(): desce um andar;
- call(): chama o elevador;