#include <stdio.h>
#include <stdlib.h>

//Algo esta dando errado nas contas

int main()
{
    #define DIAS_MES 30 //O # serve pra criar a constante aqui

    char tipo1[30]; //Esta criando uma string chamada tipo com no máximo 30 letras
    int quantidade;
    float consumo_km;
    float km_dia;
    float preco_l;
    int num_veiculos;
    float consumo_dia;
    float consumo_mes;
    float custo_mes;
    
    printf("Digite o tipo do veiculo ");
    scanf("%s", &tipo1);
    
    //Aqui entra os dados do veiculo
    printf("\nQuantos veiculos sao? ");
    scanf("%d", &num_veiculos);
    
    printf("\nQuantos litros usa em 1 km? ");
    scanf("%f", &consumo_km);
    
    printf("\nQual o preco do litro do combustivel? ");
    scanf("%f", &preco_l);
    
    printf("\nQuantos km anda por dia? ");   
    scanf("%f", &km_dia);
    
    //Calculos
    consumo_dia = consumo_km * km_dia * num_veiculos;
    consumo_mes = consumo_dia * DIAS_MES;
    custo_mes = consumo_mes * preco_l;
    
    //OUTPUT
    system("cls");
    printf("\nSeu veiculo gasta: \n%f litros por dia por carro \n%f litros por dia ao todo \n%f litros por mes \nGasta R$%f por mes\n", consumo_dia/2, consumo_dia, consumo_mes, custo_mes);
    system("pause");
} 
