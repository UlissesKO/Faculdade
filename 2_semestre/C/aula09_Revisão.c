#include <stdio.h>

int soma(int x, int y)//Criando uma fun��o, j� declara as variaveis aqui
{   //Aqui dentro tem tudo o que a fun��o vai fazer 
    return (x+y); //return � obrigat�rio
}

int main()
{
    int idade, a=10, b=2, c;
    
    printf("Primeiro programa\n\nExibir");
    printf("\na=%d, b=%d", a, b);
    
    printf("\n\nLer dados");
    printf("Escreva a idade: ");
    scanf("%d", &idade);
    
    printf("\n\nIf ou Else");
    if(idade >= 18)
    {
        printf("\nMaior de idade");
    }
    else
    {
        printf("\nMenor de idade");
    }
    
    printf("\n\nRepeticoes\n");
    for (c=1;c<=5;c++)
    {
        printf("%d ", c);
    }
    
    c = 1;
    printf("\n\nWhile\n");
    while (c < 4)
    {
          printf("%d ", c);
          c++;
    }
    
    printf("\n\nSwitch Case\n");
    
    switch (idade)
    {
           case 15:
                   printf("Tem 15 anos");
                   break;
           case 18:
                   printf("Tem 18 anos");
                   break;
           case 80:
                   printf("V�io pa cacete");
                   break;
           default:
                   printf("Idade estranha");
                   break;
    }
    
    printf("\n\nUsando uma funcao"); 
    printf("\nO reslultado da soma e: %d", soma(4, 8)); //Aqui estou chamando a fun��o
    
    return 0;
} 
