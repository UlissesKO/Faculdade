#include <stdio.h>
#include <stdbool.h> //O pacote pra trabalhar com booleans
int main(void)
{
    bool a=false, b=true;
    
    printf("a: %d; b: %d", a, b);
    printf("a && b(and): %d\n", a&&b);
    printf("a || b(or): %d\n", a||b);
    printf("!a: %d (Mostra o contrario de a)", !a);
}
