#include <stdio.h>
int main()
{
    int i, contador;
    contador = 1;
    
    printf("For\n");
    //for (i = 1; i < 11; i = i + 2) Pula de 2 em 2 
    //   var  ;condicao ; Incremento
    for (i = 1 ; i < 11 ; i++)
    {
        printf("%d ", i);
    }
    printf("\n\nWhile\n");
    //while
    while(contador<5)
    {
        printf("%d \n", ++contador);
    }             
    return 0;
}
