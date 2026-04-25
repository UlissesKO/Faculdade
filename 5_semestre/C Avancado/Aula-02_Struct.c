#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Define a estrutura (Struct). (Como um objeto)
struct Aluno {
    char nome[50];
    int idade;
    float media;
};

//Atribui o tipo Registro ao struct Aluno
typedef struct Aluno Registro;
void main(){
    Registro aluno1; //Declara a variavel struct do tipo Registro
    Registro *ptr;
    ptr = &aluno1;

    strcpy(aluno1.nome, "Julianna Dantas Alves");
    aluno1.idade = 25; 
    aluno1.media = 8.5;

    printf("Dados:\n Nome: %s\n Idade: %d\n Media: %.2f\n", ptr->nome, ptr->idade, ptr->media);
    //A seta (->) e utilizada para acessar cada campo do "objeto"
    system("pause");
}
