#include <stdio.h>
int main()
{
    int opcao;
    int t, i;
    
    while (opcao != 0)
    {
          printf("\nQual tabuada voce quer? ");
          scanf("%d", &t);
          if (t == 0)
          {
                break;
          }
          for (i = 1; i<=10; i++)
          {
              printf("\n%d x %d = %d", t, i, t*i);
          }
          
          printf("\n\nDeseja continuar? (1 = Sim/0 = Nao) ");
          scanf("%d", &opcao);          
    }
    return 0;
}
                
