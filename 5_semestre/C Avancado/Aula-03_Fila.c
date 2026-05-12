#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <stdbool.h> //Habilita uso de booleans

struct Nodo{
    int info;
    struct Nodo *prox;
};

typedef struct Nodo celula;

celula *ifila = NULL; //Aponta para o inicio da fila
celula *ffila = NULL; //Aponta para o fim da fila

void main() {
    system("pause");
}

bool FilaVazia(){ //Verifica se o ponteiro do inicio da fila aponta para NULL.
    if (ifila = NULL){ //Significa que está vazio
        return true;
    } else {
        return false;
    }
}

void InsereFila(int x){
    celula *ptr;
    ptr = (celula*)malloc(sizeof(celula));

    ptr->info = x;
    ptr->prox = NULL;

    if (FilaVazia()){//Essa funcao retorn true -> Fila vazia | false -> Fila ocupada
        //Se a fila for vazia, deixa os endereços das extremidades apontando para a celula.
        ifila = ptr;
        ffila = ptr;
    } else{
        ffila->prox = ptr;
        ffila = ptr;
    }
    ptr = NULL;
}

void RemoverFila(){
    celula *aux;
    if (!FilaVazia()){//Valida se a fila nao esta vazia
        aux = ifila;
        ifila = ifila->prox;
        aux->prox = NULL;
        free(aux);
    } else{
        printf("\n-----------------\nA fila esta vazia!\n-----------------\n");
    }
    aux = NULL;
}