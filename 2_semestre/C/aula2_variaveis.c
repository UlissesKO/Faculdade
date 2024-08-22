#include <stdio.h>
int main()
{
    int idade=18;
    int anoAtual=2024;
    int anoNascimento;
    anoNascimento=anoAtual-idade;
    
    printf("Nasceu no ano: %d\n", anoNascimento); // o %d é um placeholder para a variável

    return 0;
}
