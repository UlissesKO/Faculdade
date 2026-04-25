//--------------Codigo de soma incremental---------------
#include<stdio.h> //Outputs. (printf() e scanf())
#include<stdlib.h>//Pacote de funcoes gerais. Precisa ter

//Vai retornar um int. | Declaracao da funcao
int somar (int n){
    int soma, i; //Declara a variavel acumuladora e contadora
    soma = 0; //Variável acumuladora para retorno
    
    //Seta valor da var contadora;
    //Condição para seguir for (n é o input da funcao);
    //O que fazer após o for(Incrementar 1 a variavel);
    for ( i=1; i<=n; i++){
        soma = soma + i;
    }
    return soma;
} //Declara o subprograma. (Funcao)


int main(){
    int n, resultado;

    printf("Informe um numero inteiro n = ");
    scanf("%d", &n); //%d quer dizer que vai ser um inteiro 
    //&n e a variavel que vai colocar o dado. (No caso n)

    resultado = somar(n);//Chama a funcao e passa a var n
    printf("O resultado da soma e %d = %d\n", n, resultado);
    //Para adicionar variaveis no output adicionar % + tipo do dado. (No caso %d)
    
    system("pause"); //Serve para manter o terminal aberto
    return 0;
}