#include <stdio.h>

int main()
{
    int num1, num2;
    
    scanf("%d", &num1);
    scanf("%d", &num2);
    
    int _num1, _num2;
    _num1 = num1;
    _num2 = num2;
    
    num1 = _num2;
    num2 = _num1;
    
    printf("Os valores ficaram:\n%d pra numero um \n%d pra numero dois", num1, num2);
    
    return 0;
}
