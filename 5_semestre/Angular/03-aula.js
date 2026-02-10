var certo = true; //Variável somente com booleans
var qualquerCoisa = 1; //Variáveis tipo "any" podem ser de qualquer tipo
qualquerCoisa = true;
qualquerCoisa = "Issaí";
var lista = [4, -7, 99, 32]; //Quando se tem o "[]" ao final do tipo, indica um array
console.log(lista);
console.log(lista[3]);
console.log("\n\n\n");
//loops
//let é usado para criar variaveis locais. (Só existe dentro do loop)
for (var i = 0; i < lista.length; i++) {
    console.log(lista[i]);
}
console.log("\n\n\n");
//Loops do typescript
//Pega o index do item da lista
for (var i in lista) {
    console.log(i);
}
//Pega o valor do item
for (var _i = 0, lista_1 = lista; _i < lista_1.length; _i++) {
    var i = lista_1[_i];
    console.log(i);
}
console.log("\n\n\n");
//Tuple
var resposta;
resposta = ['Errado', 348, false];
console.log(resposta);
console.log("\n\n\n");
var listaAlunos;
listaAlunos = [
    ['Ulisses', 20, true],
    ['Maria', 19, true],
    ['João', 21, false]
];
for (var _a = 0, listaAlunos_1 = listaAlunos; _a < listaAlunos_1.length; _a++) {
    var _b = listaAlunos_1[_a], nome = _b[0], idade = _b[1], passou = _b[2];
    console.log("O aluno ".concat(nome, " tem ").concat(idade, " anos e ").concat(passou ? 'passou' : 'não passou', "."));
}
