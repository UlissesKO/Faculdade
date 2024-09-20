#include <stdio.h>
#include <stdlib.h>

int main(){
    double num1, num2; //Numeros grandes
    char operacao;
    
    printf("Digite a operacao\n");
    scanf("%lf %c %lf", &num1, &operacao, &num2); //lf é pra long float, permite digitar numeros muito grandes
    
    switch(operacao) //Dentro dos parenteses é a variavel a ser comparada
    {
                     case '+':
                              printf("%.1f + %.1f = %.2f \n", num1, num2, num1+num2);
                              break;
                     case '-':
                              printf("%.1f - %.1f = %.2f \n", num1, num2, num1-num2);
                              break;
                     case '*':
                              printf("%.1f * %.1f = %.2f \n", num1, num2, num1*num2);
                              break;
                     case '/':
                              printf("%.1f / %.1f = %.2f \n", num1, num2, num1/num2);
                              break;
    }
    
    system("pause");
    return 0;
} 
