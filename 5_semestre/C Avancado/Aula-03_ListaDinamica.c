#include <stdio.h>
#include <stdlib.h>

//Basicamente cria um novo tipo de dado com 2 informacoes
struct Nodo{
    int id_aluno; //Valor do item da lista
    struct Nodo *prox; //Ponteiro para o proximo item da lista
}; //Define um item da lista

typedef struct Nodo celula;
celula *p = NULL; //Ponteiro para inicio da lista
//Inicia o ponteiro com NULL

//Funcoes
void insereFinal(int x){ //Fluxo = Pega um endereço de memoria -> Atribui um nó da lista a ele
    celula *ptr, *aux;
    ptr = (celula*)malloc(sizeof(celula)); //Pega uma celula da RAM e atribui o endereço ao ponteiro (Entender melhor a linha)
    //malloc -> Pegar uma celula na memoria livre (RAM) e atribuir a um ponteiro
    ptr->id_aluno = x; //Atribui valor de x a celula 
    ptr->prox = NULL; //Atribui NULL ao ponteiro

    //Caso 1: Ainda não existe uma lista, esta e a primeira celula
    if (p == NULL) { //p e o primeiro ponteiro, que foi criado anteriormente como NULL
        p = ptr; //Atribui o endereco do no ao ponteiro p
    } else { //Caso 2: Ja existe uma lista e vai inserir a celula ao final
        aux = p; //ponteiro auxiliar (aux) recebe o endereco de p (Ponteiro inicial);

        while (aux->prox != NULL){ //Enquanto o valor prox do obj no endereco de aux for diferente de NULL
            aux = aux->prox; //Passa o endereco da celula seguinte ao ponteiro aux
        }
        aux->prox = ptr; //Valor prox que estava vazio, recebe endereco de ptr, que e a celula atual

        aux = NULL; //Zera o valor de aux para nao gerar problemas
    }
    ptr = NULL; //Valor de ptr e zerado novamente
}
void removeInicio(){
    celula *aux;
    aux = p; //aux recebe o valor do endereco de p (Primeira celula da lista)
    p = p->prox; //p recebe o endereco da proxima celula da lista.
    aux->prox = NULL; //Desvincula o endereco da seguinte (prox) na celula que sera excluida

    free(aux);//Devolve o endereco apontado para a memoria da maquina;
}
void showLista(){ 
    celula *aux;
    aux = p; //Passa o endereco inicial da lista ao ponteiro aux

    while(aux!=NULL){ //Enquanto nao terminar a lista vai rodar
        if (aux->prox == NULL){ //Caso chegar na ultima celula da lista, executa isso
            printf("%d -> #", aux->id_aluno); //Printa o valor da celula
        } else { //Caso nao seja a ultima lista
            printf("%d -> ", aux->id_aluno); //Printa o valor da celula
        }
        aux = aux->prox;
    }
    aux = NULL;
} 
void removeAll(){
    celula *aux;
    if (p){ //Se p existir, portanto, se a lista nao estiver vazia
        aux = p; //Ponteiro aux aponta para a primeira celula da lista
        while (aux!=NULL){
            p = p->prox; //Ponteiro p aponta para a proxima celula
            aux->prox = NULL; //Desvincula o endereco da seguinte (prox) na celula que sera excluida
            free(aux);//Devolve o endereco apontado para a memoria da maquina
            aux = p; //Passa o endereco de p para o ponteiro aux, permitindo que repita o processo
        }
    }
    aux = NULL; //Zera o valor de ambos os ponteiros
    p = NULL;
}
void menu(){
    int opcao, valor;

    do {
        printf("\n--- MENU DE ALUNOS ---");
        printf("\n1. Inserir Aluno (Final)");
        printf("\n2. Remover Primeiro Aluno");
        printf("\n3. Mostrar Lista");
        printf("\n4. Esvaziar Lista");
        printf("\n0. Sair");
        printf("\nEscolha uma opcao: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                printf("Digite o ID do aluno: ");
                scanf("%d", &valor);
                insereFinal(valor);
                break;
            case 2:
                removeInicio();
                break;
            case 3:
                showLista();
                break;
            case 4:
                removeAll();
                break;
            case 0:
                printf("Saindo...\n");
                removeAll(); // Boa prática liberar a memória antes de fechar
                break;
            default:
                printf("Opcao invalida!\n");
        }
    } while (opcao != 0);
}

void main () {
    system("pause");
}