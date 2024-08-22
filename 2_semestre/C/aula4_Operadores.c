#include <stdio.h>
#include <stdlib.h>  //Esse pacote tem coisa pra mexer no terminal (pique os do python)
int main()
{
    int numero,resto;
    
    scanf("%d", &numero);
    resto = numero % 3; //Operador de resto
    printf("O resto por 2 e: %d\n", resto);    

    system("pause"); //Função pra escrever coisa no terminal. O problema é que cria uma vulnerabilidade no sistema
    
    
    return 0;        
}
