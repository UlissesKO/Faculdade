var certo:boolean = true; //Variável somente com booleans

var qualquerCoisa:any = 1 ; //Variáveis tipo "any" podem ser de qualquer tipo
qualquerCoisa = true;
qualquerCoisa = "Issaí";

var lista:number[] = [4,-7,99,32] //Quando se tem o "[]" ao final do tipo, indica um array

console.log(lista);
console.log(lista[3]);

console.log("\n\n\n")

//loops
//let é usado para criar variaveis locais. (Só existe dentro do loop)
for (let i=0; i<lista.length; i++) {
    console.log(lista[i]);
}

console.log("\n\n\n");

//Loops do typescript
//Pega o index do item da lista
for (let i in lista) {
    console.log(i);
}

//Pega o valor do item
for (let i of lista) {
    console.log(i);
}

console.log("\n\n\n");

//Tuple
var resposta:[string, number, boolean];
resposta = ['Errado', 348, false];

console.log(resposta);

console.log("\n\n\n");

//Criação de tipos de dados. (Nesse caso é uma matriz)
type Aluno = [nome:string, idade:number, passou:boolean];
var listaAlunos:Aluno[];

listaAlunos = [
    ['Ulisses', 20, true],
    ['Maria', 19, true],
    ['João', 21, false]
];

for (let [nome, idade, passou] of listaAlunos) {
    console.log(`O aluno ${nome} tem ${idade} anos e ${passou ? 'passou' : 'não passou'}.`);
}
