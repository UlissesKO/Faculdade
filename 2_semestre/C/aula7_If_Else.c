#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num1, num2;
    scanf("%d %d", &num1, &num2);
    
    if (num1 == num2)
    {
             printf("Os dois numeros sao iguais\n");
    } else if (num1 > num2)
    {
           printf("O primeiro numero eh maior que o segundo\n");
    } else
    {
          printf("O segundo numero eh maior que o primeiro\n");
    }
    system("pause");
    return 0;
}
