#include <stdio.h>
#include <stdlib.h>

int main() {
	//Variaveis
	#define DIAS_MES 30
    int qntd_animal, preco_kg, opcao;
    int kg_animal[] = {5, 7, 10, 12}; 
    
    //Input
    do
    {
    	system("cls");
	    printf("Escreva o numero correspondente ao animal\n");
	    printf("Leopardo [1]\nLeao[2]\nGirafa[3]\nRinoceronte[4]\n");
	    scanf("%d", &opcao);
	} while (opcao < 0 || opcao > 4);
	
	printf("Quantos animais sao?\n");
	scanf("%d", &qntd_animal);
	printf("Qual o custo por quilo?\n");
	scanf("%d", &preco_kg);
    
    system("cls");
    
    opcao = opcao - 1;
    
    //Output
    printf("Quantidade de quilo por animal: %d \n", kg_animal[opcao]);
    printf("Quantidade por dia: %d \n", kg_animal[opcao] * qntd_animal);
    printf("Quantidade por mes: %d \n", (kg_animal[opcao] * qntd_animal) * DIAS_MES);
    printf("Custo estimado por mes: %d \n\n", ((kg_animal[opcao] * qntd_animal) * DIAS_MES) * preco_kg);
    
    system("pause");
    return 0;
}
