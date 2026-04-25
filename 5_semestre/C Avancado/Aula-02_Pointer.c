#include <stdio.h> //Biblioteca de input e output
#include <stdlib.h> //Funcoes gerais

void main() {
    int *ptr1, num; //* na declaracao -> Indica que a variavel e um ponteiro
    //int diz que o ponteiro so recebe enderecos de variaveis int
    num = 51;
    ptr1 = &num; //& -> Operador de endereco. Pega o endereco da var em questao

    printf("Endereco da variavel (Ponteiro)= %p\n", ptr1); //%p e o indicador de ponteiro
    printf("Valor da variavel (Ponteiro)= %d\n", *ptr1); //* na execucao -> Conteudo da variavel "apontada"

    *ptr1 = 125; //Ponteiro aponta para a variavel e troca o conteudo dela
    printf("Valor da variavel (variavel)= %d\n", num);
    
    system("pause");
}