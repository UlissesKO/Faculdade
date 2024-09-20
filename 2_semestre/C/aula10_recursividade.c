#include <stdio.h>
//É um exemplo de função recursiva
int fatorial(int i)
{
	if (i == 0)
	{
		return 1;	
	} 
	else if (i < 0)
	{
		printf("\nErro: Fatorial negativo");	
	}
	
	printf("%d * ", i);

	return i*fatorial(i-1);	
}

int main()
{
	int i, fat=1;
	printf("Digite um numero: ");
	scanf("%d", &i);
	
	fat = fatorial(i);
	
	printf("\n%d", fat);

	return 0;
}
