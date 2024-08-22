#include <stdio.h>
int main()
{
    int base, altura;
    
    printf("Digite a base e altura do triangulo respectivamente\n");
    scanf("%d %d", &base, &altura);
    
    printf("A area e: %d", (base * altura) / 2);
}
