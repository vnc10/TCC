Class Lift, ela representa um elevador em código;

Para instanciar pode ser feito lift (numero do andar mais alto) ou 
lift (numero do andar mais alto, numero total de passageiros)


Possui os seguintes métodos:

- getTopFloor(): retorna o numero do ultimo andar;
- getCurrentFloor(): retorna o numero do andar atual;
- getCapacity(): retorna o numero da capacidade do elevador;
- getNumRiders(): retorna o numero total de pessoas que cabem nele;
- isFull(): retorna um booleano se está cheio ou não;
- addRiders(): aumenta a capacidade total do elevador;
- goUp(): sobe um andar;
- goDown(): desce um andar;
- call(): chama o elevador;