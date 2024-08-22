#include <stdio.h>
int main()
{
    int Base, altura, base;
    
    printf("Digite a base maior, base menor e a altura do trapezio respectivamente\n");
    scanf("%d %d %d", &Base, &base, &altura);
    
    printf("A area e: %d", ((Base + base) * altura) / 2);
    
    return 0;
}
