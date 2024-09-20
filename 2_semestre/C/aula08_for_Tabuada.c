#include <stdio.h>
int main()
{
    int i, t, t2, t3, num;
    printf("-----Tabuada-----\nQual a tabuada inicial e a final respectivamente? \n");
    scanf("%d %d", &t, &t2);
    printf("Calcular ate qual numero?\n");
    scanf("%d", &num);
    
    for(t = t; t <= t2; t++)
    {
           for(i = 1; i <= num; i++)
           {
                 printf("\n%d * %d = %d", t, i, t * i);
           }
           printf("\n");
    }
    return 0;
}
