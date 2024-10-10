# Exercício de herança
# Ex05
Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas. Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir: 

Chefe: salário fixo e predefinido;
Vendedor: valor fixo + comissão * vendas;
Operario: valor por produção * quantidade produzida;
Horista: valor por hora * total de horas trabalhadas.


Crie as classes correspondentes, adicionando atributos e métodos que achar necessários. A classe *Funcionario* deve incluir os campos privados *nome*, *dataNascimento* e *salario*. Além disso, crie uma classe *Empresa*, que conterá o método *main()*. A empresa tem vários funcionários, logo crie um vetor (array) para cada tipo de funcionário, instancie no mínimo 2 exemplos de cada tipo de funcionário. Mostre uma chamada para cálculo do salário

# Ex06
Crie uma classe chamada {Ingresso}, que possui um valor e um método {escreveValor()}. Em seguida:

Crie uma classe {VIP}, que herda {Ingresso} e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
	
Crie uma classe {Normal}, que herda {Ingresso} e possui um método que imprime: "Ingresso Normal".
	
Crie uma classe {CamaroteInferior} (que possui a localização do ingresso e métodos para acessar e imprimir esta localização) e uma classe {CamaroteSuperior}, que é mais cara (possui valor adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as classes herdam a classe {VIP}.
