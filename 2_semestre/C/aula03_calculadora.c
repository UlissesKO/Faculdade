#include <stdio.h>
int main()
{
    int num1, num2;
    printf("Calculadora Simples\n");
    
    scanf("%d", &num1);
    scanf("%d", &num2);
    
    printf("soma:%d ", num1 + num2);
    printf("\nsubtracao: %d", num1 - num2);
    printf("\nmultiplicacao: %d", num1 * num2);
    
    if (num2 <= 0)
    {
       printf("\nDivisao impossivel");
    }else
    {
       printf("\ndivisao: %d", num1 / num2);
    }
      
    return 0;
    
}
